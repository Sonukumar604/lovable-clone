package com.MAJORPROJECT.LOVABLE.controllers.AuthController;

import com.MAJORPROJECT.LOVABLE.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/auth")
@RequiredArgsConstructor
@RestController
public class AuthController {
    private final AuthService authService;
}
