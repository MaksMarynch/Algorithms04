import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    @Order(1)
    @Test
    public void testSumArrayHappyPath (){
        int[] income = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(income);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testSumArrayHappyPathNegativeNumbers (){
        int[] income = {-7, -3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(income);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testSumArrayNull(){
        int[] income = {0, 0};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(income);

        Assertions.assertEquals(expectedResult,actualResult);
    }



}
