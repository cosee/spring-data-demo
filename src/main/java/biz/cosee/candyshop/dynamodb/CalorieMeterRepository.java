package biz.cosee.candyshop.dynamodb;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.socialsignin.spring.data.dynamodb.repository.EnableScanCount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CalorieMeterRepository extends CrudRepository<CalorieMeterEntry,CalorieMeterEntryId> {
    Optional<CalorieMeterEntry> findByUserIdAndCandyId(long userId, long candyId);

    @EnableScan
    List<CalorieMeterEntry> findByUserId(long userId);

    @EnableScanCount
    Page<CalorieMeterEntry> findByCandyIdSortByCaloriesTotalDesc(long candyId, Pageable pageable);

    @EnableScanCount
    Page<CalorieMeterEntry> findAll(Pageable pageable);

}
