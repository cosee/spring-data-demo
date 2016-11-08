package biz.cosee.candyshop.jpa.advanced.specifications;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface LionRepository extends CrudRepository<Lion, Long>, JpaSpecificationExecutor<Lion> {
}
