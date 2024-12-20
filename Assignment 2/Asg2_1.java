import java.util.Scanner;
public class Asg2_1 {
    public static double employeeCont(int salary, int age){
        double rate;
        if (age > 65){
            rate = 0.05;
        }
        else if (age > 60){
             rate = 0.075;
        }
        else if (age >55){
            rate = 0.13;
        }
        else{
            rate = 0.20;
        }
        if (salary > 10000){
            return 10000* rate;
        }

        return salary * rate;
    }
    public static double employerCont(int salary, int age){
        double rate;
        if (age > 65){
            rate = 0.075;
        }
        else if (age > 60){
            rate = 0.09;
        }
        else if (age >55){
            rate = 0.13;
        }
        else{
            rate = 0.17;
        }
        if (salary > 10000){
            return 10000* rate;
        }

        return salary * rate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly salary: RM");
        int salary = Integer.parseInt(sc.nextLine());
        while (salary!=-1){
            System.out.print("Enter the age: ");
            int age = sc.nextInt();
            System.out.printf("The employee's contribution is: RM%.2f%n",employeeCont(salary, age));
            System.out.printf("The employer's contribution is: RM%.2f%n",employerCont(salary, age));
            System.out.printf("The total contribution is: RM%.2f%n",(employeeCont(salary, age)+employerCont(salary, age)));
            System.out.print("\nEnter the monthly salary: ");
            salary = sc.nextInt();

        }
        System.out.println("Thank you.");
    }
}