package djonathanb.yourturn.game_catalog.distributors.internal.usecases.impl;

import djonathanb.yourturn.game_catalog.distributors.internal.entities.Distributor;
import djonathanb.yourturn.game_catalog.distributors.internal.entities.DistributorsRepository;
import djonathanb.yourturn.game_catalog.distributors.internal.usecases.GetAllDistributorsUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllDistributorsUseCaseImpl implements GetAllDistributorsUseCase {

    private final DistributorsRepository distributorsRepository;

    public GetAllDistributorsUseCaseImpl(DistributorsRepository distributorsRepository) {
        this.distributorsRepository = distributorsRepository;
    }

    @Override
    public List<Distributor> execute() {
        return distributorsRepository.findAll();
    }

}
