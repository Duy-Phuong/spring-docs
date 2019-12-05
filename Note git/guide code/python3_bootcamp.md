## 1. Course Introduction

### 1. Course Introduction

### 2. Python3 vs. Python2

http://python.slides.com/colt

### 2.1 httppy3readiness.org.html

http://py3readiness.org/

### 2.2 Key Differences Article.html

The key differences between Python 2.7.x and Python 3.x with examples

### 2.3 httpspythonclock.org.html

### 3. How The Exercises Work

### 4. Where Should You Start

### 5. How The Course is Structured

## 2. MACLINUX Command Line Fundamentals

### 1. Why Use The Command Line

http://python.slides.com/colt/command-line-28

### 1.1 SLIDES.html

### 2. Command Line Installation MAC

custom terminal: https://iterm2.com/
We will use the terminal to:

1. navigate around
2. create and remove directories and files
3. move, copy, and paste things
4. use version control (git) to keep track of changes

### 3. Absolute Paths and PWD

Slide: acc phuong123 – duyphuong1020
**How do I find out where I am?**
The cmdlet "pwd" (print working directory) will tell you the full absolute path of where you're at!

Check version of python: `python --version`

Slide: http://python.slides.com/colt/command-line-28#/

### 4. Using CD

**Navigating Absolutely**
The command "cd" ( "change directory") followed by the absolute path of the folder will navigate you directly there.

```ts
pwd / Users / Colt / stuff;
cd / Users;
pwd / Users;
```

**Navigating Relatively**
The dot "." stands for current directory, and dot-dot ".." stands for parent directory. This allows for relative navigation:

### 5. Using LS

What's Inside?
The keyword "ls" will "list" the contents of a directory.

```ts
ls - la;
```

Creating Directories
The command "mkdir" ("make directory") followed by the name of the new directory will create a new child directory inside the current directory.
Creating Files
New-Item -ItemType file filename.txt followed by the filename and file-type extension will create a new file of that type.

### 6. Command Line Fundamentals.html

### 7. Making Directories with MKDIR

### 8. Creating Files with TOUCH

### 9. Quick Activity Salamanders and Frogs

### 10. Moving and Renaming with MV

Moving / Renaming Things
Files can be moved or renamed using the "mv" (" move") keyword, which takes two arguments: the source and the destination.

```ts
mv favs.txt GOAT.txt
ls
GOAT.txt
mv GOAT.txt ../
```

Removing Files
Files can be deleted using the "rm" ("remove") keyword.
rm GOAT.txt

Removing Directories
Directories can be deleted using the "rm" keyword, with the added option "-r" ("recursive"). You can also add the "-fo" ("force") to prevent warnings.(rm -r -fo foldername)

```ts
rm -rf catpics
```

### 11. Deleting Files with RM

### 12. Deleting Directories (Plus Tangents on Permissions and MAN Pages)

### 13. Command Line Fundamentals II.html

**Recap**

OS file structure is hierarchical, tree-based
Navigate using these commands:

1.  cd "change directory"
2.  pwd "print working directory"
3.  ls "list contents"

Remember these aliases:

    1.  / is root directory
    2.  ~ is home
    3.  . is current
    4.  .. is parent

Manipulate files with:

    1. "mkdir" create directories
    2. "touch" create files
    3. "mv" move and rename
    4. "rm" to remove files, "-r" to remove directories

## 3. WINDOWS Command Line Fundamentals

1a. Initialize a local repository on your computer

1b. Clone (download) an online repository onto your computer

2. Change (create, edit, move, remove) files on your computer

3. Stage the files to be committed

4. Commit the files to a new version

5. Push changes to the online repository

```py
git init
git clone https://github.com/<your_github_handle>/<your_repo>.git
echo "just putting text in this file" >> README.md
git add .
git commit -m "my first commit"
git push origin master

```

### 1. Why Do You Need The Command Line

### 1.1 SLIDES.html

