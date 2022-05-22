public class OddIndices {
    /**
     * Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    public static int[] arrayOdd (int[] income) {

        int count = 0;
        int[] arrayOdd = {};

        for (int i = 0; i < income.length; i++) {
            if (i % 2 == 0) {
                income[i] = 0;
            }
        }
        for(int i = 0; i < income.length; i++){
            if (income[i] == 0){
                count++;
            }
        }
        arrayOdd = new int[income.length - count];
        count = 0;
        for(int i = 0; i < income.length; i++){
            if(income[i] != 0){
                arrayOdd[count] = income[i];
                count++;
            }
        }

        return arrayOdd;
    }
}
