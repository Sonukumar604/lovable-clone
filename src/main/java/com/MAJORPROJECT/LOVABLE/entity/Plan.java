package com.MAJORPROJECT.LOVABLE.entity;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {
    Long id;
    String name;
    String StripePriceId;
    Integer maxProjects;
    Integer maxTokenPerDev;
    Integer maxPreviews;
    Boolean unlimitedai;
    Boolean active;
}
