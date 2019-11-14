### Angular – Giới thiệu
#### Cau truc thu muc

| Tập tin / Thư mục  | Mục đích                                                                                                                      |
| ------------------ | ----------------------------------------------------------------------------------------------------------------------------- |
| e2e                | Thư mục này dùng để chứa các tập tin dành cho mục đích testing                                                                |
| node_modules       | Chứa các Node.js module cần thiết cho ứng dụng Angular của chúng ta                                                           |
| src                | Đây là thư mục sẽ chứa toàn bộ source code của ứng dụng Angular các bạn nhé                                                   |
| .editorconfig      | Chứa các cấu hình liên quan đến phần Editor để chỉnh sửa source code như: indent_size, max_line_length,…                      |
| .gitignore         | Đây là tập tin metadata của Git, chứa thông tin những tập tin hoặc thư mục sẽ bị ignore không được commit lên Git Repository. |
| angular-cli.json   | Đây là tập tin chứa cấu hình cho Angular CLI, giúp chúng ta có thể build ứng dụng Angular.                                    |
| karma.conf.js      | Tập tin cấu hình cho Karma, liên quan nhiều đến phần testing                                                                  |
| package-lock.json  | Dùng để lock version cho các Node.js module dependencies                                                                      |
| package.json       | Tập tin cấu hình cho Node.js module dependencies                                                                              |
| protractor.conf.js | Tập tin cấu hình cho Protractor, liên quan nhiều đến phần testing                                                             |
| README.md          | Tập tin này thường được sử dụng để cho các hệ thống Git hiển thị thông tin về Git Repository của chúng ta.                    |
| tslint.json        | Tập tin cấu hình để kiểm tra lỗi cho các tập tin .ts (TypeScript) trong Angular project                                       |

---

#### Mục đích của từng thư mục, tập tin trong thư mục src này mình có thể liệt kê như sau:

| Tập tin / Thư mục | Mục đích                                                                                                                                                                     |
| ----------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| app               | Đây là thư mục sẽ chứa toàn bộ code của ứng dụng Angular                                                                                                                     |
| assets            | Thư mục này sẽ chứa các file ảnh, CSS, custom JavaScript của ứng dụng Angular                                                                                                |
| environments      | Chúng ta có thể viết ứng dụng chạy trên nhiều môi trường khác nhau, đây chính là thư mục giúp chúng ta làm định nghĩa các tập tin cấu hình cho những môi trường khác nhau đó |
| favicon.ico       | Icon của ứng dụng Angular                                                                                                                                                    |
| index.html        | Trang chủ của ứng dụng Angular                                                                                                                                               |
| main.ts           | Chứa code bootstrapping cho ứng dụng Angular                                                                                                                                 |
| polyfill.ts       | Dùng để định nghĩa các chuẩn để ứng dụng của chúng ta có thể chạy được trên mọi trình duyệt                                                                                  |
| style.css         | Định nghĩa style CSS cho ứng dụng Angular                                                                                                                                    |
| test.ts           | Code để chạy test                                                                                                                                                            |
| tsconfig.json     | Tập tin định nghĩa việc compile cho TypeScript                                                                                                                               |

---





https://phocode.com/javascript/lap-trinh-web-voi-angularjs-2/angular-vi-du/

### Setting

#### Cài TypeScript

Sau đó bạn mở Command Prompt (cmd) trên Windows ra và gõ lệnh npm install -g typescript để node cài đặt gói typescript.

```js
C:\>npm install -g typescript

```

Ở đây phiên bản typescript của mình là phiên bản 2.1.4

#### Cài Angular CLI

Bản thân Angular chỉ là một thư viện Javascript mở rộng dành cho Node.js chứ không phải một ứng dụng hoàn toàn, tuy nhiên nhóm phát triển Angular đã viết thêm gói Angular CLI là một chương trình dòng lệnh để hỗ trợ chúng ta tạo project, thêm file, xóa file, khởi động project… một cách dễ dàng.

Bạn mở Command Prompt (cmd) lên và gõ lệnh sau để cài gói Angular CLI vào npm:

```js
npm install -g @angular/cli

```

npm sẽ tải và cài bộ thư viện này về máy của bạn, bộ Angular CLI này khá lớn nên quá trình này sẽ mất một lúc.

Sau khi hoàn tất thì bạn có thể tạo một project Angular bằng cách chạy lệnh

```js
ng new my-app

```

Trong đó my-app là tên project, Angular sẽ tạo một thư mục có tên my-app và tạo một số file cần thiết, chúng ta sẽ tìm hiểu về chúng sau.

Để chạy project này thì chúng ta dùng lệnh cd để chuyển thư mục hiện hành trong CMD vào thư mục project rồi chạy lệnh sau:

```js
ng serve --open

```

Angular sẽ khởi động server tại địa chỉ http://localhost:4200

### Typescript

