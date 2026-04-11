package com.MAJORPROJECT.LOVABLE.entity;

import com.MAJORPROJECT.LOVABLE.enums.SubscriptionStatus;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.apache.catalina.User;

import java.time.Instant;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    Long id;
    User user;
    Plan planId;
    String stripeSubscriptionId;
    SubscriptionStatus status;
    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Instant createdAt;
    Instant updatedAt;
}
