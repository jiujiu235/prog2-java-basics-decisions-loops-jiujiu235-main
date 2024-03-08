import java.util.Scanner;
public class Main { public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your email address: ");
        String emailAddress = scanner.nextLine();
        BookStore BookStore = new BookStore(firstName, lastName, emailAddress);
        BookStore.displayBookList();
    
        int choice;
        System.out.print("Enter the book bookID you want to order: ");
        String bookbookID = scanner.nextLine();
        BookStore.searchBook(bookbookID);
            System.out.println("How do you want to order the book?");
            System.out.println("1. Rent");
            System.out.println("2. Purchase");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            BookStore.orderBook(choice);
        BookStore.orderConfirmation();
    }
}

    
