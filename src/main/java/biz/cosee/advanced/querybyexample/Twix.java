package biz.cosee.advanced.querybyexample;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Twix {

    @Id
    private Long id;

    private String name;

    private int gram;

    private String tag;
}
