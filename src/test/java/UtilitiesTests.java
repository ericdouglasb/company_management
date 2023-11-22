import org.example.Level;
import org.example.Utilities;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilitiesTests {

    @ParameterizedTest
    @ValueSource (ints = {1, 3, 5, 7, 9})
    public void testNumberIsOddTrue(int number){
        var expected = true;
        var actual = Utilities.numberIsOdd(number);

        assertEquals(expected,actual);

    }
    @ParameterizedTest
    @ValueSource (ints = {2, 4, 6 ,8})
    public void testNumberIsOddFalse(int number){
        var expected = false;
        var actual = Utilities.numberIsOdd(number);

        assertEquals(expected,actual);

    }
    @ParameterizedTest
    @ValueSource(strings = {"","  ", " ", ""})
    @NullAndEmptySource
    public void testStringIsBlankTrue(String input){
        var expected = true;
        var actual = Utilities.stringIsBlank(input);

        assertEquals(expected,actual);


    }

    @ParameterizedTest
    @ValueSource(strings = {"ff"," tt ", " bb", "cc"})
    public void testStringIsBlankFalse(String input){
        var expected = false;
        var actual = Utilities.stringIsBlank(input);

        assertEquals(expected,actual);


    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testStringIsBlankNull(String input){
        var expected = true;
        var actual = Utilities.stringIsBlank(input);

        assertEquals(expected,actual);

    }

    @ParameterizedTest
    @ValueSource(ints = {5, 15, 25, 30, -1})
    public void testGetNoiseLevelLow(int decibel){
        var expected = Level.LOW;
        var actual = Utilities.getNoiseLevel(decibel);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {45, 55, 38, 67})
    public void testGetNoiseLevelMedium(int decibel){
        var expected = Level.MEDIUM;
        var actual = Utilities.getNoiseLevel(decibel);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {70, 85, 95, 100})
    public void testGetNoiseLevelHigh(int decibel){
        var expected = Level.HIGH;
        var actual = Utilities.getNoiseLevel(decibel);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"tEsT:test","teST:test"},delimiter = ':')
    public void testMakeStringLowercase(String input, String expected) {
        var actual = Utilities.makeStringLowercase(input);


        assertEquals(expected, actual);
    }

}
