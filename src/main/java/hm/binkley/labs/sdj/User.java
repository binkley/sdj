package hm.binkley.labs.sdj;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public final class User {
    @Getter(onMethod = @__({@Id, @GeneratedValue}))
    private long id;

    private String fullName;
    private String nickName;
}
