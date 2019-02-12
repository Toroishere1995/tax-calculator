package com.training.taxcalculatorapplication.model;

import com.training.taxcalculatorapplication.constants.Constants;

/**
 * This class is the model of our structure that holds item details.
 * @author ayushsaxena
 * 
 */
public class ItemModel {
	private String itemName; 
	private String itemType;
	private int itemQuantity=Constants.DEFAULT_QUANTITY;
	private double itemPrice;
	private double salesTax;
	private double finalPriceInclusiveTax;

	/**
	 * This method is getter for Item Name
	 * @return
	 * 
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * This method is setter for Item Name
	 * @return
	 * 
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * This method is getter for Item Type
	 * @return
	 * 
	 */
	public String getItemType() {
		return itemType;
	}

	/**
	 * This method is setter for Item Type
	 * @return
	 * 
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	/**
	 * This method is getter for Item Price
	 * @return
	 * 
	 */
	public double getItemPrice() {
		return itemPrice;
	}

	/**
	 * This method is setter for Item Price
	 * @return
	 * 
	 */
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	/**
	 * This method is getter for Item Quantity.
	 * @return
	 * 
	 */
	public int getQuantity() {
		return itemQuantity;
	}

	/**
	 * This method is getter for Item Price
	 * @return
	 * 
	 */
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	/**
	 * This method is getter for Sales tax on item
	 * @return
	 * 
	 */
	public double getSalesTax() {
		return salesTax;
	}

	/**
	 * This method is setter for Sales tax on item
	 * @return
	 * 
	 */
	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}

	/**
	 * This method is getter for Final Price on item
	 * @return
	 * 
	 */
	public double getFinalPrice() {
		return finalPriceInclusiveTax;
	}

	/**
	 * This method is setter for Final Price on item
	 * @return
	 * 
	 */
	public void setFinalPrice(double finalPriceInclusiveTax) {
		this.finalPriceInclusiveTax = finalPriceInclusiveTax;
	}
}
