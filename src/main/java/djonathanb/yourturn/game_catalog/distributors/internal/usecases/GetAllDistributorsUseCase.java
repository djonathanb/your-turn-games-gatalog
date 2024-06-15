package djonathanb.yourturn.game_catalog.distributors.internal.usecases;

import djonathanb.yourturn.game_catalog.distributors.internal.entities.Distributor;

import java.util.List;

public interface GetAllDistributorsUseCase {

    List<Distributor> execute();

}
