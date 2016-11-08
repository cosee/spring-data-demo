package biz.cosee.candyshop.jpa.selectivelyexpose;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

@NoRepositoryBean
public interface MyBaseRepository<T, ID extends Serializable> extends Repository<T, ID> {


    T findOne(ID id);


    boolean exists(ID id);


    Iterable<T> findAll();


    Iterable<T> findAll(Iterable<ID> ids);


    long count();
}
