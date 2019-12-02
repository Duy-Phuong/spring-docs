https://pythonbestcourses.com/deep-learning-with-python-course/?fbclid=IwAR1cEjJrdFT9264XczbnVKCOZRs5Np_fWXqU0VAxwMblP4tiakseEvLTV14

# Python for Beginners - The Complete Course

---
# Python Object Oriented Programming

### 1. Classes Intro.html
In the real world you are surrounded by objects.  Why not in programming?

* Objects can be represented digitally. 
* You can describe objects by their object variables. 
* Objects have a "parent" which is a class. A class is used to create an object. 
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
To create an object use  obj = Class()
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

Objects can be serialized:  converted into a text string

This "text string" can be stored into a file.  Then you can load that text again later and reconstruct the object.

There are some standard formats to convert objects into text
* JSON format
* YAML format
* Pickle format (not human readable)


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
