package com.MAJORPROJECT.LOVABLE.services.impl;

import com.MAJORPROJECT.LOVABLE.dto.project.ProjectRequest;
import com.MAJORPROJECT.LOVABLE.dto.project.ProjectResponse;
import com.MAJORPROJECT.LOVABLE.dto.project.ProjectSummaryResponse;
import com.MAJORPROJECT.LOVABLE.services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    @Override
    public ProjectResponse getUserProjectsById(Long id, Long userId) {
        // TODO: Implement get user project by ID logic
        return new ProjectResponse(null);
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        // TODO: Implement create project logic
        return new ProjectResponse(null);
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userid) {
        // TODO: Implement update project logic
        return new ProjectResponse(null);
    }

    @Override
    public void softDelete(Long id, Long userId) {
        // TODO: Implement soft delete project logic
    }

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        // TODO: Implement get user projects logic
        return new ArrayList<>();
    }
}

