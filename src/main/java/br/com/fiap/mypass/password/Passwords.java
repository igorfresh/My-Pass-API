package br.com.fiap.mypass.password;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "passwords")
public class Passwords {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String url;
    String username;
    String password;
}
