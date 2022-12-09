import java.util.Scanner;
// We used IntelliJ IDEA compiler
// This is a Library Management System program
// This Work Done by : Youssef Mohamed Kamel & Omar Adel Saad
// This program contain 11 classes and a main class
// This program used java and mysql connected together using JDBS

public class Main {

    public static void main(String[] args) {
        String name;
        int id ;
        userINT userInterface = new librarianDB() ;
        BookINT bookInterface = new librarianDB();
        requestInt requestInt = new userDB();
        System.out.println("Library Management System");
        Scanner sc = new Scanner(System.in);

    do {
        System.out.println("1-Librarian\n"+
                            "2-User\n");
        System.out.println("Enter Choice please :");
        int ch1 = sc.nextInt();
        switch (ch1) {
            case 1:
                System.out.println("1- add user\n" +
                        "2-show all users\n " + "3-delet user\n" + "4-Add Book\n" + "5-Delete Book\n" + "6-Show All Books\n");
                int ch = sc.nextInt();
                switch (ch) {
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
                        System.out.println("Enter the name to delete ");
                        name = sc.next();
                        userInterface.deleteuser(name);
                        break;
                    case 4:
                        Book b1 = new Book();
                        System.out.println("Enter Book ID:");
                        int bookID = sc.nextInt();
                        System.out.println("Enter Book Name");
                        String book_Name = sc.next();
                        System.out.println("Enter Book Author");
                        String book_Author = sc.next();
                        System.out.println("Enter Book Quantity");
                        int book_quant = sc.nextInt();
                        System.out.println("Enter Book Price");
                        double book_price = sc.nextFloat();
                        System.out.println("Enter Book Edition");
                        String book_edition = sc.next();
                        System.out.println("Enter Book Publisher");
                        String book_publisher = sc.next();
                        b1.setBookID(bookID);
                        b1.setBookName(book_Name);
                        b1.setAuthor(book_Author);
                        b1.setQuantity(book_quant);
                        b1.setPrice(book_price);
                        b1.setEdition(book_edition);
                        b1.setPublisher(book_publisher);
                        bookInterface.creatbook(b1);
                        break;
                    case 5:
                        System.out.println("Enter Book ID to delete");
                        int Bookid = sc.nextInt();
                        bookInterface.deletbook(Bookid);
                        break;
                    case 6:
                        bookInterface.showAllbooks();
                        break;
                    case 7:
                        System.exit(0);
                    default:
                        System.out.println("Enter valid choice ");
                        break;
                }
                break;
            case 2:
                System.out.println("Please enter your ID \n");
                int userID = sc.nextInt();
                System.out.println("Please Enter your Password");
                String user_pass = sc.next();
                requestInt.verifyInfo(userID, user_pass);
                System.out.println("Please Choose an option:\n" + "1-Buy Book\n" + "2-Show All Books\n");
                int ch3 = sc.nextInt();
                switch (ch3) {
                    case 1:
                        System.out.println("Enter Book Name you want to purchase:");
                        String book_name = sc.next();
                        requestInt.verifyBookName(book_name);
                        requestInt.showBookByName(book_name);
                        System.out.println("Proceed with order?\n" + "1-Yes\n" + "2-No\n");
                        int ch4 = sc.nextInt();
                        switch (ch4) {
                            case 1:
                                System.out.println("Order Confirmed!");
                                break;
                            case 2:
                                System.out.println("Order Cancelled");
                                break;
                        }
                        break;
                    case 2:
                        bookInterface.showAllbooks();
                        break;
                }
                break;
            case 3 : System.exit(0);
            default:
                System.out.println("Enter valid choice ");
                break;
        }

   }while (true);

    }

}