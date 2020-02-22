package com.isac.principal;

import com.isac.somar.SomarNumeros;

public class Principal {

	public static void main(String[] args) {

		SomarNumeros sm = new SomarNumeros();

		int x = sm.somar(300, 150);
		System.out.println(x);

	}
}
