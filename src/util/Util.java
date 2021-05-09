package util;

import java.util.Scanner;

public class Util {

public static String unesiString(String tekst){
    System.out.println(tekst);
    Scanner scanner = new Scanner(System.in);
    String answer = scanner.nextLine();
    return answer;




}
public static int unesiInt(String tekst){
    System.out.println(tekst);
    Scanner scanner = new Scanner(System.in);
    int answer  = scanner.nextInt();
    return answer ;

}
public static String unesiInfo(){
    String imePrezime = unesiString("Unesi ime i prezime");
    String email =unesiString("Unesi e-mail");
    String brojTelefona =unesiString("Unesi broj telefona");
    return "name: " + imePrezime + " email: " + email + " telefon:" +brojTelefona;

}
public static String unesiInfoPuta(){
    String lokacija = unesiString("Vaša lokacija:");
    int putnik = unesiInt("Broj putnika:");
    String vrijeme = unesiString("Unesi vrijeme");
    String pravila = unesiString("Navedite pravila, npr: Nema pušenja....");
    return "Vaša destinacija od "+ lokacija + " sa"+ putnik+ " putnika s ovim pravilima."+ pravila +" u "+ vrijeme;
}
    }

