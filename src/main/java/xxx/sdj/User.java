package xxx.sdj;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public final class User {
    @Id
    @GeneratedValue
    private long id;
}
