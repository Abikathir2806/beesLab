a=list(map(int,input().strip().split()))

ma=max(a)

mi=min(a)

for i in range(mi,ma+1):
    
   if i not in a:
        
        print(i)
        
        quit()