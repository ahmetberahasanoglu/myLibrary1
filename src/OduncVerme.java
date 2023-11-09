import java.util.ArrayList;

public class OduncVerme {
    private ArrayList<String> borcKitaplar = new ArrayList<>(10);
    //borc kitapları bulunduracak listeyi, en fazla 10 tane kitap bulunduracak şekilde tanımladık.
    // daha fazla da olabilir ya da kitap sayısı arttıkca artacak şekilde de olabilirdi

    UyeManager uyeManager;
    KitapManager kitapManager;//üye ve kitapManager'ı dışarıdan referans aldık böylece ayrı bir hash oluşturmak yerine dışarıdan belirlediğimizi kullanıcaz

    void oduncVer(String uyeAd, String borcKitap) {
        //uyeAd ve borçkitap parametreleriyle kitap verebilmek icin üye listemizde ve kitaplistemizde bulunuyor mu diye kontrol edicez
        int uyeIndex = -1;
        for (int i = 0; i < uyeManager.getList().size(); i++) {//0'dan uyelistemize kadar döndürerek parametre olarak verdiğimiz
            //uyeAd listemizde bulunuyor mu diye kontrol ettik eğer varsa uyeIndeximizi aldık ve donguyu durdurduk
            if (uyeAd.equals(uyeManager.getList().get(i))) {
                uyeIndex = i;
                break;
            }
        }
        boolean kitapVar = kitapManager.getList().contains(borcKitap);//eğer kitaplistemizde parametremizdeki borcKitap varsa true dondurcek
        if (uyeIndex != -1 && kitapVar) {//kitap da uye de vars, uyeyle kitabı eşleştirebilmek için indexi aynı olsun diye,
            // uyenin karşısında kitap yoksa(0'dan değil borcKitaplar sayısından başlatarak) "yok" yazdırttık
            for (int a = getBorcKitaplar().size(); a <= uyeIndex; a++) {//
                getBorcKitaplar().add("Yok");
            }
            getBorcKitaplar().set(uyeIndex, borcKitap);//daha sonra mesela 2. indexteki üyeye 2. indexte borç kitabı gösterttik
            // ve yazdırdık
            System.out.println(uyeAd + " isimli üyeye " + borcKitap + " kitabı verildi");
        } else {//degilse de uyarı mesajı yazdık
            System.out.println("Geçerli bir üye ismi veya kitap giriniz");
        }
    }

    public void geriBirak(String isim, String kitapAdi) {
        int uyeIndex = -1;
//Geri bırakta da oduncver methoduna benzer şekilde bir sistem var böylece üyeyle aynı indexte olan kitabı kütüphaneye geri bıraktırma kodu yazdık

        for (int i = 0; i < uyeManager.getList().size(); i++) {
            if (isim.equals(uyeManager.getList().get(i))) {
                uyeIndex = i;
                break;
            }//parametredeki isim uyelistesinde var mı diye kontrol edip. Silmemiz gereken indexi bulduk
        }
        if (uyeIndex != -1 && kitapAdi.equals(getBorcKitaplar().get(uyeIndex))) {//eger silmemiz gereken isim belirlediğimiz indexte varsa
            getBorcKitaplar().remove(uyeIndex);//alınan kitabı listeden sildik ve mesaj yazdırdık
            System.out.println(isim + " isimli üyenin " + kitapAdi + " isimli kitabı iade edildi");
        } else {//eger verdiğimiz üye ismi veya kitap ismi listedekilerle uyuşmuyorsa alttakini yazdırdık
            System.out.println("Geçersiz veri girdiniz");
        }
    }

    public ArrayList<String> getBorcKitaplar() {
        return borcKitaplar;
    }//private borc kitapları dışarıdan çağırabilmek için public olarak encapsulate ettik
}




