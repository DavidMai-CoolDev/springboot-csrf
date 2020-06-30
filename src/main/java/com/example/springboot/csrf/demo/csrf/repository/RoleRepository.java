package com.example.springboot.csrf.demo.csrf.repository;

import com.example.springboot.csrf.demo.csrf.Entity.db.Role;
import com.example.springboot.csrf.demo.csrf.systemEnum.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import selflearning.springbootmanagerapp.model.entity.Role;
//import selflearning.springbootmanagerapp.systemEnum.ERole;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);

}
