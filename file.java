# Simple Python program

def greet(name):
    return f"Hello, {name}! Welcome to Python."

def check_even_odd(number):
    if number % 2 == 0:
        return "Even number"
    else:
        return "Odd number"

# Take user input
name = input("Enter your name: ")
number = int(input("Enter a number: "))

# Use functions
message = greet(name)
result = check_even_odd(number)

# Output results
print(message)
print(f"The number you entered is {result}.")