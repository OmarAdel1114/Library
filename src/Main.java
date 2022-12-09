import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int id ;
        userINT userInterface = new librarianDB() ;
        BookINT bookInterface = new librarianDB();
        System.out.println("Library Management System");
        Scanner sc = new Scanner(System.in);

    do {
        System.out.println("1- add user\n"+
        "2-show all users\n "+ "3-delet user\n"+"4-Add Book\n"+"5-Delete Book\n" + "6-Show All Books\n" + "7-Buy Book\n");
        System.out.println("Enter Choice please :");
        int ch = sc.nextInt();

        switch (ch) {
            case 1 -> {
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
            }
            case 2 -> userInterface.showAllusesrnames();
            case 3 -> {
                System.out.println("Enter the name to delete ");
                name = sc.next();
                userInterface.deleteuser(name);
            }
            case 4 -> {
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
            }
            case 5 -> {
                System.out.println("Enter Book ID to delete");
                int Bookid = sc.nextInt();
                bookInterface.deletbook(Bookid);
            }
            case 6 -> bookInterface.showAllbooks();
            case 7 -> System.exit(0);
            default -> System.out.println("Enter valid choice ");
        }
   }while (true);

    }

}