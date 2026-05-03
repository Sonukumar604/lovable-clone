package com.MAJORPROJECT.LOVABLE.services.impl;

import com.MAJORPROJECT.LOVABLE.dto.member.InviteMemberRequest;
import com.MAJORPROJECT.LOVABLE.dto.member.MemberResponse;
import com.MAJORPROJECT.LOVABLE.dto.member.UpdateMemberRoleRequest;
import com.MAJORPROJECT.LOVABLE.services.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectMemberServiceImpl implements ProjectMemberService {

    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        // TODO: Implement get project members logic
        return new ArrayList<>();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        // TODO: Implement invite member logic
        return new MemberResponse(null, null, null, null, null, null);
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        // TODO: Implement delete project member logic
        return new MemberResponse(null, null, null, null, null, null);
    }

    @Override
    public MemberResponse updateMember(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId) {
        // TODO: Implement update member logic
        return new MemberResponse(null, null, null, null, null, null);
    }
}

