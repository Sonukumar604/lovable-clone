package com.MAJORPROJECT.LOVABLE.services.impl;

import com.MAJORPROJECT.LOVABLE.dto.auth.UserProfileResponse;
import com.MAJORPROJECT.LOVABLE.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Override
    public UserProfileResponse getProfile(Long userId) {
        // TODO: Implement get profile logic
        return new UserProfileResponse(null, null, null, null);
    }
}

