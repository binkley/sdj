package hm.binkley.labs.sdj;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository
        extends PagingAndSortingRepository<User, Long> {
    List<User> findUserByNickName(@Param("nickName") final String nickName);
}
