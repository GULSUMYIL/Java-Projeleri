import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("SİSTEME BİR SAYI GİRİNİZ: ");
        int sayi= scan.nextInt();
      int faktoriyel=1;// DEĞERİ 1 OLARAK ALMALIYIZ YOKSA SONUÇ SIFIR ÇIKACAKTIR.
        System.out.print("SİSTEME GİRİLEN SAYININ FAKTÖRİYELİ: ");
        for (int i=1;i <= sayi;i++){// DEĞERİ 1 OLARAK ALMALIYIZ YOKSA SONUÇ SIFIR ÇIKACAKTIR.
            faktoriyel= faktoriyel*i;
        }
        System.out.print(sayi +"!= "+ faktoriyel);

    }}