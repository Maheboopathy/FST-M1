#Get the user names
user1=input("What is Player1's name:")
user2=input("What is Player2's name:")
#Get the users choices
user1_answer = input(user1 +", do you want to choose rock, paper or scissors?").lower()
user2_answer = input(user2 +", do you want to choose rock, paper or scissors?").lower()
#Run algorithm to see who wins
if user1_answer == user2_answer:
    print("Its a tie!!")
elif user1_answer == 'rock':
    if user2_answer == 'scissors':
        print("rock wins!!")
    else: 
           print("paper wins!!")
elif user1_answer == 'scissors':
    if user2_answer =='paper':
        print("scissors wins!!")
    else: 
            print("rock wins!!")
elif user1_answer == 'paper':
    if user2_answer == 'rock':
        print("paper wins!!")
    else: print("scissors wins!!")
else: print("Invalid input! You have not entered rock, paper, scissors, try again")