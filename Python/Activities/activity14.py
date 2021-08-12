#defining fibbonacci function
def fibbonacci(number):
    if number<=1:
        return number
    else:
        return(fibbonacci(number-1) + fibbonacci(number-2))
#get the number
nterm=int(input("Enter a number: "))
if nterm<=0:
   print ("enter a positive number")
else:
   print("Fibbonacci series: ")
   for i in range(nterm):
       print(fibbonacci(i))
