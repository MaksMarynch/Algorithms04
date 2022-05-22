import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    @Test
    @Order(1)
    public void testBiggerValueHappyPath(){
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }


    @Test
    @Order(2)
    public void testBiggerValueHappyPathNegativeNumbers(){
        int a = -3333;
        int b = -9999;
        int expectedResult = -3333;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }


    @Test
    public void testBiggerValueHappyPathEqual(){
        int a = 3;
        int b = 3;
        int expectedResult = 0;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testBiggerValueNull(){
        int a = 0;
        int b = 3;
        int expectedResult = 3;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testBiggerValueBothNull(){
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

}
