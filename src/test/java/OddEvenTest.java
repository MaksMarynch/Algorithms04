import org.junit.jupiter.api.*;

import java.util.SplittableRandom;

public class OddEvenTest {

    OddEven od;
    @BeforeEach
    @Order(1)
    @Test
    public void testOddEvenHappyPathEven(){
        long number = 2;
        String expectedResult = "Even";

        String actualResult = od.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathOdd(){
        long number = 1;
        String expectedResult = "Odd";

        String actualResult = od.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathNull(){
        long number = 0;
        String expectedResult = "Even";

        String actualResult = od.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenUndefined(){
        long number = 2147483648L;
        String expectedResult = "Undefined";

        String actualResult = od.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testOddEvenNegativeNumber(){
        long number = -21474836;
        String expectedResult = "Even";

        String actualResult = od.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

}
