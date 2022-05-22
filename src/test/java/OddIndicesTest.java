import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class OddIndicesTest {

    @BeforeEach

    @Order(1)
    @Test
    public void testOddIndicesHappyPath() {

        int[] income = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.arrayOdd(income);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
    @Order(2)
    @Test
    public void testOddIndicesHappyPathLongerArray(){
            int[] income = {-45, 590, 234, 985, 12, 68, 79, 93, 47, 15};
            int[] expectedResult = {590, 985, 68, 93, 15};

            OddIndices oi = new OddIndices();
            int[] actualResult = oi.arrayOdd(income);
            Assertions.assertArrayEquals(expectedResult, actualResult);
        }

    @Order(3)
    @Test
    public void testOddIndicesHappyPathMoreShortArray(){
        int[] income = {-45, 590, 234};
        int[] expectedResult = {590};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.arrayOdd(income);
        Assertions.assertArrayEquals(expectedResult,actualResult);

    }


    @Order(4)
    @Test
    public void testOddIndicesArrayEmpty(){
        int[] income = {};
        int[] expectedResult = {};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.arrayOdd(income);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }



}

