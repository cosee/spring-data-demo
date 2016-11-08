package biz.cosee.candyshop.jpa.advanced.storedprocedures;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@Entity
@Data
@NamedStoredProcedureQuery(name = "KitKat.mySpecialStoredProcedure", procedureName = "nameOfProcedure", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "input", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "output", type = Integer.class) })
public class KitKat {

    @Id
    @GeneratedValue
    private Long id;
}
