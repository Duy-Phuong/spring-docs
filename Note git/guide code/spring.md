- [Spring & Hibernate for Beginners (includes Spring Boot)](#spring--hibernate-for-beginners-includes-spring-boot)
  - [Tai lieu](#tai-lieu)
  - [3. Setting Up Your Development Environment](#3-setting-up-your-development-environment)
    - [2. Installing Tomcat](#2-installing-tomcat)
    - [4. Connecting Tomcat to Eclipse](#4-connecting-tomcat-to-eclipse)
    - [5 Add jar files](#5-add-jar-files)
  - [4. Spring Inversion of Control - XML Configuration](#4-spring-inversion-of-control---xml-configuration)
    - [1. What is Inversion of Control](#1-what-is-inversion-of-control)
    - [2. Code Demo - Rough Prototype Part 1](#2-code-demo---rough-prototype-part-1)
    - [3. Code Demo - Rough Prototype Part 2](#3-code-demo---rough-prototype-part-2)
    - [4. Spring Inversion of Control - Overview](#4-spring-inversion-of-control---overview)
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

### 2. Code Demo - Rough Prototype Part 1

### 3. Code Demo - Rough Prototype Part 2

### 4. Spring Inversion of Control - Overview

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
