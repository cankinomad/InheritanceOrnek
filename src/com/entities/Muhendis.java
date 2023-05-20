package com.entities;

public class Muhendis extends Personel {
	
	//shift+alt+A ile birden cok sutunda ayni duzenleme yapilabilir.
	public String uzmanlikAlani;
	public String calismaSekli;
	
	
	
	public Muhendis() {
		super();
	}

	public Muhendis(String ad, String adres,String telefon,String uzmanlikAlani) {
		super(ad,adres,telefon);
		this.uzmanlikAlani = uzmanlikAlani;
		System.out.println("Uzmanlik sinifi 4 parametreli constructor calisti");
	}
	
	@Override
	public int getMaasKatSayisi() {
		return 3;
	}
	
	/*
	 * this()==> constructor cagiriminda kullaniliyor
	 * this. => class uye degiskenlere erisim icin kullanilmisti
	 * 
	 * super()==> ust siniftaki constructor cagriminda kullandik.
	 * super.=> ust siniftaki uye degiskenlere ve metodlara erisim icin.
	 */

	@Override
	public String toString() {
		return "Muhendis [uzmanlikAlani=" + uzmanlikAlani + "]"+super.toString()+"tc"+super.tc; //superden cekiyorsun personelin tostringini cekiyor.
	}

	@Override
	public void calis() {
		System.out.println("*****Muhendis Calisiyor*******");
	}
	
	
	
}
