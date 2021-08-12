#declaring the dictionary
fruit_shop = {
    "apple" : 2,
    "orange": 4,
    "banana":6,
    "mango":8
}

key_to_check=input("What are you looking for: ").lower()

if (key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")