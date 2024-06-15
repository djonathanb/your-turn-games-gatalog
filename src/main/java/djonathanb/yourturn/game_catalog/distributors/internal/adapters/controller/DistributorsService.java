package djonathanb.yourturn.game_catalog.distributors.internal.adapters.controller;

import djonathanb.yourturn.game_catalog.distributors.internal.entities.DistributorId;

import java.util.List;

public interface DistributorsService {

    List<DistributorDTO> getAllDistributors();

    DistributorDTO getDistributorById(DistributorId id);

    DistributorId createDistributor(DistributorDTO distributor);

    void updateDistributor(DistributorId id, DistributorDTO distributor);

    void deleteDistributor(DistributorId id);

}
