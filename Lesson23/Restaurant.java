
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Restaurant {

    private String name;
    private String location;

    TreeSet<Dish> menu = new TreeSet<Dish>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Restaurant(String name, String location) {
        super();
        this.name = name;
        this.location = location;
    }

    public void addDish(Dish d) {

        if (menu.contains(d)) { // Если меню уже содержит добавляемое блюдо
            System.out.println("The menu already contains " + d.getName() + "!"); // сообщаем об этом
            return; // выходим из метода
        }

        menu.add(d); // добавляем в Сет меню

        System.out.println(d.getName() + " succefully added in the menu!"); // сообщаем пользователю об успешном добавлении

    }

    public void removeDish(Dish d) {

        if (!menu.contains(d)) { // Если меню не содержит блюдо
            System.out.println("The menu does not contain " + d.getName() + "!"); // сообщаем об этом
            return; // выходим из метода
        }

        menu.remove(d);

        System.out.println(d.getName() + " succefully removed from the menu!"); // сообщаем пользователю об успешном удалении

    }

    public void displayMenu() {
        System.out.println("-----------------------");
        System.out.println("The menu of restaurant " + this.getName() + ":");
        System.out.println("- - - - - - - - - - - - ");

        for (Dish d : menu) {

            System.out.println(d); // выводим туСтринг каждого объекта, который прописан в классе Dish
        }

        System.out.println("-----------------------");
    }

    public void saveMenuToFile(String folderPath) {

        File folder = new File(folderPath); // создаем объект фолдер для работы с папкой

        if (folder.exists() == false) { // если папки не существует - создать
            folder.mkdirs();
        }

        String filePath = folderPath + "\\" + this.getName() + ".txt"; // составляем путь до файла (Название Ресторана.тхт) 

        File file = new File(filePath); // создаем объект файл для работы с файлом

        if (file.exists() == false) { // если файла не существует
            try {
                file.createNewFile(); // создать файл
            } catch (IOException e) {

                e.printStackTrace();
            }

            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                for (Dish d : menu) { // идем по сету Меню

                    String stringToFile
                            = // формируем строку, которую запишем в файл
                            d.getName() + "|" + d.getPrice() + "|" + d.getWeight() + "|" + d.getCalories(); // используем " | " как разделитель

                    bw.write(stringToFile); // записываем в файл полученную строчку
                    bw.newLine(); // переходим на новую строчку в файле
                }

                bw.close();

                System.out.println("The menu saved to file " + this.getName() + ".txt"); // сообщаем о создании файла и его названии

            } catch (IOException e) {

                e.printStackTrace();
            }

        }

    }

    public void readMenuFromFile(String folderPath) {

        File folder = new File(folderPath); // создаем объект фолдер для работы с папкой

        if (folder.exists() == false) { // если папки не существует - создать
            folder.mkdirs();
        }

        String filePath = folderPath + "\\" + this.getName() + ".txt"; // составляем путь до файла (Название Ресторана.тхт) 

        File file = new File(filePath);

        if (file.exists() == false) { // если такого файла не существует

            System.out.println("File not found!");
            return; // выходим из метода
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while (true) { // вечный цикл
                String line = br.readLine(); // считываем строчку из файла
                if (line == null) {
                    break; // если строчка пустая - выходим из цикла и метода

                }
                String[] ar = line.split("\\|"); // запихиваем строчку в массив, разделяя данные по " | "
                String name = ar[0]; // в первой ячейке массива Имя блюда
                double price = Double.parseDouble(ar[1]); // во второй ячейке Цена
                double weight = Double.parseDouble(ar[2]); // в третьей ячейке Вес
                int calories = Integer.parseInt(ar[3]); // в четвертой Каллории

                Dish d = new Dish(name, price, weight, calories); // создаем новый объект Блюдо из полученных данных (полей)

                this.addDish(d); // добавляем созданный объект Блюдо в меню (сет) ресторана
            }
            br.close(); // закрываем объект br
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
