package biz.cosee.advanced.specifications;

import org.springframework.data.jpa.domain.Specification;

public class LionSpecs {

    public static Specification<Lion> hasRatingHigherThan(int rating) {
        return (root, query, cb) -> cb.greaterThan(root.get(Lion_.rating), rating);

    }
}
