# Python Classes and Objects Example

# 1. Class Definition
class Dog:
    # Constructor method to initialize attributes
    def __init__(self, name, age):
        self.name = name  # Instance attribute for dog's name
        self.age = age    # Instance attribute for dog's age

    # Method to display dog's information
    def display_info(self):
        print(f"Dog's Name: {self.name}, Age: {self.age}")

    # Method to make the dog bark
    def bark(self):
        print(f"{self.name} says Woof!")

# 2. Creating Objects (Instances of the Class)
dog1 = Dog("Buddy", 3)  # Creating an object of Dog class
dog2 = Dog("Max", 5)    # Creating another object of Dog class

# 3. Accessing Attributes and Methods
print("Displaying Dog Information:")
dog1.display_info()  # Calling method to display info for dog1
dog2.display_info()  # Calling method to display info for dog2

# Making the dogs bark
print("\nMaking the dogs bark:")
dog1.bark()  # Calling bark method for dog1
dog2.bark()  # Calling bark method for dog2

# 4. Inheritance
class Puppy(Dog):  # Puppy class inherits from Dog class
    def __init__(self, name, age, training_level):
        super().__init__(name, age)  # Calling the constructor of the parent class
        self.training_level = training_level  # Additional attribute for training level

    # Overriding the display_info method
    def display_info(self):
        super().display_info()  # Call the parent method
        print(f"Training Level: {self.training_level}")

# 5. Creating an Object of the Subclass
puppy1 = Puppy("Charlie", 1, "Beginner")  # Creating an object of Puppy class

# Displaying puppy information
print("\nDisplaying Puppy Information:")
puppy1.display_info()  # Calling the overridden method for puppy1

# 6. Using a Class Method
class Animal:
    species = "Canine"  # Class attribute

    @classmethod
    def get_species(cls):
        return cls.species  # Class method to return species

# Accessing the class method
print("\nAnimal Species:", Animal.get_species())
