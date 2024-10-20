public class Main {
    public static void main(String[] args) {
        // 1. Basit bir for döngüsü ile 1'den 10'a kadar sayıları yazdırma
        System.out.println("1'den 10'a kadar sayılar:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // Yeni bir satıra geçiş

        // 2. İç içe for döngüleri ile çarpım tablosu oluşturma
        System.out.println("\nÇarpım tablosu:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println(); // Yeni satıra geçiş
        }

        // 3. For-each döngüsü ile bir diziyi yazdırma
        System.out.println("\nFor-each döngüsü ile diziyi yazdırma:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.println("Sayı: " + number);
        }
    }
}