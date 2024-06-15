package djonathanb.yourturn.game_catalog.distributors.internal.adapters.controller.impl;

import djonathanb.yourturn.game_catalog.distributors.internal.adapters.controller.DistributorDTO;
import djonathanb.yourturn.game_catalog.distributors.internal.adapters.controller.DistributorsMapper;
import djonathanb.yourturn.game_catalog.distributors.internal.entities.Distributor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DistributorsMapperImpl implements DistributorsMapper {

    @Override
    public Distributor fromDTO(DistributorDTO distributorRequest) {
        return null;
    }

    @Override
    public DistributorDTO toDTO(Distributor distributor) {
        return null;
    }

    @Override
    public List<DistributorDTO> toDTO(List<Distributor> distributors) {
        return List.of();
    }

}
