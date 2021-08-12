#import
import pandas
#read from excel
dataframe = pandas.read_excel('sample.xlsx')
#print the data
print(dataframe)
#print the number of rows and columns
print("============")
print("Number of rows and columns: ", dataframe.shape)
#print the data in email columns only
print("=============")
print("Emails: ")
print(dataframe['Email'])
#sort the data based on Firstname
print("===========")
print("sorted the data based on Firstname: ")
print(dataframe.sort_values('Firstname'))