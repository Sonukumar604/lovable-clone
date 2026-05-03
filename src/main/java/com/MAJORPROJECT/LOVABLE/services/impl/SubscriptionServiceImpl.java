package com.MAJORPROJECT.LOVABLE.services.impl;

import com.MAJORPROJECT.LOVABLE.dto.subscription.CheckOutRequest;
import com.MAJORPROJECT.LOVABLE.dto.subscription.CheckOutResponse;
import com.MAJORPROJECT.LOVABLE.dto.subscription.PortalResponse;
import com.MAJORPROJECT.LOVABLE.dto.subscription.SubscriptionResponse;
import com.MAJORPROJECT.LOVABLE.services.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubscriptionServiceImpl implements SubscriptionService {

    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        // TODO: Implement get current subscription logic
        return new SubscriptionResponse(null, null, null, null);
    }

    @Override
    public CheckOutResponse createCheckoutSession(CheckOutRequest request, Long userId) {
        // TODO: Implement create checkout session logic
        return new CheckOutResponse();
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        // TODO: Implement open customer portal logic
        return new PortalResponse(null);
    }
}

