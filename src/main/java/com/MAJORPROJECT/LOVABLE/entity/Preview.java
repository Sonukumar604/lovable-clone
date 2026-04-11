package com.MAJORPROJECT.LOVABLE.entity;

import com.MAJORPROJECT.LOVABLE.enums.PreviewStatus;

import java.time.Instant;

public class Preview {
    Long id;
    Project project;
    String namespace;
    String pod_url;
    String previewUrl;
    PreviewStatus status;
    Instant createdAt;
    Instant startedAt;
    Instant terminatedAt;
}
