package com.MAJORPROJECT.LOVABLE.entity;

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
public class UsageLog {
    Long id;
    User user;
    Project project;
    String action;
    Integer tokensUsed;
    Integer durationMs;
    String metadata;
    Instant createdAt;
}
