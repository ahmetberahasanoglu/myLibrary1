public class Gorevli {
    private String ad;
    private Boolean adSet = false;

    public String getAd() {
        return ad;
    }//gorevli adını dışarıdan aldık

    public void setAd(String ad) {//gorevli adını dışarıdan düzenledik
        this.ad = ad;
        setAdSet(true);
    }


    public Boolean getAdSet() {
        return adSet;
    }//dışarıdan boolean adSet'i aldık (encapsulate)

    public void setAdSet(Boolean adSet) {
        this.adSet = adSet;
    }//dışarıdan adSet'i düzenledik bunu OduncVerme classında kullandık
}