**TypeScript** là một ngôn ngữ có “họ hàng” với Javascript. Đây là một bản mở rộng của **ECMAScript6** (viết tắt là ES6), ES6 lại là một bản mở rộng của ECMAScript5 (viết tắt là ES5), ES5 chính là Javascript mà chúng ta thường dùng.

Ở đây chúng ta sẽ tìm hiểu nhanh qua TypeScript chứ không đi sâu.

Tuy nhiên hiện tại các trình duyệt web hiện cũng chưa hỗ trợ đầy đủ cho TypeScript nên chúng ta có thể dịch code TypeScript thành code ES5 bình thường.

Bạn có thể dùng lệnh tsc -v để xem phiên bản TypeScript của Node.

```ts
C:\>tsc -v
Version 2.1.4

```

Ở đây mình dùng phiên bản 2.1.4

Các file code TypeScript sẽ có phần mở rộng là .ts, để dịch code TypeScript thành ES5 thì chúng ta dùng lệnh tsc <tên_file>.

Ví dụ dưới đây là một đoạn code TypeScript trong file example.ts:

example.ts

```ts
class Person {
  first_name: string;
  last_name: string;
  age: number;

  constructor(first_name: string, last_name: string, age: number) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.age = age;
  }

  greet() {
    console.log("Hello", this.first_name);
  }
}

var p: Person = new Person("Pho", "Code", 23);
p.greet();
```

Dùng lệnh tsc example.ts chúng ta sẽ được một file example.js như sau:

example.js

```js
var Person = (function() {
  function Person(first_name, last_name, age) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.age = age;
  }
  Person.prototype.greet = function() {
    console.log("Hello", this.first_name);
  };
  return Person;
})();
var p = new Person("Pho", "Code", 23);
p.greet();
```

Chạy bằng node:

```js
C:\>node example.js
Hello Pho

```

#### Các kiểu dữ liệu cơ bản
Các kiểu dữ liệu thường dùng là string, number, boolean, array, enum, any, void.

**String**
Đây là kiểu chuỗi kí tự.

```ts
var name: string = "Pho Code";
```

**Number**
Đây là kiểu số, trong TypeScript thì tất cả đều là số chấm động (số thực).

```ts
var age: number = 36;
```

**Boolean**
Kiểu luận lý, hay chúng ta hay gọi là kiểu true/false.

```ts
var married: boolean = true;
```

**Array**
Kiểu mảng, khi khai báo các phần tử trong mảng thì chúng ta phải chỉ ra cả kiểu dữ liệu nữa. Để tạo array thì chúng ta có thể dùng cú pháp Array<kiểu> hoặc <kiểu>[].

```ts
var jobs: Array<string> = ["Coder", "Tester", "Manager"];
var primes: int[] = [2, 3, 5, 7];
```

**Enum**
Đây là kiểu danh sách, phần tử trong danh sách được đánh số theo thứ tự từ 0.

```ts
enum Role {
  Employee,
  Manager,
  Administrator
}
var role: Role = Role.Employee;
```

**Any**
Biến kiểu Any có thể nhận bất kiểu giá trị kiểu nào.

```ts
var something: any = "this is a string";
something = 1;
something = [1, 2, 3];
```

**Void**
Void chỉ đơn giản là “không có kiểu gì cả”, thương dùng cho các hàm không cần trả về một giá trị gì.

```ts
function setName(name: string): void {
  this.name = name;
}
```

---

#### Class
Đề khai báo một lớp thì chúng ta dùng từ khóa class.

```ts
class Product {

}

```
Để tạo một đối tượng thuộc một lớp thì chúng ta dùng từ khóa new.


```ts
class Product {
}

var p: Product = new Product();

```
**Thuộc tính**
Thuộc tính là các dữ liệu “gắn” trong một đối tượng thuộc một lớp.

```ts
class Product {
name: string;
description: string;
price: number;
}

```
#### Phương thức
Phương thức là các hàm của riêng một đối tượng.

```ts
class Product {
name: string;
description: string;
price: number;

    getName(): string {
        return this.name;
    }

    setName(name) {
        this.name = name;
    }

    getDescription(): string {
        return this.description;
    }

    setDescription(description) {
        this.description = description;
    }

    getPrice(): number {
        return this.price;
    }

    setPrice(price) {
        this.price = price;
    }

}

```
#### Phương thức khởi tạo
Phương thức khởi tạo là phương thức sẽ được gọi khi chúng ta tạo một đối tượng bằng từ khóa new. Trong TypeScript thì phương thức khởi tạo luôn có tên là constructor(), có thể nhận vào tham số nhưng không thể có giá trị trả về.

Nếu bạn không khai báo phương thức khởi tạo thì TypeScript cũng tự định nghĩa một phương thức khởi tạo riêng (nhưng chúng ta không nhìn thấy).


```ts
class Product {
constructor() {
console.log("Product has been created");
}
}
var p: Product = new Product();

```
Trong TypeScript thì chúng ta chỉ được phép khai báo một phương thức khởi tạo duy nhất cho một lớp, do đó thông thường chúng ta sẽ khai báo phương thức khởi tạo nhận vào tham số là toàn bộ thuộc tính của lớp đó.

