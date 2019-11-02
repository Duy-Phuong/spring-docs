- [Spring & Hibernate for Beginners (includes Spring Boot)](#spring--hibernate-for-beginners-includes-spring-boot)
  - [Tai lieu](#tai-lieu)
  - [3. Setting Up Your Development Environment](#3-setting-up-your-development-environment)
    - [2. Installing Tomcat](#2-installing-tomcat)
    - [4. Connecting Tomcat to Eclipse](#4-connecting-tomcat-to-eclipse)
    - [5 Add jar files](#5-add-jar-files)
  - [4. Spring Inversion of Control - XML Configuration](#4-spring-inversion-of-control---xml-configuration)
    - [1. What is Inversion of Control](#1-what-is-inversion-of-control)
    - [4. Spring Inversion of Control - Overview](#4-spring-inversion-of-control---overview)
        - [Spring Container](#spring-container)
        - [IOC & XML Configuration](#ioc--xml-configuration)
        - [Configuring Spring Container](#configuring-spring-container)
        - [Spring Development Process](#spring-development-process)
      - [FAQ: What is a Spring Bean?](#faq-what-is-a-spring-bean)
      - [8. HEADS UP - Add Logging Messages in Spring 5.1](#8-heads-up---add-logging-messages-in-spring-51)
      - [Why do we specify the Coach interface in getBean()?](#why-do-we-specify-the-coach-interface-in-getbean)
  - [5. Spring Dependency Injection - XML Configuration](#5-spring-dependency-injection---xml-configuration)
    - [Các nguyên tắc đảo ngược phụ thuộc.](#c%c3%a1c-nguy%c3%aan-t%e1%ba%afc-%c4%91%e1%ba%a3o-ng%c6%b0%e1%bb%a3c-ph%e1%bb%a5-thu%e1%bb%99c)
      - [Spring Injection Types(pdf)](#spring-injection-typespdf)
      - [Development Process - Constructor Injection](#development-process---constructor-injection)
      - [FAQ: What is the purpose for the no arg constructor?](#faq-what-is-the-purpose-for-the-no-arg-constructor)
      - [Development Process - Setter Injection](#development-process---setter-injection)
      - [Injecting Literal Values Development Process](#injecting-literal-values-development-process)
      - [Question:](#question)
  - [34. AOP Aspect-Oriented Programming Overview](#34-aop-aspect-oriented-programming-overview)
      - [1. AOP - The Business Problem](#1-aop---the-business-problem)
      - [2. AOP Solution and AOP Use Cases](#2-aop-solution-and-aop-use-cases)
      - [3. Comparing Spring AOP and AspectJ](#3-comparing-spring-aop-and-aspectj)
  - [35. AOP @Before Advice Type](#35-aop-before-advice-type)
      - [1. AOP @Before Advice Overview](#1-aop-before-advice-overview)
      - [2. AOP AOP Project Setup](#2-aop-aop-project-setup)
      - [3. AOP @Before Advice - Write Some Code](#3-aop-before-advice---write-some-code)
      - [4. AOP @Before Advice - Add and Test AOP Aspect](#4-aop-before-advice---add-and-test-aop-aspect)
  - [36. AOP Pointcut Expressions - Match Methods and Return Types](#36-aop-pointcut-expressions---match-methods-and-return-types)
      - [1. AOP - Pointcut Expressions Overview](#1-aop---pointcut-expressions-overview)
      - [2. AOP - Pointcut Expressions - Match any addAccount Method - Part 2](#2-aop---pointcut-expressions---match-any-addaccount-method---part-2)
      - [3. AOP - Pointcut Expressions - Match only DAO addAccount - Match any add Method](#3-aop---pointcut-expressions---match-only-dao-addaccount---match-any-add-method)
      - [4. AOP - Pointcut Expressions - Match any Return Type](#4-aop---pointcut-expressions---match-any-return-type)
  - [37. AOP Pointcut Expressions - Match Method Parameter Types](#37-aop-pointcut-expressions---match-method-parameter-types)
      - [1. AOP Pointcut Expressions - Match Method Parameter Types Overview](#1-aop-pointcut-expressions---match-method-parameter-types-overview)
      - [2. AOP Pointcut Expressions - Match Method with Account and more Params](#2-aop-pointcut-expressions---match-method-with-account-and-more-params)
      - [3. AOP Pointcut Expressions - Match Method Any Params - Match Method in a Package](#3-aop-pointcut-expressions---match-method-any-params---match-method-in-a-package)
  - [38. AOP Pointcut Declarations](#38-aop-pointcut-declarations)
      - [1. AOP Pointcut Declarations - Overview](#1-aop-pointcut-declarations---overview)
      - [2. AOP Pointcut Declarations - Write Some Code](#2-aop-pointcut-declarations---write-some-code)
      - [3. AOP Combining Pointcuts - Overview](#3-aop-combining-pointcuts---overview)
      - [4. AOP Combining Pointcuts - Write Some Code - Part 1](#4-aop-combining-pointcuts---write-some-code---part-1)
      - [5. AOP Combining Pointcuts - Write Some Code - Part 2](#5-aop-combining-pointcuts---write-some-code---part-2)
  - [39. AOP Ordering Aspects](#39-aop-ordering-aspects)
  - [40. AOP JoinPoints](#40-aop-joinpoints)
  - [41. AOP @AfterReturning Advice Type](#41-aop-afterreturning-advice-type)
  - [42. AOP @AfterThrowing Advice Type](#42-aop-afterthrowing-advice-type)
  - [43. AOP @After Advice Type](#43-aop-after-advice-type)
  - [44. AOP @Around Advice Type](#44-aop-around-advice-type)
  - [45. AOP Add AOP Logging to Spring MVC App - Real-Time Project](#45-aop-add-aop-logging-to-spring-mvc-app---real-time-project)

---

# Spring & Hibernate for Beginners (includes Spring Boot)

## Tai lieu

Download Source Code:

This only includes the source files, no JAR files. You will need to add JAR files separately on your own.

http://www.luv2code.com/downloads/udemy-spring-hibernate/spring-hibernate-source-code-v26.zip

---

Download PDF Files

All slides which are shown during the course are available also as a reference and can be downloaded here:

http://www.luv2code.com/download-spring-hibernate-pdfs

**free**
https://freecoursesite.com/1-spring-hibernate-for-beginners/

## 3. Setting Up Your Development Environment

### 2. Installing Tomcat

Install apache: https://tomcat.apache.org/  
Chọn version Tomcat9/ Chọn 32-bit/64-bit Windows Service Installer
Sau đó cài đặt Apache : an next/ Chon type of Install la **FULL** /
Lưu ý : phải chọn full, và nhập tên và pass cho admin
admin - admin
Bỏ chọn Show Readme và click Finish
Verify install bằng cách vào link: http://localhost:8080/
**Image**
Vào windows gõ service: tomcat => stop
Install eclipse: chọn download packages => eclipse for Java EE
Try the Eclipse Installer 2019 06 R
The easiest way to install and update your Eclipse Development Environment.

### 4. Connecting Tomcat to Eclipse

Connect apache to eclipse
Vào tab server của eclipse/ chọn click link to add new server/ chọn Apache/ Tomcat 09/ rồi chọn đường link ở trong ổ C
**Program File/ Apache Sofware Foundation/ Tomcat 9**

### 5 Add jar files

Thêm thủ công vào:
http://www.luv2code.com/downloadspring =>
http://repo.spring.io/release/org/springframework/spring/
chọn version release ở dưới cùng rồi chọn **spring-framework-5.1.8.RELEASE-dist.zip** để tải
Tạo project java bình thường, sau đó tạo thư mục lib rồi copy tất các các thư viện trong lib đã tải paste vào
Right **click/ properties/ Java build path/ libraries/ classpath/** ấn add jar rồi chon đến thư mục lib trong project mà ta vừa tạo chọn hết tất cả các file
**Nếu đúng sẽ xuất hiện Referenced libraries:**

## 4. Spring Inversion of Control - XML Configuration

### 1. What is Inversion of Control

App should be configurable
• Easily change the coach for another sport
• Hockey, Cricket, Tennis, Gymnastics etc

```java
    public static void main(String[] args) {

		// create the object
		// Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();

		// use the object
		System.out.println(theCoach.getDailyWorkout());
    }
```

### 4. Spring Inversion of Control - Overview

##### Spring Container

Primary functions
• Create and manage objects (Inversion of Control)
• Inject object’s dependencies (Dependency Injection)

##### IOC & XML Configuration

Ioc: tạo và quản lý object(xem pdf)
Tạo interface Coach(HLV) và các môn thể thao tương ứng => làm sao để dễ dàng chuyển đổi giữa các môn thể thao và không phải code cứng mà chỉ dùng file config

##### Configuring Spring Container

• XML configuration file (legacy, but most legacy apps still use this)
• Java Annotations (modern)
• Java Source Code (modern)
Spring container is generically known as ApplicationContext

##### Spring Development Process

1. Configure your Spring Beans
2. Create a Spring Container
3. Retrieve Beans from Spring Container

```java
        // load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();
```

#### FAQ: What is a Spring Bean?

A "Spring Bean" is simply a Java object.

When Java objects are created by the Spring Container, then Spring refers to them as "Spring Beans".

Spring Beans are created from normal Java classes .... just like Java objects.

---

Here's a blurb from the Spring Reference Manual

Source: https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-introduction

---

In the early days, there was a term called "Java Beans". Spring Beans have a similar concept but Spring Beans do not follow all of the rigorous requirements of Java Beans.

---

In summary, whenever you see "Spring Bean", just think Java object. :-)

#### 8. HEADS UP - Add Logging Messages in Spring 5.1

**The Problem**

In Spring 5.1, the Spring Development team changed the logging levels internally. As a result, by default you will no longer see the red logging messages at the INFO level. This is different than in the videos.

**The Solution**

If you would like to configure your app to show similar logging messages as in the video, you can make the following updates listed below. Note, you will not see the EXACT same messages, since the Spring team periodically changes the text of the internal logging messages. However, this should give you some additional logging data.

**Overview of the steps**

1. Create a bean to configure the parent logger and console handler

2. Configure the bean in the Spring XML config file

Detailed Steps

1. Create a bean to configure the parent logger and console handler

This class will set the parent logger level for the application context. It will also set the logging level for console handler. It sets the logger level to FINE. For more detailed logging info, you can set the logging level to level to FINEST. You can read more about the logging levels at http://www.vogella.com/tutorials/Logging/article.html

This class also has an init method to handle the actual configuration. The init method is executed after the bean has been created and dependencies injected.

File: MyLoggerConfig.java

```java
package com.luv2code.springdemo;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyLoggerConfig {

    private String rootLoggerLevel;
    private String printedLoggerLevel;

    public void setRootLoggerLevel(String rootLoggerLevel) {
    	this.rootLoggerLevel = rootLoggerLevel;
    }

    public void setPrintedLoggerLevel(String printedLoggerLevel) {
    	this.printedLoggerLevel = printedLoggerLevel;
    }

    public void initLogger() {

    	// parse levels
    	Level rootLevel = Level.parse(rootLoggerLevel);
    	Level printedLevel = Level.parse(printedLoggerLevel);

    	// get logger for app context
    	Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());

    	// get parent logger
    	Logger loggerParent = applicationContextLogger.getParent();

    	// set root logging level
    	loggerParent.setLevel(rootLevel);

    	// set up console handler
    	ConsoleHandler consoleHandler = new ConsoleHandler();
    	consoleHandler.setLevel(printedLevel);
    	consoleHandler.setFormatter(new SimpleFormatter());

    	// add handler to the logger
    	loggerParent.addHandler(consoleHandler);
    }

 }
```

2. Configure the bean in the Spring XML config file

In your XML config file, add the following bean entry. Make sure to list this as the first bean so that it is initialized first. Since the bean is initialized first, then you will get all of the logging traffic. If you move it later in the config file after the other beans, then you will miss out on some of the initial logging messages.

File: applicationContext.xml (snippet)

```xml
<!-- Add a logger config to see logging messages.
	- For more detailed logs, set values to "FINEST"
	- For info on logging levels, see: http://www.vogella.com/tutorials/Logging/article.html
-->

    <bean id="myLoggerConfig" class="com.luv2code.springdemo.MyLoggerConfig" init-method="initLogger">
    	<property name="rootLoggerLevel" value="FINE" />
    	<property name="printedLoggerLevel" value="FINE"/>
    </bean>

```

Source code is available here.
https://gist.github.com/darbyluv2code/cfb16c2fd1825a947d8faca3724b47a9
file html

Once you make these updates, then you will be able to see additional logging data. :-)

**Question**

#### Why do we specify the Coach interface in getBean()?

For example:

```java
Coach theCoach = context.getBean("myCoach", Coach.class);

```

---

**Answer**

When we pass the interface to the method, behind the scenes Spring will cast the object for you.

```java
context.getBean("myCoach", Coach.class)
```

However, there are some slight differences than normal casting.

From the Spring docs:

Behaves the same as getBean(String), but provides a measure of type safety by throwing a BeanNotOfRequiredTypeException if the bean is not of the required type. This means that ClassCastException can't be thrown on casting the result correctly, as can happen with getBean(String).

Source: http://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/BeanFactory.html#getBean-java.lang.String-java.lang.Class-

## 5. Spring Dependency Injection - XML Configuration

### Các nguyên tắc đảo ngược phụ thuộc.

Client ủy quyền để gọi cho đối tượng khác có trách nhiệm cung cấp các phụ thuộc của nó
Ví dụ như request car thì car factory sẽ inject các component của nó vào để tạo thành object

#### Spring Injection Types(pdf)

• Constructor Injection
• Setter Injection(Phải có hàm khởi tạo không tham số)
• Will talk about “auto-wiring” in the Annotations section later
Injecting Literal Values

#### Development Process - Constructor Injection

1. Define the dependency interface and class
2. Create a constructor in your class for injections
3. Configure the dependency injection in Spring config file

#### FAQ: What is the purpose for the no arg constructor?

Question:
I was wondering why you created a no arg constructor? I thought that they are implied by Java and only required when you also have an overloaded constructor. Or is this a Spring specific thing?

---

**Answered by: Oleksandr Palamarchuk**
When you don’t define any constructor in your class, compiler defines default one for you, however when you declare any constructor (in your example you have already defined a parameterized constructor), compiler doesn’t do it for you.
Since you have defined a constructor in class code, compiler didn’t create default one. While creating object you are invoking default one, which doesn’t exist in class code. Then the code gives an compilation error.

#### Development Process - Setter Injection

1. Create setter method(s) in your class for injections( must create no-arg constructor)
2. Configure the dependency injection in Spring config file

#### Injecting Literal Values Development Process

1. Create setter method(s) in your class for injections
2. Configure the injection in Spring config file

#### Question:

For the CricketCoach example with Setter Injection, why do we use the CricketCoach class instead of the Coach interface?
**Answer**:
The getTeam() method is only defined in the CricketCoach class. It is not part of the Coach interface.
As a result, you would need the following code:
CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

---

The Coach interface has two methods: getDailyWorkout and getDailyFortune
The CricketCoach class has four methods: getDailyWorkout, getDailyFortune, getTeam and setTeam

---

When you retrieve a bean from the Spring container using the Coach interface:

```java
Coach theCricketCoach = context.getBean("myCricketCoach", Coach.class);

```

You only have access to the methods defined in the Coach interface: getDailyWorkout and getDailyFortune. Even though the actual implementation has additional methods, you only have visibility to methods that are defined at the Coach interface level.

---

When you retrieve a bean from the Spring container using the CricketCoach class:

```java
CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

```

You have access to the methods defined in the Coach interface: getDailyWorkout and getDailyFortune.
ALSO, you have access to the additional methods defined in the CricketCoach class: getTeam, setTeam.

---

The bottom line is it depends on how you retrieve the object and assign it ... that determines the visibility you have to the methods.
**Injecting Values from a Properties File**

1. Create Properties File
2. Load Properties File in Spring config file
3. Reference values from Properties File
   Practice Activity #2 - Dependency Injection with XML Configuration
4. Define a new implementation for the FortuneService.
   a. When the getFortune() method is called it should return a random fortune from the array.
   b. Your fortune service should define three fortunes in an array.
5. Inject your new dependency into your Coach implementation.
6. Test your application to verify you are retrieving random fortunes.

Compare your code to the solution. The solution is available here:

- http://www.luv2code.com/downloads/udemy-spring-hibernate/solution-practice-activities.zip

6. Spring Bean Scopes and Lifecycle
   Spring Container creates only one instance of the bean, by default
   • It is cached in memory
   • All requests for the bean
   • will return a SHARED reference to the SAME bean
   Explicitly Specify Bean Scope and type - pdf
7. Bean Lifecycle
8. Define your methods for init and destroy
9. Configure the method names in Spring config file

## 34. AOP Aspect-Oriented Programming Overview

#### 1. AOP - The Business Problem

#### 2. AOP Solution and AOP Use Cases

#### 3. Comparing Spring AOP and AspectJ

## 35. AOP @Before Advice Type

#### 1. AOP @Before Advice Overview

#### 2. AOP AOP Project Setup

**Filter vào view**

http://luv2code.com/download-aspectjweaver
https://mvnrepository.com/artifact/org.aspectj/aspectjweaver
Sau đó vào buildpath add

#### 3. AOP @Before Advice - Write Some Code

#### 4. AOP @Before Advice - Add and Test AOP Aspect

## 36. AOP Pointcut Expressions - Match Methods and Return Types

#### 1. AOP - Pointcut Expressions Overview

#### 2. AOP - Pointcut Expressions - Match any addAccount Method - Part 2

#### 3. AOP - Pointcut Expressions - Match only DAO addAccount - Match any add Method

#### 4. AOP - Pointcut Expressions - Match any Return Type

## 37. AOP Pointcut Expressions - Match Method Parameter Types

#### 1. AOP Pointcut Expressions - Match Method Parameter Types Overview

#### 2. AOP Pointcut Expressions - Match Method with Account and more Params

#### 3. AOP Pointcut Expressions - Match Method Any Params - Match Method in a Package

## 38. AOP Pointcut Declarations

#### 1. AOP Pointcut Declarations - Overview

#### 2. AOP Pointcut Declarations - Write Some Code

#### 3. AOP Combining Pointcuts - Overview

#### 4. AOP Combining Pointcuts - Write Some Code - Part 1

#### 5. AOP Combining Pointcuts - Write Some Code - Part 2

## 39. AOP Ordering Aspects

Thêm copy Qualify Name

## 40. AOP JoinPoints

## 41. AOP @AfterReturning Advice Type

Before => after => hàm main

## 42. AOP @AfterThrowing Advice Type

## 43. AOP @After Advice Type

- After chay truoc @AfterThrowing and @AfterReturning

## 44. AOP @Around Advice Type

## 45. AOP Add AOP Logging to Spring MVC App - Real-Time Project

```

```
