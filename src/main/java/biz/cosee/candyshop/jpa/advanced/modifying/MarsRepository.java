package biz.cosee.candyshop.jpa.advanced.modifying;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface MarsRepository extends CrudRepository<Mars, Long> {

    @Transactional
    @Modifying
    @Query("update Mars m set m.name = ?1 where m.id = ?2")
    int setNameFor(String name, long id);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM mars WHERE id = :id", nativeQuery = true)
    int deleteById(@Param("id") long id);


}
