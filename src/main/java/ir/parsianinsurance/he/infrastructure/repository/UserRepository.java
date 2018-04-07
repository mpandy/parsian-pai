package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.Vahed;
import ir.parsianinsurance.he.infrastructure.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

/**
 * Created by Mohammad on 8/2/2017.
 */

@Eager
public interface UserRepository extends JpaRepository<User, Long>, QueryDslPredicateExecutor<User> {

    User findFirstByUsername(String username);
    List<User> findByUsernameContains(String username);
    List<User> findByRealNameContains(String username);
    List<User> findByRolesContains(String role);
    List<User> findTop5ByOrderByIdDesc();
    List<User> findByVahed(Vahed vahed);

}
