public class SumArray {
    /**
     * Написать алгоритм SumArray, который возвращает сумму всех чисел массива
     *
     * Test Data:
     * {0, 1, 2, 3, 4, 5} → 15
     * {-7, -3} → -10
     */

    public static int sumArray (int[] income) {
        int sum = 0;
        for (int i = 0; i < income.length; i++) {
            sum += income[i];
        }

        return sum;
    }





}
