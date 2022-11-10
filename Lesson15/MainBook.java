
public class MainBook {

    public static void main(String[] args) {

        Book bookOne = new Book("The adventures of Dunno and his friends", 1954, "N. Nosov"); // создаем объект класса
                                                                                              // Бук через кастомный
                                                                                              // конструктор
        Book bookTwo = new Book("Screw, Tongue and Groove and vacuum cleaner", 1956, "N. Nosov");
        Book bookThree = new Book("Dunno in the Sunny City", 1958, "N. Nosov");
        Book bookFour = new Book("Dunno on the Moon", 1965, "N. Nosov");
        Book bookFive = new Book("The Adventures of Pinocchio", 1936, "A. Tolstoy");

        // bookOne - ссылочная переменная типа Book содержащая адрес на участок памяти,
        // который содержит набор данных (инт, инт, стринг).

        Book[] MyBooks = { bookOne, bookTwo, bookThree, bookFour, bookFive }; // массив содержащий объекты класса Бук.
                                                                              // То есть ссылочные переменные,
                                                                              // содержающие адреса участков памяти с
                                                                              // набором данных.
                                                                              // Массив содержащий переменные типа Book

        printBooks(MyBooks);

        System.out.println();

        printBooks(MyBooks, 1958, 1965);

    }

    public static void printBooks(Book[] books) {

        for (Book i : books) {

            System.out.println(i);
        }

    }

    public static void printBooks(Book[] books, int fromYear, int toYear) {

        for (Book i : books) {

            if (i.year >= fromYear && i.year <= toYear) {

                System.out.println(i);
            }
        }

    }

}
