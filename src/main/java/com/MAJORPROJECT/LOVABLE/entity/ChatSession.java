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
public class ChatSession {
    User user;
    Project project;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
    String title;
}
