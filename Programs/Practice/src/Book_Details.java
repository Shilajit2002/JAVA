import java.util.*;

class Author {
    String name;
    String email;

    public Author() {
        this.name = "";
        this.email = "";
    }

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "\n-- Author Details --\n" +
                "Name = " + name + '\n' +
                "Email = " + email;
    }
}

class Book {
    String name;
    double price;
    Author bookAuthor[];

    public Book(String name, double price, Author[] bookAuthor) {
        this.name = name;
        this.price = price;
        this.bookAuthor = bookAuthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author[] getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(Author[] bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < bookAuthor.length; i++) {
            str += bookAuthor[i];
        }
        return "\n-- Book Details --\n" +
                "Name = " + name + '\n' +
                "Price = " + price + str;
    }
}

public class Book_Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Name : ");
        String bookName = sc.nextLine();
        System.out.print("Enter Book Price : ");
        double bookPrice = sc.nextDouble();

        System.out.print("Enter total no. of authors for " + bookName + " Book : ");
        int n = sc.nextInt();

        Author[] bookAuthor = new Author[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Author Name : ");
            String authorName = sc.next();
            System.out.print("Enter Author EmailID : ");
            String authorEmail = sc.next();

            bookAuthor[i] = new Author(authorName, authorEmail);
        }

        Book B = new Book(bookName, bookPrice, bookAuthor);

        System.out.println(B);
    }
}