```ts
class Product {
  name: string;
  description: string;
  price: number;

  constructor(name: string, description: string, price: number) {
    this.name = name;
    this.description = description;
    this.price = price;
  }
}
var p: Product = new Product(
  "Angular 2",
  "Web Development with Angular 2",
  59.99
);
```

#### Kế thừa
Kế thừa là một trong những tính năng quan trọng của lập trình hướng đối tượng, cho phép coder tái sử dụng code.

Để một lớp kế thừa từ lớp khác thì chúng ta chỉ cần dùng từ khóa extends.

```ts
class Product {
  name: string;
  description: string;
  price: number;

  getName(): string {
    return this.name;
  }

  setName(name) {
    this.name = name;
  }

  getDescription(): string {
    return this.description;
  }

  setDescription(description) {
    this.description = description;
  }

  getPrice(): number {
    return this.price;
  }

  setPrice(price) {
    this.price = price;
  }

  constructor(name: string, description: string, price: number) {
    this.name = name;
    this.description = description;
    this.price = price;
  }
}

class Book extends Product {}
var b: Book = new Book("Angular 2", "Web development with Angular 2", 59.99);
console.log(b.getName(), b.getDescription(), b.getPrice());
```

Lớp kế thừa có thể sử dụng các thuộc tính và phương thức của lớp cha, và có thể có thuộc tính và phương thức của riêng nó.

#### Fat Arrow Function
Mình không biết gọi là gì, trong TypeScript bạn có thể dùng từ khóa => để tạo nhanh một hàm thay vì phải viết từ khóa function như trong ES5.

```ts
ES5: var product = ["Apple", "Lemon", "Banana"];
product.forEach(function(p) {
  console.log(p);
});

TypeScript: var product = ["Apple", "Lemon", "Banana"];
product.forEach(p => console.log(p));
```

Thao tác trên string
Chúng ta có thể chèn giá trị của một biến vào một string bằng cách dùng kí tự '\$'.

```ts
var title = "Angular 2";
var price = 59.99;
var str = `${title} costs ${price}`;
console.log(str);
```

Lưu ý là bạn phải dùng dấu huyền ` để bọc chuỗi chứ không dùng dấu nháy đơn hay nháy kép gì cả.

Khi bọc chuỗi trong cặp dấu huyền ` thì chúng ta có thể viết chuỗi trên nhiều dòng.

```js
var html = `
<html>
    <head>
        <title>Pho Code</title>
    </head>
<body>
</body>
</html>
`;
```

---
### Angular – Kiến trúc
 Một ứng dụng Angular được xây dựng từ 8 thành phần sau đây: **Module, Component, Template, Metadata, Data Binding, Directive, Service, Dependency Injection.**

#### Module
Mỗi ứng dụng Angular được gọi là một module và bản thân Angular có riêng một module dùng để quản lý các module khác có tên là Root Module hay NgModule. Root Module thường được đặt tên là AppModule, ngoài root ra thì tùy ứng dụng mà sẽ có thêm các module khác, chúng ta sẽ tìm hiểu về root module trong bài sau.

Chúng ta khai báo một module bằng cách dùng từ khóa @NgModule. Các từ khóa như @NgModule này là các hàm dùng để chỉnh sửa các lớp của Javascript. Bên trong từ khóa @NgModule chúng ta khai báo các tham số sau đây:

* **declarations**: tên lớp view thuộc về module này
* **exports**: danh sách tên các module hoặc component có thể sử dụng module này
* **imports**: tên các module sẽ được dùng từ module này
* **providers**: tên các service sẽ được dùng từ module này, chúng ta sẽ tìm hiểu về service sau
* **bootstrap**: tên lớp view dành cho root module, chỉ có root module mới thiết lập tham số này
Đây là một đoạn code module trong file có tên app.module.ts đơn giản như sau:

```ts
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
@NgModule({
    imports:      [ BrowserModule ],
    providers:    [ Logger ],
    declarations: [ AppComponent ],
    exports:      [ AppComponent ],
    bootstrap:    [ AppComponent ]
})
export class AppModule { }

```
Để gọi module trên thì chúng ta code như sau:

```ts
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { AppModule } from './app.module';
 
platformBrowserDynamic().bootstrapModule(AppModule);

```
#### Component
Component có chức năng điều khiển việc hiển thị, tức là điều khiển View, vậy bạn có thể hình dung Component chính là một Controller trong mô hình MVC…v.v Ví dụ một đoạn code component:
```ts
export class HeroListComponent implements OnInit {
    heroes: Hero[];
    selectedHero: Hero;
 
    constructor(private service: HeroService) { }
 
    ngOnInit() {
        this.heroes = this.service.getHeroes();
    }
 
    selectHero(hero: Hero) { this.selectedHero = hero; }
}

```
#### Template
Template là một đoạn code HTML để component dựa vào đó mà hiển thị trên màn hình. Ví dụ:

