package serviceUtil;

import glavni.Gradovi;
import util.Util;

import java.util.LinkedList;

public class Service {
    public static void meni1() throws Exception{
        String info = Util.unesiInfo();
        System.out.println(info);
        System.out.println("Dobrodošli");
        String grad = Util.unesiString("Kamo želite ići?");
        System.out.println("Provjeravam :" +grad.toUpperCase());
        Thread.sleep(4000);
        Gradovi gradovi = new Gradovi();
        LinkedList<String> list = gradovi.getList();
        if(list.contains(grad.toUpperCase())){
            System.out.println("Dostupne su vožnje za: "+ grad.toUpperCase());
            String infoPuta = Util.unesiInfoPuta();
            System.out.println(infoPuta);





        }else{
            System.out.println("Nema dostupnih vožnji\tOvo su dostupne vožnje:");
            Gradovi gradovi2 = new Gradovi();
            LinkedList<String> list1 = gradovi2.getList();
            for (String s:list1){
                System.out.println(s);
            }
        }
    }
    public static void meni2(){
        String info = Util.unesiInfo();
        System.out.println(info);
        String auto = Util.unesiString("Unesite vrstu auta");
        String destinacija = Util.unesiString("Kamo vozite?");
        String pozicija = Util.unesiString("Vaša trenutnna pozicija:");
        int kapacitet = Util.unesiInt("Koliko putnika primate?");
        String pravila = Util.unesiString("Unesite svoja pravila:");
        System.out.println("Vrsta auta :" + auto + "od" + pozicija+ "do" +
                destinacija + "sa" + kapacitet + "putnika i s ovim pravilima: "+ pravila);
    }
    public static void meni3(){
        System.out.println("BlaBlaCar je pouzdana zajednica za razmjenu koja vozače sa slobodnim mjestima u autu povezuje s\n" +
                " putnicima koji traže prijevoz. Zahvaljujući predanoj korisničkoj usluzi, vrhunskoj web i mobilnoj platformi te\n" +
                " zajednici korisnika koja ubrzano raste, BlaBlaCar milijunima članova omogućuje društveno, štedljivo i učinkovitije putovanje." +
                "Podaci o tvrtki\n" +
                "40 milijuna članova\n" +
                "22 zemlje\n" +
                "više od 2 milijuna dostupnih putovanja u svakom trenutku u budućnosti\n" +
                "gotovo 5 milijardi podijeljenih kilometara\n" +
                "godišnja procijenjena ušteda naših vozača od oko 2,16 milijardi kuna\n" +
                "smanjenje emisija CO2 za otprilike 700.000 tona\n" +
                "prosječna popunjenost automobila od 2,8 putnika (u usporedbi s prosjekom od 1,6)\n" +
                "više od 21 milijuna učitanih aplikacija (iPhone i Android)\n" +
                "2.000.000 pratitelja na Facebooku (na svim stranicama na Facebooku zajedno)");
    }
    }

