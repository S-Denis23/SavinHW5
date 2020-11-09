import java.util.Scanner;

public class CT1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if((number&(number-1))==0){
            System.out.println("Является стпенью двойки");
        }else{
            System.out.println("Не является степенью двойки");
        }
    }
}
