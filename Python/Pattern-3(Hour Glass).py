n=int(input())
j=0
for i in range(n,0,-2):
    print(" "*(j)+"*"*i)
    j+=1
k=n//2-1
for i in range(3,n+1,2):
    print(" "*(k)+"*"*i)
    k-=1