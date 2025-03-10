import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("dizi uzunluğu giriniz: ");
        int n= scan.nextInt();
        int [] dizi= new int[n];
        int sayac=0;
        for ( int i=0;i< dizi.length;i++){
            System.out.print((i+1)+ ". elemanı girin:");
            dizi[i]= scan.nextInt();
        }
        for (int i=0;i< dizi.length;i++){
            sayac=0;
            for (int j=2;j< dizi[i];j++){
                if (dizi[i]%j==0){
                 sayac++;
            }}
                if (sayac==0){
                    System.out.println(dizi[i]+" asaldır");
                }
                else {
                    System.out.println(dizi[i]+" asal değildir");
                }
        }
}
}