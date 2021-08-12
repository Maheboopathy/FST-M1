#defining the function
def calculatesum(num):
  if num:
      #recursive function call
      return num+calculatesum(num-1)
  else:
      return 0

#call calculatesum
res = calculatesum(10)
#print the value
print(res)