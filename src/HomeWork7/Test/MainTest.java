package HomeWork7.Test;

import HomeWork7.FileSaver;
import HomeWork7.NBRBLoader;
import HomeWork7.SiteLoader;


public class MainTest {
    public static void main(String[] args){
        printRates(new NBRBLoader());

        SiteLoader realize = new NBRBLoader();

        String finalText = textToWrite(realize);

        FileSaver fileSaver = new FileSaver();
        fileSaver.toWrite(finalText);

    }

    public static void printRates(SiteLoader loader){
        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUB));
        System.out.println(loader.load(SiteLoader.Currency.USD));
    }

    public static String textToWrite(SiteLoader siteLoader){
        String eur = "EUR = " + siteLoader.load(SiteLoader.Currency.EUR) + "\n";
        String rub = "RUB = " + siteLoader.load(SiteLoader.Currency.RUB) + "\n";
        String usd = "USD = " + siteLoader.load(SiteLoader.Currency.USD) + "\n";
        return eur + rub + usd;
    }
}