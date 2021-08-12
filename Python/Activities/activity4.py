#Get the user names
user1=input("What is Player1's name:")
user2=input("What is Player2's name:")
#looping endlessly
while True:
   #Ask user's answers
   user1_answer = input(user1 +", do you want to choose rock, paper or scissors?").lower()
   user2_answer = input(user2 +", do you want to choose rock, paper or scissors?").lower()
   #run the algorithm
   if user1_answer==user2_answer:
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
#Ask them if they want to play again
   repeat = input("Do you want to play another round? Yes/No: ").lower()
#if they say yes
   if (repeat=="yes"):
       pass
#if they say no
   elif (repeat=="no"):
       raise SystemExit
#if they say anything exit with an error message
   else:
       print("you entered an invalid option. Exiting now")
       raise SystemExit