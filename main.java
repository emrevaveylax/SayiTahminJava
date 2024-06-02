import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        boolean hasGuessedCorrectly = false;


        System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz!");
        System.out.println("1 ile 100 arasında bir sayı tahmin ediniz: ");


        while (!hasGuessedCorrectly){
            System.out.println("Tahmininiz: ");
            int userGuess = scanner.nextInt();
            numberToGuess++;

            if (userGuess <1 || userGuess >100){
                System.out.println("Lütfen 1 ile 100 arasında bir sayı giriniz.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Daha büyük bir sayı tahmin ediniz");
            } else if (userGuess > numberToGuess){
                System.out.println("Daha küçük bir sayı tahmin ediniz");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Tebrikler Doğru tahmin ettiniz.");
                System.out.println("Tahmin sayınız: " +numberToGuess);
            }
        }
        scanner.close();
    }
}