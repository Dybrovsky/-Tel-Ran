
public class Book {

    String name; // свойства класса (будущих объектов)
    int year;
    String author;

    public Book(String name, int year, String author) { // кастомный конструктор для быстрого создания объекта класса

        // super();

        this.name = name;
        this.year = year;
        this.author = author;

    }

    @Override
    public String toString() { // переписываем метод туСтринг, выводящий информацию об объекте класса Бук
        return "Book name: " + name + ", Year: " + year + ", Author: " + author;

    }

}
