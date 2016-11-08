package biz.cosee.candyshop.jpa.customrepository;

import biz.cosee.candyshop.domain.Candy;

import java.util.List;


public interface CandyRepositoryCustom {

    void bulkPersist(List<Candy> candiesToInsert);
}
