package br.com.fiap.mypass.password;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordRepository extends JpaRepository<Passwords, String> {
    Optional<Passwords> findByUsername(String username);
}