### 2. Using Powershell

### 3. Paths, LS, and PWD

### 4. Using The CD Command

### 5. Command Line Fundamentals (Windows).html

### 6. OPTIONAL Making Directories with MKDIR

### 7. OPTIONAL Making Files (it's...complicated)

### 8. Creating a Touch Function.html

### 9. OPTIONAL Removing Files and Folders with RM

### 10. Command Line Fundamentals II (Windows).html

## 4. MAC Python Setup

### 1. Installing Python MAC

### 1.1 Python Homepage.html

### 2. Optional Installing Sublime Text

### 2.1 Sublime Text.html

### 2.2 Tutorial on setting up sublime symlink.html

### 3. Our First Python Program!

### 4. Say Your Name.html

### 5. SOLUTION.html

### 6. Important Note on Print and the Python Interpreter

## 5. WINDOWS Python Setup

### 1. Installing Python On a PC

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
python
quit()
```

### 1.1 Python Homepage.html

### 1.2 How I Install Python 3 If I Already Have Python 2 Installed.html

Using Multiple Versions of Python on Windows

https://www.youtube.com/watch?v=JWtGG-Pnpz4

### 2. Introducing Sublime Text

### 2.1 Sublime Text.html

### 3. Your First Python Program

### 4. Print Your Name.html

### 5. SOLUTION.html

### 6. Important Note on Print and the Python Interpreter

## 6. Numbers, Operators, and Comments

### 1. Section IntroductionObjectives

http://python.slides.com/colt/oop-21#/

### 1.1 SLIDES.html

### 2. Numbers Ints and Floats

### 3. Quick Ints and Floats Quiz.html

### 4. Numbers Basic Math

### 5. Basic Math Refresher.html

### 6. Quick Note Comments

### 7. One Question Quiz.html

### 8. Numbers Weirder Operators

### 9. Numbers Quiz.html

### 10. Introduction to the Python Documentation

## 7. Variables and Strings

### 1. Variables and Data Types

### 1.1 SLIDES.html

### 2. Introduction to Variables

### 3. Bank Robbery Money.html

### 4. SOLUTION.html

### 5. Variable Naming Restrictions and Conventions

### 6. Data Types Overview

### 7. What The Heck is Dynamic Typing

### 8. Super Quick One Question Quiz!.html

### 9. The Special Value NONE

### 10. Double Vs. Single Quotes

### 11. Make Some Variables!.html

### 12. SOLUTION.html

### 13. String Escape Sequences

### 14. Escape Sequence Practice.html

### 15. SOLUTION.html

### 16. String Concatenation

### 17. String Concatenation Exercise.html

### 18. SOLUTION.html

### 19. String Formatting

### 20. IMPORTANT Interpolation w Udemy Exercises

### 21. Formatting Strings.html

### 22. SOLUTION.html

### 23. Strings and Indexes (Indicies)

### 24. Converting Data Types

### 25. Building a Mileage Convertor With User Input

```py
print("How many kilometers did you cycle today?")
kms = input() #get user input
miles = float(kms)/1.60934 #convert from string to float and divide
miles = round(miles, 2) #round the result
print(f"Your {kms}km ride was {miles}mi ")

# ROUND SYNTAX:
# round(thing to round, how many decimal points)

```

### 26. Variables and Data Types.html

## 8. Boolean and Conditional Logic

### 1. Section Introduction and Objectives

### 1.1 SLIDES.html

### 2. Getting User Input

```py
data = input("What's your favorite color?")
print("You said " + data)

print("What's your favorite color?")
data = input()
print("You said " + data)

```

### 3. Intro to Conditionals

```py
name = "Arya Stark"
if name == "Arya Stark":
    print("Valar Morghulis")
elif name == "Jon Snow":
    print("You know nothing")
else:
    print("Carry on")
