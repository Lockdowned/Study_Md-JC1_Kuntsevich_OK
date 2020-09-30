package DZ1Vol1;

import java.util.Objects;
import java.util.Scanner;

public class OperatorBranching5_1correct {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Ваше имя: ");
            String yourName = in.nextLine();
            String name1 = "Вася";
            String name2 = "Анастасия";
            boolean isVasya = (Objects.equals(name1, yourName));
            boolean isNastya = (Objects.equals(name2, yourName));
            if (isVasya) {
                System.out.println("Привет!\n" + "Я тебя так долго ждал");
            }
            if (isNastya) {
                System.out.println("Я тебя так долго ждал");
            }
            if (!isVasya && !isNastya) {
                System.out.println("Добрый день, а вы кто?");
            }



            in.close();
        }
}

