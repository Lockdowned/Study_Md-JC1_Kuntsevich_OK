package DZ1Vol1;

import java.util.Objects;
import java.util.Scanner;

public class OperatorBranching5_2 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Ваше имя: ");
        String name = In.nextLine();
        String Name1 = "Вася";
        String Name2 = "Анастасия";
        boolean isBoy = (Objects.equals(Name1, name));
        boolean isGirl = (Objects.equals(Name2, name));
        if (isBoy){
            System.out.println("Привет! \nЯ тебя так долго ждал");
        } else  if (isGirl){
            System.out.println("Я тебя так долго ждал");
        } else if (!isBoy && !isGirl){
            System.out.println("Добрый день, а вы кто?");
        }
        In.close();
    }
}
