package hm.binkley.labs.sdj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@DataJpaTest(showSql = false)
@Transactional
public class UserRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void userRoundtrip() {
        final User user = new User();
        user.setFullName("Robert the Bruce");
        user.setNickName("Bob");

        entityManager.persist(user);
    }
}