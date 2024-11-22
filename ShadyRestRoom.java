import java.util.Scanner;
public class ShadyRestRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type of Rooms\n1-Queen Bed\n2-King Bed\n3-King and PullOut Couch");
        System.out.print("Please choose preferred room : ");
        int room = input.nextInt();
        int price;
        String chosenroom = "";
        switch (room) {
            case 1:
                price = 125;
                chosenroom = "Queen Bed";
                break;
            case 2:
                price = 139;
                chosenroom = "King Bed";
                break;
            case 3:
                price = 165;
                chosenroom = "King Bed with pullout couch";
                break;
            default:
                price = 0;

        }
        if (price == 0)
            System.out.print("You have entered an invalid room number");
        else
            System.out.println("\nRoom Chosen is " + chosenroom + " with price of $" + price);

    }
}