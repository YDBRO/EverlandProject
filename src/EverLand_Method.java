package EverLand;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class EverLand_Method {

	
	public static void main(String[] args) {

		EverLandClass everProcess = new EverLandClass(); 
		Array everArray = new Array();
		everProcess.DayOfToday();



	while(true) {
		 everArray.ClearAll();
		 do {
	    	  everProcess.InsertDate();
	    	  everProcess.TicketLevel();
	 
	    	  System.out.println(everProcess.ticket);
	  		  System.out.println("ㅡ");

	  		  everProcess.InsertID();
	  		  if (everProcess.socialNumber.equals("0")) {continue;}
	  		  everProcess.BirthDate();
	  		  everProcess.CountTicket();
	  		  everProcess.ChoosePriority();
	  		  if(everProcess.benefit == 0) {continue;}
	  		  System.out.println("ㅡ");
	  
	  		  everProcess.BeContinue();
	  		  everArray.Arrayadd(everProcess.ticket, everProcess.age,
	  				  			everProcess.count, everProcess.price, everProcess.B);
			  System.out.println("감사합니다.");
		      System.out.println("=============== 에버랜드 =================");


	      	}while(everProcess.addOrder == 1);
	      	  everArray.Result();   
	      	  break;
		}

	}

	}