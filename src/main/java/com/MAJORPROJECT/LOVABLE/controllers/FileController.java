package com.MAJORPROJECT.LOVABLE.controllers;

import com.MAJORPROJECT.LOVABLE.dto.member.MemberResponse;
import com.MAJORPROJECT.LOVABLE.dto.project.FileContentResponse;
import com.MAJORPROJECT.LOVABLE.dto.project.FileNode;
import com.MAJORPROJECT.LOVABLE.dto.member.UpdateMemberRoleRequest;
import com.MAJORPROJECT.LOVABLE.services.FileService;
import com.MAJORPROJECT.LOVABLE.services.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/files")
public class FileController {
    private final FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(@PathVariable Long projectId){
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getFileTree(projectId, userId));

    }
    @GetMapping("/{path")
    public ResponseEntity<FileContentResponse> getFile(@PathVariable Long projectId,
                                                       @PathVariable String path){
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getFileContent(projectId, path, userId));

    }

}
