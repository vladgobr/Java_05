import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddEven;

public class OddEvenTest {

    @Test
    public void testHappyOdd() {
        int value = -345;
        String expectedResult = -345 + " → " + "Odd";


        String actualResult = new OddEven().oddEven(value);

        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public void testHappyEven() {
        int value = 0;
        String expectedResult = 0 + " → " + "Even";

        String actualResult = new OddEven().oddEven(value);

        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public void testHappyEven2() {
        int value = 222222;
        String expectedResult = 222222 + " → " + "Even";

        String actualResult = new OddEven().oddEven(value);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
