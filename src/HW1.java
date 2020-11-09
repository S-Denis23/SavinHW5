import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if((number&(number+1))==number){
            System.out.println("Число четное");
        }else{
            System.out.println("Число не четное");
        }

        if ((number&1)==0){
            System.out.println("Числое четное");
        }else{
            System.out.println("Число не четное");
        }
    }
}
