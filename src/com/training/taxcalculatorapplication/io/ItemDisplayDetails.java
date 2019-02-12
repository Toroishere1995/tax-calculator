package com.training.taxcalculatorapplication.io;

import com.training.taxcalculatorapplication.constants.Constants;
import com.training.taxcalculatorapplication.model.ItemModel;

/**
 * This class is the view of our structure for displaying item details
 * @author ayushsaxena 
 * 
 */
public class ItemDisplayDetails {
	/**
	 * This method is used for displaying item details.
	 * @param itemModel
	 *           
	 */
	public void displayDetails(ItemModel itemModel) {

		System.out.println(Constants.DISPLAY_ITEM_NAME + itemModel.getItemName());
		System.out.println(Constants.DISPLAY_ITEM_TYPE + itemModel.getItemType());
		System.out.println(Constants.DISPLAY_ITEM_SALES_TAX + itemModel.getSalesTax());
		System.out.println(Constants.DISPLAY_ITEM_FINAL_PRICE + itemModel.getFinalPrice());
	}
}
