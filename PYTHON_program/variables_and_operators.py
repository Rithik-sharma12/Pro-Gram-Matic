# Python Variables and Operators Example

# 1. Variable Assignment
# Assigning values to variables
a = 10          # Integer variable
b = 5.5        # Float variable
name = "Alice"  # String variable
is_student = True  # Boolean variable

# 2. Arithmetic Operators
# Performing basic arithmetic operations
sum_result = a + b          # Addition
difference = a - b          # Subtraction
product = a * b             # Multiplication
division = a / b             # Division
modulus = a % b              # Modulus (remainder)
exponentiation = a ** 2     # Exponentiation (a raised to the power of 2)

# 3. Outputting results of arithmetic operations
print("Arithmetic Operations:")
print("Sum:", sum_result)
print("Difference:", difference)
print("Product:", product)
print("Division:", division)
print("Modulus:", modulus)
print("Exponentiation:", exponentiation)

# 4. Comparison Operators
# Comparing variables
is_equal = (a == b)          # Equal to
is_not_equal = (a != b)      # Not equal to
is_greater = (a > b)         # Greater than
is_less = (a < b)            # Less than
is_greater_equal = (a >= b)  # Greater than or equal to
is_less_equal = (a <= b)     # Less than or equal to

# 5. Outputting results of comparison operations
print("\nComparison Operations:")
print("Is Equal:", is_equal)
print("Is Not Equal:", is_not_equal)
print("Is Greater:", is_greater)
print("Is Less:", is_less)
print("Is Greater or Equal:", is_greater_equal)
print("Is Less or Equal:", is_less_equal)

# 6. Logical Operators
# Using logical operators with boolean variables
and_result = is_student and (a > b)  # Logical AND
or_result = is_student or (a < b)    # Logical OR
not_result = not is_student            # Logical NOT

# 7. Outputting results of logical operations
print("\nLogical Operations:")
print("AND Result:", and_result)
print("OR Result:", or_result)
print("NOT Result:", not_result)

# 8. String Concatenation
# Concatenating strings
greeting = "Hello, " + name + "!"
print("\nGreeting:", greeting)

# 9. Compound Assignment Operators
# Using compound assignment operators
a += 5  # Equivalent to a = a + 5
b *= 2  # Equivalent to b = b * 2

# 10. Outputting updated variable values
print("\nUpdated Variables:")
print("Updated a:", a)
print("Updated b:", b)
