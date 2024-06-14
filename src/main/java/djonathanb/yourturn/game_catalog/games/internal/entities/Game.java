package djonathanb.yourturn.game_catalog.games.internal.entities;

import lombok.Getter;

@Getter
public class Game {

    private GameId id;
    private String name;
    private GameDistributor distributor;

}
