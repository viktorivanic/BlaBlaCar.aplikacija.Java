package glavni;

import serviceUtil.Service;
import util.Util;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Glavna {

    public static void main(String[] args) throws Exception {
        System.out.println("Dobrodošli u BlaBlaCar aplikaciju\nOdaberite broj:");
        Scanner scanner = new Scanner(System.in);

        String opcije = "1-Nađi vožnju\n" +
                "2-Pruži vožnju\n" +
                "3-Info\n" +
                "0-Izlaz";
        while (true) {
            System.out.println(opcije);
            int meni = scanner.nextInt();
            String nacionalnost = Util.unesiString("Jeste li stranac ili domaći?");

            if (nacionalnost.equalsIgnoreCase("stranac")) {
                int putovnica = Util.unesiInt("Unesi broj putovnice");
                System.out.println("Provjeravam broj......");
                Thread.sleep(3000);
                System.out.println("Broj potvrđen!");
            } else if (nacionalnost.equalsIgnoreCase("domaći")) {

            } else {
                System.out.println("Unesite jednu od dvije navedene opcije");
                break;

            }
            if (meni == 1) {
                Service.meni1();
                break;
            } else if (meni == 2) {
                Service.meni2();
                break;
            } else if (meni == 3){
                System.out.println("Ovo je info o nama");
            Service.meni3();
            break;
            }
            else if (meni == 0){
                System.out.println("Izlazim iz sustava");
            break;}

            else
                System.out.println("Morate odabrati jedan od ponuđenih brojeva");
            break;

        }
    }
}