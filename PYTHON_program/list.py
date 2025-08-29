# Python List Manipulation Example

# 1. List Creation
# Creating lists using square brackets
fruits = ["apple", "banana", "cherry", "date"]
print("Initial List of Fruits:", fruits)

# 2. Accessing List Elements
# Accessing elements using indexing
first_fruit = fruits[0]  # First element
last_fruit = fruits[-1]   # Last element
print("\nFirst Fruit:", first_fruit)
print("Last Fruit:", last_fruit)

# 3. Slicing Lists
# Slicing to get a sublist
sublist = fruits[1:3]  # Elements from index 1 to 2 (excluding index 3)
print("\nSublist (from index 1 to 2):", sublist)

# 4. Modifying Lists
# Adding a new fruit to the list
fruits.append("elderberry")
print("\nList after appending 'elderberry':", fruits)

# Inserting a fruit at a specific position
fruits.insert(1, "blueberry")  # Insert 'blueberry' at index 1
print("List after inserting 'blueberry' at index 1:", fruits)

# Removing a fruit from the list
fruits.remove("banana")  # Remove 'banana' from the list
print("List after removing 'banana':", fruits)

# Popping the last fruit from the list
popped_fruit = fruits.pop()  # Removes and returns the last item
print("Popped Fruit:", popped_fruit)
print("List after popping the last fruit:", fruits)

# 5. List Length
# Getting the length of the list
list_length = len(fruits)
print("\nLength of the list:", list_length)

# 6. Sorting Lists
# Sorting the list in alphabetical order
fruits.sort()
print("Sorted List of Fruits:", fruits)

# 7. Reversing Lists
# Reversing the order of the list
fruits.reverse()
print("Reversed List of Fruits:", fruits)

# 8. List Comprehensions
# Creating a new list using list comprehension
squared_numbers = [x**2 for x in range(1, 6)]  # Squares of numbers from 1 to 5
print("\nSquared Numbers:", squared_numbers)

# 9. Checking for Existence
# Checking if an item exists in the list
contains_cherry = "cherry" in fruits
print("\nDoes the list contain 'cherry'? :", contains_cherry)

# 10. Iterating Through a List
# Iterating through the list and printing each fruit
print("\nIterating through the list of fruits:")
for fruit in fruits:
    print(fruit)
