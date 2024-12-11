import java.util.Scanner;

public class ArmstrongSimple {
    public static void main(String[] args) {
        int number,arm=0,remainder,change;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        number = scanner.nextInt();
        change=number;
        while (number>0) {
            remainder=number%10;
            arm=(remainder*remainder*remainder)+ arm;
            number=number/10;
        }
        if(change==arm){
            System.out.println("Is a Armstrong number -> " + change);
        }
        else{
            System.out.println("Not Armstrong number -> " + change);
        }
        scanner.close();
    }
}
