package biz.cosee.advanced.queryhints;

import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.Repository;

import javax.persistence.QueryHint;
import java.util.List;

public interface KinderRiegelRepository extends Repository<KinderRiegel, Long> {

    @QueryHints(value = { @QueryHint(name = "org.hibernate.fetchSize", value = "50")},
            forCounting = false)
    List<KinderRiegel> findAll();

}
