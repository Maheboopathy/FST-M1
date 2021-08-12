#import pandas
import pandas
#create dictionary
data = {
    "usernames" : ["admin", "Charles", "Deku"],
    "passwords" : ["password", "Charl13", "AllMight"]
}
#creating dataframe
dataframe = pandas.DataFrame(data)
#print dataframe
print(dataframe)
#writing to csv file with index false
dataframe.to_csv("sample.csv", index=False)