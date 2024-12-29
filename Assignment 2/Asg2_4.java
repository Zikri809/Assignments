import java.util.Scanner;
public class Asg2_4 {
    public static void displayall(String [] name , int [] age , double [] height, double [] weight , String [] langname){
        System.out.println("\nDisplaying all prpgrammer\n");
        for (int i = 0 ; i<name.length; i++){
            System.out.println("                        Programmer "+(i+1)+"                        ");
            System.out.println("Name = "+name[i]);
            System.out.println("Age = "+age[i]);
            System.out.println("Height = "+height[i]);
            System.out.println("Weight = "+weight[i]);
            System.out.println("Language = "+langname[i]);
        }
    }
    public static void searchlang(String [] name ,  String [] langname, String search){
        int foundcount=0;
        for (int i = 0 ; i< langname.length ; i++){
            if (search.equals(langname[i])){
                System.out.println(name[i]);
                foundcount+=1;
            }
        }
        if (foundcount==0){
                System.out.println("There's no programmer that are fluent in such language ");
            }
            
    }
    
    public static void searchbmi(String [] name  , double [] height, double [] weight , double [] bmi  ){
        System.out.println("Programmers with BMI >=30 : ");
        for (int i = 0 ; i< bmi.length ; i++){
            if (bmi[i]>=30){
                System.out.println(name[i]+", "+height[i]+", "+weight[i]);
            }
        }
    }
    public static void oldestprogrammer(int [] age, String [] name){
        int largest = 0;
        int largestindex=0;
        for (int i=0; i<age.length;i++){
            if (age[i]>=largest){
                largest=age[i];
                largestindex=i;
            }
        }
        System.out.println("Oldest programmer = "+name[largestindex]);
    }
    public static double bmicalc(double height, double weight){
        return weight / (height*height);
        }
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        String [] name = new String [5];
        int [] age = new int [5];
        double [] height = new double [5];
        double [] weight = new double [5]; 
        double [] bmi = new double [5];
        String [] langname = new String [5];
        for (int i = 0 ; i<age.length; i++){
        System.out.print ("Enter programmer name> ")  ;
        name [i] = input.nextLine();
        System.out.print("Enter programmer age> ");
        age[i]=Integer.parseInt(input.nextLine());
        System.out.print("Enter programmer height> ");
        height[i]=Double.parseDouble (input.nextLine());
        System.out.print("Enter programmer weight> ");
        weight[i]=Double.parseDouble (input.nextLine());
        System.out.print("Enter programmer language> ");
        langname[i]=input.nextLine();
        System.out.println();    
        bmi [i]=bmicalc(height[i],weight[i]);
        }
        displayall(name , age , height, weight ,langname);
        System.out.println("\n***************************************************");
        System.out.print("Enter a language>");
        String search =input.nextLine();
        searchlang(name,langname,search);
        System.out.println("\n\n**************************************************");
        searchbmi(name , height, weight ,bmi  );  
        System.out.println("\n**************************************************");
        oldestprogrammer(age,name);    
        
    }
}