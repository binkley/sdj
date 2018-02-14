package hm.binkley.labs.sdj;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserRepository
        extends PagingAndSortingRepository<User, Long> {
    List<User> findByNickName(final String nickName);
}
