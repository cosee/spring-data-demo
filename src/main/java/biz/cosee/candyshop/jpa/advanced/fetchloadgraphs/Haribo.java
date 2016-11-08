package biz.cosee.candyshop.jpa.advanced.fetchloadgraphs;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NamedEntityGraph(name = "Haribo.myEntityGraph",
        attributeNodes = @NamedAttributeNode("goldbaers"))
public class Haribo {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    List<Goldbaer> goldbaers = new ArrayList<>();
}
