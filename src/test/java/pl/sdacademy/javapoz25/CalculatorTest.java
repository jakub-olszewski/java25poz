package pl.sdacademy.javapoz25;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;
import static pl.sdacademy.javapoz25.CalculatorImpl.DIV_ERROR_MESSAGE;

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

    /**
     * Testowanie wyjątku zasadach ogólnych
     */
    @Test(expected = IllegalArgumentException.class)
    public void shouldDisplayErrorWhenDivByZeroTest(){

        // when
        calc.div(13,0);

        // then
    }

    /**
     * Testowanie wyjątku z użyciem asercji
     */
    @Test
    public void shouldDisplayErrorWhenDivByZero2Test(){

        // when
        try {
            calc.div(13, 0);
        }catch (Exception e){
            assertTrue(e instanceof IllegalArgumentException);
            assertTrue(e.getMessage().contains(DIV_ERROR_MESSAGE));
        }
        // then
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    /**
     * Test wyjatku z użycniem reguły @Rule
     */
    @Test
    public void shouldDisplayErrorDivByZero3Test(){
        // then
        // konfiguracja asercji reguły
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(DIV_ERROR_MESSAGE);

        // when
        calc.div(3,0);

    }

    /**
     * TODO Zadanie: Test pressNumber() z wartości null
     * zrzuca wyjatek IllegalArgumentException
     * Przetestuj na 3 sposoby. ( ogólnie, try/catch, rule)
     */

}