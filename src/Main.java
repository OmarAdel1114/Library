import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        userINT userInterface = new librarianDB() ;

        System.out.println("Library Management System");
        Scanner sc = new Scanner(System.in);

    do {
        System.out.println("1- add user\n"+
        "2-delet user\n "+ "3-show all users\n");
        System.out.println("Enter Choice please :");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
               User us = new User();
                System.out.println("Enter ID: ");
                int id = sc.nextInt();
                System.out.println("Enter user Fname: ");
                String fname = sc.next();
                System.out.println("Enter user Lname: ");
                String lname = sc.next();
                System.out.println("Enter user password");
                String pass = sc.next();
                us.setUserID(id);
                us.setUserFname(fname);
                us.setUserLname(lname);
                us.setPassword(pass);
                userInterface.creatuser(us);
           break;
            case 2:
                System.exit(0);
            default:
                System.out.println("Enter valid choice ");
                break;

        }
   }while (true);

    }

}