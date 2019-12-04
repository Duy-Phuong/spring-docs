https://pythonbestcourses.com/deep-learning-with-python-course/?fbclid=IwAR1cEjJrdFT9264XczbnVKCOZRs5Np_fWXqU0VAxwMblP4tiakseEvLTV14

# Python for Beginners - The Complete Course

---

# Python Object Oriented Programming

### 1. Classes Intro.html

In the real world you are surrounded by objects. Why not in programming?

- Objects can be represented digitally.
- You can describe objects by their object variables.
- Objects have a "parent" which is a class. A class is used to create an object.

### 10. Exercises.html

### 2. Class and Objects

```py
class Vehicle:
    wheel = 2
    name = 'abc'


car = Vehicle()
car.wheel = 4

print('car wheel: {}'.format(car.wheel))
```

### 3. Lecture Notes.html

Key facts

Objects are created from a class
A class defines the objects variables
An object can have one ore more variables
To create an object use obj = Class()
The line obj.variable is an objects variable

### 4. Class Attributes

### 5. Lecture Notes.html

Key facts

Objects variables are defined in a Class
You can have more than one class in a program.

Example:
Create Objects Car, Motorbike with class Vehicle.
Create Object Bob with the class Human.
If a Motorbike would be created from class Human, it would have eyes and legs. Classes define the objects variables.

### 6. Object Types

### 8. Class Methods

Key facts

Classes can have methods

```py
class Car:
    def drive():
        ...
    def accelerate():
        ....

```

Objects will have the same class methods available

```py
obj1.drive()
obj2.drive()
obj3.drive()

```

### 9. Lecture Notes.html

## 3. More on Classes

### 1. Constructor

Key facts

A constructor is the first method called upon creating an object
A constructor is defined as def `__init__():`
If a constructor is not defined, Python creates an empty constructor

```py
class Vehicle:
    wheel = 2
    name = 'abc'
    __key = ''

    def __init__(self):
        # def __init__(self, name): with param
        print('constructor')

    def __del__(self):
        print('destructor')

    def run(self):
        print('run')

    def get_key(self):
        return self.__key

    def set_key(self, key):
        self.__key = key


car = Vehicle()
car.wheel = 4

print('car wheel: {}'.format(car.wheel))
car.run()
car.set_key(5)
print('key: {}'.format(car.get_key()))

```

### 3. Destructor

### 5. Private Variables

Key facts
A variable can be private. Private variables cannot directly be accessed
Getter and setter methods can be used to interact with private variables

## 4. Inheritance

### 1. Inheritance

```py
class Person:
  def __init__(self, fname, lname):
    self.firstname = fname
    self.lastname = lname

  def printname(self):
    print(self.firstname, self.lastname)

class Student(Person):
  pass

x = Student("Mike", "Olsen")
x.printname()

```

### 3. Inherit Methods

### 4. Multiple Inheritance

```
class Student(Person, Man):
  pass
```

### 5. Lecture Notes.html

Classes can inherit from one of more parent classes
Example: Class Bob can inherit from parent classes Human and Superman

class Bob(Human, Superman):
....

### 6. Override Methods

redefine func in subclass

## 5. Advanced OOP

### 1. Method Overloading

```py
def hello(name=None):
    if name is not None:
        print('hello {}'.format(name))
    else:
        print('hello')

hello()
hello('Phuong')
```

### 2. Lecture Notes.html

### 3. Interface

```py
from abc import ABC, abstractmethod

class VehicleInterface(ABC):
    @abstractmethod
    def run(self):
        print('run')


class Truck(Vehicle):
    def run(self):
        print('truck run')


truck = Truck()
truck.run()
```

### 5. Factory Method

```py
class MyFactory:
    def factory(self, type):
        if type == 'Word':
            return Word()
        else:
            return PDF()


class Word:
    version = 1

class PDF:
    version = 2


the_factory = MyFactory()
word = the_factory.factory('Word')
print('version: {}'.format(word.version))
```

### 7. Exercises.html

## 6. Object Serialization

What is serialization?

Objects can be serialized: converted into a text string

This "text string" can be stored into a file. Then you can load that text again later and reconstruct the object.

There are some standard formats to convert objects into text

