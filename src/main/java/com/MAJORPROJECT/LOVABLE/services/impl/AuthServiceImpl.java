package com.MAJORPROJECT.LOVABLE.services.impl;

import com.MAJORPROJECT.LOVABLE.dto.auth.AuthResponse;
import com.MAJORPROJECT.LOVABLE.dto.auth.LoginRequest;
import com.MAJORPROJECT.LOVABLE.dto.auth.SignUpRequest;
import com.MAJORPROJECT.LOVABLE.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse login(LoginRequest request) {
        // TODO: Implement login logic
        return new AuthResponse("jwt-token", null);
    }

    @Override
    public AuthResponse signup(SignUpRequest request) {
        // TODO: Implement signup logic
        return new AuthResponse("jwt-token", null);
    }
}