```html
<h2>Hero List</h2>
<p><i>Pick a hero from the list</i></p>
<ul>
    <li *ngFor="let hero of heroes" (click)="selectHero(hero)">
        {{hero.name}}
    </li>
</ul>
<hero-detail *ngIf="selectedHero" [hero]="selectedHero"></hero-detail>

```
Ngoài các thẻ HTML thông thường như <h2>, <p> thì còn có những thẻ và thuộc tính đặc biệt như *ngFor, {{hero.name}}, (click), [hero] và <hero-detail>, đây là cú pháp template của Angular.

#### Metadata
Metadata (siêu dữ liệu) là những thông tin giúp Angular xử lý các lớp.

Trong đoạn code ví dụ về Component ở trên, đó chỉ là một lớp bình thường viết bằng TypeScript, không có sự xuất hiện của Angular trong này. Muốn Angular hiểu được đó là một lớp dành cho Angular thì chúng ta phải khai báo metadata. Ví dụ:

```ts
@Component({
    moduleId: module.id,
    selector: 'hero-list',
    templateUrl: 'hero-list.component.html',
    providers: [ HeroService ]
})
export class HeroListComponent implements OnInit {
    /* . . . */
}

```
Trong đó @Component là từ khóa bắt đầu định nghĩa metadata, phần định nghĩa lớp ngay sau phần metadata này là lớp component của metadata trên. Bên trong chúng ta khai báo một số thông tin cho Angular như moduleId, selector, templateUrl, providers. Chúng ta sẽ tìm hiểu về chúng sau.

#### Data Binding
Data Binding tức là lấy dữ liệu từ model/controller đổ vào view. Trong đoạn code ví dụ về template trên có những dòng data binding như sau:

```html
<li>{{hero.name}}</li>
<hero-detail [hero]="selectedHero"></hero-detail>
<li (click)="selectHero(hero)"></li>

```
Data binding trong Angular là 2 chiều, tức là chúng ta có thể nhập dữ liệu từ view vào model/controller.

```html
<input [(ngModel)]="hero.name">

```
#### Directive
Directive (chỉ thị) là một lớp và có phần khai báo metadata là @Directive. Thường thì directive sẽ nằm trong một element – hay thẻ của HTML giống như một thuộc tính bình thường.

Có 2 loại directive là **structural và attribute**.

- Các structural directive có chức năng gán dữ liệu theo một quy tắc nào đó.

```html
<li *ngFor="let cus of customer"></li>
<customer *ngIf="selectedCustomer"></customer>

```
Trong đoạn code trên thì *ngFor và *ngIf là các structural directive.

- Các attribute directive có chức năng hiển thị dữ liệu một cách trực tiếp.

```html
<input [(ngModel)]="hero.name">

```
Trong đoạn code trên thì ngModel là một attribute directive.

#### Service
Service là các lớp có khả năng thực hiện một số chức năng thường dùng, nói đơn giản thì chúng giống như thư viện vậy. Một số service phổ biến là: logging service, data service, message bus, tax calculator, application configuration.

Ví dụ lớp Logger cho phép chúng ta in các đoạn code báo lỗi, cảnh báo…v.v:

```ts
export class Logger {
    log(msg: any) { console.log(msg); }
    error(msg: any) { console.error(msg); }
    warn(msg: any) { console.warn(msg); }
}

```
#### Dependency injection
Dependency là các lớp/module/service được dùng thêm, Dependency injection là khả năng cho phép tạo các đối tượng lớp có đầy đủ các lớp/module/service được dùng thêm đó. Chẳng hạn như chúng ta có phương thức constructor() như sau:


```ts
constructor(private service: HeroService) { }

```
Tham số private service: HeroService có nghĩa là lớp này cần dùng một service có tên HeroService.

Angular có riêng một vùng bộ nhớ để lưu trữ các dependency đã được gọi, khi một module/component nào cần dùng service nào, Angular sẽ tìm trong vùng bộ nhớ đó xem có không, nếu không có thì Angular sẽ tạo một đối tượng của dependency đó và đưa vào bộ nhớ rồi trả về cho lớp đã gọi.


 
Khi chúng ta xây dựng root module thì chúng ta phải khai báo các dependency trong tham số providers, có như thế Angular mới có thể tìm được.

```ts
providers: [
    BackendService,
    HeroService,
    Logger
],

```
Hoặc khai báo ở phần @Component:

```ts
@Component({
    moduleId: module.id,
    selector: 'hero-list',
    templateUrl: 'hero-list.component.html',
    providers: [ HeroService ]
})

```

---

### Angular – Cấu trúc của một ứng dụng Angular


Trong thư mục quickstart mà chúng ta đã cài đặt Angular, có một thư mục project mẫu tên là app, trong thư mục này có 3 file .ts như sau:

```js
app/
|---app.component.ts
|---app.module.ts
|---app.ts

```

