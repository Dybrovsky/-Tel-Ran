// Task 8
// Два наблюдателя (watcher1 и watcher2) находятся соответственно в (country1 и country2).
// Известно, что country1 находится в часовом поясе (GMT - 5), а country2 - в часовом поясе, опережающем время в country1 на 8 часов.
// В country1 применяется 12-ти часовая система обозначения времени в формате AM(ante meridiem, дословно — «до полудня») - 12.00AM и PM(post meridiem, дословно — «после полудня») - 12.00PM.
// В country2 применяется 24-х часовая система обозначения времени в формате 00.00 - 23.59.

// 1) Значение GMT задать глобально в формате 00.00 - 23.59, объявив над main() в виде:
// 	 static int a = 5;

// 2) Объявить и описать функцию:

// float watcher1 ();

// которая возвращает в функцию main() местное время в country1 для вывода на консоль в соответствии с применяемым форматом.

// 3) Объявить и описать функцию:

// void watcher2 (float hour);

// которая выводит на консоль местное время в country2 в соответствии с применяемым форматом.
// В функцию watcher2 передавать значение из функции main().

// 4) Сделать проверку на возможные некорректные значения времени, переданные в функцию:

// а) Проверка на то, что часы не отрицательны и не больше 23.

// б) Проверка на то, что минуты не отрицательны и не больше 59.
public class Task8 {

    static double time = 16.20;

    public static void main(String[] args) {

        double country1 = time;
        double country2 = time + 8;
        watcher1();
        // double res = (time24to12Hours(time));
        // System.out.printf("%.2f\n", res);
    }

    public static double watcher1() {
        return country1;
    }

    // System.out.printf("%.2f\n", country1);

    public static double time24to12Hours(double time) {
        double result;

        if (time <= 12) {
            result = time;
        } else {
            result = time - 12;
        }
        return result;
    }
}