- JSON format
- YAML format
- Pickle format (not human readable)

### 2. Object Serialization with JSON

https://jsonpickle.github.io/

```py
class Thing(object):
    def __init__(self, name):
        self.name = name

obj = Thing('Awesome')
# Use jsonpickle to transform the object into a JSON string:

import jsonpickle
frozen = jsonpickle.encode(obj)
# Use jsonpickle to recreate a Python object from a JSON string:

thawed = jsonpickle.decode(frozen)

## save to file
with open("thing.obj", "wb") as f:
f.write(frozen)

data = ""
with open("thing.obj", "rb") as fo:
data = fo.readline()
```

https://www.pythonforbeginners.com/files/reading-and-writing-files-in-python

### 3. Object Serialization with YAML

http://zetcode.com/python/yaml/

```py
import yaml

users = {'name': 'John Doe', 'occupation': 'gardener'}
s = yaml.dump(users)
print(s)
print(s.load().name)
```

### 4. Object Serialization with Pickle

```py
import pickle

bin_file = open('dump.bin', mode='wb')
dump = pickle.dump(car, bin_file)
bin_file.close()

with open('dump.bin') as f:
    obj = pickle.load()
    print(obj.name)
```

## 7. Counter OOP

### 2. Class Method

```py
class Utils:
    version = 1

    @classmethod
    def hello(cls):
        print(cls.version)

    @staticmethod
    def run(self):
        print('static method')


Utils.hello()  # access class field
Utils.run()
```

### 3. Static Method

---

# The Complete Python 3 Course Go from Beginner to Advanced!

## 02 Setting Up Python On Your Computer

### 002 Get Started by Installing Python 3_5

Search python/ open file location
![](../root/img/2019-12-03-01-37-06.png)
![](../root/img/2019-12-03-01-37-40.png)
![](../root/img/2019-12-03-01-38-11.png)
copy path
Search: envi
System vari...
Add into PATH: C:\Users\phuong\AppData\Local\Programs\Python\Python37
Add into PATH: C:\Users\phuong\AppData\Local\Programs\Python\Python37\python.exe
![](../root/img/2019-12-03-01-56-45.png)

Check

```py
python --version
```

### 003 Setting up Sublime Text to Build Python

/_use your own path in the cmd portion. Be sure to delete this line! _/

```json
{
  "cmd": [
    "C:\\Users\\Test\\AppData\\Local\\Programs\\Python\\Python35-32\\python.exe",
    "-u",
    "$file"
  ],
  "file_regex": "^[ ]*File \"(...*?)\", line ([0-9]*) ",
  "selector": "source.python"
}
```

## 03 Introduction to your first program with Python data types and variables

### 004 First Program in Python

### 005 Data Types

Check use `print(type(2.2))`

### 006 Variables

```py
a, b, c = 1.5, 2, 3
a = b = c = 1
num = 1
s = "abc"
num = s

import keyword
# list keyword
print(keyword.kwlist)
```

### 007 Indentation

Ham phai nam trong cac Indentation(Tab vao)

### 008 How to Clear Screen

```py
# cmd
import os
clear = lambda: os.system('cls')
clear()
```

## 04 Comments in Python

### 009 Single-line Comments

### 010 Multi-line Comments

```py
'''
comment in multiple lines
'''
```

## 05 Expressions in Python

### 011 Basic Arithmetic

### 012 Division Characteristics

// chia lay phan nguyen
% chia lay phan du

### 013 Operator Precedence

### 014 Complex Arithmetic

### 015 Binary Number Manipulation

## 06 Learn about Strings

### 016 Basic String Manipulation

```py
string = "abc"
string = 'def1234'
print(len(string))
print('character: {}'.format(string[-2]))
print(string[:5])

a = '1'
b = '2'
c = 2 * a + b
print(c)

# 7
# character: 3
# def12
# 112
```

### 017 Using the format Method

```py
print('Today I have {0} cup {1}'.format('a', 'coffee'))
print('x = {x}; y = {y}'.format(x = 1, y = 2))
print('The {vehicle} is {0}'.format('car', vehicle = 'vehicle'))
print('{:<20}'.format('text'))
print('{:>20}'.format('text')) #                 text
print('{:b}'.format(20)) # 10100
print('{:x}'.format(20)) # hexan: 14
```

