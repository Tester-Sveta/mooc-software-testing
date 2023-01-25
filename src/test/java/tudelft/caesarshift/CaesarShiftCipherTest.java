package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void messageWithLowerCaseAndPositiveShift() {
        CaesarShiftCipher our_message = new CaesarShiftCipher();
        String result = our_message.CaesarShiftCipher("abc",3);
        Assertions.assertEquals("def", result);
    }
    @Test
    public void messageWithLowerCaseAndNegativeShift() {
        CaesarShiftCipher our_message = new CaesarShiftCipher();
        String result = our_message.CaesarShiftCipher("def",-3);
        Assertions.assertEquals("abc", result);
    }
    @Test
    public void messageWithALetterInUpperCaseCaseAndPositiveShift() {
        CaesarShiftCipher our_message = new CaesarShiftCipher();
        String result = our_message.CaesarShiftCipher("Def",3);
        Assertions.assertEquals("invalid", result);
    }
    @Test
    public void messageWithALetterInUpperCaseCaseAndNegativeShift() {
        CaesarShiftCipher our_message = new CaesarShiftCipher();
        String result = our_message.CaesarShiftCipher("Def",-3);
        Assertions.assertEquals("invalid", result);
    }
    @Test
    public void messageWithNotConsecCharAndPositiveShift() {
        CaesarShiftCipher our_message = new CaesarShiftCipher();
        String result = our_message.CaesarShiftCipher("aeh",3);
        Assertions.assertEquals("dhk", result);
    }

    @Test
    public void messageWithNotConsecCharAndNegativeShift() {
        CaesarShiftCipher our_message = new CaesarShiftCipher();
        String result = our_message.CaesarShiftCipher("aeh",-3);
        Assertions.assertEquals("xbe", result);
    }

    @Test
    public void messageWithCornerCasesAndNegativeShift() {
        CaesarShiftCipher our_message = new CaesarShiftCipher();
        String result = our_message.CaesarShiftCipher("aaaa",-3);
        Assertions.assertEquals("xxxx", result);
    }
    @Test
    public void messageWithCornerCasesAndPositiveShift() {
        CaesarShiftCipher our_message = new CaesarShiftCipher();
        String result = our_message.CaesarShiftCipher("xyz", 1);
        Assertions.assertEquals("yza", result);
    }



}
