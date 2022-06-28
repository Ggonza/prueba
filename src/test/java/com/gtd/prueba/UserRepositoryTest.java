package com.gtd.prueba;

import com.gtd.prueba.model.user.User;
import com.gtd.prueba.views.userRep;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
    @Autowired private userRep repoUser;
    //Test creacion de usuario
    @Test
    public void testAddNew(){
        User user = new User();

        user.setDni(11234);
        user.setEmail("99test@mail.com");
        user.setPassword("99asd1");
        user.setName("99nombreTEST");
        user.setLastname("99apellidoTEST");

        User savedUser = repoUser.save(user);
        //Verificacion para ver que no este nula ni el ID tenga un valor menor o igual a cero
        Assertions.assertThat(savedUser).isNotNull();
        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);

    }

    //Test Listar
    @Test
    public void testList(){
        Iterable<User> users = repoUser.findAll();
        Assertions.assertThat(users).hasSizeGreaterThan(0);

        for (User user : users) {
            System.out.println(user);
        }
    }

    //Test Listar
    @Test
    public void testGet(){
        Integer userID = 2;
        Optional<User> optionalUser = repoUser.findById(userID);
        Assertions.assertThat(optionalUser).isPresent();
        System.out.println(optionalUser.get());
    }

    //Test Update
    @Test
    public void testUpdate(){
        Integer userID = 1;
        Optional<User> optionalUser = repoUser.findById(userID);

        User user = optionalUser.get();
        user.setPassword("1234");
        repoUser.save(user);

        User updatedUser = repoUser.findById(userID).get();
        Assertions.assertThat(updatedUser.getPassword()).isEqualTo("1234");
    }

    //Test Delete
    @Test
    public void testDelete(){
        Integer userID = 2;
        repoUser.deleteById(userID);

        Optional<User> optionalUser = repoUser.findById(userID);
        Assertions.assertThat(optionalUser).isNotPresent();
    }
}