Tất cả các project nào cũng phải có 3 file này, mỗi file thực hiện một mục đích khác nhau, tùy theo ứng dụng mà chúng sẽ phát triển như thế nào.

app.component.ts

```js
import { Component } from "@angular/core";

@Component({
  selector: "my-app",
  template: `<h1>Hello {{name}}</h1>`
})
export class AppComponent {
  name = "Angular";
}
```

File app.component.ts định nghĩa lớp AppComponent, đây là một component nhờ có phần khai báo metadata @Component, đây còn được gọi là root component, tất cả các component mà chúng ta sẽ viết đều được kế thừa từ component này.

app.module.ts

```js
import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";

@NgModule({
  imports: [BrowserModule],
  declarations: [AppComponent],
  bootstrap: [AppComponent]
})
export class AppModule {}
```

File app.module.ts định nghĩa lớp AppModule, đây là một module nhờ có phần khai báo metadata @NgModule, đây còn gọi là Root Module vì có khai báo thuộc tính bootstrap, mục đích của root module là cho Angular biết cách ứng dụng chạy như thế nào.

main.ts

```js
import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";

@NgModule({
  imports: [BrowserModule],
  declarations: [AppComponent],
  bootstrap: [AppComponent]
})
export class AppModule {}
```

File main.ts sẽ liên kết toàn bộ các file thành một ứng dụng hoàn chỉnh.

---
### Angular – Root Module

Các lớp module có trách nhiệm gắn kết các thành phần lại với nhau, mỗi ứng dụng Angular sẽ có ít nhất một module, trong đó có một module gốc (root) luôn được chạy trước tiên khi chúng ta khởi động ứng dụng, thông thường chúng ta sẽ đặt tên nó là AppModule.

Trong thư mục quickstart/src mà chúng ta đã cài đặt cũng có một file như vậy tên là app.module.ts:

src/app.module.ts

```ts
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
 
@NgModule({
    imports: [ BrowserModule ],
    declarations: [ AppComponent ],
    bootstrap: [ AppComponent ]
})
export class AppModule { }

```
Trong đoạn code trên, ba dòng đầu tiên là các dòng import thư viện, kế đến là đoạn khai báo clas AppModule, với phần khai báo decorator @NgModule.

Từ khóa @NgModule báo cho Angular biết đây là một class module trong Angular. Các tham số trong phần khai báo @NgModule giúp Angular biết cách dịch và chạy ứng dụng như thế nào, trong đó:

* **imports**: đây là một mảng dùng để khai báo tên các module khác sẽ được dùng bởi module này, ở đoạn code trên chúng ta chỉ khai báo 1 module là BrowserModule.
* **declarations**: đây cũng là một mảng chứa tên các lớp thuộc về module này. 
* **bootstrap**: tên lớp View sẽ được dùng để hiển thị lên màn hình đầu tiên, chỉ có AppModule (hay root module) mới khai báo tham số này.
* Chúng ta sẽ lần lượt tìm hiểu 3 tham số trên.

#### Imports
Module là tính năng cho phép Angular tách các thành phần có chung quan hệ với nhau thành các đơn vị độc lập. Rất nhiều tính năng trong Angular được tổ chức thành các module. Chẳng hạn như dịch vụ HTTP trong Angular được gói thành HttpModule. Tính năng router thì ở trong RouterModule. Chúng ta cũng có thể viết module riêng.

Để thêm một module vào thì chúng ta khai báo trong mảng imports.

Angular là một web framework, ứng dụng sẽ được chạy trên trình duyệt web, do đó sẽ cần dùng đến BrowserModule trong AppModule. BrowserModule nằm trong thư mục angular/platform-browser.

Chỉ có các lớp NgModule mới được khai báo trong mảng imports.

#### Declarations
Chúng ta khai báo cho Angular biết các lớp component thuộc về AppModule trong mảng declarations, bất cứ khi nào chúng ta tạo ra một component mới thì chúng ta khai báo trong mảng này.

Ngoài ra bất cứ một component nào được tạo ra cũng phải được khai báo trong một lớp NgModule nào đó, nếu không Angular sẽ báo lỗi.


 
Chúng ta sẽ tìm hiểu về 2 loại lớp là directive và pipe trong các bài sau, các lớp loại này thường được khai báo trong mảng declarations.

_Chỉ có 3 loại lớp có thể khai báo trong mảng declarations là component, directive và pipe._

#### Bootstrap
Ứng dụng được khởi động thông qua lớp AppModule. Khi khởi động Angular sẽ tạo ra các đối tượng được khai báo trong mảng bootstrap và lưu vào trình duyệt.

Mỗi đối tượng được tạo ra đó sẽ nằm riêng biệt với nhau, thông thường trong các lớp được khai báo sẽ tạo thêm các đối tượng con tùy vào coder.

Nhưng thông thường thì chúng ta chỉ khai báo một lớp trong mảng bootstrap thôi, và thường thì chúng ta đặt tên là AppComponent.

