package com.MAJORPROJECT.LOVABLE.services.impl;

import com.MAJORPROJECT.LOVABLE.dto.subscription.PlanResponse;
import com.MAJORPROJECT.LOVABLE.services.PlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlanServiceImpl implements PlanService {

    @Override
    public PlanResponse getAllActivePlans() {
        // TODO: Implement get all active plans logic
        return new PlanResponse(null, null, null, null, null, null);
    }
}

