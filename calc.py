# Create a calculator program that takes two numbers and takes an operation and applies it to the two numbers. 

# num1 
# num2 
# operators 
# 1 (Addition)
# 2 (Subtraction) 
# 3 (Multiplication) 
# 4 (Division) 

# Use if else statements to decide which operator to use. 

# Print out the answer to the terminal.

#USEFUL THINGS TO KNOW 
#float() converts value into a decimal number                                                                                                                              `
#input("What is your age? ") prompts the user this question, and it allows the user to type something in the terminal as the input

# Calculator code goes here: 

num1 = float(input("What is num1? "))
num2 = float(input("What is num2? "))
operator = float(input("What operation do you want to do?\n 1 (Addition) \n 2 (Subtraction) \n 3 (Multiplication) \n 4 (Division) \n"))

if operator == 1:
    print(num1 + num2)
elif operator == 2: 
    print (num1 - num2)
elif operator == 3: 
    print(num1 * num2)
elif operator == 4: 
    if num2 != 0: 
        print(num1 / num2)
    else: 
        print("Error: Division by 0")
else: 
    print("Invalid Operator Selected")


    