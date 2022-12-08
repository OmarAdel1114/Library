import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int id  ;
        String name;
        userINT userInterface = new librarianDB() ;

        System.out.println("Library Management System");
        Scanner sc = new Scanner(System.in);

    do {
        System.out.println("1- add user\n"+
        "2-show all users\n "+ "3-delet user\n");
        System.out.println("Enter Choice please :");
        int ch = sc.nextInt();

        switch (ch){

            case 1:
                User us = new User();
                System.out.println("Enter ID: ");
                 id = sc.nextInt();
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
            userInterface.showAllusesrnames();
                break;
            case 3:
                System.out.println("Enter the to delete ");
                name =sc.next();
                userInterface.deleteuser(name);
                break;
                case 4:
                System.exit(0);
            default:
                System.out.println("Enter valid choice ");
                break;
        }
   }while (true);

    }

}