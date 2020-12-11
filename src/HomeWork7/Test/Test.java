package HomeWork7.Test;

import HomeWork7.NBRBLoader;
import HomeWork7.SiteLoader;

public class Test {
    public static void main(String[] args) {
        printRates(new NBRBLoader());
    }

    public static void printRates(SiteLoader loader){
        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUB));
        System.out.println(loader.load(SiteLoader.Currency.USD));
    }
}
