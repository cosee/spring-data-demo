package biz.cosee.advanced.spel;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T extends AbstractCandy> extends Repository<T, Long> {

    @Query("select t from #{#entityName} t where t.name = ?1")
    List<T> findByName(String name);
}
