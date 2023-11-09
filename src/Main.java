public class Main {
    public static void main(String[] args) {
        // Classları oluşturduk
        UyeManager manager = new UyeManager();
        KitapManager kitapManager = new KitapManager();
        Gorevli gorevli = new Gorevli();
        GorevliManager gorevliManager = new GorevliManager(gorevli);
        OduncVerme oduncVerme = new OduncVerme();

        System.out.println("\n--Kütüphane Uygulaması--\n");

        // Classları birbirine eşleştirdik: Oduncverme icine uyeManager ve kitapManager'ın classını buradan referans verdik
        oduncVerme.uyeManager = manager;
        oduncVerme.kitapManager = kitapManager;
        //static olarak verdiğimiz class referanslarını da buradan verdik
        Yonetim.kitapManager = kitapManager;
        Yonetim.oduncVerme = oduncVerme;
        Yonetim.uyeManager = manager;
        Yonetim.gorevliManager = gorevliManager;

        // Gorevli örneklerini kullanarak işlemler gerçekleştir
        gorevli.setAd("Ahmet");//gorevli adımızı Ahmet olarak belirledik
        gorevliManager.addGorevli(gorevli);//gorevli referansımız icine Ahmet gorevlisini ekledik
        gorevliManager.deleteGorevli(gorevli);//Ahmet gorevlisin cıkardık
        gorevliManager.deleteGorevli(gorevli);//yine gorevliyi atmaya calıstık ama şuan bir görevli olmadığından hata mesajı alıcaz
        gorevli.setAd("Mahmut");
        gorevliManager.addGorevli(gorevli);//mahmut adlı görevliyi ekledik

        // Gorevli listesini görüntülettik
        Yonetim.getGorevliList();
        System.out.println("-----------");

        // Üyeleri listemize eklettik ve Mustafa adlı üyeyi çıkardık
        manager.add("Mustafa");
        manager.add("Cem");
        manager.add("Ahmet");
        manager.add("Barış");
        manager.add("Fatih");
        manager.delete("Mustafa");
        System.out.println("-----------");

        // Üye listesini görüntüle
        Yonetim.getUyeList();

        System.out.println("-----------");

        // Kütüphanemizdeki kitap stoklarına kitap ekledik
        kitapManager.add("Küçük Prens");
        kitapManager.add("Cehennem");
        kitapManager.add("Hayvan Çiftliği");
        kitapManager.add("Sefiller");
        System.out.println("-----------");

        // Kütüphane kitap listesini görüntüle
        Yonetim.getKutuphaneKitapList();
        System.out.println("-------------");

        // adı ve kitap ismi parametrelerini vererek kütüphane üyelerimize kitap verdik
        try {//eger hata verirse diye try catch içerisinde yazdık hata verirse de exception consol ekranında yazdırılacak
            oduncVerme.oduncVer("Ahmet", "Kürk Mantolu Madonna");// kürk mantolu madonna kütüphanemizde tanımlı olmadığından hata mesajı yazacak
            oduncVerme.oduncVer("Cem", "Cehennem");
            oduncVerme.oduncVer("Barış", "Hayvan Çiftliği");
            oduncVerme.geriBirak("Barış", "Hayvan Çiftliği");
            oduncVerme.oduncVer("Fatih", "Sefiller");
        } catch (Exception exception) {
            System.out.println(exception);
        }

        // Ödünç listesini görüntüle
        Yonetim.getOduncList();
    }
}
