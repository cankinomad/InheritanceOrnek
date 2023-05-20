package com.berk;

import com.entities.Hizmetli;
import com.entities.Mudur;
import com.entities.Muhasebeci;
import com.entities.Muhendis;


public class Runner {

	public static void main(String[] args) {
		
//		Muhendis muhendis1=new Muhendis();
//		Muhasebeci muhasebeci1=new Muhasebeci();
//		Hizmetli hiz1=new Hizmetli();
//		
//		Mudur mudur1=new Mudur();
//		
//		mudur1.ad="Ahmet";
//		mudur1.cepTel="564535252"; 
//		
//		System.out.println(mudur1.toString());
//		System.out.println("=======================================");
//		Mudur mudur2=new Mudur("Serken", "Istanbul", "4324234", "Muhasebe");
//		
//		System.out.println(mudur2.toString());
//		
//		Muhendis aliBey=new Muhendis("Ali", "Ankara", "232323", "elektronik");
//		System.out.println(aliBey.toString());
//		Hizmetli hizmetli1=new Hizmetli();
//		System.out.println(hizmetli1.toString());
//		
//		
//		System.out.println("-=========--=-==--=-=-=-");
//		Personel personel1=new Personel();
//		personel1.cepTel="555";
//		System.out.println(personel1.toString());
//		personel1.calis();
//		
//		System.out.println("=======Muhendis Personel=========");
//		
//		Personel personel2=new Muhendis(); //polymorphizm deniyor yazimina bak.
//		System.out.println(personel2.toString());
//		personel2.calis();
//		//compile time // run time
//		//personel2.hesapla(); sadece muhendiste olan bir metodu cagiramazsin personel uzerinden. override ile ikisinde de varsa cagirabilirsin.
//	
//		
//		System.out.println("============Mudur Personel========");
//		personel2=new Mudur();
//		personel2.calis(); //mudur sinifinin icinde override yaparak farkli sonuc aliyorsun
//		System.out.println(personel2.toString());
//		
//		//Muhendis m3=new Personel(); //type mismatch: cannot conver from muhendis to personel
//	
		
		Mudur mudur1=new Mudur();
		System.out.println(mudur1.getMaasKatSayisi());
		
		
		Hizmetli hizmetli=new Hizmetli();
		System.out.println(hizmetli.getMaasKatSayisi());
		
		
		Muhendis muhendis1=new Muhendis();
		
		
		Muhasebeci muhasebeci1=new Muhasebeci();
		
		
		Mutemet mutemet1=new Mutemet();
		mutemet1.maasHesapla(mudur1);
		
		mutemet1.maasHesapla(muhendis1);
		mutemet1.maasHesapla(hizmetli);
		mutemet1.maasHesapla(muhasebeci1);
	}

}
