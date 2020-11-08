package pl.sdacademy.javapoz25;


import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO Stwórz testy metod
 * pressNumber(), display(),
 * add(), sub(), div(), multi() [+, -, / , * ]
 */
public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {

        //given
        calc = new CalculatorImpl();

    }

    @Test
    public void emptyDisplayTest(){

        //when
        //patrz wyswietlacz

        //then
        assertTrue(calc.display().isEmpty());
    }

    @Test
    public void shouldDisplay15WhenAdd5And10Test(){

        //when
        calc.add(5,10);

        //then
        String result = calc.display();
        String expected = "15";

        assertEquals(expected,result,"Display must contain 15!");

    }

}