package homework1;
import java.util.Arrays;
    public class homework {

        public static void main(String[] args) {
            // Выводятся все результаты сразу, для проверки поэтапно нужно комментировать "лишние" строки в методе main.
            
            System.out.println(isSumBetween10And20(5, 15)); // true
            System.out.println(isSumBetween10And20(7, 15)); // false
        
            System.out.println(isPositive(5)); // true
            System.out.println(isPositive(-3)); // false
        
            printString("abcd", 5); // abcdabcdabcdabcdabcd

            System.out.println(isLeapYear(1862)); // false
            System.out.println(isLeapYear(2012)); // true

            System.out.println(Arrays.toString(createArray(4, 3)));

            changeArray();
            arrayProd ();
            matrixDiagonal(4);
           
        
        }
        
        /**
         * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
         * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
         */
        private static boolean isSumBetween10And20(int a, int b) {
            // проверить, что сумма a и b лежит между 10 и 20
            int sum = a + b;
            if (sum >= 10 && sum <= 20) { // если между 10 и 20 включительно
                return true;
            } else {
                return false;
            }
        }
        
        private static boolean isPositive(int x) {
            // проверить, что х положительное
            if (x > 0) {
                return true;
            } else {
                return false;
            }
        }
        
        private static void printString(String source, int repeat) {
            // напечатать строку source repeat раз
            for (int i = 0; i < repeat; i++) {
                System.out.print(source);
            }
            System.out.println();
        }
        
        private static boolean isLeapYear(int year) {
            // проверить, является ли год високосным. если да - return true
            if (year % 4 == 0 && year % 100 != 0 | year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
        
        private static int[] createArray(int len, int initalValue) {
            // должен вернуть массив длины len, каждое значение которого равно initialValue
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = initalValue;
            }
            return array;
        }
        

        private static void changeArray () {
            // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
            // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
            int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    array[i] = 0;
                } else {
                    array[i] = 1;
                }                
            }
            System.out.println(Arrays.toString(array));
        }

        private static void arrayProd () {
            //  2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
            int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6) {
                    array[i] = array[i]*2;
                }
            }
            System.out.println(Arrays.toString(array));
        }

        private static void matrixDiagonal(int size) {
            // 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
            // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
            // например: [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]] // int x = array[2][3];
            // Определить элементы одной из диагоналей можно по следующему принципу: 
            // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
            // ** Также заполнить элементы побочной диагонали
            int[][] array = new int[size][size]; 
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (i==j | i+j == size-1){
                        array[i][j] = 1;
                    }
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();                
            }
        }

}