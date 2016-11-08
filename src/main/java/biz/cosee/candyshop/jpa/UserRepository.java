package biz.cosee.candyshop.jpa;

import biz.cosee.candyshop.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    List<User> findByFitness_Level(int level);
}
