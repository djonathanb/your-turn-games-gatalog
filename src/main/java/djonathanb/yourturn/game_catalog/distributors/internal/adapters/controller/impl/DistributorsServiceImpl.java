package djonathanb.yourturn.game_catalog.distributors.internal.adapters.controller.impl;

import djonathanb.yourturn.game_catalog.distributors.internal.adapters.controller.DistributorDTO;
import djonathanb.yourturn.game_catalog.distributors.internal.adapters.controller.DistributorsService;
import djonathanb.yourturn.game_catalog.distributors.internal.entities.DistributorId;
import djonathanb.yourturn.game_catalog.distributors.internal.usecases.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistributorsServiceImpl implements DistributorsService {

    private final DistributorsMapper distributorsMapper;
    private final GetAllDistributorsUseCase getAllDistributorsUseCase;
    private final GetDistributorUseCase getDistributorUseCase;
    private final CreateDistributorUseCase createDistributorUseCase;
    private final UpdateDistributorUseCase updateDistributorUseCase;
    private final DeleteDistributorUseCase deleteDistributorUseCase;

    public DistributorsServiceImpl(DistributorsMapper distributorsMapper,
                                   GetAllDistributorsUseCase getAllDistributorsUseCase,
                                   GetDistributorUseCase getDistributorUseCase,
                                   CreateDistributorUseCase createDistributorUseCase,
                                   UpdateDistributorUseCase updateDistributorUseCase,
                                   DeleteDistributorUseCase deleteDistributorUseCase) {
        this.distributorsMapper = distributorsMapper;
        this.getAllDistributorsUseCase = getAllDistributorsUseCase;
        this.getDistributorUseCase = getDistributorUseCase;
        this.createDistributorUseCase = createDistributorUseCase;
        this.updateDistributorUseCase = updateDistributorUseCase;
        this.deleteDistributorUseCase = deleteDistributorUseCase;
    }

    @Override
    public List<DistributorDTO> getAllDistributors() {
        var distributors = getAllDistributorsUseCase.execute();
        return distributorsMapper.toDTO(distributors);
    }

    @Override
    public DistributorDTO getDistributorById(DistributorId id) {
        var distributor = getDistributorUseCase.execute(id);
        return distributorsMapper.toDTO(distributor);
    }

    @Override
    public DistributorId createDistributor(DistributorDTO distributorRequest) {
        var distributor = distributorsMapper.fromDTO(distributorRequest);
        return createDistributorUseCase.execute(distributor);
    }

    @Override
    public void updateDistributor(DistributorId id, DistributorDTO distributorRequest) {
        var distributor = distributorsMapper.fromDTO(distributorRequest);
        updateDistributorUseCase.execute(id, distributor);
    }

    @Override
    public void deleteDistributor(DistributorId id) {
        throw new UnsupportedOperationException("Not implemented yet");
//        deleteDistributorUseCase.execute(id);
    }

}
