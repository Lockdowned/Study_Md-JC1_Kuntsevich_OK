package DZ1Vol1;

public class NewSleepIn {
    public static void main(String[] args) {
        boolean isWeekday = true;
        boolean isVacation = false;
      if (sleepIn(isWeekday, isVacation)){
          System.out.println("Можем спать дальше");
      } else {
          System.out.println("Пора идти на работу");
      }
        /*
        or
         */
        if (sleepIn(false, false)){
          System.out.println("Можем спать дальше");
      } else {
          System.out.println("Пора идти на работу");
      }


    }
    static boolean sleepIn(boolean weekday, boolean vacation){
        if (!weekday || vacation){
            return true;
        } else return false;
    }
}
