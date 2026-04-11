package com.MAJORPROJECT.LOVABLE.services;

import com.MAJORPROJECT.LOVABLE.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
