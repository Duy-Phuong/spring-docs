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
      - [Injecting Values from a Properties File](#injecting-values-from-a-properties-file)
      - [Practice Activity #2 - Dependency Injection with XML Configuration](#practice-activity-2---dependency-injection-with-xml-configuration)
  - [6. Spring Bean Scopes and Lifecycle](#6-spring-bean-scopes-and-lifecycle)
    - [1. Bean scope](#1-bean-scope)
    - [2. Bean Lifecycle](#2-bean-lifecycle)
      - [Special Note about init and destroy Method Signatures](#special-note-about-init-and-destroy-method-signatures)
  - [7. Spring Configuration with Java Annotations - Inversion of Control](#7-spring-configuration-with-java-annotations---inversion-of-control)
    - [1. Annotations Overview - Component Scanning](#1-annotations-overview---component-scanning)
    - [2. Annotations Project Setup](#2-annotations-project-setup)
    - [3. Explicit Component Names - Write Some Code](#3-explicit-component-names---write-some-code)
    - [4. Default Component Names - Overview](#4-default-component-names---overview)
  - [8. Spring Configuration with Java Annotations - Dependency Injection](#8-spring-configuration-with-java-annotations---dependency-injection)
    - [1. Constructor Injection - Overview](#1-constructor-injection---overview)
      - [FAQ: What if there are multiple FortuneService implementations?](#faq-what-if-there-are-multiple-fortuneservice-implementations)
      - [I have finished the video "Constructor Injection - Writing Code part2".](#i-have-finished-the-video-%22constructor-injection---writing-code-part2%22)
    - [2. Setter Injection - Overview](#2-setter-injection---overview)
    - [3. Method Injection](#3-method-injection)
    - [4. Field Injection - Overview](#4-field-injection---overview)
    - [5. Which Injection Type Should You Use](#5-which-injection-type-should-you-use)
    - [12. Qualifiers for Dependency Injection - Overview](#12-qualifiers-for-dependency-injection---overview)
    - [13. Qualifiers for Dependency Injection - Write Some Code - Part 1](#13-qualifiers-for-dependency-injection---write-some-code---part-1)
    - [14. Qualifiers for Dependency Injection - Write Some Code - Part 2](#14-qualifiers-for-dependency-injection---write-some-code---part-2)
      - [Annotations - Default Bean Names ... and the Special Case](#annotations---default-bean-names--and-the-special-case)
      - [FAQ: How to inject properties file using Java annotations](#faq-how-to-inject-properties-file-using-java-annotations)
  - [9. Spring Configuration with Java Annotations - Bean Scopes and Lifecycle Methods](#9-spring-configuration-with-java-annotations---bean-scopes-and-lifecycle-methods)
    - [1. @Scope Annotation - Overview](#1-scope-annotation---overview)
    - [2. @Scope Annotation - Write Some Code](#2-scope-annotation---write-some-code)
      - [Special Note about @PostConstruct and @PreDestroy Method Signatures](#special-note-about-postconstruct-and-predestroy-method-signatures)
    - [3. Bean Lifecycle Method Annotations - Overview](#3-bean-lifecycle-method-annotations---overview)
      - [HEADS UP - FOR JAVA 9, 10 and 11 USERS - @PostConstruct and @PreDestroy](#heads-up---for-java-9-10-and-11-users---postconstruct-and-predestroy)
  - [10. Spring Configuration with Java Code (no xml)](#10-spring-configuration-with-java-code-no-xml)
    - [1. Spring Configuration with Java Code (no xml) – Overview](#1-spring-configuration-with-java-code-no-xml-%e2%80%93-overview)
      - [3. Heads Up - Add Logging Messages in Spring 5.1 - All Java Config Version](#3-heads-up---add-logging-messages-in-spring-51---all-java-config-version)
      - [During All Java Configuration, how does the @Bean annotation work in the background?](#during-all-java-configuration-how-does-the-bean-annotation-work-in-the-background)
    - [FAQ: Problems with Injecting Values - Value not returning from \${foo.email}](#faq-problems-with-injecting-values---value-not-returning-from-fooemail)
    - [4. Defining Spring Beans with Java Code (no xml) - Overview](#4-defining-spring-beans-with-java-code-no-xml---overview)
  - [11. Spring MVC - Building Spring Web Apps](#11-spring-mvc---building-spring-web-apps)
    - [1. Spring MVC Overview](#1-spring-mvc-overview)
    - [2. Spring MVC - Behind the Scenes](#2-spring-mvc---behind-the-scenes)
    - [3. Development Environment Checkpoint](#3-development-environment-checkpoint)
    - [5. Spring MVC Configuration - Overview](#5-spring-mvc-configuration---overview)
    - [6. Spring MVC Configuration - JAR Files](#6-spring-mvc-configuration---jar-files)
      - [How to configure the Spring Dispatcher Servlet using all Java Code (no xml)?](#how-to-configure-the-spring-dispatcher-servlet-using-all-java-code-no-xml)
    - [12. Spring MVC - Creating Controllers and Views](#12-spring-mvc---creating-controllers-and-views)
      - [1. Creating a Spring Home Controller and View – Overview](#1-creating-a-spring-home-controller-and-view-%e2%80%93-overview)
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

Tao ham setter de khi khai bao trong file config no se tu dong goi

#### Question:

For the CricketCoach example with Setter Injection, why do we use the CricketCoach class instead of the Coach interface?
**Answer**:
The getTeam() method is only defined in the CricketCoach class. It is not part of the Coach interface.
As a result, you would need the following code:

```java
CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

```

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

#### Injecting Values from a Properties File

1. Create Properties File
2. Load Properties File in Spring config file
3. Reference values from Properties File

#### Practice Activity #2 - Dependency Injection with XML Configuration

Compare your code to the solution. The solution is available here:

- http://www.luv2code.com/downloads/udemy-spring-hibernate/solution-practice-activities.zip

## 6. Spring Bean Scopes and Lifecycle

### 1. Bean scope

Spring Container creates only one instance of the bean, by default
• It is cached in memory
• All requests for the bean
• will return a SHARED reference to the SAME bean
**Explicitly Specify Bean Scope and type - pdf**
singleton and prototype

### 2. Bean Lifecycle

1. Define your methods for init and destroy
2. Configure the method names in Spring config file

#### Special Note about init and destroy Method Signatures

When using XML configuration, I want to provide additional details regarding the method signatures of the init-method and destroy-method .

**Access modifier**
The method can have any access modifier (public, protected, private)

**Return type**
The method can have any return type. However, "void' is most commonly used. If you give a return type just note that you will not be able to capture the return value. As a result, "void" is commonly used.

**Method name**
The method can have any method name.

**Arguments**
The method can not accept any arguments. The method should be no-arg.

**There is a subtle point you need to be aware of with "prototype" scoped beans.**

**For "prototype" scoped beans, Spring does not call the destroy method. Gasp!**

---

\_In contrast to the other scopes, Spring does not manage the complete lifecycle of a prototype bean: the container instantiates, configures, and otherwise assembles a prototype object, and hands it to the client, with no further record of that prototype instance.

Thus, although initialization lifecycle callback methods are called on all objects regardless of scope, in the case of prototypes, configured destruction lifecycle callbacks are not called. The client code must clean up prototype-scoped objects and release expensive resources that the prototype bean(s) are holding.\_

---

This also applies to both XML configuration and Annotation-based configuration.

## 7. Spring Configuration with Java Annotations - Inversion of Control

Spring will scan your Java classes for special annotations
Automatically register the beans in the Spring container

### 1. Annotations Overview - Component Scanning

**Development Process**

1. Enable component scanning in Spring config file
2. Add the @Component Annotation to your Java classes
3. Retrieve bean from Spring container

@Component(“beanID”)

### 2. Annotations Project Setup

### 3. Explicit Component Names - Write Some Code

### 4. Default Component Names - Overview

Default bean id: the class name, make first letter lower-case

## 8. Spring Configuration with Java Annotations - Dependency Injection

### 1. Constructor Injection - Overview

For dependency injection, Spring can use auto wiring
• Spring will look for a class that matches the property
• matches by type: class or interface
• Spring will inject it automatically … hence it is autowired

**Autowiring Injection Types**
• Constructor Injection
• Setter Injection
• Field Injections

**Development Process - Constructor Injection**

1. Define the dependency interface and class
2. Create a constructor in your class for injections
3. Configure the dependency injection with @Autowired Annotation

Spring will auto find that inplements FoturneService

AUTOWIRING

#### FAQ: What if there are multiple FortuneService implementations?

When using autowiring, what if there are multiple FortuneService implementations? Like in the image below?

---

ANSWER

Spring has special support to handle this case. Use the **@Qualifier** annotation. We'll cover this later in the course with slides and code examples. But don't worry, we will address all scenarios :-)

**Question**

#### I have finished the video "Constructor Injection - Writing Code part2".

I have commented the Autowired annotation. But still it worked. How did it work?

```java
    //@Autowired
    public TennisCoach(FortuneService theFortuneService) {
        System.out.println(" theFortuneService " + theFortuneService);
        fortuneService = theFortuneService;
    }

```

===

Answer

This is a new feature of Spring 4.3.

Here is the snippet from the Spring Docs.

Section 1.9.2: Autowired

As of Spring Framework 4.3, an **@Autowired** annotation on such a constructor is no longer necessary if the target bean only defines one constructor to begin with. However, if several constructors are available, at least one must be annotated to teach the container which one to use.

**I personally prefer to use the @Autowired annotation because it makes the code more readable. But as mentioned, the @Autowired is not required for this scenario.**

See link to the docs.
https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-autowired-annotation

### 2. Setter Injection - Overview

1. Create setter method(s) in your class for injections (có constructor)
2. Configure the dependency injection with @Autowired Annotation

### 3. Method Injection

Thu tu chay la:

- Default Contructor
- Inject value auto

### 4. Field Injection - Overview

### 5. Which Injection Type Should You Use

Chon 1 cai va SD thong nhat trong project

### 12. Qualifiers for Dependency Injection - Overview

Nho them annotation @Component
Bean id phai trung voi Class name

```java
@Autowired
@Qualifier("happyFortuneService")
private FortuneService fortuneService;
```

### 13. Qualifiers for Dependency Injection - Write Some Code - Part 1

### 14. Qualifiers for Dependency Injection - Write Some Code - Part 2

#### Annotations - Default Bean Names ... and the Special Case

In general, when using Annotations, for the default bean name, Spring uses the following rule.

If the annotation's value doesn't indicate a bean name, an appropriate name will be built based on the short name of the class (with the first letter lower-cased).  
For example:

HappyFortuneService --> happyFortuneService

---

However, for the special case of **when BOTH the first and second characters of the class name are upper case**, then the name is **NOT converted**.

For the case of RESTFortuneService

RESTFortuneService --> RESTFortuneService

No conversion since the first two characters are upper case.

Behind the scenes, Spring uses the Java Beans Introspector to generate the default bean name. Here's a screenshot of the documentation for the key method.

Also, here's a link to the documentation.

- https://docs.oracle.com/javase/8/docs/api/java/beans/Introspector.html#decapitalize(java.lang.String)

---

As always, you can give explicity names to your beans.

@Component("foo")
public class RESTFortuneService .... {

}

Then you can access it using the name of "foo". Nothing tricky to worry about :-)

Hope this helps. Happy Coding! :-)

**XEM THEM HTML**
**@Qualifier** is a nice feature, but it is tricky when used with Constructors.

The syntax is much different from other examples and not exactly intuitive. Consider this the "deep end of the pool" when it comes to Spring configuration LOL :-)

You have to place the @Qualifier annotation inside of the constructor arguments.

Here's an example from our classroom example. I updated it to make use of constructor injection, with @Autowired and @Qualifier. Make note of the code in bold below:

---

```java
package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {

        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");

        fortuneService = theFortuneService;
    }


    /*
    @Autowired
    public void doSomeCrazyStuff(FortuneService theFortuneService) {
        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
        fortuneService = theFortuneService;
    }
    */

    /*
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
    */

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}

```

---

For detailed documentation on using @Qualified with Constructors, see this link in the Spring Reference Manual

https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-autowired-annotation-qualifiers

#### FAQ: How to inject properties file using Java annotations

**Answer**:

This solution will show you how inject values from a properties file using annotatons. The values will no longer be hard coded in the Java code.

1. Create a properties file to hold your properties. It will be a name value pair.

New text file: src/sport.properties

```properties
foo.email=myeasycoach@luv2code.com
foo.team=Silly Java Coders

```

Note the location of the properties file is very important. It must be stored in src/sport.properties

2. Load the properties file in the XML config file.

File: applicationContext.xml

Add the following lines:

```xml
    <context:property-placeholder location="classpath:sport.properties"/>

This should appear just after the <context:component-scan .../> line

```

3. Inject the properties values into your Swim Coach: SwimCoach.java

@Value("${foo.email}")
private String email;
    
@Value("${foo.team}")
private String team;

---

DOWNLOAD FULL SOURCE CODE

You can download entire code from here:

- http://www.luv2code.com/downloads/spring-hibernate/spring-props-annotation-demo.zip

## 9. Spring Configuration with Java Annotations - Bean Scopes and Lifecycle Methods

### 1. @Scope Annotation - Overview

Default scope is singleton

### 2. @Scope Annotation - Write Some Code

#### Special Note about @PostConstruct and @PreDestroy Method Signatures

I want to provide additional details regarding the method signatures of @PostContruct and @PreDestroy methods.

**Access modifier**

The method can have any access modifier (public, protected, private)

**Return type**
The method can have any return type. However, "void' is most commonly used. If you give a return type just note that you will not be able to capture the return value. As a result, "void" is commonly used.

**Method name**
The method can have any method name.

**Arguments**
The method can not accept any arguments. The method should be no-arg.

### 3. Bean Lifecycle Method Annotations - Overview

Development Process

1. Define your methods for init and destroy
2. Add annotations: @PostConstruct and @PreDestroy

#### HEADS UP - FOR JAVA 9, 10 and 11 USERS - @PostConstruct and @PreDestroy

If you are using Java 9, 10 or 11, then you will encounter an error when using @PostConstruct and @PreDestroy in your code.

These are the steps to resolve it. Come back to the lecture if you hit the error.

**Error**

Eclipse is unable to import @PostConstruct or @PreDestroy

This happens because of Java 9 and higher.

When using Java 9 and higher, javax.annotation has been removed from its default classpath. That's why we Eclipse can't find it.

---

**Solution**

1. Download the javax.annotation-api-1.2.jar from

http://central.maven.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.jar

2. Copy the JAR file to the lib folder of your project

---

Use the following steps to add it to your Java Build Path.

3. Right-click your project, select Properties

4. On left-hand side, click Java Build Path

5. In top-center of dialog, click Libraries

6. Click Classpath and then Click Add JARs ...

7. Navigate to the JAR file <your-project>/lib/javax.annotation-api-1.2.jar

8. Click OK then click Apply and Close

Eclipse will perform a rebuild of your project and it will resolve the related build errors.

## 10. Spring Configuration with Java Code (no xml)

### 1. Spring Configuration with Java Code (no xml) – Overview

Instead of configuring Spring container using XML
Configure the Spring container with Java code
**Development Process**

1. Create a Java class and annotate as @Configuration
2. Add component scanning support: @ComponentScan (optional)
3. Read Spring Java configuration class
4. Retrieve bean from Spring container

---

#### 3. Heads Up - Add Logging Messages in Spring 5.1 - All Java Config Version

**The Problem**

In Spring 5.1, the Spring Development team changed the logging levels internally. As a result, by default you will no longer see the red logging messages at the INFO level. This is different than in the videos.

**The Solution**

If you would like to configure your app to show similar logging messages as in the video, you can make the following updates. Note, you will not see the EXACT same messages, since the Spring team periodically changes the text of the internal logging messages. However, this should give you some additional logging data.

Overview of the steps

0. Create a logging properties file

1. Create a configuration class to configure the parent logger and console handler

Detailed Steps

**0. Create a logging properties file**

This properties file will define the logging levels for the application. The props file sets the logger level to FINE. For more detailed logging info, you can set the logging level to level to FINEST. You can read more about the logging levels at http://www.vogella.com/tutorials/Logging/article.html

File: src/mylogger.properties

root.logger.level=FINE
printed.logger.level=FINE

---

**1. Create a configuration class to configure the parent logger and console handler**

This class will set the parent logger level for the application context. It will also set the logging level for console handler. The logging levels are loaded from the configuration file using the @PropertySource annotation. The fields are injected using the @Value annotation. This class also has a @PostConstruct method to handle the actual configuration.

File: MyLoggerConfig.java

```java
package com.luv2code.springdemo;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mylogger.properties")
public class MyLoggerConfig {

	@Value("${root.logger.level}")
	private String rootLoggerLevel;

	@Value("${printed.logger.level}")
	private String printedLoggerLevel;

	@PostConstruct
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

---

Source code is available at the following link

https://gist.github.com/darbyluv2code/a49009fe1f92f95a30d2d5f7ac987ce5

---

Once you make these updates, then you will be able to see additional logging data. :-)

Question:

#### During All Java Configuration, how does the @Bean annotation work in the background?

**Answer**

This is an advanced concept. But I'll walk through the code line-by-line.

For this code:

```java
@Bean
public Coach swimCoach() {
 SwimCoach mySwimCoach = new SwimCoach();
 return mySwimCoach;
}

```

At a high-level, Spring creates a bean component manually. By default the scope is singleton. So any request for a "swimCoach" bean, will get the same instance of the bean since singleton is the default scope.

However, let's break it down line-by-line

**@Bean**

The @Bean annotation tells Spring that we are creating a bean component manually. We didn't specify a scope so the default scope is singleton.

**public Coach swimCoach(){**
This specifies that the bean will bean id of "swimCoach". The method name determines the bean id. The return type is the Coach interface. This is useful for dependency injection. This can help Spring find any dependencies that implement the Coach interface.

The @Bean annotation will intercept any requests for "swimCoach" bean. Since we didn't specify a scope, the bean scope is singleton. As a result, it will give the same instance of the bean for any requests.

SwimCoach mySwimCoach = new SwimCoach();
This code will create a new instance of the SwimCoach.

return mySwimCoach;
This code returns an instance of the swimCoach.

---

Now let's step back and look at the method in it's entirety.

```java
@Bean
public Coach swimCoach() {
 SwimCoach mySwimCoach = new SwimCoach();
 return mySwimCoach;
}

```

It is important to note that this method has the @Bean annotation. The annotation will intercept ALL calls to the method "swimCoach()". Since no scope is specified the @Bean annotation uses singleton scope. Behind the scenes, during the @Bean interception, it will check in memory of the Spring container (applicationContext) and see if this given bean has already been created.

If this is the first time the bean has been created then it will execute the method as normal. It will also register the bean in the application context. So that is knows that the bean has already been created before. Effectively setting a flag.

The next time this method is called, the @Bean annotation will check in memory of the Spring container (applicationContext) and see if this given bean has already been created. Since the bean has already been created (previous paragraph) then it will immediately return the instance from memory. It will not execute the code inside of the method. Hence this is a singleton bean.

The code for

SwimCoach mySwimCoach = new SwimCoach();
return mySwimCoach;
is not executed for subsequent requests to the method public Coach swimCoach() . This code is only executed once during the initial bean creation since it is singleton scope.

That explains how @Bean annotation works for the swimCoach example.

====

Now let's take it one step further.

Here's your other question

> > Please explain in detail whats happening behind the scene for this statement.

return new SwimCoach(sadFortuneService())

The code for this question is slightly different. It is injecting a dependency.

In this example, we are creating a SwimCoach and injecting the sadFortuneService().

```java
         // define bean for our sad fortune service
        @Bean
        public FortuneService sadFortuneService() {
            return new SadFortuneService();
        }

        // define bean for our swim coach AND inject dependency
        @Bean
        public Coach swimCoach() {
            SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());

            return mySwimCoach;
        }

```

Using the same information presented earlier

The code

        // define bean for our sad fortune service
        @Bean
        public FortuneService sadFortuneService() {
            return new SadFortuneService();
        }

In the code above, we define a bean for the sad fortune service. Since the bean scope is not specified, it defaults to singleton.

Any calls for sadFortuneService, the @Bean annotation intercepts the call and checks to see if an instance has been created. First time through, no instance is created so the code executes as desired. For subsequent calls, the singleton has been created so @Bean will immediately return with the singleton instance.

Now to the main code based on your question.

return new SwimCoach(sadFortuneService())
This code creates an instance of SwimCoach. Note the call to the method sadFortuneService(). We are calling the annotated method above. The @Bean will intercept and return a singleton instance of sadFortuneService. The sadFortuneService is then injected into the swim coach instance.

This is effectively dependency injection. It is accomplished using all Java configuration (no xml).

---

This concludes the line-by-line discussion of the source code. All of the behind the scenes work.

I hope this clears your doubt. :-)

### FAQ: Problems with Injecting Values - Value not returning from \${foo.email}

Question

I am running the code for Java Configuration and injecting values from props file. However, I'm getting:

${foo.email}
${foo.team}

Instead of the actual property values. How can I resolve this?

Answer

This is an issue with Spring versions.

If you are using Spring 4.2 and lower, you will need to add the code in bold.

---

```java
package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
// @ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

 // bold
 // add support to resolve \${...} properties
@Bean
public static PropertySourcesPlaceholderConfigurer
propertySourcesPlaceHolderConfigurer() {

 return new PropertySourcesPlaceholderConfigurer();
}

 // define bean for our sad fortune service
@Bean
public FortuneService sadFortuneService() {
return new SadFortuneService();
}

 // define bean for our swim coach AND inject dependency
@Bean
public Coach swimCoach() {
SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());

 return mySwimCoach;
}

}

```

---

In Spring 4.3 and higher, they removed this requirement. As a result, you don't need this code.

In the video, I show Spring 4.3, that's why this code is not displayed.

Let me know if that clears it up.

:-)

### 4. Defining Spring Beans with Java Code (no xml) - Overview

Trong file SportConfig, ten method trung voi bean ID

```java
@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
    //sadFortuneService la bean id
```

## 11. Spring MVC - Building Spring Web Apps

http://luv2code.com/spring-mvc-docs =>
https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html

### 1. Spring MVC Overview

### 2. Spring MVC - Behind the Scenes

http://luv2code.com/spring-mvc-views =>
https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc-view

### 3. Development Environment Checkpoint

In the following videos for Spring MVC, I provide a collection of starter files.
Download these files from the link below.
http://www.luv2code.com/downloads/udemy-spring-hibernate/solution-code-spring-mvc-config-files.zip
You will need these in the following videos.
Cheers :-)

### 5. Spring MVC Configuration - Overview

**Spring MVC Configuration Process - Part 1**
Add configurations to file: WEB-INF/web.xml

1. Configure Spring MVC Dispatcher Servlet
2. Set up URL mappings to Spring MVC Dispatcher Servlet
3. Add support for Spring component scanning
4. Add support for conversion, formatting and validation
5. Configure Spring MVC View Resolver

```xml
web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns="http://xmlns.jcp.org/xml/ns/javaee"
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
	id="WebApp_ID" version="3.1">

	<display-name>spring-mvc-demo</display-name>

	<absolute-ordering />

	<!-- Step 1: Configure Spring MVC Dispatcher Servlet -->
	<servlet>
		<servlet-name>dispatcher</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>/WEB-INF/spring-mvc-demo-servlet.xml</param-value>
		</init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>

	<!-- Step 2: Set up URL mapping for Spring MVC Dispatcher Servlet -->
	<servlet-mapping>
		<servlet-name>dispatcher</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>

</web-app>

----------------------------------
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:mvc="http://www.springframework.org/schema/mvc"
	xsi:schemaLocation="
		http://www.springframework.org/schema/beans
    	http://www.springframework.org/schema/beans/spring-beans.xsd
    	http://www.springframework.org/schema/context
    	http://www.springframework.org/schema/context/spring-context.xsd
    	http://www.springframework.org/schema/mvc
        http://www.springframework.org/schema/mvc/spring-mvc.xsd">

	<!-- Step 3: Add support for component scanning -->
	<context:component-scan base-package="com.luv2code.springdemo" />

	<!-- Step 4: Add support for conversion, formatting and validation support -->
	<mvc:annotation-driven/>

	<!-- Step 5: Define Spring MVC view resolver -->
	<bean
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/view/" />
		<property name="suffix" value=".jsp" />
	</bean>

</beans>

```

### 6. Spring MVC Configuration - JAR Files

**File/ New/ Dynamic web project/Finish**
Copy jar files vào thư mục WebContent/ WEB-INF/ lib
Copy thêm 2 file jstl:

- javax.servlet.jsp.jstl-1.2.1.jar
- javax.servlet.jsp.jstl-api-1.2.1

Copy 2 file xml vao WEB-INF
Question:

#### How to configure the Spring Dispatcher Servlet using all Java Code (no xml)?

Answer:

Good question!

For Spring MVC, we cover all Java config (no xml) later in the course, complete with videos/explanation and everything.

However, if you just need the code, here are the steps

1. Delete the files: web.xml file and spring-mvc-demo-servlet.xml files

2. Create a new Java package: com.luv2code.springdemo.config

3. Add the following Java files in your package

File: DemoAppConfig.java

```java
package com.luv2code.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.luv2code.springdemo")
public class DemoAppConfig {

    // define a bean for ViewResolver

    @Bean
    public ViewResolver viewResolver() {

    	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

    	viewResolver.setPrefix("/WEB-INF/view/");
    	viewResolver.setSuffix(".jsp");

    	return viewResolver;
    }

 }

```

**File: MySpringMvcDispatcherServletInitializer.java**

```java
package com.luv2code.springdemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
    	// TODO Auto-generated method stub
    	return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
    	return new Class[] { DemoAppConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
    	return new String[] { "/" };
    }

}

```

4. Test your app

Your app should work as desired.

---

I also uploaded a full project implementation with code here

https://drive.google.com/open?id=1_5__2SggzgFHt7Rs2YYsv5JHRVX5Orq3

---

For a discussion on how this code works, you can skip ahead to the following video

Video 403 - Spring MVC All Java Config

https://www.udemy.com/spring-hibernate-tutorial/learn/v4/t/lecture/8355870?start=148

Skip ahead to time marker [02:28]

---

let me know if you need anything else.

:-)

### 12. Spring MVC - Creating Controllers and Views

#### 1. Creating a Spring Home Controller and View – Overview

**Development Process**

1. Create Controller class
2. Define Controller method
3. Add Request Mapping to Controller method
4. Return View Name
5. Develop View Page

- Khi chạy vào **run as/ run on server/ chọn server Tomcat/ tick Always use this server….**

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
