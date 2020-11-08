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

    @Test
    public void shouldAdd5TimesSuccessedTest(){
        calc.add(5,10);
        assertEquals("15",calc.display(),"Display must contain 15!");
        calc.add(5,1);
        assertEquals("6",calc.display(),"Display must contain 6!");
        calc.add(5,0);
        assertEquals("5",calc.display(),"Display must contain 5!");
        calc.add(8,1);
        assertEquals("9",calc.display(),"Display must contain 9!");
        calc.add(2,10);
        assertEquals("12",calc.display(),"Display must contain 12!");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldDisplayErrorWhenDivByZeroTest(){

        //when
        calc.div(12,0);

        //then
        // za pomoca adnotacji przed metoda
    }

}