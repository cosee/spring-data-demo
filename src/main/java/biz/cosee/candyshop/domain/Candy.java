package biz.cosee.candyshop.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Candy {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String name;

    private String brand;

    private int price;

    private int rating;

    private int calories;

    @Version
    private Long version;

}
