import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.StringMethods;

public class StringMethodsTest {

    @Test
    public void testHappySecondMetod() {
        String str = "Red Rover School";
        String expectedResult = "Пробелов не было";

        String actualResult = new StringMethods().farewell(str);

        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public void testHappySecondMetod1() {
        String str = "    Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";

        String actualResult = new StringMethods().farewell(str);

        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public void testHappySecondMetod2() {
        String str = "";
        String expectedResult = "Строка пустая";

        String actualResult = new StringMethods().farewell(str);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
