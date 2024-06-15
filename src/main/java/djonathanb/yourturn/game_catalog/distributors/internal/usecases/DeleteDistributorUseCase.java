package djonathanb.yourturn.game_catalog.distributors.internal.usecases;

import djonathanb.yourturn.game_catalog.distributors.internal.entities.DistributorId;

public interface DeleteDistributorUseCase {

    void execute(DistributorId id);

}
