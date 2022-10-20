class NewSwitch {

	public static void main(String[] args) {
		
		String  month="feb";
		int year=2024;
		
		switch(month)
		{
		  case "Jan","March","May","July","Aug","Oct","Dec"->System.out.println("Number of days=31");
		  case "April","June","Sep","Nov"->System.out.println("Number of days=30");
		  case "Feb"->{
			             if(year%4==0)
			            	 System.out.println("Leap Year and Number of days=29");
			             else  
			            	 System.out.println("Number of days=28");
		              }
		  default->System.out.println("Invalid month");
		
		}

	}

}