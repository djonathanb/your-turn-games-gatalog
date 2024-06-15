package djonathanb.yourturn.game_catalog.distributors.internal.adapters.controller;

import djonathanb.yourturn.game_catalog.distributors.internal.entities.Distributor;

import java.util.List;

public interface DistributorsMapper {

    Distributor fromDTO(DistributorDTO distributorRequest);

    DistributorDTO toDTO(Distributor distributor);

    List<DistributorDTO> toDTO(List<Distributor> distributors);

}
