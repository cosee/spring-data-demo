package biz.cosee.candyshop.jpa.advanced.fetchloadgraphs;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.Repository;

public interface HariboRepository extends Repository<Haribo, Long> {

    @EntityGraph(value = "Haribo.myEntityGraph", type = EntityGraph.EntityGraphType.LOAD)
    Haribo getById(long id);

}
