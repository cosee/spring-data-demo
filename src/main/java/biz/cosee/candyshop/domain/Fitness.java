package biz.cosee.candyshop.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Fitness {

    @Id
    @GeneratedValue
    private Long id;

    private int level;

    private String description;

}
