public static int getHolidaysDaysBetweenTwoDates(Date startDate, Date endDate) 
{
    
Calendar startCal = Calendar.getInstance();
    
startCal.setTime(startDate);        

    
Calendar endCal = Calendar.getInstance();
    
endCal.setTime(endDate);

    
int holidays = 0;

    
    
if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) 
{
        
return 0;
    
}

    
if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) 
{
        
startCal.setTime(endDate);
        
endCal.setTime(startDate);
    
}

    
do 
{
      
        
startCal.add(Calendar.DAY_OF_MONTH, 1);
       
 if (startCal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
 {
            
   ++holidays;
        
}
    
} 
while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); 

    
return holidays;

}