package biz.cosee.advanced.projection;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class MilkyWay {

    @Id
    @GeneratedValue
    private Long id;

    String name;

    private String description;

    private String internalName;

}
