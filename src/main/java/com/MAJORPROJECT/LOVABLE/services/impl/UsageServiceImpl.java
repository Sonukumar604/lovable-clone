package com.MAJORPROJECT.LOVABLE.services.impl;

import com.MAJORPROJECT.LOVABLE.dto.subscription.PlanLimitsResponse;
import com.MAJORPROJECT.LOVABLE.dto.subscription.UsageTodayResponse;
import com.MAJORPROJECT.LOVABLE.services.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsageServiceImpl implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsage(Long userId) {
        // TODO: Implement get today usage logic
        return new UsageTodayResponse(null, null, null, null);
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitOfUser(Long userId) {
        // TODO: Implement get current subscription limit logic
        return new PlanLimitsResponse(null, null, null, null);
    }
}

