import java.util.Scanner;
class LT_307385{
   public static void main(String [] args){
      Scanner sc = new Scanner (System.in);
      System.out.print("Enter Customer name: ");
      String name= sc.nextLine();
     System.out.print("Enter account number: ");
     int accnum= sc.nextInt();
     System.out.print("Enter Customer total units consumed: ");
     int unit= sc.nextInt();
     
     System.out.println("");
     System.out.println("Displaying Bill for account number "+accnum+":");
     System.out.println("========================================================================");
     System.out.println("Customer Name = "+name);
     System.out.println("Total unit consumed: "+unit);
     System.out.println("");
     
     double tax ;
     double total;
     if (unit<=150){
         total = unit*0.218;
         System.out.println("               First 150: RM"+total);
         tax=0.11;

     }
     else if (unit>150 &&unit<=300){
         total = (150*0.218)+((unit-150)*0.334);
          System.out.println("               First 150:     RM0.218 X 150     =     RM "+(0.218*150));
          System.out.printf("               Next %-3d :     RM0.334 X %-3d     =     RM %.2f%n",(unit-150),(unit-150),((unit-150)*0.334),total);

          tax=0.11;
     }
     else if (unit > 300 && unit <=600){
         total = (150*0.218)+(150*0.334)+((unit-300)*0.516);
          System.out.println("               First 150:     RM0.218 X 150     =     RM "+(150*0.218));
          System.out.println("                Next 150:     RM0.334 X 150     =     RM "+(150*0.334));
          System.out.printf("               Next %-3d :     RM0.516 X %-3d     =     RM %.2f%n",(unit-300),(unit-300),((unit-300)*0.516),total);

          tax=0.06;
     }
     else{
         total =  (150*0.218)+(150*0.334)+(300*0.516)+((unit-600)*0.571);
          System.out.println("               First 150:     RM0.218 X 150     =     RM "+(150*0.218));
          System.out.println("               Next 150 :     RM0.334 X 150     =     RM "+(150*0.334));
          System.out.println("               Next 300 :     RM0.516 X 300     =     RM "+(300*0.516));
          System.out.printf("               Next %-3d :     RM0.571 X %-3d     =     RM %.2f%n",(unit-600),(unit-600),((unit-600)*0.571),total);
          tax=0.06;


     }
     System.out.printf("Total %d kWh units     :                       =     RM %.2f%n",unit,total);
     System.out.printf("       Tax %2.0f%S          :                       =     RM %.2f%n",(tax*100),"%",(total*tax));
     System.out.printf("Total to be paid        :                       =     RM %.2f%n",(total*(1+tax)));


     
    


   }
}