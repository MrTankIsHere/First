import java.util.Scanner;

/**
 * Marks
 */
public class Marks {

    public static void main(String[] args) {
        
        int java, c, cpp, html;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for java: ");
        java = sc.nextInt();
        System.out.println("Enter marks for c: ");
        c = sc.nextInt();
        System.out.println("Enter marks for cpp: ");
        cpp = sc.nextInt();
        System.out.println("Enter marks for html: ");
        html = sc.nextInt();

        sc.close();

        int avg = (java+c+cpp+html)/4;

        System.out.println("Average of the marks is: "+avg);

    }
    
}