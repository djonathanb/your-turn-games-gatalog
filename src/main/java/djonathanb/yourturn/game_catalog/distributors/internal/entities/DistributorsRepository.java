package djonathanb.yourturn.game_catalog.distributors.internal.entities;

import java.util.List;

public interface DistributorsRepository {

    List<Distributor> findAll();

    DistributorId save(Distributor distributor);

}
