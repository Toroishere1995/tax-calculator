package com.training.taxcalculatorapplication.controller;

import com.training.taxcalculatorapplication.constants.Constants;
import com.training.taxcalculatorapplication.io.ItemDisplayDetails;
import com.training.taxcalculatorapplication.model.ItemModel;
import com.training.taxcalculatorapplication.services.ItemType;
import com.training.taxcalculatorapplication.services.impl.ImportedItemType;
import com.training.taxcalculatorapplication.services.impl.ManufacturedItemType;
import com.training.taxcalculatorapplication.services.impl.RawItemType;
/**
 * This class is used as controller for computing sales tax and final price with respect to item type.
 * @author ayushsaxena
 * 
 */
public class ComputeTax {

	public void checkItemTypeAndCalculateTax(ItemModel itemModel) {
		ItemType itemType = null;
		String modelItemType=itemModel.getItemType().toUpperCase();
		switch (modelItemType) {
		case Constants.RAW_ITEM:
			itemType = new RawItemType(); // for Raw item
			break;
		case Constants.MANUFACTURED_ITEM:
			itemType = new ManufacturedItemType(); // For Manufactured Item
			break;
		case Constants.IMPORTED_ITEM:
			itemType = new ImportedItemType();// For Imported item
			break;
		}
		itemModel.setSalesTax(itemType.salesTaxLiabilityPerItem(itemModel.getItemPrice()));
		double finalPriceInclusiveTax=itemModel.getSalesTax() + itemModel.getItemPrice();
		itemModel.setFinalPrice(finalPriceInclusiveTax); // Setting final price in Model of item
		ItemDisplayDetails itemDisplayDetails = new ItemDisplayDetails();
		itemDisplayDetails.displayDetails(itemModel); // Display the details via View
	}

}
