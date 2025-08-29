# Python Dictionary Operations Example

# 1. Dictionary Creation
# Creating dictionaries using curly braces or the dict() function
person = {
    "name": "Alice",
    "age": 30,
    "city": "New York"
}
print("Initial Dictionary:", person)

# 2. Accessing Dictionary Elements
# Accessing values using keys
name = person["name"]
age = person["age"]
print("\nName:", name)
print("Age:", age)

# 3. Adding Elements to a Dictionary
# Adding a new key-value pair
person["job"] = "Engineer"
print("\nDictionary after adding 'job':", person)

# 4. Updating Values in a Dictionary
# Updating an existing value
person["age"] = 31
print("Dictionary after updating 'age':", person)

# 5. Removing Elements from a Dictionary
# Removing a key-value pair using pop()
removed_job = person.pop("job")  # Removes the key 'job' and returns its value
print("\nRemoved Job:", removed_job)
print("Dictionary after removing 'job':", person)

# 6. Dictionary Length
# Getting the number of key-value pairs in the dictionary
dict_length = len(person)
print("\nLength of the dictionary:", dict_length)

# 7. Checking for Existence
# Checking if a key exists in the dictionary
has_city = "city" in person
print("\nDoes the dictionary contain 'city'? :", has_city)

# 8. Iterating Through a Dictionary
# Iterating through the dictionary and printing keys and values
print("\nIterating through the dictionary:")
for key, value in person.items():
    print(f"{key}: {value}")

# 9. Nested Dictionaries
# Creating a nested dictionary
students = {
    "student1": {
        "name": "John",
        "age": 20
    },
    "student2": {
        "name": "Emma",
        "age": 22
    }
}
print("\nNested Dictionary of Students:", students)

# Accessing nested dictionary values
student1_name = students["student1"]["name"]
print("Student 1 Name:", student1_name)

# 10. Dictionary Comprehensions
# Creating a new dictionary using dictionary comprehension
squared_numbers = {x: x**2 for x in range(1, 6)}  # Squares of numbers from 1 to 5
print("\nSquared Numbers Dictionary:", squared_numbers)

# 11. Clearing a Dictionary
# Clearing all elements from the dictionary
person.clear()
print("\nDictionary after clearing all elements:", person)

# 12. Copying a Dictionary
# Creating a copy of a dictionary
original_dict = {"a": 1, "b": 2}
copied_dict = original_dict.copy()
print("\nOriginal Dictionary:", original_dict)
print("Copied Dictionary:", copied_dict)
