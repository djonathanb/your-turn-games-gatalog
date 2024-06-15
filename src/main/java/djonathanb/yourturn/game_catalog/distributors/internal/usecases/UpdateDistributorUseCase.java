package djonathanb.yourturn.game_catalog.distributors.internal.usecases;

import djonathanb.yourturn.game_catalog.distributors.internal.entities.Distributor;
import djonathanb.yourturn.game_catalog.distributors.internal.entities.DistributorId;

public interface UpdateDistributorUseCase {

    void execute(DistributorId id, Distributor distributor);

}
