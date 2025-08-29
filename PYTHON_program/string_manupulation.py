# Python String Manipulation Example

# 1. String Creation
# Creating strings using single quotes, double quotes, and triple quotes
single_quote_string = 'Hello, World!'
double_quote_string = "Python is fun!"
triple_quote_string = """This is a 
multi-line string."""
print(single_quote_string)
print(double_quote_string)
print(triple_quote_string)

# 2. String Indexing
# Accessing characters in a string using indexing
first_character = single_quote_string[0]  # First character
last_character = single_quote_string[-1]   # Last character
print("\nFirst character:", first_character)
print("Last character:", last_character)

# 3. String Slicing
# Slicing strings to get substrings
substring = single_quote_string[0:5]  # Characters from index 0 to 4
print("\nSubstring (0 to 4):", substring)

# 4. String Concatenation
# Concatenating strings using the + operator
greeting = "Hello"
name = "Alice"
full_greeting = greeting + ", " + name + "!"
print("\nFull Greeting:", full_greeting)

# 5. String Formatting
# Using f-strings for formatting
age = 25
formatted_string = f"{name} is {age} years old."
print("\nFormatted String:", formatted_string)

# 6. Common String Methods
# Demonstrating various string methods
sample_string = "   Python Programming   "
print("\nOriginal String:", repr(sample_string))

# Stripping whitespace
stripped_string = sample_string.strip()
print("Stripped String:", repr(stripped_string))

# Converting to uppercase and lowercase
upper_string = sample_string.upper()
lower_string = sample_string.lower()
print("Uppercase String:", upper_string)
print("Lowercase String:", lower_string)

# Replacing a substring
replaced_string = sample_string.replace("Programming", "Coding")
print("Replaced String:", repr(replaced_string))

# Splitting a string into a list
words = sample_string.split()  # Splits by whitespace by default
print("List of Words:", words)

# Joining a list of strings into a single string
joined_string = ", ".join(words)
print("Joined String:", joined_string)

# 7. Checking for Substring
# Using the 'in' keyword to check for a substring
contains_python = "Python" in sample_string
print("\nDoes the sample string contain 'Python'? :", contains_python)
