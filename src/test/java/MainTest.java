import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    //=================================== first task =================================================
    Main main = new Main();

    @Test
    public void checkThreeNumsTestPositive() {
        Assert.assertEquals(3, main.minFromThreeNums(25, 3, 50));
        Assert.assertEquals(3, main.minFromThreeNumsVerTwo(25, 3, 50));
    }

    @Test
    public void checkThreeNumsTestZero() {
        Assert.assertEquals(0, main.minFromThreeNums(54, 27, 0));
        Assert.assertEquals(0, main.minFromThreeNumsVerTwo(54, 27, 0));
    }

    @Test
    public void checkThreeNumsTestNegativeValue() {
        Assert.assertEquals(-11, main.minFromThreeNums(115, -11, 0));
        Assert.assertEquals(-11, main.minFromThreeNumsVerTwo(115, -11, 0));
    }

    @Test
    public void checkThreeNumsTestThreeNegativeValues() {
        Main main = new Main();
        Assert.assertEquals(-251, main.minFromThreeNums(-124, -251, -2));
        Assert.assertEquals(-251, main.minFromThreeNumsVerTwo(-124, -251, -2));
    }

    @Test
    public void checkThreeNumsTestDuplicateValuesMin() {
        Assert.assertEquals(27, main.minFromThreeNums(27, 46, 27));
        Assert.assertEquals(27, main.minFromThreeNumsVerTwo(27, 46, 27));
    }

    @Test
    public void checkThreeNumsTestDuplicateValuesMax() {
        Assert.assertEquals(11, main.minFromThreeNums(11, 12, 12));
        Assert.assertEquals(11, main.minFromThreeNumsVerTwo(11, 12, 12));
    }

    @Test
    public void checkThreeNumsTestThreeEqualValues() {
        Assert.assertEquals(7, main.minFromThreeNums(7, 7, 7));
        Assert.assertEquals(7, main.minFromThreeNumsVerTwo(7, 7, 7));
    }

    //========================================== second task =================================================
    @Test
    public void checkAbbreviationTestPositive() {
        Assert.assertEquals("МГУ", main.abbreviationForSrtrings("московский государственный университет"));
        Assert.assertEquals("МГУ", main.abbreviationForSrtringsVerTwo("московский государственный университет"));
    }

    @Test
    public void checkAbbreviationTestMix() {
        Assert.assertEquals("Ч0ИQ", main.abbreviationForSrtrings("четыре 000 и qwerty"));
        Assert.assertEquals("Ч0ИQ", main.abbreviationForSrtringsVerTwo("четыре 000 и qwerty"));
    }

    @Test
    public void checkAbbreviationEnglish() {
        Assert.assertEquals("MEU", main.abbreviationForSrtrings("moscow electrotechnical university"));
        Assert.assertEquals("MEU", main.abbreviationForSrtringsVerTwo("moscow electrotechnical university"));
    }

    @Test
    public void checkAbbreviationTestWithoutSpaces() {
        Assert.assertEquals("М", main.abbreviationForSrtrings("московскийQwerty123"));
        Assert.assertEquals("М", main.abbreviationForSrtringsVerTwo("московскийQwerty123"));
    }

    @Test
    public void checkAbbreviationTestDigits() {
        Assert.assertEquals("0101", main.abbreviationForSrtrings("0000 1111 0101 1100"));
        Assert.assertEquals("0101", main.abbreviationForSrtringsVerTwo("0000 1111 0101 1100"));
    }
}
