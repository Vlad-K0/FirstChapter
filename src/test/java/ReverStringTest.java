import com.vladko.RevertString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverStringTest {
    private final RevertString revertString = new RevertString();

    @Test
    void revertStringTest() {
        String originalString = "J@va the be$t!123";
        String resultString = revertString.revertString(originalString);
        assertEquals("t@eb eht av$J!123", resultString);
    }

    @Test
    void voidStringTest(){
        String originalString = "";
        String resultString = revertString.revertString(originalString);
        assertEquals("", resultString);
    }

    @Test
    void oneLetterStringTest(){
        String originalString = "a";
        String resultString = revertString.revertString(originalString);
        assertEquals("a", resultString);
    }

    @Test
    void onlyLetterStringTest(){
        String originalString = "abcd";
        String resultString = revertString.revertString(originalString);
        assertEquals("dcba", resultString);
    }

    @Test
    void LetterStringTest(){
        String originalString = "#asdasd$adsads$";
        String resultString = revertString.revertString(originalString);
        assertEquals("#sdasda$dsadsa$", resultString);
    }

    @Test
    void RegisterStringTest(){
        String originalString = "SbombOmH";
        String resultString = revertString.revertString(originalString);
        assertEquals("HmObmobS", resultString);
    }
}
