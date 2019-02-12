package com.training.taxcalculatorapplication.io;

import com.training.taxcalculatorapplication.constants.Constants;
import com.training.taxcalculatorapplication.exception.InvalidItemDetailsException;
import com.training.taxcalculatorapplication.model.ItemModel;
import com.training.taxcalculatorapplication.validation.InputValidation;

/**
 * This class is used for taking the input and parsing it and setting the values in the item model.
 * @author ayushsaxena 
 */
public class InputModelDetails {
	/**
	 * This method is used for parsing the string and throw exception to Driver class if Exception occurs.
	 *
	 * 
	 * @param inputString
	 * @return
	 * @throws ItemValueNull
	 * @throws ArrayIndexOutOfBoundsException
	 * @throws InvalidItemDetailsException
	 */
	public ItemModel parseItemDetails(String inputString, int countOfInputs)
			throws ArrayIndexOutOfBoundsException, InvalidItemDetailsException {
		ItemModel itemModel = new ItemModel();

		if (!inputString.contains(Constants.ENTITY_TYPE)) // To check if item type is present
			throw new InvalidItemDetailsException(Constants.ENTITY_TYPE + " to be Mandatory");

		if (!inputString.startsWith("-"))
			throw new InvalidItemDetailsException("Input according to specified in manual");

		if (!inputString.contains(Constants.ENTITY_NAME)) // Check if item name is specified
			itemModel.setItemName("Product " + countOfInputs);

		String inputValues[] = inputString.trim().split("\\s+");

		int index = 0;
		boolean reEnterString = false;
		InputValidation inputValidation = new InputValidation();
		while (index < inputValues.length) {

			switch (inputValues[index]) {
			case Constants.ENTITY_NAME:
				reEnterString = inputValidation.validateName(inputValues[index + 1]); //Validating Item Name

				if (reEnterString)
					itemModel.setItemName(inputValues[index + 1]);
				break;
			case Constants.ENTITY_TYPE:
				reEnterString = inputValidation.validateType(inputValues[index + 1]); //Validating Item Type

				if (reEnterString)
					itemModel.setItemType((inputValues[index + 1]).toUpperCase());
				break;
			case Constants.ENTITY_QUANTITY:
				reEnterString = inputValidation.validateQuantity(inputValues[index + 1]); //Validating Item Quantity

				if (reEnterString)
					itemModel.setItemQuantity(Integer.parseInt(inputValues[index + 1]));
				break;
			case Constants.ENTITY_PRICE:
				reEnterString = inputValidation.validatePrice(inputValues[index + 1]);// Validating Item Price

				if (reEnterString)
					itemModel.setItemPrice(Double.parseDouble(inputValues[index + 1]));
				break;
			default:
				throw new InvalidItemDetailsException("Input according to specified in manual");
			}
			if (!reEnterString)
				throw new InvalidItemDetailsException("Input according to specified in manual");
			;
			index += 2;
		}
		return itemModel;
	}
}
