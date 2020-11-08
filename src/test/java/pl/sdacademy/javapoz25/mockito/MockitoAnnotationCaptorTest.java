package pl.sdacademy.javapoz25.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : java25poz
 * @since : 08.11.2020
 **/
public class MockitoAnnotationCaptorTest {

    @Mock
    List<String> mockedList;

    @Captor
    ArgumentCaptor<String> argumentCaptor;

    /**
     * Inicjalizacja mockito
     */
    @Before
    public void before(){
        MockitoAnnotations.initMocks(this);// this-testowana klasa czyli ta klasa
    }

    @Test
    public void whenUseCaptorAnnotationTest(){

        mockedList.add("one");

        verify(mockedList).add(argumentCaptor.capture());// użycie przechwytywania argumentu

        assertEquals("one",argumentCaptor.getValue());// asercja przechwyconej wartości argumentu powyżej
    }

    @Test
    public void whenNotUseCaptorAnnotationTest(){

        mockedList.add("one");

        ArgumentCaptor<String> argumentCaptorHere = ArgumentCaptor.forClass(String.class);// podobnie co @Captor

        verify(mockedList).add(argumentCaptorHere.capture());// użycie przechwytywania argumentu

        assertEquals("one",argumentCaptorHere.getValue());// asercja przechwyconej wartości argumentu powyżej

    }
}