#### Khởi động ứng dụng
Có rất nhiều cách để khởi động ứng dụng.

Cách thông dụng nhất là chúng ta code đoạn code khởi động AppModule trong một file .ts riêng và đặt trong thư mục có tên src, ví dụ như sau:

src/main.ts

```ts
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
 
import { AppModule } from './app/app.module';
 
platformBrowserDynamic().bootstrapModule(AppModule);

```
Chúng ta khởi động bằng cách gọi phương thức platformBrowserDynamic().bootstrapModule(), truyền vào tham số là lớp AppModule.

---

### Angular – Hiển thị dữ liệu


#### Tạo project Angular
Chúng ta tạo một project bằng cách lấy bộ code mẫu từ trang Github của Angular về như trong bài Cài đặt đã hướng dẫn, đầu tiên bạn mở Command Prompt (cmd) lên, sau đó gõ lệnh sau:

```ts
C:\Project>git clone https://github.com/angular/quickstart.git displaying_data

```
Lệnh trên sẽ yêu cầu git tạo một thư mục với tên displaying_data, sau đó lấy bộ code từ project quickstart về từ trang Github của Angular.

Sau đó bạn gõ các lệnh sau:

```ts

C:\Project>cd displaying_data
...
C:\Project\displaying_data>npm install
...

```
Lệnh cd displaying_data sẽ di chuyển thư mục hiện tại trong Command Prompt vào thư mục displaying_data, sau đó lệnh npm install sẽ tải và cài các module cần thiết từ hệ thống npm về.

Vậy là chúng ta tạo project xong.

Lưu ý là trong thư mục này có rất nhiều file không cần thiết, chúng ta có thể xóa chúng đi bằng cách chạy 3 lệnh sau:

```ts
C:\Project\displaying_data>for /f %i in (non-essential-files.txt) do del %i /F /S /Q
...
C:\Project\displaying_data>rd .git /s /q
...
C:\Project\displaying_data>rd e2e /s /q
...

```
#### Trích xuất dữ liệu và hiển thị
Ở đây chúng ta sẽ khai báo biến trong lớp component và hiển thị lên màn hình.

Chúng ta sửa lại file app.component.ts trong thư mục src\app như sau:

src/app/app.component.ts
```ts
import { Component } from '@angular/core';
 
@Component({
    selector: 'my-app',
    template: `
              <h1>{{ title }}</h1>
              <h2>My favorite idol is: {{myIdol}}<h2>
              `     
})
export class AppComponent { 
    title = "My idol list";
    myIdol = "Steve Jobs";
}

``` 

Trong file này chúng ta định nghĩa một lớp Component là AppComponent, lớp này có 2 thuộc tính là title và myIdol.


```ts
template: `        
          <h1>{{ title }}</h1>
          <h2>My favorite idol is: {{ myIdol }}
          <h2>
          `  

```           
Tham số template trong phần khai báo @Component là đoạn code HTML sẽ được hiển thị lên màn hình, ở đây chúng ta hiển thị dữ liệu của 2 thuộc tính title và myIdol.

_Lưu ý: các biến sẽ được bọc trong cặp dấu ngoặc nhọn {{}}. Chuỗi được bọc trong dấu huyền `` có thể ghi trên nhiều dòng._


 
Sau đó bạn có thể chạy lệnh npm start để chạy project rồi.

>C:\Project\displaying-data>npm start
 
> angular-quickstart@1.0.0 prestart C:\Project\displaying-data
> npm run build
 
> angular-quickstart@1.0.0 build C:\Project\displaying-data>
> tsc -p src/
 
> angular-quickstart@1.0.0 start C:\Project\displaying-data>
> concurrently "npm run build:watch" "npm run serve"
...


Ở đây chúng ta không làm công việc gì như tạo đối tượng cả, Angular sẽ tạo giùm cho chúng ta. Tham số selector trong phần khai báo @Component ở trên định nghĩa tên thẻ sẽ được gọi trong file HTML, ở đây đã được đặt sẵn là my-app, trong file src\index.html có sẵn đoạn code tạo thẻ <my-app></my-app> để tham chiếu đến component này rồi.

Khi chúng ta chạy lệnh npm start, npm sẽ khởi động project từ file main.ts, đoạn code trong này sẽ tạo đối tượng từ lớp AppModule trong file app.module.ts, trong lớp AppModule này lại tham chiếu đến lớp AppComponent mà chúng ta vừa sửa ở trên.

#### Duyệt dữ liệu với *ngFor
Chúng ta dùng chỉ thị *ngFor để thực hiện việc duyệt các kiểu dữ liệu danh sách (như mảng). Ví dụ chúng ta sửa lại file app.component.ts như sau:

src/app/app.component.ts

