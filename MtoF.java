import java.util.Scanner;

public class MtoF {

    public static void main(String[] args) {
        
        double mtr, feet;
            
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Meter : ");
        mtr = sc.nextDouble();
        sc.close();


        feet = 3.28084*mtr;
        System.out.println("Feet : "+feet);

    }
}