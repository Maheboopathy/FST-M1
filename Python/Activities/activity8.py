#list of numbers
#numlist=[10,20,30,40,50]
numlist = list(input("Enter seq of numbers separated by comma: ").split(","))
print("Given list of numbers", numlist)
#get firstelement
firstelement=numlist[0]
#get lastelement
lastelement=numlist[-1]
if (firstelement==lastelement):
    print("true")
else:
    print("false")