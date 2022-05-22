import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ConditionalActionsTest {

    @Order(1)
    @Test
    public void areNumbersEqualTestHappyPathMultipleThreeAndFive() {
        int M = 15;
        String expectedResult = "Good Number";

        ConditionalActions ca = new ConditionalActions();
        String actualResult = ca.conditionalActions(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void areNumbersEqualTestHappyPathMultipleThree() {
        int M = 9;
        String expectedResult = "Bad Number";

        ConditionalActions ca = new ConditionalActions();
        String actualResult = ca.conditionalActions(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void areNumbersEqualTestHappyPathMultipleFive() {
        int M = 10;
        String expectedResult = "Poor Number";

        ConditionalActions ca = new ConditionalActions();
        String actualResult = ca.conditionalActions(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void areNumbersEqualTestHappyPathNoMultiple() {
        int M = 7;
        String expectedResult = "-1";

        ConditionalActions ca = new ConditionalActions();
        String actualResult = ca.conditionalActions(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}

