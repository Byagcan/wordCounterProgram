package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi tuşlayınız.");
        System.out.println("1 - Kelime saymak için 1'e basın.");
        System.out.println("0 - Çıkmak için 0'a basın.");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> countWords();
            case 0 -> {
                System.out.println("Uygulamayı tercih ettiğiniz için " +
                        "teşekkür ederiz. ");
                System.exit(0);
            }
            default -> {
                System.out.println("Hatalı seçim.");
                System.out.println(" ");
            }


        }
    }

    private static void countWords() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Kelime sayısını bulmak istediğiniz " +
                    "metni Giriniz:");
            System.out.println("Çıkmak için 0 yazınız");
            String text = scanner.nextLine();
            if (text.length() == 1 && text.charAt(0) == '0') {
                System.out.println("Uygulamayı tercih ettiğiniz için " +
                        "teşekkür ederiz. ");
                System.exit(0);
            }
            int count = 1;
            if (text.length() == 1 && text.charAt(0) == ' ') {
                count = 0;
                System.out.println("Metindeki kelime sayısı: " + count);
                System.out.println(" ");
            }
            if (text.length() == 1 && text.charAt(0) != ' ') {
                count = 1;
                System.out.println("Metindeki kelime sayısı: " + count);
                System.out.println(" ");
            }
            if (text.length() > 1) {
                for (int i = 1; i <= text.length(); i++) {
                    if (i == text.length() - 1) break;
                    if (text.charAt(i - 1) == ' '
                            && text.charAt(i) != ' ') {
                        count++;
                    }
                }
                System.out.println("Metindeki kelime sayısı: " + count);
                System.out.println(" ");
            }
        }
    }
}