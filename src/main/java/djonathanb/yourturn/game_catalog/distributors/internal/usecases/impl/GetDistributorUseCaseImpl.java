package djonathanb.yourturn.game_catalog.distributors.internal.usecases.impl;

import djonathanb.yourturn.game_catalog.distributors.internal.entities.Distributor;
import djonathanb.yourturn.game_catalog.distributors.internal.entities.DistributorId;
import djonathanb.yourturn.game_catalog.distributors.internal.usecases.GetDistributorUseCase;
import org.springframework.stereotype.Service;

@Service
public class GetDistributorUseCaseImpl implements GetDistributorUseCase {

    @Override
    public Distributor execute(DistributorId id) {
        return null;
    }

}
