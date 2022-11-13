package test;

import java.util.Scanner;

public class KodluyoruzProje {

	public static void main(String[] args) {
		int matematik, fizik, kimya, turkce, tarih, muzik;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Matematik sýnav notunuz: " );
		matematik = input.nextInt();
		
		System.out.println("Fizik sýnav notunuz: " );
		fizik = input.nextInt();
		
		System.out.println("Kimya sýnav notunuz: " );
		kimya=input.nextInt();
		
		System.out.println("Türkçe sýnav notunuz: ");
		turkce=input.nextInt();
		
		System.out.println("Tarih sýnav notunuz: ");
		tarih=input.nextInt();
		
		System.out.println("Müzik sýnav notunuz: ");
		muzik=input.nextInt();

		int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
		double ortalama = toplam / 6.0;
		System.out.println("Ortalamanýz: " + ortalama);
		
		 String test = ortalama > 60 ? "Sýnýfý Geçti!" :  "Sýnýfta Kaldý!";
		 System.out.println(test);
		
		
	}

}
