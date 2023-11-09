import java.util.ArrayList;

public class UyeManager {

    private ArrayList<String> uyeList = new ArrayList<String>();//üyeleri içerecek listeyi String genericli ArrayList olarak belirttik

    void add(String uye) {//uyeleri String bir parametreyle alıp ekledik
        System.out.println(uye + " uyesi eklendi");
        getList().add(uye);
    }

    public void delete(String uye) {//uyeleri String bir parametreyle alıp sildik
        System.out.println(uye + " uyesi cikarildi");
        getList().remove(uye);
    }

    public ArrayList<String> getList() {
        return uyeList;
    }//bu listeye dışarıdan(başka bir classtan) erişebilmek için public olarak belirtip encapsulate ettik
}
