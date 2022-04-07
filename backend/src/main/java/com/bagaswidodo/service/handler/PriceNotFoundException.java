package com.bagaswidodo.service.handler;

public class PriceNotFoundException extends RuntimeException {

	   private static final long serialVersionUID = 7428051251365675318L;

	   public  PriceNotFoundException(String message){
		   super(message);
	   }

}
