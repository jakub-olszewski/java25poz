package pl.sdacademy.solve;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;
import pl.sdacademy.javapoz25.matchers.Person;

import java.util.Date;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : java25poz
 * @since : 08.11.2020
 **/
public class PersonAssert extends AbstractAssert<PersonAssert, Person> {

    public PersonAssert hasNoBirthDay() {
        isNotNull();

        String assertjErrorMessage = "\nExpecting Person <%s> to havent birthday\n but was:\n  <%s> ";

        // null safe check
        Date birthdayDate = actual.getBirthdayDate();

        if (!Objects.areEqual(birthdayDate, null)) {
            failWithMessage(assertjErrorMessage, actual.getName(), birthdayDate);
        }

        // return the current assertion for method chaining
        return this;
    }

    public PersonAssert(Person actual) {
        super(actual, PersonAssert.class);
    }

    public static PersonAssert assertThat(Person actual) {
        return new PersonAssert(actual);
    }

}