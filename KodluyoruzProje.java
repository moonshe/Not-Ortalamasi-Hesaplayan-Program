package test;

import java.util.Scanner;

public class KodluyoruzProje {

	public static void main(String[] args) {
		int matematik, fizik, kimya, turkce, tarih, muzik;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Matematik s�nav notunuz: " );
		matematik = input.nextInt();
		
		System.out.println("Fizik s�nav notunuz: " );
		fizik = input.nextInt();
		
		System.out.println("Kimya s�nav notunuz: " );
		kimya=input.nextInt();
		
		System.out.println("T�rk�e s�nav notunuz: ");
		turkce=input.nextInt();
		
		System.out.println("Tarih s�nav notunuz: ");
		tarih=input.nextInt();
		
		System.out.println("M�zik s�nav notunuz: ");
		muzik=input.nextInt();

		int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
		double ortalama = toplam / 6.0;
		System.out.println("Ortalaman�z: " + ortalama);
		
		 String test = ortalama > 60 ? "S�n�f� Ge�ti!" :  "S�n�fta Kald�!";
		 System.out.println(test);
		
		
	}

}
