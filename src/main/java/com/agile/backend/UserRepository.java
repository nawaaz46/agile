package com.agile.backend;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // Find a user by username
    User findByUsername(String username);

    // Find users by a partial match on the username
    List<User> findByUsernameContaining(String partialUsername);

    // Add more custom queries or methods as needed
}
