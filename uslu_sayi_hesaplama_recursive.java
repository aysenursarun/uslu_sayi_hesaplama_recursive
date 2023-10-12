package uslu_sayi_hesaplama_recursive;

import java.util.Scanner;

public class uslu_sayi_hesaplama_recursive {

	public static int hesapla(int sayi,int us) {

		if(us==0) {
			return 1;
		}else if (sayi==1) {
			return sayi;
		}else {
			return sayi * hesapla(sayi,us-1);	
		}
	}
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
			
			System.out.print("Üssü alınacak sayıyı girin: ");
			int sayi = scan.nextInt();
			System.out.print("Üssü girin: ");
			int us = scan.nextInt();
		
			System.out.println("Sonuç: " + hesapla(sayi,us));
	}

}
