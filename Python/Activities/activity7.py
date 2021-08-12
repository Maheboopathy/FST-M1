numbers = list(input("Enter a sequence of number separated by comma: ").split(","))
sum = 0
for number in numbers:
    sum += int(number)
    print(sum)