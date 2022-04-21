import java.util.*;

public class Methods {

    static Scanner scan = new Scanner(System.in);
    static Map<Integer,Urun> urunListesi=new HashMap<>();

    public static void girisEkrani(){

        System.out.println("Lütfen yapmak istediğiniz işlemi seçin"
                + "Ürün tanımlama : 1\n"
                + "Ürün listeleme : 2\n"
                + "Ürün girişi :3\n"
                + "Ürün rafa koyma : 4\n"
                + "Ürün çıkışı : 5\n"
                + "İşlemi bitirme : 6");

        String secim = scan.nextLine();

        switch (secim) {
            case "1":
                urunTanimla();
                break;
            case "2":
                urunListele();
                break;
            case "3":
                urunGirisi();
                break;
            case "4":
                urunRafaKoy();
                break;
            case "5":
                urunCikis();
                break;
            case "6":
                bitir();
                break;
            default:
                System.out.println("Hatalı giril yaptınız. Tekrar deneyin");
                girisEkrani();
                break;
        }

    }


    public static void urunTanimla(){


    }
    public static void urunListele(){


    }
    public static void urunGirisi(){

    }
    public static void urunRafaKoy(){

    }
    public static void urunCikis(){

    }
    private static void bitir() {
        System.out.println("Yine bekleriz :)");
        System.exit(0);
    }
}
