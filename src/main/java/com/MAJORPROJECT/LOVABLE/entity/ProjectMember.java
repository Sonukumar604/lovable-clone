package com.MAJORPROJECT.LOVABLE.entity;

import com.MAJORPROJECT.LOVABLE.enums.ProjectRole;
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
public class ProjectMember {
    Project project;
    User user;
    ProjectRole role;
    User invitedBy;
    Instant invitedAt;
}
