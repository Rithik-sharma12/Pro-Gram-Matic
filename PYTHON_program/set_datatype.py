# Python Set Operations Example

# 1. Set Creation
# Creating sets using curly braces or the set() function
fruits = {"apple", "banana", "cherry"}
print("Initial Set of Fruits:", fruits)

# 2. Adding Elements to a Set
# Adding a single element using add()
fruits.add("orange")
print("\nSet after adding 'orange':", fruits)

# Adding multiple elements using update()
fruits.update(["kiwi", "mango"])
print("Set after adding 'kiwi' and 'mango':", fruits)

# 3. Removing Elements from a Set
# Removing an element using remove()
fruits.remove("banana")  # Raises KeyError if the element is not found
print("\nSet after removing 'banana':", fruits)

# Removing an element using discard()
fruits.discard("apple")  # Does not raise an error if the element is not found
print("Set after discarding 'apple':", fruits)

# 4. Set Length
# Getting the number of elements in the set
set_length = len(fruits)
print("\nLength of the fruits set:", set_length)

# 5. Set Operations
# Creating another set for operations
vegetables = {"carrot", "broccoli", "cherry", "spinach"}

# Union of two sets
union_set = fruits.union(vegetables)
print("\nUnion of Fruits and Vegetables:", union_set)

# Intersection of two sets
intersection_set = fruits.intersection(vegetables)
print("Intersection of Fruits and Vegetables:", intersection_set)

# Difference of two sets (fruits - vegetables)
difference_set = fruits.difference(vegetables)
print("Difference of Fruits and Vegetables:", difference_set)

# Symmetric Difference (elements in either set but not in both)
symmetric_difference_set = fruits.symmetric_difference(vegetables)
print("Symmetric Difference of Fruits and Vegetables:", symmetric_difference_set)

# 6. Checking for Existence
# Checking if an item exists in the set
contains_cherry = "cherry" in fruits
print("\nDoes the set contain 'cherry'? :", contains_cherry)

# 7. Iterating Through a Set
# Iterating through the set and printing each fruit
print("\nIterating through the set of fruits:")
for fruit in fruits:
    print(fruit)

# 8. Set Comprehensions
# Creating a new set using set comprehension
squared_numbers = {x**2 for x in range(1, 6)}  # Squares of numbers from 1 to 5
print("\nSquared Numbers Set:", squared_numbers)

# 9. Clearing a Set
# Clearing all elements from the set
fruits.clear()
print("\nSet after clearing all elements:", fruits)

# 10. Set Immutability
# Attempting to create a set with mutable types (like lists) will raise an error
try:
    invalid_set = {1, 2, [3, 4]}  # This will raise a TypeError
except TypeError as e:
    print("\nError:", e)
