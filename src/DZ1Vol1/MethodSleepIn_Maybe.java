package DZ1Vol1;

public class MethodSleepIn_Maybe {
    public static void main(String[] args) {
        System.out.println(sleepIn(false, true));
    }
    static String sleepIn(boolean weekday, boolean vacation){
        if (weekday || vacation)
            return "Можем спать дальше";
        else
            return "Пора идти на работу";
    }
}