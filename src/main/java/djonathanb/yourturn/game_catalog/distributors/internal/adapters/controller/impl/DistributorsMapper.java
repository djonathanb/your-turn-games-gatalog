package djonathanb.yourturn.game_catalog.distributors.internal.adapters.controller.impl;

import djonathanb.yourturn.game_catalog.distributors.internal.adapters.controller.DistributorDTO;
import djonathanb.yourturn.game_catalog.distributors.internal.entities.Distributor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DistributorsMapper {

    DistributorsMapper INSTANCE = Mappers.getMapper(DistributorsMapper.class);

    Distributor fromDTO(DistributorDTO distributorRequest);

    DistributorDTO toDTO(Distributor distributor);

    List<DistributorDTO> toDTO(List<Distributor> distributors);

}
