package practice_4.solvers;

public class IfElseTaskSolver {
    /**
     * Метод для проверки четности числа
     * @param number
     * @return
     */
    public static void main(String[] args) {
        // проверка метода четности
        System.out.println(checkParity(5));
        System.out.println(checkParity(4));
        // проверка метода определения возраста
        System.out.println(checkAge(15));
        System.out.println(checkAge(34));
        System.out.println(checkAge(67));
        //проверка метода по нахождению максимального значения среди 3 чисел
        System.out.println(checkMax(23, 45, 67));
    }


    public static String checkParity(int number) {
        // if-else
        // в идеале в методе должен быть один return
        String parity = "Нечетное";

        if (number % 2 == 0) {
            parity = "Четное";
        }

        return parity;

    }

    public static String checkAge(int age) {
        String ageDescription = "";
        if (age < 18) {
            ageDescription = "Несовершеннолетний";
        } else if (age > 60) {
            ageDescription = "Пожилой";
        } else {
            ageDescription = "Взрослый";
        }

        return ageDescription;

    }

    public static int checkMax(int a, int b, int c) {
        int maxAB = b;
        if (a > b) {
            maxAB = a;
        }
        int max = maxAB;
        if (c > max) {
            max = c;
        }
        return max;
    }




}
