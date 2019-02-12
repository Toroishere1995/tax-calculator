package com.training.taxcalculatorapplication.services;
/**
 * This interface is used for sales tax calculatin
 * @author ayushsaxena
 * 
 */
public interface ItemType {
	/**
	 * This is a method signature for sales tax per item.
	 * @param itemPrice
	 * @return
	 * 
	 */
	public double salesTaxLiabilityPerItem(double itemPrice);
}
