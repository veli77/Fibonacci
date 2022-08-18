import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,yenifibo,fibo=1,eskifibo=0;
      //  boolean asal;
        Scanner giris = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        sayi = giris.nextInt();

        for(int i=0;i<sayi;i++){
            System.out.print("  "+fibo);
            yenifibo = fibo + eskifibo;
            eskifibo = fibo;
            fibo = yenifibo;

        }


    }
}
