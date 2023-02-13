import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.print("Yıl Giriniz:");
        yil = input.nextInt();

        if( yil%100 == 0 && yil%400 == 0){;
            System.out.print(yil);
            System.out.print(" bir artik yıldır.");
        }
        else if(!(yil%100 == 0) && !(yil%400 == 0)){
            if(yil%4 == 0){
                System.out.print(yil);
                System.out.print(" bir artık yıldır.");
            }
            else{
                System.out.print(yil);
                System.out.print(" bir artık yıl değildir.");
            }
        }
        else{
            System.out.print(yil);
            System.out.print(" bir artık yıl değildir.");
        }
    }
}
