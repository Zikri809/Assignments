import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CASESTUDY2ARRAY {
    public static void display(int [][] ticketquant){
        System.out.println("             City 1     City 2      City 3      City 4      City 5");
        for (int row = 0; row < ticketquant.length; row++) {
            System.out.print("City " + (row + 1) + "            ");
            for (int col = 0; col < ticketquant[row].length; col++) {
                System.out.print(ticketquant[row][col] + "          ");
            }
            System.out.println();
        }

    }
    public static double total(double [][] tickettable,int city, int destination, int [][] ticketquant,int quant){
        ticketquant[city-1][destination-1] += quant;
        return quant*tickettable[city-1][destination-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double [][] tickettable = {
                {0,30.00,42.00,55.00,88.50},
                {30.00,0,15.00,40.50,75.00},
                {42.00,15.00,0,35.00,60.50},
                {55.00,40.50,35.00,0,28.00},
                {88.50,75.00,60.50,28.00,0}
        };
        int [][] ticketquant = new int[tickettable.length][tickettable[0].length];

        for (int row =0 ; row<tickettable.length; row++){
            for (int column = 0; column<tickettable[0].length; column++){
              ticketquant [row][column]=0;
            }
        }

        for (boolean controlflag=true; controlflag;) {
            System.out.println("            JERAI LINER SYSTEM          ");
            System.out.println("-------------------------------------------------------");
            System.out.println("|       1. Tickets Purchase     |");
            System.out.println("|       2. Display Report       |");
            System.out.println("|       3. Exit                 |");
            System.out.println("-------------------------------------------------------");
            System.out.print("Enter your choice> ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                System.out.print("Enter origin city (1-5)> ");
                int city = Integer.parseInt(sc.nextLine());
                System.out.print("Enter destination city (1-5)> ");
                int destination = Integer.parseInt(sc.nextLine());
                System.out.print("Enter number of tickets> ");
                int quant = Integer.parseInt(sc.nextLine());
                System.out.println("-------------------------------------------------------");
                System.out.println("From        :       City " + city);
                System.out.println("To          :       City " + destination);
                System.out.println("Quantity    :            " +quant);
                System.out.println("Total Amount = " + total(tickettable, city, destination, ticketquant,quant));
                System.out.println("-------------------------------------------------------");
                break;
                case 2:
                    System.out.println("-----------------------------------------------------------------------------");
                    display(ticketquant);
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                case 3:
                    controlflag=false;
                    break;

            }
        }
        System.out.println("=================================");
        System.out.println("            THANK YOU!           ");
        System.out.println("=================================");



    }
}