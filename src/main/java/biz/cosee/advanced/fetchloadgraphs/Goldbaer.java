package biz.cosee.advanced.fetchloadgraphs;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Goldbaer {

    @Id
    @GeneratedValue
    private Long id;

    private String color;
}
