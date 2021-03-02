package org.example.mock;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockTest {
    public static final String DUMMY="";
    @Test
    public void shouldBeInvokedMethodAdd(){
        List<String> list= Mockito.mock(List.class);

        list.add(DUMMY);
        list.add(DUMMY);
        list.add(DUMMY);
        list.add(DUMMY);

        //Mockito.verify(list,times(4)).add(DUMMY);
        verify(list, atLeast(2)).add(DUMMY);
        assertEquals(4,list.size());

    }

    @Test
    public void shouldBeInvokedMethodClear(){
        List<String> list= Mockito.mock(List.class);

        list.add(DUMMY);
        list.add(DUMMY);
        list.add(DUMMY);
        list.add(DUMMY);

        Mockito.verify(list, never()).clear();
    }

    @Test
    public void shouldReturnNumberWhenSizeInvoked(){
        List<String> list= Mockito.mock(List.class);
        Mockito.doReturn(1).when(list).size();

        assertEquals(1, list.size());
    }

    @Test
    public void SpyTest(){
        List<String>list=Mockito.spy(new ArrayList<>());
        list.add("one");
        list.add("two");

        verify(list, times(2)).add(anyString());
        assertEquals(2, list.size());
    }
}
