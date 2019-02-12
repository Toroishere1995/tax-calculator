package com.training.taxcalculatorapplication.services.impl;

import com.training.taxcalculatorapplication.constants.Constants;
import com.training.taxcalculatorapplication.services.ItemType;
/**
 * This class calculates sales tax for Imported Item Type.
 * @author ayushsaxena
 * 
 */
public class ImportedItemType implements ItemType {
	/**
	 * This method calculates sales tax.
	 */
	@Override
	public double salesTaxLiabilityPerItem(double itemPrice) {
		double importDuty = Constants.IMPORT_DUTY_PERCENT * itemPrice;
		double priceAfterTax = 0.0; // To be changed
		double finalCost = priceAfterTax + importDuty;
		double surchargeAmount = 0;

		if (finalCost <= Constants.FINAL_COST_LOW_LIMIT) //if final cost is less than 100
			surchargeAmount = Constants.SURCHARGE_FOR_FINAL_PRICE_LESS_THAN_100;

		else if (finalCost > Constants.FINAL_COST_LOW_LIMIT && finalCost <= Constants.FINAL_COST_HIGH_LIMIT) // final cost in range from 100 to 200
			surchargeAmount = Constants.SURCHARGE_FOR_FINAL_PRICE_BETWEEN_100_AND_200;

		else if (finalCost >= Constants.FINAL_COST_HIGH_LIMIT)// final cost greater than 200
			surchargeAmount = Constants.SURCHARGE_PERCENT_FOR_FINAL_PRICE_GREATER_THAN_200 * finalCost;

		double salesTax = importDuty + surchargeAmount; // Sales tax calculation
		return salesTax;
	}
}
