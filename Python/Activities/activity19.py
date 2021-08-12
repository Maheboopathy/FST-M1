#import
import pandas
from pandas import ExcelWriter
from pandas.core.frame import DataFrame
#create a dictionary
data = {
    'Firstname': ["Sathish", "Satvik", "Shahish"],
    'Lastname':["Kumar", "Darsh", "Sharma"],
    'Email': ["saku@gmail.com", "sadar@gmail.com", "shsh@gmail.com"],
    'Phonenumber':["8768996509", "8765469877", "9754205464"]
}
#create dataframe
dataframe=pandas.DataFrame(data)
print(dataframe)
#write to excel
writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index=False)
#save
writer.save()