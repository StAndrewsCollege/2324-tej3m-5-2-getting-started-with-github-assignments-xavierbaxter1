
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        while (num<= 1000){

            if (num%4 == 0 && num%3 == 0)
            System.out.println("bizz");
            else if (num%4 == 0)
            System.out.println("buzz");
            else if (num%3==0)
            System.out.println("Bizz Buzz");
            else 
            System.out.println(num);
            num = sc.nextInt();
            
                
       }
    }
}
