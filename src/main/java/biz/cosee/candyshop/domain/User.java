package biz.cosee.candyshop.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;
import java.util.List;

@Entity
@Data
@Builder
public class User {

    @Id
    private long id;

    private String firstName;

    private String lastName;

    @ManyToMany
    private List<Candy> orderedCandies;

    @OneToOne
    private Fitness fitness;

    @Version
    Long version;

    public String getFullname() {
        return firstName + " " + lastName;
    }
}
