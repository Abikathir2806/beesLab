def findAngle(hour, min):
	
     h = (hour * 360) // 12 + (min * 360) // (12 * 60)
	
     m = (min * 360) // (60) 
	
     angle = abs(h - m)
	
     if angle > 180:
		
       angle = 360 - angle
         
     return angle
        
     hour = int(input()) 
	
     min = int(input()) 
        
     print(findAngle(hour, min))