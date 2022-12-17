import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.IsPositiveNumber;

public class IsPositiveNumberTest {

    @Test
    public void testIsPositive() {
        int a = 555;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPosotiveNumber(a);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIsPositiveZero() {
        int a = 0;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPosotiveNumber(a);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIsPositiveMinus() {
        int a = -555;
        boolean expectedResult = false;

        boolean actualResult = new IsPositiveNumber().isPosotiveNumber(a);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
