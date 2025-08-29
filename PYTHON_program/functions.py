# Python Functions Example

# 1. Function Definition
# This function takes two numbers and returns their sum
def add_numbers(a, b):
    """Return the sum of two numbers."""
    return a + b

# 2. Function with Default Arguments
# This function greets a user with a default greeting
def greet_user(name="Guest"):
    """Greet the user with a provided name, defaulting to 'Guest'."""
    print(f"Hello, {name}!")

# 3. Function with Variable Number of Arguments
# This function calculates the average of a variable number of arguments
def calculate_average(*args):
    """Return the average of the provided numbers."""
    if len(args) == 0:
        return 0
    return sum(args) / len(args)

# 4. Function that Returns Multiple Values
# This function returns both the sum and the product of two numbers
def sum_and_product(a, b):
    """Return the sum and product of two numbers."""
    return a + b, a * b

# 5. Calling Functions
# Call the add_numbers function and print the result
result = add_numbers(10, 5)
print("Sum of 10 and 5:", result)

# Call the greet_user function with and without an argument
greet_user("Alice")
greet_user()  # Uses default argument

# Call the calculate_average function with different numbers of arguments
average1 = calculate_average(10, 20, 30)
average2 = calculate_average(5, 15)
average3 = calculate_average()  # No arguments
print("Average of 10, 20, 30:", average1)
print("Average of 5 and 15:", average2)
print("Average with no arguments:", average3)

# Call the sum_and_product function and unpack the returned values
sum_result, product_result = sum_and_product(4, 6)
print("Sum of 4 and 6:", sum_result)
print("Product of 4 and 6:", product_result)

# 6. Lambda Functions
# This is a simple lambda function to square a number
square = lambda x: x ** 2
print("Square of 5:", square(5))
