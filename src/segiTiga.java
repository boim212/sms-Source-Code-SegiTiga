import java.lang.Math;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class segiTiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
		double alas, tinggi, miring;
		double luas, keliling;

		System.out.println("");
		System.out.println("---PROGRAM PERHITUNGAN SEGITGA--");
		System.out.println("-----------WITH JAVA------------");
		System.out.println("--------------------------------");
		System.out.println("");
		System.out.print("Masukkan Alas   = ");
		alas = input.nextDouble();
		System.out.print("Masukkan Tinggi = ");
		tinggi = input.nextDouble();
		System.out.println("");

		//proses
		luas = (alas * (tinggi / 2));
		miring = Math.sqrt((alas * alas) + (tinggi * tinggi));
		keliling = (alas + tinggi + miring);

		System.out.println("Dengan Alas      = " + alas);
		System.out.println("Dengan Tinggi    = " + tinggi);
		System.out.println("Maka Luasnya     = " + luas);
		System.out.println("Maka Kelilingnya = " + keliling);
		System.out.println("--------------------------------");
                System.out.println("---------Yudha Developer--------");
                System.out.println("--------------------------------");
    }
    
}
