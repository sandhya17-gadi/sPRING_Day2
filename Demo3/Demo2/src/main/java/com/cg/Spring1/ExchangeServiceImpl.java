package com.cg.Spring1;

public class ExchangeServiceImpl implements ExchangeService {
   
	private double exchangeRate;
    
    
	public ExchangeServiceImpl(double exchangeRate) {
		super();
		this.exchangeRate = exchangeRate;
		System.out.println("ExchangeServiceImpl()");
	}


	
	public double getExchangeRate() {
		// TODO Auto-generated method stub
		System.out.println("getExchangeRate()");
		return exchangeRate;
	}

}
