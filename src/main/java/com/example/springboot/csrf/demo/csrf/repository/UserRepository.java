package com.example.springboot.csrf.demo.csrf.repository;

import com.example.springboot.csrf.demo.csrf.Entity.db.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
//import selflearning.springbootmanagerapp.model.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(@Param("email") String email);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
