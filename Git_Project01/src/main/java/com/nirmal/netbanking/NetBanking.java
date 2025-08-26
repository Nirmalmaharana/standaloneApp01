package com.nirmal.netbanking;

import java.util.Random;

public class NetBanking {
	
	public String createNewAccount(String adhar,String acountType,double amount) {
		return "Acount is opened with "+acountType+" account number is :"+new Random().nextLong(90000000000L)+" , initial amount is :"+amount;
	}

}