### 018 Specific Characters

```py
print("""Hello
 Phuong""")
print(r'c:\a\b') # c:\a\b

```

## 07 Branching in Python

### 019 Logical Operators and Conditional Statements

### 020 if Statement

### 021 if else Statement

```py
x = 41

if x > 10:
  print("Above ten,")
  if x > 20:
    print("and also above 20!")
  else:
    print("but not above 20.")
```

### 022 ifelif Statement

### 023 Ternary Operator

```py
a = 7 if c == '' else 14
```

## 08 Loops in Python

range(start, stop, step)

```py
for i in range(0,10,1):
    print(i)


```

### 024 for Loop Part 1

```py
str = 'abc'

for i in str:
    print(i)

for i in range(0, 5):
    print('{:<3}|'.format(i), end="")
# 0  |1  |2  |3  |4  |
```

### 025 for Loop Part 2

### 026 for Loop Part 3

### 027 while Loop

### 028 break and continue Statements

## 09 Functions in Python

### 030 Passing Arguments Default Parameters Scope and Nested Functions

### 031 Recursive Functions

### 032 Lambda Functions

## 10 Exception Handling

### 034 Handling Exceptions

```py
try:
    x = 5 / 0
except Exception as e:
  print(e)
```

### 035 Throwing Exceptions

```py
a = 1
def raise_exception(a):
    try:
        if type(a) != type('a'):
            raise ValueError('this is not a string!')
    except ValueError as e:
        print(e)


raise_exception(a)
```

## 11 Data Input

Install package control in sublime text

```py
age = input('Nhap: ')
```

### 036 Data Input Setup and Input Function

### 037 File Management Reading

w3school

```py
f = open("demofile.txt", "r")
print(f.readline())
f.close()

Return the 5 first characters of the file:

f = open("demofile.txt", "r")
print(f.read(5))

# Loop through the file line by line:
f = open("demofile.txt", "r")
for x in f:
  print(x)

f.tell()
f.seek(5)
print(f.name)
print(str(f.closed))
```

### 038 File Management Writing

```py
f = open('test.txt', 'w+')
f.write('hello')
f.seek(0)
f.write('fff')
f.seek(0)
print(f.read())
# ffflo
```

## 12 Useful Data Structures

### 039 Tuples

```ts
tup = (1, 2, 'a', 4, 5)
print(tup[1])
print(tup[:3]) # (1, 2, 'a')
tup = tup[:3] + (,5)
print(tup[1]*4)
print(5 in tup) # True

```

cannot set tup[1] = 3

### 040 Tuple Functions

len, max, min

### 041 Lists

```
list = [1, 2]
print(5 in list) # True
list.append(6)
```

### 042 List Functions

map
lambda

```py
list(filter(lambda x: x < 4, [1, 2, 3, 4]))

# [1, 2, 3]
reduce => import functools
```

### 043 Dictionaries

### 044 Shallow Copies

### 045 Sets

### 046 Set Functions

## 13 Modules and Packages

### 047 Modules

### 048 Packages

### 049 Built-in Modules

## 14 All About Object Oriented Programming (OOP)

### 050 Introduction to OOP

### 051 Class Definition and Object Instantiation

### 052 Class Methods Part 1

### 053 Class Methods Part 2

### 054 Operator Overloading

### 055 Class Inheritance Part 1

### 056 Class Inheritance Part 2

### 057 Extra Notes in Python

## 15 Data Visualization

### 058 Installing Modules for Visualization

### 059 Visualization Part 1

### 060 Visualization Part 2

### 061 Visualization Part 3

### 062 Pandas Library

## 16 Numpy Library

### 063 Installing the Numpy Library

### 064 Creating Numpy Objects

### 065 Useful Functions from the Numpy Library

### 066 Basic Operations with Numpy Library

## 17 Debugging

### 067 The pdb Module

### 068 Commands for Debugging Part 1

### 069 Commands for Debugging Part 2

## 18 Regular Expressions

### 070 Creating Evaluating and Compiling Regular Expressions

### 071 Patterns

### 072 Division and Grouping the Results

### 073 Setting the Search Parameters
