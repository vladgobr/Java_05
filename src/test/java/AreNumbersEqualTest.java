import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.AreNumbersEqual;

public class AreNumbersEqualTest {

    @Test
    public void testHappyAreNumbersEqualZero() {
        int numvl1 = 89;
        int numvl2 = 89;
        int expectedResult = 0;

        int actualResult = new AreNumbersEqual().areNumbersEqual(numvl1,numvl2);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testHappyAreNumbersEqualMinus() {
        int numvl1 = -89;
        int numvl2 = 89;
        int expectedResult = -1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(numvl1,numvl2);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testHappyAreNumbersEqualPlus() {
        int numvl1 = 89;
        int numvl2 = -89;
        int expectedResult = 1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(numvl1,numvl2);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
