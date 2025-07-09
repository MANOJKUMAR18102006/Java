import java.util.Scanner;
public class sample {
    public static void main(String[] args){
        Scanner v1=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=v1.nextInt();       // Read an integer input for age
        v1.nextLine();               //to consume the newline character left by nextInt()
        System.out.print("Enter your name:");
        String name1=v1.nextLine();
        System.out.println("Hello,"+name1+"! You are " + age + " years old.");

        System.out.print("Enter the amount with you :");
        float f=v1.nextFloat();
        System.out.println("The amount is: " + f);

        System.out.print("Enter true/false:");
        boolean b=v1.nextBoolean();
        System.out.println("The boolean value is: " + b);
        v1.close();
    }
}
