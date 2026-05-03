#!/usr/bin/env pwsh
<#
  start-postgres.ps1
  Simple helper to bring up the postgres container defined in docker-compose.yml,
  wait for it to become ready, and create the two databases used by the projects.

  Usage: Open PowerShell as administrator and run:
    .\scripts\start-postgres.ps1

  Notes:
  - Requires Docker Desktop / docker CLI and docker compose v2 available as `docker compose`.
  - The script mounts host folder `E:\DOCKER_LOVABLE` (adjust docker-compose.yml if you want a different path).
#>

Set-StrictMode -Version Latest
Push-Location $PSScriptRoot | Out-Null

$composeFile = Join-Path $PSScriptRoot '..\docker-compose.yml'
if (-not (Test-Path $composeFile)) {
  Write-Error "docker-compose.yml not found at $composeFile"
  Pop-Location | Out-Null
  exit 1
}

Write-Host "Starting postgres via docker compose..."
docker compose -f $composeFile up -d

Write-Host "Waiting for Postgres to become ready (timeout 120s)..."
$ready = $false
for ($i=0; $i -lt 60; $i++) {
  Start-Sleep -Seconds 2
  $logs = docker logs postgres_lovable 2>&1
  if ($logs -match 'ready to accept connections') { $ready = $true; break }
}

if (-not $ready) {
  Write-Error "Postgres did not become ready in time. Check container logs: docker logs postgres_lovable"
  Pop-Location | Out-Null
  exit 1
}

Write-Host "Postgres is ready — creating databases (if they do not already exist)..."
docker exec -i postgres_lovable psql -U postgres -c "CREATE DATABASE campus_connect_db;" 2>$null || Write-Host "campus_connect_db may already exist"
docker exec -i postgres_lovable psql -U postgres -c "CREATE DATABASE lovable_clone_db;" 2>$null || Write-Host "lovable_clone_db may already exist"

Write-Host "Databases ensured. You can now start the applications (CampusConnect on 8080, Lovable on 8081)."
Pop-Location | Out-Null

