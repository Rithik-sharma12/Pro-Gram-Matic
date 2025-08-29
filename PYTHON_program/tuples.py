# Python Tuple Operations Example

# 1. Tuple Creation
# Creating tuples using parentheses
fruits = ("apple", "banana", "cherry")
print("Initial Tuple of Fruits:", fruits)

# 2. Accessing Tuple Elements
# Accessing elements using indexing
first_fruit = fruits[0]  # First element
last_fruit = fruits[-1]   # Last element
print("\nFirst Fruit:", first_fruit)
print("Last Fruit:", last_fruit)

# 3. Slicing Tuples
# Slicing to get a sub-tuple
sub_tuple = fruits[1:3]  # Elements from index 1 to 2 (excluding index 3)
print("\nSub-tuple (from index 1 to 2):", sub_tuple)

# 4. Concatenating Tuples
# Concatenating two tuples
vegetables = ("carrot", "broccoli")
combined_tuple = fruits + vegetables
print("\nCombined Tuple of Fruits and Vegetables:", combined_tuple)

# 5. Repeating Tuples
# Repeating a tuple using the * operator
repeated_tuple = fruits * 2
print("\nRepeated Tuple of Fruits:", repeated_tuple)

# 6. Tuple Length
# Getting the length of a tuple
tuple_length = len(fruits)
print("\nLength of the fruits tuple:", tuple_length)

# 7. Checking for Existence
# Checking if an item exists in the tuple
contains_banana = "banana" in fruits
print("\nDoes the tuple contain 'banana'? :", contains_banana)

# 8. Iterating Through a Tuple
# Iterating through the tuple and printing each fruit
print("\nIterating through the tuple of fruits:")
for fruit in fruits:
    print(fruit)

# 9. Nested Tuples
# Creating a nested tuple
nested_tuple = (fruits, vegetables)
print("\nNested Tuple:", nested_tuple)

# 10. Tuple Unpacking
# Unpacking values from a tuple into variables
a, b, c = fruits
print("\nUnpacked Fruits:")
print("a:", a)
print("b:", b)
print("c:", c)

# 11. Tuples are Immutable
# Trying to change an element (will raise an error)
try:
    fruits[0] = "kiwi"  # This will raise a TypeError
except TypeError as e:
    print("\nError:", e)
