import java.util.Scanner;

public class CellPhoneservice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i>-1; i++) {
            System.out.print("Enter Talk minutes needed: ");
            int talkminutes = sc.nextInt();
            System.out.print("Enter maximum monthly text messages needed: ");
            int textmessages = sc.nextInt();
            System.out.print("Enter maximum monthly data needed (GB): ");
            double datamax = sc.nextDouble();
            char plantype = 'm';
            int planprice = 0;
            if (talkminutes < 500 && textmessages == 0 && datamax == 0) {
                plantype = 'A';
                planprice = 49;
            } else if (talkminutes < 500 && textmessages >= 0 && datamax == 0 ) {
                plantype = 'B';
                planprice = 55;
            } else if (talkminutes >= 500 && datamax == 0 && textmessages <100) {
                plantype = 'C';
                planprice = 61;
            } else if (talkminutes >= 500 && datamax == 0 && textmessages >= 100) {
                plantype = 'D';
                planprice = 70;
            } else if (datamax>=0 && datamax <3) {
                plantype = 'E';
                planprice = 79;
            } else if (datamax >= 3) {
                plantype = 'F';
                planprice = 87;
            }
            System.out.println("The most suitable plan is " + plantype + "\nWith Total Price of: $" + planprice+"\n");
        }
    }
}
