public class Kitabxana2 {
    private String yazici;
    private String kitabAdi;
    private String kitabinSeriyaNomresi;
    private double qiymet;
    private int Eded;
    public Kitabxana2(String yazici, String kitabAdi, String kitabinSeriyaNomresi, double qiymet, int eded) {
        this.yazici = yazici;
        this.kitabAdi = kitabAdi;
        this.kitabinSeriyaNomresi = kitabinSeriyaNomresi;
        this.qiymet=qiymet;
        Eded = eded;
    }

    public void setYazici(String yazici) {
        this.yazici = yazici;
    }

    public void setKitabAdi(String kitabAdi) {
        this.kitabAdi = kitabAdi;
    }

    public void setKitabinSeriyaNomresi(String kitabinSeriyaNomresi) {
        this.kitabinSeriyaNomresi = kitabinSeriyaNomresi;
    }

    public void setQiymet(double qiymet) {
        this.qiymet = qiymet;
    }

    public void setEded(int eded) {
        Eded = eded;
    }

    public String getYazici() {
        return yazici;
    }

    public String getKitabAdi() {
        return kitabAdi;
    }

    public String getKitabinSeriyaNomresi() {
        return kitabinSeriyaNomresi;
    }

    public double getQiymet() {
        return qiymet;
    }

    public int getEded() {
        return Eded;
    }

}
