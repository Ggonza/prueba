package com.gtd.prueba.model.user;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true,length = 20, name = "documento")
    private Integer dni;
    @Column(name = "nombre",length = 60)
    private String name;
    @Column(name = "apellido",length = 60)
    private String lastname;

    @Column(nullable = false)
    private String password;
    @Column(nullable = false, unique = true, length = 50)
    private String email;

}
