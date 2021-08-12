#defining the function
def sum(num):
    sum1=0
    for numbers in num:
        sum1 +=numbers
    return sum1

#defind the list of numbers
numlist=[10,5,25,45,39]
#function call
result = sum(numlist)
#print result
print("The sum value is: ", str(result))