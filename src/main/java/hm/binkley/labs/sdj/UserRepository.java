package hm.binkley.labs.sdj;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository
        extends PagingAndSortingRepository<User, Long> {}
