package DZ1Vol1;

import java.util.Scanner;

public class OperatorBranching5_3 {
    public static void main(String[] args) {
        Scanner iN = new Scanner(System.in);
        System.out.print("Ваше имя: ");
        String name = iN.nextLine();
        switch (name){
            case "Вася":
                System.out.println("Привет! \nЯ тебя так долго ждал");
            break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                iN.close();
        }
    }
}
