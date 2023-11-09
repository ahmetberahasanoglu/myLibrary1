import java.util.ArrayList;

public class GorevliManager extends Gorevli {
    private Gorevli gorevli;//Gorevli'yi dışarıdan referans aldık böylece ayrı bir hash oluşturmak yerine dışarıdan belirlediğimizi kullanıcaz
    private ArrayList<String> gorevliList;//gorevlileri saklayan private bir liste tanımladık

    public GorevliManager(Gorevli gorevli) {//constructer ekledik ve bunun sayesinde mainde tanımladıgımız Gorevli class'ına eriştik
        this.gorevli = gorevli;//bu classtaki gorevli'yi maindeki gorevliye eşitledik
        gorevliList = new ArrayList<>();//gorevli listemizi tanımladık
    }

    public void addGorevli(Gorevli isim) {//gorevlileri eğer bool adSet true ise gorevlilist'e ekledik
        if (!gorevli.getAdSet()) {
            System.out.println("hata   ");
            return;
        }
        System.out.println(isim.getAd() + " görevlisi eklendi");
        gorevliList.add(isim.getAd());


    }


    public void deleteGorevli(Gorevli gorevliAdi) {
        if (!gorevli.getAdSet()) {//eğer boolean adSet false ise gorevliler eklenemez diye hata mesajı verdirttik
            System.out.println("Önce bir ad belirlemelisiniz.");
            return;//islemi bitirdik
        }

        if (gorevliList.contains(gorevliAdi.getAd())) {//eger adSet yapıldı ve gorevliListesinde mainde belirttiğimiz gorevli adu bulunuyorsa
            //gorevliyi listeden cıkardık
            System.out.println(gorevliAdi.getAd() + " görevlisi çıkarıldı");
            gorevliList.remove(gorevliAdi.getAd());
        } else {//bir ad belirlenmiş ama görevlistesinde aradığımız ad yoksa hata mesajı verdirdik
            System.out.println("silinmesi gereken görevli bulunamadı.");
        }
    }

    public ArrayList<String> getGorevliList() {
        return gorevliList;
    }//private gorevli listesine dışarıdan erişmek için encapsulate ettik

}
