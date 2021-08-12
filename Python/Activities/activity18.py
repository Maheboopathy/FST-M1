#import pandas
import pandas
#Read CSV file
dataframe=pandas.read_csv("sample.csv")
#print the data
print("Full Data: ")
print(dataframe)
#print the values of usernames columns only
print("============")
print("Usernames: ")
print(dataframe["usernames"])
#print the values of the second row
print("=============")
print("Username: ", dataframe["usernames"][1], "|", "Password: ", dataframe["passwords"][1])
#print the usernames in ascending order
print("=============")
print("Usernames in ascending order")
print(dataframe.sort_values('usernames'))
#print the passwords in descending order
print("============")
print("passwords in descending order")
print(dataframe.sort_values('passwords', ascending=False))