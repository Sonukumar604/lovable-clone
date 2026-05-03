package com.MAJORPROJECT.LOVABLE.services.impl;

import com.MAJORPROJECT.LOVABLE.dto.project.FileContentResponse;
import com.MAJORPROJECT.LOVABLE.dto.project.FileNode;
import com.MAJORPROJECT.LOVABLE.services.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        // TODO: Implement file content retrieval logic
        return new FileContentResponse(path, "");
    }

    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        // TODO: Implement file tree retrieval logic
        return new ArrayList<>();
    }
}

