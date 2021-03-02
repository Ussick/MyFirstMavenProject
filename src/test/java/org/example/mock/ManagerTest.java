package org.example.mock;

import com.sun.source.tree.AssertTree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ManagerTest {
    public static final String NAME = "Jack";
    private Manager manager;

    @Test
    public void shouldCreateNewUser(){
        List<User> users= Mockito.mock(List.class);
        manager=new Manager(users);

        manager.createUserByName(NAME);


        verify(users).add(any());
    }

    @Test
    public void shouldFindUserByName(){
        User jack=new User();
        jack.setName(NAME);
        List<User> userList=new ArrayList<>();
        userList.add(jack);
        List<User> users= Mockito.spy(userList);
        manager=new Manager(users);

        User actual = manager.findByName(NAME);
        assertEquals(NAME, actual.getName());
    }

    @Test
    public void shouldCreatNewUserWithTimestamp(){
        List<User> users= Mockito.mock(List.class);
        manager=new Manager(users);
        ArgumentCaptor<User> captor=ArgumentCaptor.forClass(User.class);
        long millis=System.currentTimeMillis();

        manager.createUserByName(NAME);

        verify(users).add(captor.capture());
        assertTrue(captor.getValue().getTimestamp()>=millis);

    }
}