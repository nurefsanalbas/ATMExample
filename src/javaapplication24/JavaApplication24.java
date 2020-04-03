/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author NurdanPC
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int bakiye = 1000;
        int işlem;
        System.out.println("1.Bakiye görüntüle");
        System.out.println("2.Para yatırma");
        System.out.println("3.Para çekme");
        System.out.println("4.Sistemden çıkış");
        işlem = scan.nextInt();

        switch (işlem) {
            case 1:
                System.out.println("Bakiyeniz:" + bakiye + "tldir.");
                break;

            case 2:
                System.out.println("Ne kadar yatıracaksınız?");
                int miktar = scan.nextInt();
                bakiye += miktar;
                System.out.println("Bakiyeniz" + bakiye + "tldir.");
                break;

            case 3:
                System.out.println("Ne kadar çekeceksiniz");
                miktar = scan.nextInt();

                if (miktar > 1000) {
                    System.out.println("bakiye yetersiz.");
                } else {
                    bakiye -= miktar;
                    System.out.println("Bakiyeniz" + bakiye + "tldir");
                }
                break;
            case 4:
                System.out.println("sistemden çıkılıyor...");
                break;

            default:
                System.out.println("işlem geçersiz.");

        }

    }

}
