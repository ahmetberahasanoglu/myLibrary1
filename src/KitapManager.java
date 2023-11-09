import java.util.ArrayList;


public class KitapManager extends UyeManager {//UyeManager'la benzer işlevleri kullandığından inherit ettik
    private ArrayList<String> list = new ArrayList<String>();//kitapları içerecek listeyi String genericli ArrayList olarak belirttik

    public void add(String kitapAdi) {//kitapları String bir parametreyle alıp ekledik
        System.out.println(kitapAdi + " kitabı eklendi");
        getList().add(kitapAdi);
    }

    public void delete(String kitapAdi) {//kitapları String bir parametreyle alıp sildik
        System.out.println(kitapAdi + " kitabı cikarildi");
        getList().remove(kitapAdi);
    }

    public ArrayList<String> getList() {
        return list;
    }//bu listeye dışarıdan(başka bir classtan) erişebilmek için public olarak belirtip encapsulate ettik
}
