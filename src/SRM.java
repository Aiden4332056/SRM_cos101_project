import java.util.Scanner;

public class SRM {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("PLease enter your username and password (in that order) on two separate lines ");
        String username= input.nextLine();
        String password = input.nextLine();

        if(username.equals("4332056")){
            System.out.println("Welcome user");
            if(password.equals("SRM4332056")){
                System.out.println("password is correct");

            } else {
                System.out.println("password incorrect, you have one more try ");
                password = input.nextLine();
                if(password.equals("SRM4332056")){

                    System.out.println("Password is correct ");
                }else{
                    System.out.println("Password is incorrect. Program will now shut down");
                    System.exit(0);
                }

            }
        } else {
            System.out.println("You are not a registered member ");
            System.exit(0);}


    System.out.println("Press 1 to access a students information or press 2 to add a student to the database");
    String ans = input.nextLine();
    if (ans.equals("1")){
        System.out.println("Please enter the students name, student number, age, and grade average (in that order) in different lines below");
        String name = input.nextLine();
        String studentNumber = input.nextLine();
        String age = input.nextLine();
        String gradeAverage = input.nextLine();
        System.out.println("Name: " + name+ "; student number: "+ studentNumber + ", age: " + age+"; grade average: "+gradeAverage);}

        if (ans.equals("2")) {
            System.out.println("There is no current student information ");
    }


    }




}
