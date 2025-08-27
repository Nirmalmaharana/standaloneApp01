package com.nirmal.cardpayment;

public class CardPaymentService {
	
	public String cardPayment(Long cardnumber,double amount) {
		return "INR:- "+amount+" paid by Card card number is "+cardnumber;
	}

	
	
	
	
	
	public String closeAccount() {
		return "Account is closed";
	}
}
