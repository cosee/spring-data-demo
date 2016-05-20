package biz.cosee;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
@Data
public class Candy {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String name;

    private String brand;

    private int price;

    private int rating;

    @Version
    private Long version;

}
