package biz.cosee.advanced.specifications;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Lion {

    @Id
    private Long id;

    private String name;

    private int rating;

}
