package djonathanb.yourturn.game_catalog.distributors.internal.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Builder
public class Distributor {

    @Setter
    private DistributorId id;

    private String name;

    @Setter
    private LocalDateTime createdAt;

    @Setter
    private LocalDateTime updatedAt;

}
