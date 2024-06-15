package djonathanb.yourturn.game_catalog.distributors.internal.entities;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.UUID;

public class DistributorId extends UUIDIdentifier {

    public DistributorId(UUID id) {
        super(id);
    }

    @JsonCreator
    public static DistributorId getInstance(UUID uuid) {
        return new DistributorId(uuid);
    }

    public static DistributorId randomInstance() {
        return new DistributorId(UUID.randomUUID());
    }

}
