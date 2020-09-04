s1=input().strip() 

s2=input().strip()

s1=int(s1)

s2=int(s2)

c=0

for i in range(s1,s2+1):
    
      s=str(i) 
    
      for j in s:
        
           if j=='1':
            
              c=c+1 

print(c)