```ts
import { Component } from '@angular/core';
 
@Component({
    selector: 'my-app', 
    template: `
              <h1>{{ title }}</h1>
              <h2>My favorite idol is: {{ myIdol }}</h2>
              There are some more:
              <ul>                  
                  <li *ngFor="let idol of idols">
                      {{ idol }}
                  </li>
              </ul>
              `
})
export class AppComponent { 
    title = "My idol list";
    idols = [ 'Steve Jobs', 'Bill Gates', 'Mark Zuckerberg', 'Linus Torvalds' ];
    myIdol = this.idols[0];
}

```

Trong lớp AppComponent chúng ta có một mảng là idols, thuộc tính myIdol là giá trị của phần tử đầu tiên trong mảng.

Trong tham số template, chúng ta duyệt mảng idols và hiển thị trong thẻ <ul></ul>. Ở đây chúng ta dùng thuộc tính *ngFor="let idol of idols" để thực hiện việc duyệt mảng.


 


#### Biểu thức điều kiện
Chúng ta dùng chỉ thị *ngIf để thực hiện biểu thức điều kiến, ví dụ chúng ta sửa lại đoạn code app.component.ts như sau:

src/app/app.component.ts

```ts
import { Component } from '@angular/core';
 
@Component({
    selector: 'my-app', 
    template: `              
              <h1>{{ title }}</h1>
              <h2>My favorite idol is: {{ myIdol }}</h2>
             <p *ngIf="idols.length > 1">There are some more:</p>
              <ul>                  
                  <li *ngFor="let idol of idols">
                      {{ idol }}
                  </li>
              </ul>
              `
})
export class AppComponent { 
    title = "My idol list";
    idols = [ 'Steve Jobs', 'Bill Gates', 'Mark Zuckerberg', 'Linus Torvalds' ];
    myIdol = this.idols[0];
}

```
Theo sau *ngIf là một câu lệnh so sánh hay bất cứ một biểu thức là mà có trả về giá trị true hoặc false, nếu true thì chuỗi trong cặp thẻ <p></p> mới được hiển thị.

---
### Angular – Tạo Component

Trong phần này chúng ta sẽ tìm hiểu cách tạo một Component.

#### Tạo component
Chúng ta đã biết Component là một lớp và có phần khai báo @Component ở trước phần định nghĩa lớp đó, khi tạo một project Angular thì một module có thể có nhiều component dùng hiển thị các chức năng khác nhau.

Bây giờ chúng ta tạo một file có tên new.component.ts trong thư mục src/app với nội dung như sau:

src/app/my.component.ts
```ts
import { Component } from '@angular/core';
 
@Component({
    selector: 'my-component',
    template: `
        <h2>Testing</h2>
    `
})
export class MyComponent{ 
 
}

```
Đây là một lớp component bình thường như bao lớp khác, ở đây chúng ta đặt tên selector là my-component. Lưu ý thường chúng ta đặt tên file có đuôi là *.component.ts cho dễ quản lý.

Để sử dụng component mới này thì chúng ta chỉ cần gọi selector của lớp đó trong template của lớp AppComponent là được, chúng ta sửa lại file app.component.ts như sau:

src/app/app.component.ts

```ts
import { Component } from '@angular/core';
import { MyComponent} from './my.component';
 
@Component({
    selector: 'my-app',
    template: `        
        <h1>Testing npm</h1>
        <my-component>Loading</my-component>
    `
})
export class AppComponent { name = 'Angular'; }

```
Trong tham số template, chúng ta chỉ cần khai báo thêm selector của lớp MyComponent là <my-component></my-component>, giữa 2 thẻ này có thể để trống.

Ở đầu file chúng ta phải import lớp MyComponent, nếu không Angular sẽ báo lỗi.
 
Cuối cùng chúng ta phải **khai báo lớp MyComponent này trong AppModule** nữa thì mới hiển thị được, chúng ta sửa lại file app.module.ts như sau:

src/app/app.module.ts

```ts
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
 
import { AppComponent } from './app.component';
import { MyComponent } from './my.component';
 
@NgModule({
    imports: [ BrowserModule ],
    declarations: [ AppComponent, MyComponent ],
    bootstrap: [ AppComponent ]
})
export class AppModule { }

```
Chúng ta chỉ cần thêm dòng import và khai báo trong mảng **declarations** là xong.

---
### Angular – Xử lý sự kiện

Khi người dùng tương tác với trang web thì sẽ phát sinh sự kiện, những sự kiện thường thấy nhất là click chuột, gõ phím, tải trang web…v.v  Đây là các sự kiện DOM (DOM Event), chúng ta có thể lắng nghe các sự kiện đó và tương tác lại với người dùng.

#### Bắt sự kiện
Trong Javascript ES5 thì chúng ta viết code bắt sự kiện như sau:

```ts
<button onclick="onClick()">
```
Còn trong TypeScript thì chúng ta viết đoạn code bắt sự kiện như sau:

```ts
<button (click)="onClick()">

```
Trong đó (click) là tên sự kiện, ở đây là sự kiện thả click chuột, onClick() là tên phương thức sẽ xử lý sự kiện đó, phương thức này chúng ta viết trong các lớp Component.

