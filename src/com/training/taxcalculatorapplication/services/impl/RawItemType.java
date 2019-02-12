package com.training.taxcalculatorapplication.services.impl;

import com.training.taxcalculatorapplication.constants.Constants;
import com.training.taxcalculatorapplication.services.ItemType;

/**
 * This class calculates sales tax for Raw item type.
 * 
 * @author ayushsaxena
 * 
 */
public class RawItemType implements ItemType {
	/**
	 * This method calculates sales tax.
	 */
	@Override
	public double salesTaxLiabilityPerItem(double itemPrice) {
		return Constants.PERCENT_TAX_FOR_RAW_OR_MANUFACTURED_ITEM * itemPrice;

	}
}
