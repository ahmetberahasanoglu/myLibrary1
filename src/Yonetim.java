import java.util.ArrayList;
import java.util.HashMap;

public class Yonetim {
    //Bu kodda listelerimizdeki değerleri main'de new ile initialize etmeden static biçimde listelettik.
    static KitapManager kitapManager;
    static GorevliManager gorevliManager;
    static OduncVerme oduncVerme;
    static UyeManager uyeManager;
    //Sırasıyla Listeleri alacağımız classların referansını ve Listeleri aldık
    public static void getKutuphaneKitapList() {
        System.out.println("Kutuphanedeki kitaplarımız " + kitapManager.getList());
    }

    public static void getGorevliList() {
        System.out.println("Kutuphanedeki görevlilerimiz " + gorevliManager.getGorevliList());
    }
    public static void getUyeList() {
        System.out.println("Kütüphanedeki Üyeler" + uyeManager.getList());
    }
    public static void getOduncList() {//odunc listesinde hem kütüphanedeki tanımlanan üyeleri hem de verdiğimiz kitapları gösterttik
        System.out.println("-----");
        System.out.println("Kütüphanedeki Üyeler" + uyeManager.getList());
        System.out.println("Verdiğimiz kitaplar" + oduncVerme.getBorcKitaplar());
    }

}
