package cima.sergio.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cima.sergio.security.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
