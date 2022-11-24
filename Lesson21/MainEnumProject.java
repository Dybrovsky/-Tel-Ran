package Enum;

public class MainEnumProject {

    public static void main(String[] args) {
        Month january = new Month("January");
        System.out.println(january);
        Month anything = new Month("Anything");
        System.out.println(anything);

        MonthEnum m1 = MonthEnum.AUGUST;
        System.out.println(m1);
        System.out.println(m1.season);

        MonthEnum[] month = MonthEnum.values();
        for (MonthEnum m : month) {
            System.out.println(m + " : " + m.season);
        }
        MonthEnum.whatToDo(m1);
        System.out.println();
        MonthEnum.whatToDo(MonthEnum.FEBRUARY);
        System.out.println();
        MonthEnum.whatToDo(MonthEnum.OCTOBER);
        System.out.println();
        MonthEnum.whatToDo(MonthEnum.MARCH);
    }
}
