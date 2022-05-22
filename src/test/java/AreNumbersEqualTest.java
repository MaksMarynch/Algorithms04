import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {

    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPath(){
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual an = new AreNumbersEqual();
        int actualResult = an.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testAreNumbersEqualHappyPathNegativeFirstNumber(){
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual an = new AreNumbersEqual();
        int actualResult = an.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }


    @Order(3)
    @Test
    public void testAreNumbersEqualHappyPathNegativeSecondNumber(){
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual an = new AreNumbersEqual();
        int actualResult = an.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }


}
