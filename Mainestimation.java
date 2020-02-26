package com.epam.logging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
public class Mainestimation {
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	public static void main(String args[])
	{
		float area;
		int ch,choice;
		Estimation1 e=new Estimation1();
		Scanner sc=new Scanner(System.in);
		LOGGER.info("Enter the area ofhouse");
		area=sc.nextInt();
		LOGGER.info("Do you want automated house or not if yes enter 1 else 0");
		ch=sc.nextInt();
		LOGGER.info("1.Standard material 2.above standard material 3.high standard material");
		choice=sc.nextInt();
		if(ch==1)
		{
			if(choice==1)//automated and standard material
			{
				LOGGER.info(e.construction(ch,choice,area));
			}
			else if(choice==2)
			{
				LOGGER.info(e.construction(ch,choice,area));
			}
			else if(choice==3)
			{
				LOGGER.info(e.construction(ch,choice,area));
			}
		}
		else if(ch==0)
		{
			if(choice==1)//automated and standard material
			{
				LOGGER.info(e.construction(ch,choice,area));
			}
			else if(choice==2)
			{
				LOGGER.info(e.construction(ch,choice,area));
			}
			else if(choice==3)
			{
				LOGGER.info(e.construction(ch,choice,area));
			}
		}
	}

}
