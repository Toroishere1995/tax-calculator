package com.training.taxcalculatorapplication;

import java.util.Scanner;

import com.training.taxcalculatorapplication.constants.Constants;
import com.training.taxcalculatorapplication.controller.ComputeTax;
import com.training.taxcalculatorapplication.exception.InvalidItemDetailsException;
import com.training.taxcalculatorapplication.io.InputModelDetails;
import com.training.taxcalculatorapplication.model.ItemModel;

/**
 * This Class is the main class It act's as a driver for Tax Calculation.
 * @author ayushsaxena 
 */

public class TaxCalculationDriver {
	/**
	 * Main Method
	 * @param args
	 *           
	 */
	public static void main(String args[]) {
		// ItemModel itemModel = null;
		Scanner input = null;
		int countOfInputs = 0;
		ComputeTax computeTax = null;
		System.out.println("Welcome user, hope you will find the application helpful.");
		System.out.println("The item details which must be provided should be in below format :");
		System.out.println("-name [item name] -type [item type] -price [item price] -quantity [item quantity]");
		System.out.println(
				"In the above mentioned format, type is mandatory and must be either RAW, IMPORTED or MANUFACTURED.");
		System.out.println("The order of the item details doesn't matter.");
		System.out.println();
		try {
			input = new Scanner(System.in);
			String checkInputYOrN = Constants.YES_INPUT;
			do {
				countOfInputs++; // To be used in case name is not provided
				System.out.println("Enter item details in mentioned format");
				String itemDetails = input.nextLine(); // For taking item values as input

				InputModelDetails inputModelDetails = new InputModelDetails();
				ItemModel itemModel = null;

				try {
					itemModel = inputModelDetails.parseItemDetails(itemDetails, countOfInputs); // For Parsing the input string into item model
					computeTax = new ComputeTax();
					computeTax.checkItemTypeAndCalculateTax(itemModel); // Controller method invoking for tax calculation
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(Constants.INPUT_DETAILS_INCOMPLETE_MESSAGE);
				} catch (InvalidItemDetailsException e) {
					System.out.println(e.getExceptionMessage());
				}
				System.out.println(Constants.USER_WANT_TO_INPUT_MORE_DETAILS);
				checkInputYOrN = input.nextLine(); // Taking yes or no for next for taking item details

			} while (checkInputYOrN.equalsIgnoreCase(Constants.YES_INPUT));
			System.out.println("Hope that was a lovely experience!");
		} finally {
			if (input != null)
				input.close();
		}
	}
}
