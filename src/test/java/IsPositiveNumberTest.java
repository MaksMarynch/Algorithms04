import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class IsPositiveNumberTest {

    @Order(1)
    @Test
    public void TestIsPositiveNumberHappyPath(){
        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumber ip = new IsPositiveNumber();
        boolean actualResult = ip.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void TestIsPositiveNumberHappyPathNegative(){
        int a = -555;
        boolean expectedResult = false;

        IsPositiveNumber ip = new IsPositiveNumber();
        boolean actualResult = ip.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void TestIsPositiveNumberHappyPathNul(){
        int a = 0;
        boolean expectedResult = true;

        IsPositiveNumber ip = new IsPositiveNumber();
        boolean actualResult = ip.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }




}
