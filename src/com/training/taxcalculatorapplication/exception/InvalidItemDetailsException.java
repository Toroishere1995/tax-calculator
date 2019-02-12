package com.training.taxcalculatorapplication.exception;
/**
 * This class is a custom exception class, which can give stack trace and return messages according to errors.
 * @author ayushsaxena
 *
 */
public class InvalidItemDetailsException extends Throwable{

	private String errorMessage;
	
	private Throwable throwable;
	
	
	/**
	 * This is the constructor of class
	 * @param errorMessage
	 * @param throwable
	 */
	public InvalidItemDetailsException(String errorMessage, Throwable throwable) {
		this.errorMessage = errorMessage;
		this.throwable = throwable;
	}
	
	/**
	 * This is the constructor of class
	 * @param throwable
	 */
	public InvalidItemDetailsException(Throwable throwable){
		this.throwable=throwable;
	}
	
	/**
	 * This is the constructor of class.
	 * @param errorMessage
	 */
	public InvalidItemDetailsException(String errorMessage){
		this.errorMessage=errorMessage;
	}
	
	/**
	 * This method returns the exception message on to console.
	 * @return
	 */
	public String getExceptionMessage(){
		return ("Invalid Item Details, Check "+errorMessage);
	}
}
