package com.training.taxcalculatorapplication.constants;

/**
 * This class contains all the constants used in the current application.
 * 
 * @author ayushsaxena
 */
public class Constants {

	public static final String RAW_ITEM = "RAW"; //Raw item type constant
	public static final String MANUFACTURED_ITEM = "MANUFACTURED";//Manufacture Item type constant
	public static final String IMPORTED_ITEM = "IMPORTED";//Imported Item Type constant

	public static final int FINAL_COST_LOW_LIMIT = 100;
	public static final int FINAL_COST_HIGH_LIMIT = 200;

	public static final String YES_INPUT = "y";
	public static final String USER_WANT_TO_INPUT_MORE_DETAILS = "Do you want to enter Details of any other item (y/n)";
	public static final String INPUT_MISMATCH_EXCEPTION_MESSAGE = "Input Mismatch with storage type, please re-enter details";
	public static final String INVALID_ITEM_TYPE_MESSAGE = "Item Type Invalid, please re-enter details";
	public static final String ITEM_VALUE_NULL_MESSAGE = "Item Name must not be empty , please re-enter details";
	public static final String ITEM_TYPE_MANDATORY_MESSAGE = "Item Type is Mandatory, please re-enter details";
	public static final String INPUT_DETAILS_INCOMPLETE_MESSAGE = "Incomplete Details, please re-enter details";
	public static final String INPUT_FORMAT_INVALID_MESSAGE = "Input Format Invalid, please re-enter details";

	public static final double IMPORT_DUTY_PERCENT = 0.1;
	public static final int SURCHARGE_FOR_FINAL_PRICE_LESS_THAN_100 = 5;
	public static final int SURCHARGE_FOR_FINAL_PRICE_BETWEEN_100_AND_200 = 10;
	public static final double SURCHARGE_PERCENT_FOR_FINAL_PRICE_GREATER_THAN_200 = 0.05;
	public static final double PERCENT_TAX_FOR_RAW_OR_MANUFACTURED_ITEM = 0.125;

	public static final String ENTITY_TYPE = "-type";
	public static final String ENTITY_NAME = "-name";
	public static final String ENTITY_PRICE = "-price";
	public static final String ENTITY_QUANTITY = "-quantity";

	public static final String DISPLAY_ITEM_NAME = "Item name : ";
	public static final String DISPLAY_ITEM_TYPE = "Item Type : ";
	public static final String DISPLAY_ITEM_SALES_TAX = "Sales Tax : ";
	public static final String DISPLAY_ITEM_FINAL_PRICE = "Final Price Inclusive Tax : ";
	public static final int DEFAULT_QUANTITY = 1;

}
