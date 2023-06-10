//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

/**
 * Task_01
 */
public class Task_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
         int sum =0 ;
        for (int i = 0; i < num; i++) {
             sum += i + 1;
            
        }
        
        System.out.println("Сумма чисел равна: " + sum);  
        System.out.println("Введите число:");
        int number = sc.nextInt();
        int result = 1;
        for (int i = 0; i < number; i++) {
            result *= i + 1;
        }
       
        System.out.println("Факториал равен: " + result);
         sc.close();
    }
}