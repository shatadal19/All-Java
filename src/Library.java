public class Library {

    private static int totalBooks = 0;
    private static int totalMembers = 0;


    public static void addBooks(int numberOfBooks) {
        if (numberOfBooks > 0) {
            totalBooks += numberOfBooks;
            System.out.println(numberOfBooks + " Success add. Total books: " + totalBooks);
        } else {
            System.out.println("No Book There");
        }
    }

    public static void registerMember(int a) {

        totalMembers =a;
        System.out.println("New member registered. Total members: " + totalMembers);
    }


    public static void borrowBook(int numberOfBooksToBorrow) {
        if (numberOfBooksToBorrow > 0 && numberOfBooksToBorrow <= totalBooks) {
            totalBooks -= numberOfBooksToBorrow;
            System.out.println("Books borrowed successfully. Remaining books: " + totalBooks);
        } else {
            System.out.println("There are no books available.");
        }
    }


    public static void returnBook(int numberOfBooksReturned) {
        if (numberOfBooksReturned > 0) {
            totalBooks += numberOfBooksReturned;
            System.out.println("Books returned successfully. Total books: " + totalBooks);
        } else {
            System.out.println("Please provide a positive number.");
        }
    }


    public static void main(String[] args) {
        addBooks(100);
        registerMember(2);
        borrowBook(10);
        returnBook(5);
    }
}