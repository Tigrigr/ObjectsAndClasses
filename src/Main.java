import Homework_1_12.Author;
import Homework_1_12.Book;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Ява", "Конструктовна");
        Author author2 = new Author("Конструктор", "Явовный");
        Author author3 = new Author("Конструктор", "Явовный");
        Book book = new Book("Конструкторы в Java", author, 2022);
        Book book2 = new Book("Java в конструкторах", author2, 2023);
        Book book3 = new Book("Java в конструкторах", author3, 2023);


        System.out.println("Сравнение первого и второго автора: " + author.equals(author2));
        System.out.println("Сравнение второго и третьего автора: " + author2.equals(author3));
        System.out.println("Сравнение первой и второй книги: " + book.equals(book2));
        System.out.println("Сравнение второй и третьей книги: " + book2.equals(book3));

    }
}