import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner kullanici= new Scanner(System.in);
        System.out.println("kaç adet sayı gireceksiniz: ");
        int n= kullanici.nextInt();
        int[] sayilar = new int[n];
        for (int i=0;i<n;i++){
            System.out.println((i+1)+ ". sayıyı girin: ");
            sayilar[i]= kullanici.nextInt();
        }
        int[] tekrarEdenSayilar= new int[n];
        boolean[] ziyaretEdildi = new boolean[n];
        for (int i=0;i<n;i++){
            if (ziyaretEdildi[i]){
                continue;
            }
            int tekrarSayisi=1;
            for (int j=i+1;j<n;j++){
                if (sayilar[i]==sayilar[j]){
                    tekrarSayisi++;
                    ziyaretEdildi[j] = true;
                }
            }
            tekrarEdenSayilar[i]= tekrarSayisi;
        }
        System.out.println("SAYI TEKRARLARI: ");
        for (int i=0;i<n;i++){
            if (tekrarEdenSayilar[i]>0){
                System.out.println(sayilar[i]+": "+ tekrarEdenSayilar[i]+ " kere bulunuyor.");
            }
        }




























    }
}