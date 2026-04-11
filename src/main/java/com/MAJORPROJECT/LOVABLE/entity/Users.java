package com.MAJORPROJECT.LOVABLE.entity;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Users {
    Long id;
    String email;
    String name;
    String passwordHash;
    String avatar_url;
    Instant createdAt;
    Instant deletedAt;

}
