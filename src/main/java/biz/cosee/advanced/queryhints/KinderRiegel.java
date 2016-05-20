package biz.cosee.advanced.queryhints;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class KinderRiegel {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
