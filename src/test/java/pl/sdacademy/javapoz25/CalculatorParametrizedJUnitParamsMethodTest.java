package pl.sdacademy.javapoz25;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : java25poz
 * @since : 08.11.2020
 **/
@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedJUnitParamsMethodTest {

    /**
     * Metoda zawiera dane do testu dodawania
     * @return
     */
    private Object[] parametersToTestAdd(){
        return new Object[]{
                new Object[]{1,2,"3"},// nastapi rzutowanie
                new Object[]{2,2,4},
                new Object[]{4,2,6}
        };
    }

    /**
     * Test pobiera dane/parametry z metody
     * @param numberA
     * @param numberB
     * @param expectedResult
     */
    @Test
    @Parameters(method = "parametersToTestAdd")
    public void shouldAddSuccessExecuteTest(int numberA,int numberB,String expectedResult){
        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.add(numberA,numberB);

        //then
        String resultDisplay = calc.display();

        String message = numberA + "+" +numberB+" must be equal! "+expectedResult;

        assertEquals(expectedResult,resultDisplay,message);
    }


    @Test
    @Parameters(method = "parametersToTestSub")
    public void shouldSubSuccessExecuteTest(int numberA,int numberB,String expectedResult){
        /**
         * TODO Zadanie: Wykonanie testu parametryzowanie przez metodę na odejmowanie
         * Stwórz dane do testów na odejmowanie za pomoca metody o nazwie z lini 55 , czyli parametersToTestSub
         */
    }
}
