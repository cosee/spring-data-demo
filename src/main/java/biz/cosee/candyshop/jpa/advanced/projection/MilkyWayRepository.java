package biz.cosee.candyshop.jpa.advanced.projection;

import org.springframework.data.repository.CrudRepository;

public interface MilkyWayRepository extends CrudRepository<MilkyWay, Long> {

    MilkyWayNoInternalName findByName(String name);


}
