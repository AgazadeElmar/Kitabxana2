import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BookNotFound {
        ServiceKitabxana.kitabSiyahisi();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("""
                0-Sistemden cixmaq
                1-Kitab siyahisini gormek
                2-Kitab elave etmek
                3-Yazicinin adina gore axtaris
                4-Kitabin adina gore axtaris
                5-Her hansi bir kitabin melumatlarini yenilemek ve ya deyismek
                6-Her hansi bir kitabi silmek
                7-Her hansi bir kitabi goturmek
                8-Kitabi qaytarmaq
                """);
            System.out.print("Yerine yetirmek istediyiniz emeliyyatin nomresini daxil edin: ");
            int input= sc.nextInt();
            switch (input){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println(ServiceKitabxana.addList);
                    break;
                case 2:
                    ServiceKitabxana.KitabElaveEtmek();
                    break;
                case 3:
                    ServiceKitabxana.yazicininAdinaGoreAxtarma();
                    break;
                case 4:
                    ServiceKitabxana.kitabAdinaGoreAxtarma();
                    break;
                case 5:
                    ServiceKitabxana.update();
                    break;
                case 6:
                    ServiceKitabxana.remove();
                    break;
                case 7:
                    ServiceKitabxana.kitabGoturmek();
                    break;
                case 8:
                    ServiceKitabxana.kitabQaytarmaq();
                    break;
                default:
                    System.out.println("Qeyd etdiyiniz reqemde emeliyyat movcud deyil");
            }
        }

    }
}