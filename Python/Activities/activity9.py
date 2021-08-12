#list of numbers
listone = [10,20,25,37,19]
listtwo = [45,39,66,20,50]
#print the list
print(listone)
print(listtwo)
#declare third list
thirdlist=[]
#to get odd numbers
for num in listone:
    if num%2!=0:
        thirdlist.append(num)
#to get even numbers
for num in listtwo:
    if num%2 == 0:
        thirdlist.append(num)
#print the list
print("result list is: ", thirdlist)