```

### 4. Lucky Number 7.html

Check html file

### 5. SOLUTION.html

### 6. Number is Odd.html

### 7. SOLUTION.html

### 8. Multiple Elifs

### 9. A Word on Truthiness + A Quick Example

### 10. The Joy of Comparison Operators

### 11. Logical AND & OR

### 12. Food Classifying Exercise.html

### 13. SOLUTION.html

### 14. LOGICAL NOT

### 15. Boolean Logic Principles.html

### 16. A Note on Is Vs. ==

### 17. Bouncer Code-Along and Nested Conditionals

### 18. Boolean & Conditional Logic in Python.html

### 19. Positive or Negative Checking.html

### 20. SOLUTION.html

### 21. Calling in Sick.html

### 22. SOLUTION.html

## 9. Rock, Paper, Scissors

### 1. Rock, Paper, Scissor Mini Project BASIC Version

### 2. RPS Mini Project BASIC Version Solution

### 3. RPS Mini Project Refactoring Time

### 4. Another Cleaner RPS Solution.html

### 5. RPS Mini Project Playing Against The Computer

### 6. RPS Mini Project Computer AI Solution

## 10. Looping in Python

### 1. Section Introduction

### 1.1 SLIDES.html

### 2. IMPORTANT ANNOUNCEMENT ON LOOPS EXERCISES.html

### 3. The Basics of For Loops

### 4. Exploring Ranges In Depth

### 5. Quick Ranges Quiz.html

### 6. For Loop and Range Exercise.html

### 7. SOLUTION.html

### 8. EXERCISE Screaming Repeating

### 9. EXERCISE Unlucky Numbers

### 10. Introducing While Loops

### 11. EXERCISE Emoji Art

### 12. EXERCISE Stop Copying Me

### 13. The Break Keyword

### 14. Stuck in a Loop.html

### 15. While Loop Exercise.html

### 16. SOLUTION.html

### 17. Loops.html

## 11. Guessing Game

### 1. Guessing Game Mini Project

### 2. Guessing Game Solution

### 3. Improving Rock Paper Scissors

### 4. SIDE NOTE Python Style and PEP8

## 12. Lists

### 1. Intro to Lists and Objectives

### 1.1 SLIDES.html

### 2. Creating Lists

### 3. Creating Lists Exercise.html

### 4. SOLUTION.html

### 5. Accessing Data in Lists

### 6. Accessing List Data.html

### 7. SOLUTION.html

### 8. Iterating Over Lists

### 9. List Iteration Exercise.html

### 10. SOLUTION.html

### 11. List Methods Append, Insert, and Extend

### 12. Lists Basics Exercise.html

### 13. SOLUTION.html

### 14. List Methods Clear, Pop, and Remove,

### 15. Lists Quiz.html

### 16. List Methods Index, Count, Sort, Reverse, and Join

### 17. Lists Methods Exercise.html

### 18. SOLUTION.html

### 19. Slices

### 20. Slices Quiz.html

### 21. Swapping Values in Lists

## 13. Lists Comprehensions

### 1. List Comprehension

### 1.1 SLIDES.html

### 2. List Comprehension With Conditional Logic

### 3. List Comprehension Exercises.html

### 4. SOLUTION.html

### 5. More List Comprehension Exercises.html

### 6. SOLUTION.html

### 7. Another List Comp Exercise.html

### 8. SOLUTION.html

### 9. List Exercises 4.html

### 10. SOLUTION.html

### 11. Nested Lists

### 12. List Exercises 5.html

### 13. SOLUTION.html

### 14. One More Nested List Comp Challenge.html

### 15. SOLUTION.html

### 16. Lists Recap

## 14. Dictionaries

### 1. Intro To Dictionaries Creating Dictionaries

### 1.1 SLIDES.html

### 2. Dictionary Creation Exercise.html

### 3. SOLUTION.html

### 4. Accessing Data in Dictionaries

### 5. Access Data in a Dictionary Exercise.html

### 6. SOLUTION.html

### 7. Iterating Dictionaries

### 8. Totaling Donations Exercise.html

### 9. SOLUTION.html

### 10. Using In With Dictionaries

### 11. Dictionary Methods Clear, Copy, Fromkeys, and Get

### 12. Dictionary Access.html

### 13. SOLUTION.html

### 14. Fromkeys Exercise.html

### 15. SOLUTION.html

### 16. Dictionary Methods Pop, Popitems, and Update

### 17. Dictionary Methods Exercise.html

### 18. SOLUTION.html

### 19. Spotify Playlist Example

### 20. Dictionary Comprehension

### 21. Dictionaries Quiz.html

## 15. Dictionary Exercises

### 1. State Abbreviations Exercise.html

### 2. SOLUTION.html

### 3. List to Dictionary Exercise.html

### 4. SOLUTION.html

### 5. Vowels Dict Exercise.html

### 6. SOLUTION.html

### 7. ASCII Codes Dictionary.html

### 8. SOLUTION.html

## 16. Tuples and Sets

### 1. Section Introduction

### 1.1 SLIDES.html

### 2. Tuple Looping and Methods

### 3. Introduction to Sets

### 4. Set Methods and Set Math

### 5. Tuples and Sets Quiz.html

### 6. Tuples and Sets Exercise.html

### 7. SOLUTION.html

### 8. Set Comprehension and Recap

## 17. Functions Part I

### 1. Introduction to Defining Functions

### 1.1 SLIDES.html

### 2. Defining Functions

### 3. Your First Function.html

### 4. SOLUTION.html

### 5. The Magical Return Keyword

### 6. Writing a coin_flip Function Using Random

### 7. Super Quick Return Exercise.html

### 8. SOLUTION.html

### 9. Generating Evens Exercise.html

### 10. SOLUTION.html

### 11. Parameters

### 12. Yell Function Exercise.html

### 13. SOLUTION.html

### 14. Common Mistakes When Returning

### 15. Fix This Function!.html

### 16. SOLUTION.html

### 17. Default parameters

### 18. Default Parameter Exercise - Talking Animals.html

### 19. SOLUTION.html

### 20. Keyword Arguments

### 21. Scope

### 22. Docstrings and Functions Recap - WE DID IT!

## 18. Functions Exercises

### 1. Product.html

### 2. SOLUTION.html

### 3. return_day.html

### 4. SOLUTION.html

### 5. last_element.html

### 6. SOLUTION.html

### 7. number_compare.html

### 8. SOLUTION.html

### 9. single_letter_count.html

### 10. SOLUTION.html

### 11. multiple_letter_count.html

### 12. SOLUTION.html

### 13. list_manipulation.html

### 14. SOLUTION.html

### 15. is_palindrome.html

### 16. SOLUTION.html

### 17. frequency.html

### 18. SOLUTION.html

### 19. multiply_even_numbers.html

### 20. SOLUTION.html

### 21. capitalize.html

### 22. SOLUTION.html

### 23. compact.html

### 24. SOLUTION.html

### 25. intersection.html

### 26. SOLUTION.html

### 27. partition.html

### 28. SOLUTION.html

## 19. Functions Part II

### 1. Introduction and args

### 1.3 SLIDES.html

### 2. args Exercise The Purple Test.html

### 3. SOLUTION.html

### 4. kwargs

### 5. kwargs Exercise.html

### 6. SOLUTION.html

### 7. Ordering Parameters

### 8. Tuple unpacking

### 9. Unpacking Exercise.html

### 10. SOLUTION.html

### 11. Dictionary unpacking

### 12. calculate.html

### 13. SOLUTION.html

### 14. Args and Kwargs.html

## 20. Lambdas and Built-In Functions

### 1. Lambdas

### 1.2 SLIDES.html

### 2. Writing Your Own Lambda!.html

### 3. SOLUTION.html

### 4. Map

### 5. Map Time Exercise.html

### 6. SOLUTION.html

### 7. Filter

### 8. Filter Exercise!.html

### 9. SOLUTION.html

### 10. Any and All

### 11. Generator Expressions and Using sys.getsizeof

### 12. AnyAll Exercise.html

### 13. SOLUTION.html

### 14. Sorted

### 15. Min and Max

### 16. Extremes Exercise - Using Min and Max.html

### 17. SOLUTION.html

### 18. Reversed

### 19. Len() and a Special Sneak Peak of OOP!

### 20. Abs(), Sum(), and Round()

### 21. Greatest Magnitude Exercise.html

### 22. SOLUTION.html

### 23. sum_even_values.html

### 24. SOLUTION.html

### 25. sum_floats.html

### 26. SOLUTION.html

### 27. Zip Basics

### 28. More Complex Zip Examples

### 29. Interleaving Strings (kind of tough!).html

### 30. SOLUTION.html

### 31. triple_and_filter.html

### 32. SOLUTION.html

### 33. extract_full_name.html

### 34. SOLUTION.html

## 21. Debugging and Error Handling

### 1. Section Introduction

### 1.1 SLIDES.html

### 2. Common Types of Errors in Python

### 3. Raising Our Own Errors

### 4. Try and Except Blocks

### 5. Try, Except, Else, and Finally!

### 6. Debugging With PDB

### 7. Errors Quiz.html

### 8. Debugging and Error Handling Exercises.html

### 9. SOLUTION.html

## 22. Modules

### 1. Section Introduction

### 1.1 SLIDES.html

### 2. Working With Built-In Modules

### 3. Built In Modules Exercise.html

### 4. SOLUTION.html

### 5. Built-In Modules Slightly Tougher Challenge.html

### 6. SOLUTION.html

### 7. Custom modules

### 8. Custom Module Exercise.html

### 9. SOLUTION.html

### 10. Built-in and Custom Imports Quiz.html

### 11. Installing External Modules And TermColor

### 12. ASCII Art Exercise

### 13. Using The autopep8 Package to Clean Up Code

### 14. The Mysterious **name** variable

### 15. External Modules and Module Patterns Quiz.html

## 23. OPTIONAL SECTION Making HTTP Requests with Python

### 1. HTTP START HERE

### 2. HTTP Introduction and Crash Course

### 3. HTTP Verbs and APIs

### 4. Writing Your First Python Request

### 5. Requesting JSON with Python

### 6. Sending Requests with Params

### 7. API Project

### 8. API Project Solution

## 24. Object Oriented Programming

### 1. Section Introduction and Objectives

### 1.1 SLIDES.html

### 2. Defining Classes and Objects

### 3. Abstraction and Encapsulation

### 4. Creating Classes and Instances

### 5. World's Simplest Class Exercise.html

### 6. SOLUTION.html

### 7. The **init** method

### 8. Your First Class - Social Media Comments.html

### 9. SOLUTION.html

### 10. Underscores Dunder Methods, Name Mangling, and More!

### 11. Adding Instance Methods

### 12. Bank Account OOP Exercise.html

### 13. SOLUTION.html

### 14. Introducing Class Attributes

### 15. Class Attributes Continued

### 16. Chicken Coop Exercise.html

### 17. SOLUTION.html

### 18. Class Methods

### 19. A More Advanced Class Method Example

### 20. The **repr** method

### 21. OOP Part 1.html

## 25. Deck Of Cards Exercise

### 1. Deck Of Cards Intro Video

### 2. Deck of Cards Exercise Introduction Text.html

### 3. Deck of Cards Tests.html

### 4. SOLUTION.html

### 5. Deck of Cards Solution Card Class

### 6. Deck of Cards Solution Deck Class

## 26. OOP Part 2

### 1. Inheritance and Objectives

### 2. All About Properties

### 3. Introduction to Super()

### 4. Inheritance Example User and Moderator

### 5. Roleplaying Game Classes.html

### 6. SOLUTION.html

### 7. The Crazy World of Multiple Inheritance

### 8. WTF is Method Resolution Order(MRO)

### 9. MRO Genetics.html

### 10. SOLUTION.html

### 11. Polymorphism Introduction

### 12. Special **magic** methods

### 13. Making a Grumpy Dictionary - Overriding Dict

### 14. Special Methods Train.html

### 15. SOLUTION.html

### 16. OOP Part 2.html

## 27. Iterators & Generators

### 1. Section Introduction and Objectives

### 1.1 SLIDES.html

### 2. Iterators vs. Iterables!!

### 3. Writing Our Own Version of for loops

### 4. Writing a Custom Iterator

### 5. Iterators Quiz.html

### 6. Making our Deck class Iterable

### 7. Introduction to Generators

### 8. Week Generator Exercise.html

### 9. SOLUTION.html

### 10. yes_or_no.html

### 11. SOLUTION.html

### 12. Writing a Beat Making Generator

### 13. Generators Quiz.html

### 14. make_song.html

### 15. SOLUTION.html

### 16. Testing Memory Usage With Generators

### 17. get_multiples.html

### 18. SOLUTION.html

### 19. get_unlimited_multiples.html

### 20. SOLUTION.html

### 21. Generator Expressions AND Speed Testing!

## 28. Decorators

### 1. Higher Order Functions

### 2. Introduction to Decorators

### 3. Decorators With Different Signatures

### 4. Using Wraps To Preserve Metadata

### 5. Decorators Quiz.html

### 6. Building A Speed-Test Decorator

### 7. show_args.html

### 8. SOLUTION.html

### 9. Another Example Ensuring Args With A Decorator

### 10. double_return.html

### 11. SOLUTION.html

### 12. ensure_fewer_than_three_args.html

### 13. SOLUTION.html

### 14. only_ints.html

### 15. SOLUTION.html

### 16. ensure_authorized.html

### 17. SOLUTION.html

### 18. Writing an ensure_first_arg_is Decorator

### 19. Enforcing Argument Types With A Decorator

### 20. delay.html

### 21. SOLUTION.html

## 29. Testing With Python

### 1. Section Introduction

### 1.1 SLIDES.html

### 2. Why Test

### 3. Assertions

### 4. Assertions Quiz.html

### 5. Doctests

### 6. Doctests Exercise.html

### 7. Introduction to Unittest

### 8. Other Types of Assertions

### 9. Before and after hooks

### 10. Testing CardDeck Exercise.html

### 11. Testing CardDeck Exercise Intro

### 12. Testing CardDeck Solution

## 30. File IO

### 1. Section Introduction

### 1.1 SLIDES.html

### 2. Reading Text Files Open and Read

### 3. Reading Files Seek and Cursors

### 4. The With Statement

### 5. Writing to Text Files

### 6. File Modes

### 7. Text Reading Quiz.html

### 8. copy.html

### 9. SOLUTION.html

### 10. copy_and_reverse.html

### 11. SOLUTION.html

### 12. statistics.html

### 13. SOLUTION.html

### 14. find_and_replace.html

### 15. SOLUTION.html

## 31. Working With CSV and Pickling!

### 1. Reading CSV Files

### 2. Writing to CSV Files Writer

### 3. Writing to CSV Files DictWriter

### 4. CSV Quiz.html

### 5. add_user.html

### 6. SOLUTION.html

### 7. print_users.html

### 8. SOLUTION.html

### 9. find_user.html

### 10. SOLUTION.html

### 11. Pickling Time!

### 12. Extra Fancy JSON Pickling

### 13. update_users.html

### 14. SOLUTION.html

### 15. delete_users.html

### 16. SOLUTION.html

## 32. Web Scraping with BeautifulSoup

### 1. Introduction to Web Scraping

### 1.1 SLIDES.html

### 2. Is Scraping...OK

### 3. Optional HTMLCSS Crash Course

### 4. Selecting with BeautifulSoup find()

### 5. Selecting With BeautifulSoup CSS Style Selectors

### 6. Accessing Data with Beautiful Soup

### 7. Navigating With BeautifulSoup

### 8. Our First Scraping Program

## 33. Web Scraping Project

### 1. Quote Scraping Project Intro

### 2. Scraping Project.html

### 3. Quote Scraping Project Part 1

### 4. Quote Scraping Project The Game Logic

### 5. Quote Scraping Project Refactoring

### 6. Quote Scraping Project Adding CSV

### 7. Creating A Web Crawler with Scrapy

## 34. Regular Expressions

### 1. Intro To Regular Expressions

### 1.1 Regex Slides For This Section.html

### 2. Writing Basic Regex

### 2.1 Regex Cheatsheet Reference.html

### 2.2 Pythex Regex Editor.html

### 3. Regex Quiz.html

### 4. Regex Basics Quantifiers

### 4.1 Pythex Regex Editor.html

### 5. Quick Quantifiers Quiz.html

### 6. Regex Basics Character Classes and Sets

### 6.1 Pythex Regex Editor.html

### 7. Character Class Quiz.html

### 8. Regex Basics Anchors and Boundaries

### 8.1 Pythex Regex Editor.html

### 9. Quick Anchors and Boundaries Quiz.html

### 10. Regex Basics Logical Or and Capture Groups

### 10.1 Pythex Regex Editor.html

### 11. Final Regex Quiz.html

### 12. Introduction to the RE Module

### 12.1 RE Module Documentation.html

### 13. Validating Phone Numbers With Python

### 14. Time Validating.html

### 15. SOLUTION.html

### 16. Parsing URLs with Python

### 17. Parsing Bytes Exericse.html

### 18. SOLUTION.html

### 19. Symbolic Group Names

### 20. Date Parsing Exercise.html

### 21. SOLUTION.html

### 22. Regex Compilation Flags

### 23. Regex Substitution Basics

### 24. Regex Profanity Filter.html

### 25. SOLUTION.html

### 26. Swapping File Names

## 35. Python + SQL

### 1. Intro to Section

### 2. Installing SQLite3

### 2.1 SQLite Docs.html

### 2.2 Windows Installation Video.html

### 3. SQL Basics Creating Tables

### 4. SQL Basics Inserting

### 5. SQL Basics Selecting

### 6. Connecting to a DB With Python

### 7. Inserting With Python

### 8. Bulk Inserts With Python

### 9. Selecting With Python

### 10. SQL INJECTION!

### 11. Scraping to a Database Pt. 1

### 12. Scraping to a Database Pt. 2

## 36. Massive Section of Challenges!

### 1. reverse_string.html

### 2. list_check.html

### 3. remove_every_other.html

### 4. sum_pairs.html

### 5. vowel_count.html

### 6. SOLUTIONS Part 1.html

### 7. Titleize.html

### 8. find_factors.html

### 9. includes.html

### 10. repeat.html

### 11. truncate.html

### 12. SOLUTIONS Part 2.html

### 13. two_list_dictionary.html

### 14. range_in_list.html

### 15. same_frequency.html

### 16. nth.html

### 17. find_the_duplicate.html

### 18. SOLUTIONS Part 3.html

### 19. sum_up_diagonals.html

### 20. min_max_key_in_dictionary.html

### 21. find_greater_numbers.html

### 22. two_oldest.html

### 23. is_odd_string.html

### 24. SOLUTIONS Part 4.html

### 25. valid_parentheses.html

### 26. reverse_vowels.html

### 27. three_odd_numbers.html

### 28. mode.html

### 29. SOLUTION mode.html

### 30. running_average.html

### 31. SOLUTIONS Part 5.html

### 32. letter_counter.html

### 33. once.html

### 34. Next Prime Generator.html

### 35. SOLUTIONS Part 6.html
