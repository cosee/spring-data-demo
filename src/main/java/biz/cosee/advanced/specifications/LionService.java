package biz.cosee.advanced.specifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LionService {

    private final LionRepository lionRepository;

    @Autowired
    public LionService(LionRepository lionRepository) {
        this.lionRepository = lionRepository;
    }

    public List<Lion> doSpecificationQueryUsingRating(int rating) {
        List<Lion> all = lionRepository.findAll(LionSpecs.hasRatingHigherThan(rating));
        return all;
    }
}
