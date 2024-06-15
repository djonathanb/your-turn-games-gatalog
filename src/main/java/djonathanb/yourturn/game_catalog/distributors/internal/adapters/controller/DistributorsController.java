package djonathanb.yourturn.game_catalog.distributors.internal.adapters.controller;

import djonathanb.yourturn.game_catalog.distributors.internal.entities.DistributorId;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/distributors")
public class DistributorsController {

    private final DistributorsService distributorsService;

    public DistributorsController(DistributorsService distributorsService) {
        this.distributorsService = distributorsService;
    }

    @GetMapping
    public List<DistributorDTO> getAllDistributors() {
        return distributorsService.getAllDistributors();
    }
;
    @GetMapping("/{id}")
    public DistributorDTO getDistributorById(@PathVariable DistributorId id) {
        return distributorsService.getDistributorById(id);
    }

    @PostMapping
    public DistributorId createDistributor(@RequestBody DistributorDTO distributor) {
        return distributorsService.createDistributor(distributor);
    }

    @PatchMapping("/{id}")
    public void updateDistributor(@PathVariable DistributorId id, @RequestBody DistributorDTO distributor) {
        distributorsService.updateDistributor(id, distributor);
    }

    @DeleteMapping("/{id}")
    public void deleteDistributor(@PathVariable DistributorId id) {
        distributorsService.deleteDistributor(id);
    }

}
