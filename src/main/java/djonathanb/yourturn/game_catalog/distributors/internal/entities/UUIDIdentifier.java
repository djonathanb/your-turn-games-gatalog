package djonathanb.yourturn.game_catalog.distributors.internal.entities;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class UUIDIdentifier {

    @JsonValue
    private final UUID id;

    public UUIDIdentifier(UUID id) {
        this.id = id;
    }

}
