import Homework_1_12.Author;
import Homework_1_12.Book;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Ява", "Конструктовна");
        Book book = new Book("Конструкторы в Java", author, 2023);
        Author author2 = new Author("Конструктор", "Явовный");
        Book book2 = new Book("Java в конструкторах", author2, 2023);
        book2.setBookYear(3202);
    }
}