package com.epam.logging;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,principle_amount,time,no_of_times;
		float rate;
		 LOGGER.info("Enter your choice simple interest or compound interest 1 or 2");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		Calculation1 c=new Calculation1();
		switch(ch)
		{
		case 1: LOGGER.info("Enter priciple amount");
			   principle_amount=sc.nextInt();
			   LOGGER.info("Enter how many years");
			   time=sc.nextInt();
			   LOGGER.info("Enter rate of interest");
			   rate=sc.nextFloat();
			   LOGGER.info(c.simple_interest(principle_amount,rate,time));
			   break;
		case 2: LOGGER.info("Enter principle amount");
			   principle_amount=sc.nextInt();
			   LOGGER.info("Enter rate of interest");
			   rate=sc.nextFloat();
			   LOGGER.info("Enter how many years");
			   time=sc.nextInt();
			   LOGGER.info("Enter number of times in a year do you want to pay");
			   no_of_times=sc.nextInt();
			   LOGGER.info(c.compound_interest(principle_amount,rate,time,no_of_times));
		}

	}

}
