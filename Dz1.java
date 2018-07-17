package ru.geekbrains.homework;

public class Dz1 {
    public static void main(String[] args) {
    }
   public static void task2() {
        byte b = 127;
        short s = 12419;
        char c = 'A';
        int i = 24;
        long l = 124124L;
        float f = 12.345949f;
        double d = 4323.45345;
        boolean bool = true;
    }
    public static double calculate(double a, double b, double c, double d) {
        return a * (b + (c / d));}

    public static boolean task10and20(int a, int b){
        return 10 <= a + b && a + b <= 20;}

    public static void printPositiveOrNegative(int num) {
        String x = "Положительное";
        if (num < 0) x = "Отрицательное";
        System.out.println(x);}

    public static boolean isNegative(int num) {
        return num < 0;
    }

    public static void sayHello(String name) {
        System.out.printf("Привет, мир", name);}

    public static boolean eighth(int year){
        return year % 100 != 0 && year % 4 == 0 || year % 400 ==0;
    }
}
