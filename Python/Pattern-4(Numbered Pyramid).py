n=int(input())
k=0

for i in range(1,n+1):
    print((n*2-k-2)*" ",end="")
    for j in range(i,i*2):
        print(j,end=" ")
   
    k+=2
    
    for p in range((i*2)-2,i-1,-1):
        print(p,end=" ")
    print()