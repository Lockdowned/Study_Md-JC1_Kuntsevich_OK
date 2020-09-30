package DZ1Vol1;
/*

JUST EXPERIMENT

 */
public class StaticMetod {
    public static void main(String[] args) {
        Noworking No = new Noworking();
        No.weekday = false;
        No.vacation = true;
        No.sleapIN();

    }
}

class Noworking{
    boolean weekday, vacation;


        void sleapIN() {
            if (weekday | vacation) {
                System.out.println("Можем спать дальше");
            } else {
                System.out.println("Пора идти на работу");
            }
        }
    }
