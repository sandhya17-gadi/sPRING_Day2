package com.cg.Spring2;

import java.util.ArrayList;
import java.util.List;

public class CurrencyListImpl implements CurrencyList {
     
   ArrayList<String> currList=new ArrayList<String>();
	public ArrayList<String> getCurrList() {
		
		return currList;
	}
	
	public void setCurrList(ArrayList<String> currList) {
		this.currList = currList;
	}
	

}
