package biz.cosee.customrepository;

import biz.cosee.Candy;

import java.util.List;


public interface CandyRepositoryCustom {

    void bulkPersist(List<Candy> candiesToInsert);
}
