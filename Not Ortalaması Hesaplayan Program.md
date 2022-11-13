package test;

import java.util.Scanner;

public class KodluyoruzProje {

	public static void main(String[] args) {
		int matematik, fizik, kimya, turkce, tarih, muzik;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Matematik sınav notunuz: " );
		matematik = input.nextInt();
		
		System.out.println("Fizik sınav notunuz: " );
		fizik = input.nextInt();
		
		System.out.println("Kimya sınav notunuz: " );
		kimya=input.nextInt();
		
		System.out.println("Türkçe sınav notunuz: ");
		turkce=input.nextInt();
		
		System.out.println("Tarih sınav notunuz: ");
		tarih=input.nextInt();
		
		System.out.println("Müzik sınav notunuz: ");
		muzik=input.nextInt();

		int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
		double ortalama = toplam / 6.0;
		System.out.println("Ortalamanız: " + ortalama);
		
		 String test = ortalama > 60 ? "Sınıfı Geçti!" :  "Sınıfta Kaldı!";
		 System.out.println(test);
		
		
	}

}
