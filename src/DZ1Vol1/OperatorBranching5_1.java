package DZ1Vol1;

import java.util.Scanner;

public class OperatorBranching5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ваше имя: ");
        String name = in.nextLine();
        if (name.equals("Вася")){
            System.out.println("Привет!\n" + "Я тебя так долго ждал");
        } else {
            if (name.equals("Анастасия")) {
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
        }

        in.close();

    }

}
