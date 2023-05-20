package com.berk;

import com.entities.Personel;



public class Mutemet {

	public String ad;
	
//	
//	public void maasHesapla(Mudur m) {
//		System.out.println("Maas: "+m.getMaas()*m.getMaasKatSayisi());
//	}
//	public void maasHesapla(Muhendis m) {
//		System.out.println("Maas: "+m.getMaas()*m.getMaasKatSayisi());
//	}
//	public void maasHesapla(Muhasebeci m) {
//		System.out.println("Maas: "+m.getMaas()*m.getMaasKatSayisi()); //boyle tek tek metod yazacagina gel hepsini kapsayan sinifa metod yaz.
//	}
	public void maasHesapla(Personel p) { //ana sinif hepsini kapsiyor. direk ana siniftan personel cagir ve o, hangi sinifin maas katsayisina gitmek istiyorsan seni oraya goturur.
		System.out.println("Maas: "+p.getMaas()*p.getMaasKatSayisi());
	}
}
