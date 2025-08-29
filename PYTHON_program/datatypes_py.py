
# Python Data Types

# 1. Numeric Types
# Integer
integer_var = 10
print("Integer:", integer_var)

# Float
float_var = 10.5
print("Float:", float_var)

# Complex
complex_var = 3 + 4j
print("Complex:", complex_var)

# 2. Sequence Types
# String
string_var = "Hello, World!"
print("String:", string_var)

# List
list_var = [1, 2, 3, 4, 5]
print("List:", list_var)

# Tuple
tuple_var = (1, 2, 3, 4, 5)
print("Tuple:", tuple_var)

# 3. Mapping Type
# Dictionary
dict_var = {"name": "Alice", "age": 25}
print("Dictionary:", dict_var)

# 4. Set Types
# Set
set_var = {1, 2, 3, 4, 5}
print("Set:", set_var)

# Frozen Set
frozen_set_var = frozenset([1, 2, 3, 4, 5])
print("Frozen Set:", frozen_set_var)

# 5. Boolean Type
bool_var_true = True
bool_var_false = False
print("Boolean True:", bool_var_true)
print("Boolean False:", bool_var_false)

# 6. None Type
none_var = None
print("None Type:", none_var)

# 7. Bytes and Bytearray
# Bytes
bytes_var = b"Hello"
print("Bytes:", bytes_var)

# Bytearray
bytearray_var = bytearray(5)
print("Bytearray:", bytearray_var)

# Summary of Data Types
data_types_summary = {
    "Integer": type(integer_var),
    "Float": type(float_var),
    "Complex": type(complex_var),
    "String": type(string_var),
    "List": type(list_var),
    "Tuple": type(tuple_var),
    "Dictionary": type(dict_var),
    "Set": type(set_var),
    "Frozen Set": type(frozen_set_var),
    "Boolean": type(bool_var_true),
    "None": type(none_var),
    "Bytes": type(bytes_var),
    "Bytearray": type(bytearray_var)
}

print("\nData Types Summary:")
for data_type, data_type_value in data_types_summary.items():
    print(f"{data_type}: {data_type_value}")
