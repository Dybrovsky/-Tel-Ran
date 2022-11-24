package Enum;

public enum MonthEnum {
    JANUARY("WINTER"),
    FEBRUARY("WINTER"),
    MARCH("SPRING"),
    APRIL("SPRING"),
    MAY("SPRING"),
    JUNE("SUMMER"),
    JULY("SUMMER"),
    AUGUST("SUMMER"),
    SEPTEMBER("AUTUMN"),
    OCTOBER("AUTUMN"),
    NOVEMBER("AUTUMN"),
    DECEMBER("WINTER");

    String season;

    private MonthEnum(String season) {
        this.season = season;
    }

    public static void whatToDo(MonthEnum m) {
        System.out.print(m + " is a " + m.season + " so lets ");
        switch (m.season) {
            case "WINTER":
                System.out.print("Ride to ski");
                break;
            case "SPRING":
                System.out.print("Collect flowers");
                break;
            case "SUMMER":
                System.out.print("Ride on a Bicycle");
                break;
            case "AUTUMN":
                System.out.print("Walks");
                break;
        }
    }
}
