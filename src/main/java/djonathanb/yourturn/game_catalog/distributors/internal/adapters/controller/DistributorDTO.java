package djonathanb.yourturn.game_catalog.distributors.internal.adapters.controller;

import djonathanb.yourturn.game_catalog.distributors.internal.entities.DistributorId;

import java.time.LocalDateTime;

public record DistributorDTO(
        DistributorId id,
        String name,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) { }
