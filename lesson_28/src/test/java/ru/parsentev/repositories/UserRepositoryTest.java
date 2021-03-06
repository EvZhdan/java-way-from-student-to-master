package ru.parsentev.repositories;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.parsentev.models.Role;
import ru.parsentev.models.User;

import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 05.07.2016
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void create() {
        User user = new User();
        Role role = new Role();
        role.setId(1);
        user.setRole(role);
        repository.save(user);
    }

    @Test
    public void findByLike() {
        assertFalse(repository.findByFullnameLike("%Petr%").isEmpty());
    }
}