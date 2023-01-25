package tudelft.ghappy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest(name ="test_word={0}")
    @CsvSource({"tishkone","ciao-marco"})
    public void noGinWord(String test_word) {
        GHappy word = new GHappy();
        boolean result = word.gHappy(test_word);
        Assertions.assertEquals(true, result);
    }

    @ParameterizedTest(name ="test_word={0}")
    @CsvSource({"gorilla","hedge","hedgehog","eagle","google","goggles"})
    public void isolatedGinWord(String test_word) {
        GHappy word = new GHappy();
        boolean result = word.gHappy(test_word);
        Assertions.assertEquals(false, result);
    }

    @ParameterizedTest(name ="test_word={0}")
    @CsvSource({"oggi","aggiotaggio","piogggia", "ggiorno"})
    public void pairsGinWord(String test_word) {
        GHappy word = new GHappy();
        boolean result = word.gHappy(test_word);
        Assertions.assertEquals(true, result);
    }


}
