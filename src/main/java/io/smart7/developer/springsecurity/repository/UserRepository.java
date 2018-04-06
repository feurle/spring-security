package io.smart7.developer.springsecurity.repository;

import io.smart7.developer.springsecurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);
    public long countByUsername(String username);
}
