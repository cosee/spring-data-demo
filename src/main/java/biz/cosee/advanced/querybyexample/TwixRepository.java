package biz.cosee.advanced.querybyexample;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface TwixRepository extends CrudRepository<Twix, Long>, QueryByExampleExecutor<Twix> {

}
