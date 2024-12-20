import java.util.Scanner;
public class Asg1q3 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("**MAJLIS DAERAH DARULAMAN**");

        System.out.print("\nNumber of type A violation        : ");
        int numviolA = Integer.parseInt (sc.nextLine());

        System.out.print("Number of type B violation        : ");
        int numviolB = Integer.parseInt (sc.nextLine());

        System.out.print("Number of type C violation        : ");
        int numviolC = Integer.parseInt (sc.nextLine());

        System.out.print("Number of type D violation        : ");
        int numviolD = Integer.parseInt (sc.nextLine());


        System.out.print("Payment before deadline (Y or N)  : ");
        char deadline = Character.toLowerCase(sc.next().charAt(0));
        
        
       
        double fine =(numviolA*150)+(numviolB*220)+(numviolC*350)+(numviolD*570);

        if (numviolA>10){
            fine+=(numviolA-10)*10;
        }
        if (numviolB>10){
            fine+=(numviolB-10)*10;
        }
        if (numviolC>10){
            fine+=(numviolC-10)*10;
        }
        if (numviolA+numviolB+numviolC>20){
            fine+=20;
        }
        if (numviolD>3){
            fine+=30;
        }

        
        switch (deadline){
         case 'y' : fine*=0.90;
                     break;
         case 'n' : break;
        }


        System.out.println("\n\nOutput:\nTotal fine = "+fine);
    }
}
