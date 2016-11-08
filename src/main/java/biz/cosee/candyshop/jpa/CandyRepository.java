package biz.cosee.candyshop.jpa;

import biz.cosee.candyshop.domain.Candy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public interface CandyRepository extends PagingAndSortingRepository<Candy, Long> {

        Page<Candy> findByNameAndBrand(String name, String brand, Pageable pageable);

        Collection<Candy> findByName(String name);

        Iterator<Candy> findDistinctByBrand(String brand);

        List<Candy> deleteByName(String name);

        Candy findFirstByBrandOrderByRatingAsc(String brand);

        Stream<Candy> findByBrand(String brand);

        @Async
        Future<List<Candy>> findByRating(int rating);

        Optional<Candy> findById(long id);

}
