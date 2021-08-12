#tuple
num_tuple=(10,20,30,32,76,80,90)
print("given tuple list is: ", num_tuple)
#print the numbers divisible by 5
print("numbers divisible by 5: ")
for num in num_tuple:
    if num%5==0:
        print(num)