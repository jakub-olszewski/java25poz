package pl.sdacademy.javapoz25;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * TODO Zadanie: Zaimplementuj tak aby testy przeszły pozytywnie
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : java25poz
 * @since : 08.11.2020
 **/
public class CafeTest {

    Cafe cafe;

    @Before
    public void before(){
        // given
        cafe = new Cafe();
    }

    @Test
    public void shouldServeCoffee(){

        // when
        cafe.serveCoffe(); // serwuje kawe

        // then
        assertTrue(cafe.canServeCoffee());
        // sprawdzam czy kawa zostala zaserwowana
    }

    @Test
    public void shouldNotServeCoffee(){

        // when
        //nie serwuje kawy

        // then
        assertFalse(cafe.canServeCoffee());
        // sprawdzam czy kawa nie zostala zaserwowana
    }
}
