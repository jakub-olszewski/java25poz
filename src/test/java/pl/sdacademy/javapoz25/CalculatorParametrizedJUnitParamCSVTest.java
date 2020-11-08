package pl.sdacademy.javapoz25;

import junitparams.FileParameters;
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
public class CalculatorParametrizedJUnitParamCSVTest {

    @Test
    @FileParameters("src/test/resources/CalculatorParametrizedJUnitParamCSVAddTest.csv")
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

    /**
     * TODO Zadanie: Wykonaj test na odejmowanie z wykorzystaniem CSV
     */
}
