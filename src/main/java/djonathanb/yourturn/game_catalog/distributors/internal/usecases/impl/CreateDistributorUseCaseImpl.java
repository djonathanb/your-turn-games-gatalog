package djonathanb.yourturn.game_catalog.distributors.internal.usecases.impl;

import djonathanb.yourturn.game_catalog.distributors.internal.entities.Distributor;
import djonathanb.yourturn.game_catalog.distributors.internal.entities.DistributorId;
import djonathanb.yourturn.game_catalog.distributors.internal.usecases.CreateDistributorUseCase;
import org.springframework.stereotype.Service;

@Service
public class CreateDistributorUseCaseImpl implements CreateDistributorUseCase {

    @Override
    public DistributorId execute(Distributor distributor) {
        return null;
    }

}