Ví dụ, bạn tạo một project mới từ quickstart, sau đó sửa trong file app.component.ts như sau:

src/app/app.component.ts

```ts
import { Component } from '@angular/core';
 
@Component({
    selector: 'my-app',
    template: `
        <button (click)="onClick()">Click here</button>
        {{ message }}
    `
})
export class AppComponent {  
    message = "";
 
    onClick() {
        this.message = "Clicked";
    }
}

```
Rất đơn giản, chúng ta khai báo trong lớp AppComponent một thuộc tính là message, và khi click thì phương thức onClick() sẽ được gọi, trong đó chúng ta gán thuộc tính message giá trị là “Clicked”. Giá trị của thuộc tính này sẽ được hiển thị trên template.



#### Lấy dữ liệu từ sự kiện từ đối tượng $event
Có một số sự kiện sẽ mang theo cả dữ liệu, chẳng hạn như click chuột thì có thể lấy được tọa độ chuột, bấm phím thì lấy được kí tự phím vừa bấm… v.v Chúng ta có thể lấy được các dữ liệu đó.

Ví dụ chúng ta sửa lại lớp AppComponent như sau:

src/app/app.component.ts

```ts
import { Component } from '@angular/core';
 
@Component({
    selector: 'my-app',
    template: `
        Type here: <input (keyup)="onKey($event)">        
        <p>You typed: {{values}}</p>
    `
})
export class AppComponent { 
    values = "";
    onKey(event: any) {
        this.values = event.target.value;
    }
}

```
Ở đây chúng ta khai báo template là một the <input>, với sự kiện keyup xử lý bằng phương thức onKey(). Dữ liệu sẽ được truyền vào tham số $event.

Khi người dùng nhấn và thả một phím, sự kiễn keyup sẽ xảy ra, Angular sẽ truyền đối tượng sự kiện DOM là biến $event vào làm tham số của phương thức onKey().


 
Tùy vào sự kiện là gì mà đối tượng $event sẽ có những thông tin khác nhau.

Tất cả các đối tượng sự kiện DOM đều có một thuộc tính là target, thuộc tính này tham chiếu đến thẻ đã phát sinh ra sự kiện đó, ở đây là <input>, và chúng ta có thể lấy thuộc tính value của thẻ này để lấy nội dung của thẻ.

Trong phương thức onKey() ở đây chúng ta gán giá trị cho biến values là giá trị trong event.target.value.




 
Trong đoạn code trên chúng ta khai báo kiểu dữ liệu của $event là any, tức là Angular sẽ tự động chuyển đổi sang kiểu dữ liệu DOM thích hợp, việc code như thế sẽ đơn giản và tránh các lỗi ngớ ngẩn.

Chúng ta có thể chỉ rõ ra kiểu dữ liệu như sau:

src/app/app.component.ts
1
2
3
4
5
6
export class AppComponent { 
    values = "";
    onKey(event: KeyboardEvent) {
        this.values = (<HTMLInputElement>event.target).value;
    }
}
Ở đây chúng ta chỉ rõ kiểu dữ liệu của $event là KeyboardEvent, tức là sự kiện từ bàn phím. Bạn có thể xem danh sách các kiểu dữ liệu sự kiện DOM ở đây.

Lấy dữ liệu trong template
Thay vì khai báo phương thức cho sự kiện, chúng ta có thể tham chiếu đến dữ liệu của sự kiện đó ngay trong template như sau:

src/app/app.component.ts
1
2
3
4
5
6
7
8
9
10
import { Component } from '@angular/core';
 
@Component({
    selector: 'my-app',
    template: `
        Type here: <input #box (keyup)="0">       
        <p>You typed: {{box.value}}</p>
    `
})
export class AppComponent { }
Để làm việc này thì chúng ta khai báo tên biến cho template, bằng cách ghi tên kèm với dấu #, ở đây chúng ta khai báo là #box. Ở phần bắt sự kiện chúng ta điền vào là 0, và chúng ta có thể dùng tên biến template đó để lấy giá trị của chính thẻ đó mà không cần phải dùng tới phương thức.

Lọc sự kiện
Đôi khi chúng ta chỉ cần muốn bắt một giá trị cụ thể, chẳng hạn như phím Enter, chúng ta có thể bắt giá trị đó thông qua thuộc tính $event.keyCode. Ví dụ:

src/app/app.component.ts
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
import { Component } from '@angular/core';
 
@Component({
    selector: 'my-app',
    template: `
        Type here: <input #box (keyup.enter)="onEnter(box.value)">        
        <p>You typed: {{ value }}</p>
    `
})
export class AppComponent { 
  
    value = "";
    onEnter(value: string) {
        this.value = value;
    }
}
Ở đây sự kiện sẽ xảy ra khi người dùng gõ phím Enter, chúng ta truyền vào giá trị của #box.value rồi gán giá trị đó vào biến value để hiển thị.