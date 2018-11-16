package com.cg.Spring1;

public class CurrencyConvertorImpl implements CurrencyConvertor {
     
	private ExchangeService exchangeService;
	
	
	
	public CurrencyConvertorImpl() {
		System.out.println("CurrencyConvertorImpl()");
		
	}



	public ExchangeService getExchangeService() {
		
		System.out.println("getExchangeService()");
		return exchangeService;
	}



	public void setExchangeService(ExchangeService exchangeService) {
		System.out.println("setExchangeService()");
		this.exchangeService = exchangeService;
	}



	
	public double dollarsToRupees(double dollars) {
		// TODO Auto-generated method stub
		System.out.println("dollarsToRupees()");
		return dollars*exchangeService.getExchangeRate();
	}

}
