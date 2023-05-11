import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceKitabxana {
    public static List<Kitabxana> addList = new ArrayList<>();
    public static List<Kitabxana2> addList2 = new ArrayList<>();


    public static void kitabSiyahisi() {
        Kitabxana amfibiya = new Kitabxana("aleksandr belyayev", "amfibiya adam", "36473", 8.49, 5);
        addList.add(amfibiya);
        Kitabxana2 amfibiya2 = new Kitabxana2("aleksandr belyayev", "amfibiya adam", "36473", 8.49, 5);
        addList2.add(amfibiya2);
        Kitabxana sadiqler = new Kitabxana("veronika not", "sadiqler", "27361", 10.20, 2);
        addList.add(sadiqler);
        Kitabxana2 sadiqler2 = new Kitabxana2("veronika not", "sadiqler", "27361", 10.20, 2);
        addList2.add(sadiqler2);
    }

    public static void KitabElaveEtmek() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yazici adi: ");
        String yazici = sc.nextLine();
        System.out.print("Kitab adi: ");
        String kitabAdi = sc.nextLine();
        System.out.print("Kitabin seriya nomresi: ");
        String seriyaNomresi = sc.nextLine();
        System.out.print("Kitabin qiymeti: ");
        double qiymet = sc.nextDouble();
        System.out.print("Kitabin sayi: ");
        int eded = sc.nextInt();
        String helebele = sc.nextLine();
        Kitabxana daxilEdilen = new Kitabxana(yazici, kitabAdi, seriyaNomresi, qiymet, eded);
        Kitabxana2 daxilEdilen2 = new Kitabxana2(yazici, kitabAdi, seriyaNomresi, qiymet, eded);

        addList.add(daxilEdilen);
        addList2.add(daxilEdilen2);
    }

    public static void kitabAdinaGoreAxtarma() throws BookNotFound {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kitabin adini daxil edin: ");
        String str = sc.nextLine();
        boolean x = true;
        for (int i = 0; i < addList.size(); i++) {
            if (str.toLowerCase().equals(addList.get(i).getKitabAdi())) {
                System.out.println(addList.get(i));
                x = false;
            }
        }
        if (x == true) {
            BookNotFound.error();
        }
    }

    public static void yazicininAdinaGoreAxtarma() throws BookNotFound {
        Scanner sc = new Scanner(System.in);
        System.out.print("Axtardiginiz yazici adini daxil edin: ");
        String str = sc.nextLine();
        boolean x = true;
        for (int i = 0; i < addList.size(); i++) {
            if (str.toLowerCase().equals(addList.get(i).getYazici())) {
                System.out.println(addList.get(i));
                x = false;
            }
        }
        if (x == true) {
            BookNotFound.error();
        }

    }

    public static void update() throws BookNotFound {
        Scanner sc = new Scanner(System.in);
        System.out.print("Deyismek istediyiniz kitab adini daxil edin: ");
        String str = sc.nextLine();
        boolean x = true;
        for (int i = 0; i < addList.size(); i++) {
            if (str.toLowerCase().equals(addList.get(i).getKitabAdi())) {
                addList.remove(i);
                System.out.print("Yazici adi: ");
                String yazici = sc.nextLine();
                System.out.print("Kitab adi: ");
                String kitabAdi = sc.nextLine();
                System.out.print("Kitabin seriya nomresi: ");
                String seriyaNomresi = sc.nextLine();
                System.out.print("Kitabin qiymeti: ");
                double qiymet = sc.nextDouble();
                System.out.print("Kitabin sayi: ");
                int eded = sc.nextInt();
                String helebele = sc.nextLine();
                Kitabxana deyisdirilen = new Kitabxana(yazici, kitabAdi, seriyaNomresi, qiymet, eded);
                addList.add(i, deyisdirilen);
                x = false;
            }
        }
        if (x == true) {
            BookNotFound.error();
        }
    }

    public static void remove() throws BookNotFound {
        Scanner sc = new Scanner(System.in);
        System.out.print("Silmek istediyiniz kitabin adini daxil edin: ");
        String str = sc.nextLine();
        boolean x = true;
        for (int i = 0; i < addList.size(); i++) {
            if (str.toLowerCase().equals(addList.get(i).getKitabAdi())) {
                addList.remove(i);
                x = false;
            }

        }
        if (x == true) {
            BookNotFound.error();
        }
    }

    public static void kitabGoturmek() throws BookNotFound {
        for (int i = 0; i < addList.size(); i++) {
            System.out.println(i + "-" + addList.get(i));
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Goturmek istediyiniz kitabin reqemini daxil edin: ");
        int x = sc.nextInt();
        boolean b = false;
        for (int i = 0; i < addList.size(); i++) {
            if (x == i && addList.get(i).getEded() > 0) {
                System.out.println(addList.get(i));
                addList.get(i).setEded(addList.get(i).getEded() - 1);
                b = true;
            } else if (x == i && addList.get(i).getEded() == 0) {
                System.out.println("Kitab hal hazirda oxuyucudadir");
                b = true;
            }
        }
        if (b == false) {
            BookNotFound.error();
        }

    }

    public static void kitabQaytarmaq() throws BookNotFound {
        for (int i = 0; i < addList.size(); i++) {
            System.out.println(i + "-" + addList.get(i));
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Qaytarmaq istediyiniz kitabin reqemini daxil edin: ");
        int x = sc.nextInt();
        boolean b = false;
        boolean a = false;
        for (int i = 0; i < addList.size(); i++) {
            if (x == i && addList.get(i).getEded() == addList2.get(i).getEded()) {
                System.out.println("Bele bir kitab goturulmeyib!");
                b = true;
                a = true;

            } else if (x == i && b == false) {
                System.out.println(addList.get(i));
                addList.get(i).setEded(addList.get(i).getEded() + 1);
                System.out.println("Elave olundu");
                a = true;
            }
        }
        if (a == false) {
            BookNotFound.error();
        }
    }
}

