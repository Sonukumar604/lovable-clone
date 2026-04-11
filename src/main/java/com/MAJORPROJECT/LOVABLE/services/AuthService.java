package com.MAJORPROJECT.LOVABLE.services;

import com.MAJORPROJECT.LOVABLE.dto.auth.AuthResponse;
import com.MAJORPROJECT.LOVABLE.dto.auth.LoginRequest;
import com.MAJORPROJECT.LOVABLE.dto.auth.SignUpRequest;

public interface AuthService {
    AuthResponse login(LoginRequest request);
    AuthResponse signup(SignUpRequest request);
}
