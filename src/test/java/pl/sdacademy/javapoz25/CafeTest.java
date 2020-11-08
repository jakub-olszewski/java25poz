package pl.sdacademy.javapoz25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : java25poz
 * @since : 08.11.2020
 **/
public class CafeTest {

    @Test
    public void shouldServeCoffee(){

        // given
        Cafe cafe = new Cafe();

        // when
        cafe.serveCoffe(); // serwuje kawe

        // then
        assertTrue(cafe.canServeCoffee());
        // sprawdzam czy kawa zostala zaserwowana

    }

    @Test
    public void shouldNotServeCoffee(){

        // given
        Cafe cafe = new Cafe();

        // when
        //nie serwuje kawy

        // then
        assertFalse(cafe.canServeCoffee());
        // sprawdzam czy kawa nie zostala zaserwowana
    }
}
