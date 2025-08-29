# Python Control Structures Example

# 1. Conditional Statements
# Function to check if a number is positive, negative, or zero
def check_number(num):
    print(f"Checking the number: {num}")
    if num > 0:
        print("The number is positive.")
    elif num < 0:
        print("The number is negative.")
    else:
        print("The number is zero.")

# Test the function with different numbers
check_number(10)   # Positive number
check_number(-5)   # Negative number
check_number(0)    # Zero

# 2. For Loop
# Function to print the squares of numbers from 1 to 5
def print_squares():
    print("\nSquares of numbers from 1 to 5:")
    for i in range(1, 6):  # Looping through numbers 1 to 5
        square = i ** 2     # Calculating square
        print(f"Square of {i}: {square}")

print_squares()

# 3. While Loop
# Function to demonstrate a while loop that counts down from 5 to 1
def countdown():
    count = 5
    print("\nCountdown from 5 to 1:")
    while count > 0:  # Continue until count is greater than 0
        print(count)
        count -= 1  # Decrease the count by 1
    print("Countdown finished!")

countdown()

# 4. Nested Loops
# Function to demonstrate nested loops
def nested_loops():
    print("\nNested Loops:")
    for i in range(1, 4):  # Outer loop
        for j in range(1, 4):  # Inner loop
            print(f"i: {i}, j: {j}")

nested_loops()

# 5. Using break and continue
# Function to demonstrate break and continue statements
def break_continue_example():
    print("\nBreak and Continue Example:")
    for i in range(1, 11):  # Loop from 1 to 10
        if i == 5:
            print("Breaking the loop at i =", i)
            break  # Exit the loop when i is 5
        if i % 2 == 0:
            print(f"Continue to the next iteration, skipping {i}")
            continue  # Skip even numbers
        print("Current value of i:", i)

break_continue_example()
