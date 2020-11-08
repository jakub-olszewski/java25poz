package pl.sdacademy.javapoz25;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : java25poz
 * @since : 08.11.2020
 **/
//@RunWith(JUnit4.class) //-domyślna wartość
@RunWith(value = Parameterized.class)
public class CalculatorParametersConstructorTest {

    private int numberA;
    private int numberB;
    private String expectedResult;

    public CalculatorParametersConstructorTest(int numberA, int numberB, String expectedResult){
        this.numberA = numberA;
        this.numberB = numberB;
        this.expectedResult = expectedResult;
    }

    /**
     *
     * @return zwraca dane do testów
     */
    @Parameterized.Parameters(name = "Test {index}: {0} + {1} = {2}")// wymagana adnotacja danych do testów
    public static Collection<Object> data(){
        return Arrays.asList(
          new Object[][]{
                  {1,2,"3"},// musi być kolejność jak w konstruktorze!
                  {3,7,"10"},
                  {55,33,"88"},
                  {2,4,"6"},
                  {1,6,"7"},
          }
        );
    }

    @Test
    public void shouldAddSuccessExecuteTest(){
        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.add(numberA,numberB);

        //then
        String resultDisplay = calc.display();

        String message = numberA + "+" +numberB+" must be equal! "+expectedResult;

        assertEquals(expectedResult,resultDisplay,message);
    }

    /**
     * TODO Zadanie: Wykonanie testu parametryzowanie przez konstruktor na odejmowanie
     */
}
