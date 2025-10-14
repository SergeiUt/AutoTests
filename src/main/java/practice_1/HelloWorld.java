package practice_1;

public class HelloWorld {
    //поля
    static int a = 1;







    //методы
    public static void main(String[] args){

      int sum1 = sum(1001,2000);
      System.out.println("Результат сложения " + sum1);

      int mult1 = multiply(3,2);
      System.out.println("Результат умножения " + mult1);

      int subs1 = substruct(12,6);
      System.out.println("Результат вычитания " + subs1);

      double div1 = divide(12,6);
      System.out.println("Результат деления " + div1);

    }

    public static int sum(int x, int y) {
        //тело метода

        return x + y; //возвращаемое значение из метода
    }

    public static int multiply(int p, int k) { //аргументы метода
        //тело метода
        return p * k;

    }

    public static int substruct(int a, int b) {

        return a - b;

    }

    //возвращаемый тип данных - целое или нет?
    public static double divide(int f, int w) {

        return (double) f / w;
    }



}
