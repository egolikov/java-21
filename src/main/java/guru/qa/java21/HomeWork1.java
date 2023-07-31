package guru.qa.java21;

public class HomeWork1 {

    public static void main(String[]args){

        // 1. Прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
        byte aByte = -128; // 8bit
        byte bByte = 127;

        short aShort = -32768; // 16bit
        short bShort = 32767;

        char aChar = '\u0003'; // 16bit

        int aInt = -2147483648; // 32bit
        int bInt = 2147483647;

        long aLong = -9223372036854775808L; // 64bit
        long bLong = 9223372036854775807L;

        float aFloat = 1.4e-45f; // 32bit
        float bFloat = 3.4e+38f;

        double aDouble = 4.9e-324; // 64bit
        double bDouble = 1.7e+308;

        boolean aBoolean = true; // 8bit or 32bit
        boolean bBoolean = false;

        String aString = "iamString"; // ...bit


        // 2. Поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, вывести в консоль
        int a = 20;
        int b = 45;
        int c = 35;

        // Математические операторы
        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = "+ (a*b));
        System.out.println("a / b = "+ (a/b));
        System.out.println("a % b = "+ (a%b));
        System.out.println("++a = "+ (++a));
        System.out.println("--b = "+ (--b));
        System.out.println("********************");

        // Логические операторы
        if (a > b && b < c) {
            System.out.println("a > b && b < c is True!");
        } else {
            System.out.println("a > b && b < c is False!");
        }

        if (c < a || b > a) {
            System.out.println("c < a || b > a is True!");
        } else {
            System.out.println("c < a || b > a is False!");
        }

        if (c != a || b == a) {
            System.out.println("c != a || b == a is True!");
        } else {
            System.out.println("c != a || b == a is False!");
        }

        System.out.println("********************");

        // Переполнение
        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue + 1 : " + (maxValue + 1));
        System.out.println("********************");


        // 3. Попробовать вычисления комбинаций типов данных (int и double)
        int x = 500;
        double y = 99.99;

        // Математические операторы с int и double
        System.out.println("x + y = "+ (x+y));
        System.out.println("y - x = "+ (y-x));
        System.out.println("x * y = "+ (x*y));
        System.out.println("y / x = "+ (y/x));
        System.out.println("x % y = "+ (x%y));

    }
}
