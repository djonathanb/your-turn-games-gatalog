package djonathanb.yourturn.game_catalog.distributors.internal.usecases.impl;

import djonathanb.yourturn.game_catalog.distributors.internal.entities.Distributor;
import djonathanb.yourturn.game_catalog.distributors.internal.entities.DistributorId;
import djonathanb.yourturn.game_catalog.distributors.internal.usecases.UpdateDistributorUseCase;
import org.springframework.stereotype.Service;

@Service
public class UpdateDistributorUseCaseImpl implements UpdateDistributorUseCase {

    @Override
    public void execute(DistributorId id, Distributor distributor) {

    }

}
