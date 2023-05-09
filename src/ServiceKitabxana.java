import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceKitabxana {
    public static List<Kitabxana>addList=new ArrayList<>();


    public static void kitabSiyahisi() {
        Kitabxana amfibiya = new Kitabxana("aleksandr belyayev", "amfibiya adam", "36473", 8.49, 5);
        addList.add(amfibiya);
        Kitabxana sadiqler = new Kitabxana("veronika not", "sadiqler", "27361", 10.20, 2);
        addList.add(sadiqler);
    }
    public static void KitabElaveEtmek(){
        Scanner sc=new Scanner(System.in);
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
            String helebele=sc.nextLine();
            Kitabxana daxilEdilen = new Kitabxana(yazici, kitabAdi, seriyaNomresi, qiymet, eded);
            addList.add(daxilEdilen);
    }
    public static void kitabAdinaGoreAxtarma() throws BookNotFound {
        Scanner sc=new Scanner(System.in);
        System.out.print("Kitabin adini daxil edin: ");
        String str=sc.nextLine();
        boolean x=true;
        for (int i=0;i< addList.size();i++) {
            if (str.toLowerCase().equals(addList.get(i).getKitabAdi())){
                System.out.println(addList.get(i));
                x=false;
            }
        }
        if (x==true){
            BookNotFound.error();
        }
    }

    public static void yazicininAdinaGoreAxtarma() throws BookNotFound {
        Scanner sc=new Scanner(System.in);
        System.out.print("Axtardiginiz yazici adini daxil edin: ");
        String str=sc.nextLine();
        boolean x=true;
        for (int i=0;i< addList.size();i++) {
            if (str.toLowerCase().equals(addList.get(i).getYazici())) {
                System.out.println(addList.get(i));
                x = false;
            }
        }
        if (x==true){
            BookNotFound.error();
        }

    }
    public static void update() throws BookNotFound {
        Scanner sc=new Scanner(System.in);
        System.out.print("Deyismek istediyiniz kitab adini daxil edin: ");
        String str=sc.nextLine();
        boolean x=true;
        for (int i=0;i<addList.size();i++){
            if (str.toLowerCase().equals(addList.get(i).getKitabAdi())){
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
                String helebele=sc.nextLine();
                Kitabxana deyisdirilen = new Kitabxana(yazici, kitabAdi, seriyaNomresi, qiymet, eded);
                addList.add(i,deyisdirilen);
                x=false;
            }
        }
        if (x==true){
            BookNotFound.error();
        }
    }
    public static void remove() throws BookNotFound {
        Scanner sc=new Scanner(System.in);
        System.out.print("Silmek istediyiniz kitabin adini daxil edin: ");
        String str=sc.nextLine();
        boolean x=true;
        for (int i = 0; i < addList.size(); i++) {
            if (str.toLowerCase().equals(addList.get(i).getKitabAdi())){
                addList.remove(i);
                x=false;
            }

        }
        if (x==true){
            BookNotFound.error();
        }
    }
}
