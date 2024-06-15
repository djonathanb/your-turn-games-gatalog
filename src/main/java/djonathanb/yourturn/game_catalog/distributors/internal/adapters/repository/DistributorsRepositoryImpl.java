package djonathanb.yourturn.game_catalog.distributors.internal.adapters.repository;

import djonathanb.yourturn.game_catalog.distributors.internal.entities.Distributor;
import djonathanb.yourturn.game_catalog.distributors.internal.entities.DistributorId;
import djonathanb.yourturn.game_catalog.distributors.internal.entities.DistributorsRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DistributorsRepositoryImpl implements DistributorsRepository {

    private static final List<Distributor> distributors = new ArrayList<>(List.of(
            buildDistributor("Valve"),
            buildDistributor("Ubisoft")
    ));

    private static Distributor buildDistributor(String name) {
        return Distributor.builder()
                .id(DistributorId.randomInstance())
                .name(name)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }

    @Override
    public List<Distributor> findAll() {
        return distributors;
    }

    @Override
    public DistributorId save(Distributor distributor) {
        distributor.setId(DistributorId.randomInstance());
        distributor.setCreatedAt(LocalDateTime.now());
        distributor.setUpdatedAt(LocalDateTime.now());

        distributors.add(distributor);
        return distributor.getId();
    }

}
