package com.entities;

public class Muhasebeci extends Personel {
	public String mahasebeUnvani;

	public Muhasebeci() {
		super();
	}
	
	@Override
	public int getMaasKatSayisi() {
		return 3;
	}
}
