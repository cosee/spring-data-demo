package biz.cosee.candyshop.jpa.advanced.storedprocedures;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

public interface KitKatRepository {

    @Procedure(name = "KitKat.mySpecialStoredProcedure")
    Integer callMySpecialStoredProcedure(@Param("input") String someString);
}
