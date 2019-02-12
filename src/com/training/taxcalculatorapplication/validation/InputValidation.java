package com.training.taxcalculatorapplication.validation;

import com.training.taxcalculatorapplication.constants.Constants;
import com.training.taxcalculatorapplication.exception.InvalidItemDetailsException;

/**
 * This class takes item details and validates them, if error occurs it throws InvalidItemDetailsException.
 * @author ayushsaxena 
 */
public class InputValidation {
	/**
	 * This method validates item name
	 * @param itemName
	 * @return
	 * @throws InvalidItemDetailsException
	 */
	public boolean validateName(String itemName) throws InvalidItemDetailsException {

		if (isNull(itemName))
			throw new InvalidItemDetailsException(Constants.ENTITY_NAME, new NullPointerException());
		return true;
	}

	/**
	 * This method validates Item Type
	 * @param itemName
	 * @return
	 * @throws InvalidItemDetailsException
	 */
	public boolean validateType(String itemType) throws InvalidItemDetailsException {

		if (isNull(itemType))
			throw new InvalidItemDetailsException(Constants.ENTITY_TYPE, new NullPointerException());
		itemType = itemType.toUpperCase();
		switch (itemType) {
		case Constants.IMPORTED_ITEM:
			return true;
		case Constants.MANUFACTURED_ITEM:
			return true;
		case Constants.RAW_ITEM:
			return true;

		}
		throw new InvalidItemDetailsException(Constants.ENTITY_TYPE, new Throwable());
	}

	/**
	 * This method validates Item quantity
	 * 
	 * @param itemName
	 * @return
	 * @throws ItemValueNull
	 *            
	 */
	public boolean validateQuantity(String itemQuantity) throws InvalidItemDetailsException {
		// TODO Auto-generated method stub
		if (isNull(itemQuantity))
			throw new InvalidItemDetailsException(Constants.ENTITY_QUANTITY, new NullPointerException());
		if (isNumber(itemQuantity))
			return true;
		throw new InvalidItemDetailsException(Constants.ENTITY_QUANTITY, new NumberFormatException());
	}

	/**
	 * 
	 * @param itemName
	 * @return
	 * @throws ItemValueNull
	 *             Method for validating item price
	 */
	public boolean validatePrice(String itemPrice) throws InvalidItemDetailsException {
		// TODO Auto-generated method stub
		if (isNull(itemPrice))
			throw new InvalidItemDetailsException(Constants.ENTITY_PRICE, new NullPointerException());
		String[] splitter = itemPrice.split("\\.");
		int index=0;
		while(index<splitter.length){
			if (!isNumber(splitter[index]))
				throw new InvalidItemDetailsException(Constants.ENTITY_PRICE, new NumberFormatException());
			index++;
		}
		return true;
	}
	
	/**
	 * This method checks if string is not null
	 * @param value
	 * @return
	 */
	private boolean isNull(String value) {
		return value == null;
	}
	
	/**
	 * This method checks if Number is valid or not
	 * @param value
	 * @return
	 */
	private boolean isNumber(String value) {
		return value.matches("[0-9]+");
	}
}
