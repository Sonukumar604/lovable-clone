package com.MAJORPROJECT.LOVABLE.controllers;

import com.MAJORPROJECT.LOVABLE.dto.subscription.PlanLimitsResponse;
import com.MAJORPROJECT.LOVABLE.dto.subscription.UsageTodayResponse;
import com.MAJORPROJECT.LOVABLE.services.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UsageController {
    private final UsageService usageService;
    
    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getTodayUsage(){
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getTodayUsage(userId));
    }
    @GetMapping("/limits")
    public ResponseEntity<PlanLimitsResponse> getPlanLimit(){
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitOfUser(userId));
    }
}
