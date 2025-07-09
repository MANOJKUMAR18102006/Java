import java.util.Scanner;
public class scannerExample {
    public static void main(String[] args){
        Scanner v1=new Scanner(System.in);


        //System.out.print("Enter your name:");
       // String v2=v1.nextLine();


        System.out.print("Enter your age:");
        int age=v1.nextInt();       // Read an integer input for age
        v1.nextLine();             //to consume the newline character left by nextInt()


        //System.out.print("Hello,"+ v2 + "!");
        //int age=Integer.parseInt(v1.nextLine());


        System.out.print("Enter your name:");
        String name1=v1.nextLine();
        System.out.print("Hello,"+name1+"! You are " + age + " years old.");
        v1.close();
    }
}
