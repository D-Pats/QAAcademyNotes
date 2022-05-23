package com.taxes;

import com.taxes.*;

public class Runner {

	public static void main(String[] args) {
		Taxes taxtest = new Taxes(150000);
		System.out.println(taxtest.taxedPercent());
		System.out.println(taxtest.taxedAmount());
	}

}
