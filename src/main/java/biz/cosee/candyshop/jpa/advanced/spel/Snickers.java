package biz.cosee.candyshop.jpa.advanced.spel;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Snickers extends AbstractCandy {

    @Id
    @GeneratedValue
    private Long id;

}
