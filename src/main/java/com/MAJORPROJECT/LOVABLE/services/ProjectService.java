package com.MAJORPROJECT.LOVABLE.services;

import com.MAJORPROJECT.LOVABLE.dto.project.ProjectRequest;
import com.MAJORPROJECT.LOVABLE.dto.project.ProjectResponse;

public interface ProjectService {
    Object getUserProjects(Long userId);
    ProjectResponse getUserProjectsById(Long id, Long userId);
    ProjectResponse createProject(ProjectRequest request, Long userId);
    ProjectResponse updateProject(Long id, ProjectRequest request, Long userid);
    void softDelete(Long id, Long userId);
}
