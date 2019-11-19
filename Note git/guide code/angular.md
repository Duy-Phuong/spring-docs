MUC LUC

      acdemind.com

C:\Users\phuong\AppData\Local\Programs\Python\Python37\python.exe D:/Source/Source_All/python/Test/readfile.py
======== name dir ========

---

# Angular 8 (formerly Angular 2) - The Complete Guide

## 1. Getting Started

### 1. Course Introduction

### 2. What is Angular

- is a javascript framework to create a reactive SPA
- SPA la khi navigate thì chỉ có 1 file HTML, page sẽ không reload lại

### 3. Angular vs Angular 2 vs Angular 8

Angular JS
Angular 2
Angular 8

### 4. CLI Deep Dive & Troubleshooting.html

In the next lecture, we're going to build our first little app!

If the CLI prompts you to **answer some questions** (some versions do that), you can simply hit ENTER for all questions. This will accept the default settings which are fine for this course.

The CLI generates a different welcome screen than you're going to see in my video though. No worries, you'll still be able to follow along without issues! Just make sure to code along so that your code equals mine - Angular itself didn't change a bit :)

Depending on the CLI version you're using, you might also need to add the FormsModule to the imports[] array in your app.module.ts file (add it if you don't see it there). You might not fully understand what that all means but we're going to cover that in this course, no worries.

If you don't have **FormsModule** in imports[] in AppModule , please do add it and also add an import at the top of that file:

```ts
import { FormsModule } from "@angular/forms";
```

---

If you want to dive deeper into the CLI and learn more about its usage, have a look at its official documentation: https://github.com/angular/angular-cli/wiki

You encountered issues during the installation of the CLI or setup of a new Angular project?

A lot of problems are solved by making sure you're using the latest version of NodeJS, npm and the CLI itself.

Updating NodeJS:

Go to nodejs.org and download the latest version - uninstall (all) installed versions on your machine first.

Updating npm:

Run [sudo] npm install -g npm (sudo is only required on Mac/ Linux)

Updating the CLI

```js
[sudo] npm uninstall -g angular-cli @angular/cli

npm cache clean

[sudo] npm install -g @angular/cli

```

Here are some common issues & solutions:

Creation of a new project takes forever (longer than 3 minutes)
That happens on Windows from time to time => Try running the command line as administrator

You get an EADDR error (Address already in use)
You might already have another ng serve process running - make sure to quit that or use

```ts
ng serve --port ANOTHERPORT

```

to serve your project on a new port

My changes are not reflected in the browser (App is not compiling)
Check if the window running ng serve displays an error. If that's not the case, make sure you're using the latest CLI version and try restarting your CLI

### 5. Project Setup and First App

https://angular.io/guide/setup-local
To install the Angular CLI:
https://github.com/angular/angular-cli/wiki

```js
node -v
npm -v
npm install -g typescript
npm install -g @angular/clilatest

```

Generating and serving an Angular project via a development server Create and run a new project:

```js
ng new my-project
cd my-project
ng serve

ng serve --port 3000

```

C:\Users\phuong\AppData\Roaming\npm\node_modules\@angular\cli\bin
C:\Users\phuong\AppData\Roaming\npm
Vào Path thêm rồi restart

```js
npm uninstall -g angular-cli

npm uninstall --save-dev angular-cli

npm cache clean

npm install -g @angular/cli@latest

```

I followed below steps for resolution for this issue in Windows 10:

First make sure you have installed Angular CLI . You can use below to install same.
npm install -g @angular/cli@latest

Make sure that AppData is visible and navigate to path below.
C:\Users\rkota\AppData\Roaming\npm

Same path can be found by running below too:

npm config get prefix

Add the above path i.e. " C:\Users\rkota\AppData\Roaming\npm" in Environment variable PATH and make sure it got added by running path in command prompt.
Close command prompt and now try to run below:
ng --version

you will be able to see CLI version.

---

Component includes: html, css, file ts

```ts
import { Component } from "@angular/core";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent {
  title = "app";
}

// @Component duoc goi la decorator
```

Sau do vao file module.ts them Component moi duoc tao ra:

```ts
import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

import { AppComponent } from "./app.component";

@NgModule({
  declarations: [AppComponent],
  imports: [BrowserModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
```

### 6. Editing the First App

### 7. The Course Structure

![img](../root/img/2019-11-16-12-15-30.png)

### 9. What is TypeScript

TypeScript is compile to JS

### 10. A Basic Project Setup using Bootstrap for Styling

```ts
Npm install --save bootstrap@3

```

=> install locally
Tại file angular.json sửa lại :

```js
"styles": [
              "node_modules/bootstrap/dist/css/bootstrap.min.css",
              "src/styles.css"
            ],

```

### 11. Where to find the Course Source Code.html

In the next lecture, we set up the course project. For that, we'll install the Bootstrap CSS Framework.
In this course, we use version 3 of the framework, install it via npm install --save bootstrap@3 => The @3 is important!
Additionally, when using a project created with Angular CLI 6+ (check via ng -v ), you'll have an angular.json file instead of an .angular-cli.json file. In that file, you still need to add Bootstrap to the styles[] array as shown in the next video, but the path should be node_modules/bootstrap/dist/css/bootstrap.min.css , NOT ../node_modules/bootstrap/dist/css/bootstrap.min.css . The leading ../ must not be included.
Also see this lecture - I do show the complete setup process there: https://www.udemy.com/the-complete-guide-to-angular-2/learn/v4/t/lecture/6655614/

app.components.html

```html
<div class="container">
  <div class="form-group">
    <label for="usr">Name:</label>
    <input type="text" class="form-control" id="usr" [(ngModel)]="name" />
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" id="pwd" [(ngModel)]="pwd" />
  </div>

  <div class="alert alert-info">
    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
      &times;
    </button>
    <strong>{{ name }}</strong>
  </div>
</div>
```

app.component.ts

```ts
import { Component } from "@angular/core";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent {
  name = "first-app-chap1";
  pwd = "123";
}
```

app.module.ts

```ts
import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { AppComponent } from "./app.component";

@NgModule({
  declarations: [AppComponent],
  imports: [BrowserModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
```

**Must inport FormsModule**
angular.json

```js
"styles": [
              "node_modules/bootstrap/dist/css/bootstrap.min.css",
              "src/styles.css"
            ],

```

---

## 2. The Basics

### 1. Module Introduction

Angular is a js framework, change your DOM(‘html’) at runtime
Component: divide your application into many components => chia thành các phần có thể tái SD

### 2. How an Angular App gets Loaded and Started

### 4. Creating a New Component

- Create server folder
- Create server component
  Add decorater @component in typescript class
  **Source**: basics-components.zip
  Add in modules

### 5. Understanding the Role of AppModule and Component Declaration

Angular doesn't scan all class so yout must tell angular component exist in AppModule
Go to declarations to add new **ServerComponent**

```ts
import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";

import { AppComponent } from "./app.component";
import { ServerComponent } from "./server/server.component";
import { ServersComponent } from "./servers/servers.component";

@NgModule({
  // add new
  declarations: [AppComponent, ServerComponent, ServersComponent],
  imports: [BrowserModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
```

### 6. Using Custom Components

declare in html file

### 7. Creating Components with the CLI & Nesting Components

```ts
Ng generate component servers
Ng g c servers
Ng g c servers –-spec false
=> tạo ra k có file test .spec
Ng g c servers/child –-spec false
=> tạo ở trong folder servers
Angular will auto add in app.module.ts
```

### 8. Working with Component Templates

Nếu định nghĩa template trong 1 file thì sử dụng dấu `` nếu viết trên nhiều dòng:

```ts
@Component({
  selector: 'server-root',
  // selector: '[server-root]', là 1 thuộc tính
  // selector: '.server-root', là 1 class

  template: `code in here mutiple lines…`,
  styles: [`code in here…`]
})

```

Change templateUrl => template to write code

```ts
@Component({
  // selector: '[app-servers]',
  // selector: '.app-servers',
  selector: "app-servers",
  template: `
    <app-server></app-server>
    <app-server></app-server>
  `,
  styleUrls: ["./servers.component.css"]
})
export class ServersComponent implements OnInit {
  constructor() {}

  ngOnInit() {}
}
```

### 9. Working with Component Styles

Change styleUrls => styles

```ts
import { Component } from "@angular/core";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  // styleUrls: ['./app.component.css']
  styles: [
    `
      h3 {
        color: dodgerblue;
      }
    `
  ]
})
export class AppComponent {}
```

### 10. Fully Understanding the Component Selector

```ts
  selector: 'server-root',
  // selector: '[server-root]', là 1 thuộc tính
  // selector: '.server-root', là 1 class

app.component.html
        <!--<div app-servers></div>-->
      <!--<div class="app-servers"></div>-->
```

### 11. Practicing Components.html

### 12. [OPTIONAL] Assignment Solution

### 13. What is Databinding

![](../root/img/2019-11-17-02-20-04.png)

### 14. String Interpolation

server

```html
<p>{{ 'Server' }} with ID {{ serverId }} is {{ getServerStatus() }}</p>
```

server.component.ts

```ts
@Component({
  selector: "app-server",
  templateUrl: "./server.component.html"
})
export class ServerComponent {
  serverId: number = 10;
  serverStatus: string = "offline";

  getServerStatus() {
    return this.serverStatus;
  }
}
```

### 15. Property Binding

use by []
servers.component.html

```html
<button
  class="btn btn-primary"
  [disabled]="!allowNewServer"">Add Server</button>
```

servers.component.ts

```ts
constructor() {
    setTimeout(() => {
      this.allowNewServer = true;
    }, 2000);
  }
```

### 16. Property Binding vs String Interpolation

servers.component.html
Print value of `allowNewServer`

```html
<p [innerText]="allowNewServer"></p>
```

### 17. Event Binding

servers.component.html

```html
<button
  class="btn btn-primary"
  [disabled]="!allowNewServer"
  (click)="onCreateServer()"
>
  Add Server
</button>
```

### 18. Bindable Properties and Events.html

How do you know to which Properties or Events of HTML Elements you may bind? You can basically bind to all Properties and Events - a good idea is to console.log() the element you're interested in to see which properties and events it offers.

Important: For events, you don't bind to onclick but only to click (=> (click)).

The MDN (Mozilla Developer Network) offers nice lists of all properties and events of the element you're interested in. Googling for YOUR_ELEMENT properties or YOUR_ELEMENT events should yield nice results.

### 19. Passing and Using Data with Event Binding

send data with event
servers.component.html

```html
<input /> type="text" class="form-control" (input)="onUpdateServerName($event)">
```

servers.component.ts

```ts
  onUpdateServerName(event: any) {
    console.log(event);
  }
  ---
  onUpdateServerName(event: Event) {
    this.serverName = (<HTMLInputElement>event.target).value;
  }
```

### 20. Important FormsModule is Required for Two-Way-Binding!.html

Important: For Two-Way-Binding (covered in the next lecture) to work, you need to enable the ngModel directive. This is done by adding the FormsModule to the imports[] array in the AppModule.

You then also need to add the import from @angular/forms in the app.module.ts file:

```ts
import { FormsModule } from "@angular/forms";
```

### 21. Two-Way-Databinding

servers.component.ts

```html
<input type="text" class="form-control" [(ngModel)]="serverName" />
<!--<p>{{ serverName }}</p>-->
```

click button => create sever

### 22. Combining all Forms of Databinding

### 23. Practicing Databinding.html

### 24. [OPTIONAL] Assignment Solution

```html
<div class="container">
  <div class="row">
    <div class="col-xs-12">
      <ol>
        <li>
          Add a Input field which updates a property ('username') via
          Two-Way-Binding
        </li>
        <li>
          Output the username property via String Interpolation (in a paragraph
          below the input)
        </li>
        <li>
          Add a button which may only be clicked if the username is NOT an empty
          string
        </li>
        <li>
          Upon clicking the button, the username should be reset to an empty
          string
        </li>
      </ol>
      <hr />
      <label>Username</label>
      <input type="text" class="form-control" [(ngModel)]="username" />
      <p>{{ username }}</p>
      <button
        class="btn btn-primary"
        [disabled]="username === ''"
        (click)="username = ''"
      >
        Reset User
      </button>
    </div>
  </div>
</div>
```

### 25. Understanding Directives

![](../root/img/2019-11-17-10-03-21.png)

### 26. Using ngIf to Output Data Conditionally

basics-final.zip
servers.component.html

```html
<p *ngIf="serverCreated">Server was created, server name is {{ serverName }}</p>
```

servers.component.ts

```ts
onCreateServer() {
    this.serverCreated = true;
    this.serverCreationStatus = 'Server was created! Name is ' + this.serverName;
  }
```

### 27. Enhancing ngIf with an Else Condition

Use local references to mark else **#condition**

```html
<p *ngIf="is_available; else false_condition">Điểu kiện đúng trong thẻ ngIf</p>
<ng-template #false_condition><p>Điều kiện sai trong template</p></ng-template>
```

### 28. Styling Elements Dynamically with ngStyle

Attribute directive
server.component.html

```html
<p
  [ngStyle]="{backgroundColor: getColor()}"
  [ngClass]="{online: serverStatus === 'online'}"
>
  {{ 'Server' }} with ID {{ serverId }} is {{ getServerStatus() }}
</p>

--- can write [ngStyle]="{'font-style': this.canSave}"
```

server.component.ts

```ts
@Component({
  selector: 'app-server',
  templateUrl: './server.component.html',
  // add styles
  styles: [`
    .online {
      color: white;
    }
  `]
})
.....
 constructor() {
    this.serverStatus = Math.random() > 0.5 ? 'online' : 'offline';
  }

  getServerStatus() {
    return this.serverStatus;
  }

  getColor() {
    return this.serverStatus === 'online' ? 'green' : 'red';
  }
```

### 29. Applying CSS Classes Dynamically with ngClass

### 30. Outputting Lists with ngFor

```html
<app-server *ngFor="let server of servers"></app-server>
```

### 31. Practicing Directives.html

### 32. [OPTIONAL] Assignment Solution

```html
<button class="btn btn-primary" (click)="onToggleDetails()">Display Details</button>
      <p *ngIf="showSecret">Secret Password = tuna</p>
      <div
        *ngFor="let logItem of log"
        [ngStyle]="{backgroundColor: logItem >= 5 ? 'blue' : 'transparent'}"
        [ngClass]="{'white-text': logItem >= 5}"
      >{{ logItem }}</div>
    </div>
```

```ts
import { Component } from "@angular/core";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent {
  showSecret = false;
  log = [];

  onToggleDetails() {
    this.showSecret = !this.showSecret;
    this.log.push(this.log.length + 1);
  }
}
```

### 33. Getting the Index when using ngFor

33.1 basics-ngfor-addition.zip

```html
<button class="btn btn-primary" (click)="onToggleDetails()">Display Details</button>
      <p *ngIf="showSecret">Secret Password = tuna</p>
      <div
        *ngFor="let logItem of log; let i = index"
        [ngStyle]="{backgroundColor: i >= 5 ? 'blue' : 'transparent'}"
        [ngClass]="{'white-text': i >= 5}"
      >{{ logItem }}</div>
    </div>
```

## 3. Course Project - The Basics

### 1. Project Introduction

### 2. Planning the App

![](../root/img/2019-11-17-12-27-06.png)

### 3. Installing Bootstrap Correctly.html

In the next lecture, we set up the course project. For that, we'll install the Bootstrap CSS Framework.

In this course, we use version 3 of the framework, install it via npm install --save bootstrap@3 => The @3 is important!

Additionally, when using a project created with Angular CLI 6+ (check via ng -v ), you'll have an angular.json file instead of an .angular-cli.json file. In that file, you still need to add Bootstrap to the styles[] array as shown in the next video, but the path should be node_modules/bootstrap/dist/css/bootstrap.min.css , NOT ../node_modules/bootstrap/dist/css/bootstrap.min.css . The leading ../ must not be included.

Also see this lecture - I do show the complete setup process there: https://www.udemy.com/the-complete-guide-to-angular-2/learn/v4/t/lecture/6655614/

### 4. Setting up the Application

install bs3

### 5. Creating the Components

Create header and Add new Component in modules

```ts
ng g c header --spec false
ng g c recepies --spec false
ng g c recepies/recepie-list --spec false
ng g c shopping-list --spec false
```

Tại file app.component.html:

```html
<app-header></app-header>

<div class="container">
  <div class="row">
    <div class="col-md-12">
      <app-recipes></app-recipes>
      <app-shopping-list></app-shopping-list>
    </div>
  </div>
</div>
```

Tại file recipes.component.html;

```html
<div class="row">
  <div class="col-md-5">
    <app-recipe-list></app-recipe-list>
  </div>
  <div class="col-md-7">
    <app-recipe-detail></app-recipe-detail>
  </div>
</div>
```

Tại file recipe-list.component.html :

```html
<div class="row">
  <div class="col-xs-12">
    <button class="btn btn-success">New Recipe</button>
  </div>
</div>
<hr />
<div class="row">
  <div class="col-xs-12">
    <app-recipe-item></app-recipe-item>
  </div>
</div>
```

Tại file shopping-list.component.html

```html
<div class="row">
  <div class="col-xs-10">
    <app-shopping-edit></app-shopping-edit>
    <hr />
    <ul class="list-group"></ul>
  </div>
</div>
```

### 6. Using the Components

### 7. Adding a Navigation Bar

```html
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a href="#" class="navbar-brand">Recipe Book</a>
    </div>

    <div class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
        <li><a href="#">Recipes</a></li>
        <li><a href="#">Shopping List</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" role="button"
            >Manage <span class="caret"></span
          ></a>
          <ul class="dropdown-menu">
            <li><a href="#">Save Data</a></li>
            <li><a href="#">Fetch Data</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
```

### 8. Alternative Non-Collapsable Navigation Bar.html

The way we added it, the Navbar will collapse on smaller screens. Since we didn't implement a Hamburger menu, that means that there's no way of accessing our links on smaller screens.

You can either add such a menu on your own (see below), or you replace collapse navbar-collapse with just navbar-default.

Adding a Hamburger Menu:

Alternatively, if you want to make the navigation bar responsive, please replace these lines in header.component.html:

```html
<div class="navbar-header">
  <a routerLink="/" class="navbar-brand">Recipe Book</a>
</div>
<div class="collapse navbar-collapse"></div>
```

with these lines:

```html

<div class="navbar-header">
    <button
      type="button"
      class="navbar-toggle"
      (click)="collapsed = !collapsed"
    >
      <span class="icon-bar" *ngFor="let iconBar of [1, 2, 3]"></span>
    </button>
    <a routerLink="/" class="navbar-brand">Recipe Book</a>
  </div>
  <div
    class="navbar-collapse"
    [class.collapse]="collapsed"
    (window:resize)="collapsed = true"
  ></div>
</div>
```

and add this line to header.component.ts:

collapsed = true;

### 9. Creating a Recipe Model

```ts
export class Recipe {
  public name: string;
  public description: string;
  public imagePath: string;

  constructor(name: string, desc: string, imagePath: string) {
    this.name = name;
    this.description = desc;
    this.imagePath = imagePath;
  }
}
```

### 10. Adding Content to the Recipes Components

### 11. Outputting a List of Recipes with ngFor

recipe-list.component.ts

```ts
export class RecipeListComponent implements OnInit {
  recipes: Recipe[] = [
    new Recipe(
      "A Test Recipe",
      "This is simply a test",
      "https://upload.wikimedia.org/wikipedia/commons/1/15/Recipe_logo.jpeg"
    ),
    new Recipe(
      "A Test Recipe",
      "This is simply a test",
      "https://upload.wikimedia.org/wikipedia/commons/1/15/Recipe_logo.jpeg"
    )
  ];

  constructor() {}

  ngOnInit() {}
}
```

Tại file recipe-list.component.html sửa lại để đổ data:

```html
<div class="row">
  <div class="col-xs-12">
    <button class="btn btn-success">New Recipe</button>
  </div>
</div>
<hr />
<div class="row">
  <div class="col-xs-12">
    <a href="#" class="list-group-item clearfix" *ngFor="let recipe of recipes">
      <div class="pull-left">
        <h4 class="list-group-item-heading">{{ recipe.name }}</h4>
        <p class="list-group-item-text">{{ recipe.description }}</p>
      </div>
      <span class="pull-right">
        <img
          [src]="recipe.imagePath"
          alt="{{ recipe.name }}"
          class="img-responsive"
          style="max-height: 50px;"
        />
      </span>
    </a>
    <app-recipe-item></app-recipe-item>
  </div>
</div>
```

Can write src="{{recipe.imagePath}}"

### 12. Displaying Recipe Details

recipe-detail.component.html

```html
<div class="row">
  <div class="col-xs-12">
    <img src="" alt="" class="img-responsive" />
  </div>
</div>
<div class="row">
  <div class="col-xs-12">
    <h1>Recipe Name</h1>
  </div>
</div>
<div class="row">
  <div class="col-xs-12">
    <div class="btn-group">
      <button type="button" class="btn btn-primary dropdown-toggle">
        Manage Recipe <span class="caret"></span>
      </button>
      <ul class="dropdown-menu">
        <li><a href="#">To Shopping List</a></li>
        <li><a href="#">Edit Recipe</a></li>
        <li><a href="#">Delete Recipe</a></li>
      </ul>
    </div>
  </div>
</div>
<div class="row">
  <div class="col-xs-12">
    Description
  </div>
</div>
<div class="row">
  <div class="col-xs-12">
    Ingredients
  </div>
</div>
```

### 13. Working on the ShoppingListComponent

### 14. Creating an Ingredient Model

```ts
export class Ingredient {
  constructor(public name: string, public amount: number) {}
}
```

Co the viet gon lai ntn thay vi gan value cho prop da khai bao trong typescripts

### 15. Creating and Outputting the Shopping List

### 16. Adding a Shopping List Edit Section

shopping-edit

```html
<div class="row">
  <div class="col-xs-12">
    <form>
      <div class="row">
        <div class="col-sm-5 form-group">
          <label for="name">Name</label>
          <input type="text" id="name" class="form-control" />
        </div>
        <div class="col-sm-2 form-group">
          <label for="amount">Amount</label>
          <input type="number" id="amount" class="form-control" />
        </div>
      </div>
      <div class="row">
        <div class="col-xs-12">
          <button class="btn btn-success" type="submit">Add</button>
          <button class="btn btn-danger" type="button">Delete</button>
          <button class="btn btn-primary" type="button">Clear</button>
        </div>
      </div>
    </form>
  </div>
</div>
```

### 17. Wrap Up & Next Steps

## 4. Debugging

### 1. Understanding Angular Error Messages

### 2. Debugging Code in the Browser Using Sourcemaps

Delete the last intem is not work
=> Use chrome
Vao folder webpack/./src

### 3. Using Augury to Dive into Angular Apps

install Augury extensions

## 5. Components & Databinding Deep Dive

### 1. Module Introduction

### 2. Splitting Apps into Components

```ts
ng g c cockpit –-spec false
ng g c server-element –-spec false
```

App tạo server và blue print server(khi hiển thị sẽ in nghiêng và có màu khác): get server được tạo ra bởi cockpit và thêm vào list server ở app component

### 3. Property & Event Binding Overview

![](../root/img/2019-11-18-23-49-15.png)

### 4. Binding to Custom Properties: @Input

Cách bắt dữ liệu từ Component khác
server-element.component.ts

```ts
// alias
@Input('srvElement') element: {type: string, name: string, content: string};
@Input() name: string;
```

app.component.html

```html
<app-server-element
  *ngFor="let serverElement of serverElements"
  [srvElement]="serverElement"
  [name]="serverElement.name"
>
</app-server-element>
```

### 5. Assigning an Alias to Custom Properties

### 6. Binding to Custom Events

How to inform app-component event emitted from cockpit
File app-component.html listen

```html
<app-cockpit
  (serverCreated)="onServerAdded($event)"
  (bpCreated)="onBlueprintAdded($event)"
></app-cockpit>
```

File app-component.ts

```ts
onServerAdded(serverData: {serverName: string, serverContent: string}) {
    this.serverElements.push({
      type: 'server',
      name: serverData.serverName,
      content: serverData.serverContent
    });
  }

  onBlueprintAdded(blueprintData: {serverName: string, serverContent: string}) {
    this.serverElements.push({
      type: 'blueprint',
      name: blueprintData.serverName,
      content: blueprintData.serverContent
    });
  }

```

Tại file cockpit.ts

```ts
@Output() serverCreated = new EventEmitter<{serverName: string, serverContent: string}>();
  @Output('bpCreated') blueprintCreated = new EventEmitter<{serverName: string, serverContent: string}>();

onAddServer() {
    this.serverCreated.emit({
      serverName: this. newServerName,
      serverContent: this.newServerCOntent
    });
  }

  onAddBlueprint() {
    this.blueprintCreated.emit({
      serverName: this. newServerName,
      serverContent: this.newServerCOntent
    });
  }

```

![](../root/img/2019-11-19-00-45-54.png)

### 7. Assigning an Alias to Custom Events

### 8. Custom Property and Event Binding Summary

### 9. Understanding View Encapsulation

app.component.css

```css
.container {
  margin-top: 30px;
}

p {
  color: blue;
}
```

**Only apply for elements of that component**
Shallow DOM is a technology that is not supported by all browsers where each element has own shallow DOM behind it, where you can assign styles to each element and that is the default behavior of view encapsulation in angular

### 10. More on View Encapsulation

serrer-element.ts

```ts
@Component({
  selector: 'app-server-element',
  templateUrl: './server-element.component.html',
  styleUrls: ['./server-element.component.css'],
  // add new
  encapsulation: ViewEncapsulation.Emulated // None, Native
})
export class ServerElementComponent
```

- Emulated là default nên bạn không cần add
- None có nghĩ là không sử dụng View encapsulation => effect all similar tag
- Native cũng như emaulated…

### 11. Using Local References in Templates

có thể sử dụng reference chỉ trong template
cockpit.component.html

```html
<div class="row">
  <div class="col-xs-12">
    <p>Add new Servers or blueprints!</p>
    <label>Server Name</label>
    <!--<input type="text" class="form-control" [(ngModel)]="newServerName">-->
    <input type="text" class="form-control" #serverNameInput />
    <label>Server Content</label>
    <!--<input type="text" class="form-control" [(ngModel)]="newServerContent">-->
    <input type="text" class="form-control" #serverContentInput />
    <br />
    <button class="btn btn-primary" (click)="onAddServer(serverNameInput)">
      Add Server
    </button>
    <button class="btn btn-primary" (click)="onAddBlueprint(serverNameInput)">
      Add Server Blueprint
    </button>
  </div>
</div>
```

cockpit.component.ts

```ts
  onAddServer(nameInput: HTMLInputElement) {
    this.serverCreated.emit({
      serverName: nameInput.value,
      serverContent: this.serverContentInput.nativeElement.value
    });
  }

  onAddBlueprint(nameInput: HTMLInputElement) {
    this.blueprintCreated.emit({
      serverName: nameInput.value,
      serverContent: this.serverContentInput.nativeElement.value
    });
  }
```

### 12. @ViewChild() in Angular 8.html

In Angular 8, the @ViewChild() syntax which you'll see in the next lecture needs to be changed slightly:

Instead of:

```ts
@ViewChild('serverContentInput') serverContentInput: ElementRef;

```

use

```ts
@ViewChild('serverContentInput', {static: true}) serverContentInput: ElementRef;

```

The same change (add { static: true } as a second argument) needs to be applied to ALL usages of @ViewChild() (and also @ContentChild() which you'll learn about later) IF you plan on accessing the selected element inside of ngOnInit().

If you DON'T access the selected element in ngOnInit (but anywhere else in your component), set static: false instead!

This is a temporary adjustment which will NOT be required anymore once Angular 9 is released!

### 13. Getting Access to the Template & DOM with @ViewChild

```ts
@ViewChild('serverContentInput', { static: false }) serverContentInput: ElementRef;
```

True neu chúng ta sẽ sử dụng trong ngOnInit
Nên sử dụng string interpolation hay pro binding thay vì this.serverContentInput.nativeElement.value để gán giá trị output

### 14. Projecting Content into Components with ng-content

Khi muốn chuyển đoạn html bên dưới từ server-element ra ngoài

```html
<strong *ngIf="serverElement.type === 'server'" style="color: red"
  >{{ serverElement.content }}</strong
>
<em *ngIf="serverElement.type === 'blueprint'">{{ serverElement.content }}</em>
```

Thay bằng

```html
<ng-content></ng-content>
```

### 15. Understanding the Component Lifecycle

![img](../root/img/2019-11-19-01-54-30.png)

### 16. Seeing Lifecycle Hooks in Action

app.component.ts

```ts
onChangeFirst() {
    this.serverElements[0].name = 'Changed!';
  }
// O file server
console.log(changes);
In change have previous value
```

app.component.html

```html
<!--Add button-->
<button class="btn btn-primary" (click)="onChangeFirst()">
  Change first Element
</button>
<!--Add name-->
<button class="btn btn-danger" (click)="onDestroyFirst()">
  Destroy first Component
</button>
<app-server-element
  *ngFor="let serverElement of serverElements"
  [srvElement]="serverElement"
  [name]="serverElement.name"
></app-server-element>
```

Constructor được gọi đầu tiên => change => onInit => do Check => @AfterContentInit

### 17. Lifecycle Hooks and Template Access

server
Add #heading

```html
<div class="panel-heading" #heading>{{ name }}</div>
```

server

```ts
@ViewChild('heading', {static: true}) header: ElementRef;

  constructor() {
    console.log('constructor called!');
  }


  ngOnInit() {
    console.log('ngOnInit called!');
    // Add
    console.log('Text Content: ' + this.header.nativeElement.textContent);
  }


  ngAfterViewInit() {
    console.log('ngAfterViewInit called!');
    console.log('Text Content: ' + this.header.nativeElement.textContent);
  }
```

print value of Heading name

### 18. @ContentChild() in Angular 8.html

In Angular 8, the @ContentChild() syntax which you'll see in the next lecture needs to be changed slightly:

Instead of:

```ts
@ContentChild('contentParagraph') paragraph: ElementRef;
```

use

```ts
@ContentChild('contentParagraph', {static: true}) paragraph: ElementRef;

```

The same change (add { static: true } as a second argument) needs to be applied to ALL usages of @ContentChild() if you use the selected element inside of ngOnInit (as we do it in the lectures).

If you DON'T use the selected element in ngOnInit, set static: false instead.

### 19. Getting Access to ng-content with @ContentChild

Add contentParagraph
app.component.html

```html
<p #contentParagraph>
  <strong *ngIf="serverElement.type === 'server'" style="color: red"
    >{{ serverElement.content }}</strong
  >
  <em *ngIf="serverElement.type === 'blueprint'"
    >{{ serverElement.content }}</em
  >
</p>
```

server

```ts
  @ContentChild('contentParagraph', {static: true}) paragraph: ElementRef;

  ngOnInit() {
    console.log('ngOnInit called!');
    // Add
    console.log('Text Content: ' + this.header.nativeElement.textContent);
    console.log('Text Content of paragraph: ' + this.paragraph.nativeElement.textContent);
  }
```

Sau AfterContentInit

### 20. Wrap Up

### 21. Practicing Property & Event Binding and View Encapsulation.html

### 22. [OPTIONAL] Assignment Solution

## 6. Course Project - Components & Databinding

### 1. Introduction

### 2. Adding Navigation with Event Binding and ngIf

App shopping list and recipe hiển thị tùy loại khi bấm vào nav bar header
header.component.html bắt event click

```html
<ul class="nav navbar-nav">
  <li><a href="#" (click)="onSelect('recipe')">Recipes</a></li>
  <li><a href="#" (click)="onSelect('shopping-list')">Shopping List</a></li>
</ul>
```

header.component.ts

```ts
import { Component, EventEmitter, Output } from "@angular/core";

@Component({
  selector: "app-header",
  templateUrl: "./header.component.html"
})
export class HeaderComponent {
  @Output() featureSelected = new EventEmitter<string>();

  onSelect(feature: string) {
    this.featureSelected.emit(feature);
  }
}
```

app.component.html

```html
<app-header (featureSelected)="onNavigate($event)"></app-header>
<div class="container">
  <div class="row">
    <div class="col-md-12">
      <app-recipes *ngIf="loadedFeature === 'recipe'"></app-recipes>
      <app-shopping-list *ngIf="loadedFeature !== 'recipe'"></app-shopping-list>
    </div>
  </div>
</div>
```

app.component.ts

```ts
import { Component } from "@angular/core";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent {
  loadedFeature = "recipe";

  onNavigate(feature: string) {
    this.loadedFeature = feature;
  }
}
```

### 3. Passing Recipe Data with Property Binding

### 4. Passing Data with Event and Property Binding (Combined)

### 5. Make sure you have FormsModule added!.html

### 6. Allowing the User to Add Ingredients to the Shopping List

## 7. Directives Deep Dive

### 1. Module Introduction

### 10. What Happens behind the Scenes on Structural Directives

### 11. Building a Structural Directive

### 12. Understanding ngSwitch

### 2. ngFor and ngIf Recap

### 3. ngClass and ngStyle Recap

### 4. Creating a Basic Attribute Directive

### 5. Using the Renderer to build a Better Attribute Directive

### 6. More about the Renderer.html

### 7. Using HostListener to Listen to Host Events

### 8. Using HostBinding to Bind to Host Properties

### 9. Binding to Directive Properties

## 8. Course Project - Directives

### 1. Building and Using a Dropdown Directive

### 2. Closing the Dropdown From Anywhere.html

## 9. Using Services & Dependency Injection

### 1. Module Introduction

### 10. Practicing Services.html

### 11. [OPTIONAL] Assignment Solution

### 12. Services in Angular 6+.html

### 2. Why would you Need Services

### 3. Creating a Logging Service

### 4. Injecting the Logging Service into Components

### 5. Creating a Data Service

### 6. Understanding the Hierarchical Injector

### 7. How many Instances of Service Should It Be

### 8. Injecting Services into Services

### 9. Using Services for Cross-Component Communication

## 10. Course Project - Services & Dependency Injection

### 1. Introduction

### 2. Setting up the Services

### 3. Managing Recipes in a Recipe Service

### 4. Using a Service for Cross-Component Communication

### 5. Adding the Shopping List Service

### 6. Using Services for Pushing Data from A to B

### 7. Adding Ingredients to Recipes

### 8. Passing Ingredients from Recipes to the Shopping List (via a Service)

## 11. Changing Pages with Routing

### 1. Module Introduction

### 10. Passing Parameters to Routes

### 11. Fetching Route Parameters

### 12. Fetching Route Parameters Reactively

### 13. An Important Note about Route Observables

### 14. Passing Query Parameters and Fragments

### 15. Retrieving Query Parameters and Fragments

### 16. Practicing and some Common Gotchas

### 17. Setting up Child (Nested) Routes

### 18. Using Query Parameters - Practice

### 19. Configuring the Handling of Query Parameters

### 2. Why do we need a Router

### 20. Redirecting and Wildcard Routes

### 21. Important Redirection Path Matching.html

### 22. Outsourcing the Route Configuration

### 23. An Introduction to Guards

### 24. Protecting Routes with canActivate

### 25. Protecting Child (Nested) Routes with canActivateChild

### 26. Using a Fake Auth Service

### 27. Controlling Navigation with canDeactivate

### 28. Passing Static Data to a Route

### 29. Resolving Dynamic Data with the resolve Guard

### 3. Understanding the Example Project.html

### 30. Understanding Location Strategies

### 31. Wrap Up

### 4. Setting up and Loading Routes

### 5. Navigating with Router Links

### 6. Understanding Navigation Paths

### 7. Styling Active Router Links

### 8. Navigating Programmatically

### 9. Using Relative Paths in Programmatic Navigation

## 12. Course Project - Routing

### 1. Planning the General Structure

### 10. Styling Active Recipe Items

### 11. Adding Editing Routes

### 12. Retrieving Route Parameters

### 13. Programmatic Navigation to the Edit Page

### 14. One Note about Route Observables

### 15. Project Cleanup.html

### 2. Setting Up Routes

### 3. Adding Navigation to the App

### 4. Marking Active Routes

### 5. Fixing Page Reload Issues

### 6. Child Routes Challenge

### 7. Adding Child Routing Together

### 8. Configuring Route Parameters

### 9. Passing Dynamic Parameters to Links

## 13. Understanding Observables

### 1. Module Introduction

### 10. Useful Resources & Links.html

### 2. Analyzing Angular Observables

### 3. Getting Closer to the Core of Observables

### 4. Building a Custom Observable

### 5. Errors & Completion

### 6. Observables & You!

### 7. Understanding Operators

### 8. Subjects

### 9. Wrap Up

## 14. Course Project - Observables

### 1. Improving the Reactive Service with Observables (Subjects)

### 2. Changed the Subscription Name.html

## 15. Handling Forms in Angular Apps

### 1. Module Introduction

### 10. Built-in Validators & Using HTML5 Validation.html

### 11. TD Using the Form State

### 12. TD Outputting Validation Error Messages

### 13. TD Set Default Values with ngModel Property Binding

### 14. TD Using ngModel with Two-Way-Binding

### 15. TD Grouping Form Controls

### 16. TD Handling Radio Buttons

### 17. TD Setting and Patching Form Values

### 18. TD Using Form Data

### 19. TD Resetting Forms

### 2. Why do we Need Angular's Help

### 20. Practicing Template-Driven Forms.html

### 21. Introduction to the Reactive Approach

### 22. Reactive Setup

### 23. Reactive Creating a Form in Code

### 24. Reactive Syncing HTML and Form

### 25. Reactive Submitting the Form

### 26. Reactive Adding Validation

### 27. Reactive Getting Access to Controls

### 28. Reactive Grouping Controls

### 29. Reactive Arrays of Form Controls (FormArray)

### 3. Template-Driven (TD) vs Reactive Approach

### 30. Reactive Creating Custom Validators

### 31. Reactive Using Error Codes

### 32. Reactive Creating a Custom Async Validator

### 33. Reactive Reacting to Status or Value Changes

### 34. Reactive Setting and Patching Values

### 35. Practicing Reactive Forms.html

### 36. [OPTIONAL] Assignment Solution

### 4. An Example Form

### 5. TD Creating the Form and Registering the Controls

### 6. TD Submitting and Using the Form

### 7. TD Understanding Form State

### 8. TD Accessing the Form with @ViewChild

### 9. TD Adding Validation to check User Input

## 16. Course Project - Forms

### 1. Introduction

### 10. Creating the Template for the (Reactive) Recipe Edit Form

### 11. Creating the Form For Editing Recipes

### 12. Syncing HTML with the Form

### 13. Adding Ingredient Controls to a Form Array

### 14. Fixing a Bug.html

### 15. Adding new Ingredient Controls

### 16. Validating User Input

### 17. Submitting the Recipe Edit Form

### 18. Adding a Delete and Clear (Cancel) Functionality

### 19. Redirecting the User (after Deleting a Recipe)

### 2. TD Adding the Shopping List Form

### 20. Adding an Image Preview

### 21. Providing the Recipe Service Correctly

### 22. Deleting Ingredients and Some Finishing Touches

### 23. Deleting all Items in a FormArray.html

### 3. Adding Validation to the Form

### 4. Allowing the Selection of Items in the List

### 5. Loading the Shopping List Items into the Form

### 6. Updating existing Items

### 7. Resetting the Form

### 8. Allowing the the User to Clear (Cancel) the Form

### 9. Allowing the Deletion of Shopping List Items

## 17. Using Pipes to Transform Output

### 1. Introduction & Why Pipes are Useful

### 10. Understanding the async Pipe

### 11. Practicing Pipes.html

### 2. Using Pipes

### 3. Parametrizing Pipes

### 4. Where to learn more about Pipes

### 5. Chaining Multiple Pipes

### 6. Creating a Custom Pipe

### 7. Parametrizing a Custom Pipe

### 8. Example Creating a Filter Pipe

### 9. Pure and Impure Pipes (or How to fix the Filter Pipe)

## 18. Making Http Requests

### 1. A New IDE

### 10. Outputting Posts

### 11. Showing a Loading Indicator

### 12. Using a Service for Http Requests

### 13. Services & Components Working Together

### 14. Sending a DELETE Request

### 15. Handling Errors

### 16. Using Subjects for Error Handling

### 17. Using the catchError Operator

### 18. Error Handling & UX

### 19. Setting Headers

### 2. Module Introduction

### 20. Adding Query Params

### 21. Observing Different Types of Responses

### 22. Changing the Response Body Type

### 23. Introducing Interceptors

### 24. Manipulating Request Objects

### 25. Response Interceptors

### 26. Multiple Interceptors

### 27. Wrap Up

### 28. Useful Resources & Links.html

### 3. How Does Angular Interact With Backends

### 3.1 Securing JS Code.html

### 3.2 Building a REST API.html

### 4. The Anatomy of a Http Request

### 5. Backend (Firebase) Setup

### 6. Sending a POST Request

### 7. GETting Data

### 8. Using RxJS Operators to Transform Response Data

### 9. Using Types with the HttpClient

## 19. Course Project - Http

### 1. Module Introduction

### 2. Backend (Firebase) Setup

### 3. Setting Up the DataStorage Service

### 4. Storing Recipes

### 5. Fetching Recipes

### 6. Transforming Response Data

### 7. Resolving Data Before Loading

### 8. Fixing a Bug with the Resolver

## 20. Authentication & Route Protection in Angular

### 1. Module Introduction

### 10. Adding a Loading Spinner & Error Handling Logic

### 11. Improving Error Handling

### 12. Sending Login Requests

### 13. Login Error Handling

### 14. Creating & Storing the User Data

### 15. Reflecting the Auth State in the UI

### 16. Adding the Token to Outgoing Requests

### 17. Attaching the Token with an Interceptor

### 18. Adding Logout

### 19. Adding Auto-Login

### 2. How Authentication Works

### 20. Adding Auto-Logout

### 21. Adding an Auth Guard

### 22. Wrap Up

### 23. Useful Resources & Links.html

### 3. Adding the Auth Page

### 4. Switching Between Auth Modes

### 5. Handling Form Input

### 6. Preparing the Backend

### 7. Make sure you got Recipes in your backend!.html

### 8. Preparing the Signup Request

### 9. Sending the Signup Request

## 21. Dynamic Components

### 1. Module Introduction

### 10. Useful Resources & Links.html

### 2. Adding an Alert Modal Component

### 3. Understanding the Different Approaches

### 4. Using ngIf

### 5. Preparing Programmatic Creation

### 6. Creating a Component Programmatically

### 7. Understanding entryComponents

### 8. Data Binding & Event Binding

### 9. Wrap Up

## 22. Angular Modules & Optimizing Angular Apps

### 1. Module Introduction

### 10. Understanding the Core Module

### 11. Adding an Auth Feature Module

### 12. Understanding Lazy Loading

### 13. Implementing Lazy Loading

### 14. Alternative Lazy Loading Syntax.html

### 15. More Lazy Loading

### 16. Preloading Lazy-Loaded Code

### 17. Modules & Services

### 18. Loading Services Differently

### 19. Ahead-of-Time Compilation

### 2. What are Modules

### 20. Wrap Up

### 21. Useful Resources & Links.html

### 3. Analyzing the AppModule

### 4. Getting Started with Feature Modules

### 5. Splitting Modules Correctly

### 6. Adding Routes to Feature Modules

### 7. Component Declarations

### 8. The ShoppingList Feature Module

### 9. Understanding Shared Modules

## 23. Deploying an Angular App

### 1. Module Introduction

### 2. Deployment Preparation & Steps

### 3. Using Environment Variables

### 4. Deployment Example Firebase Hosting

### 5. Server Routing vs Browser Routing.html

## 24. Bonus Working with NgRx in our Project

### 1. Module Introduction

### 10. Multiple Actions

### 11. Preparing Update & Delete Actions

### 12. Updating & Deleting Ingredients

### 13. Expanding the State

### 14. Managing More State via NgRx

### 15. Removing Redundant Component State Management

### 16. First Summary & Clean Up

### 17. One Root State

### 18. Setting Up Auth Reducer & Actions

### 19. Dispatching Auth Actions

### 2. What is Application State

### 20. Auth Finished (For Now...)

### 21. And Important Note on Actions

### 22. Exploring NgRx Effects

### 23. Defining the First Effect

### 24. Effects & Error Handling

### 25. Login via NgRx Effects

### 26. Managing UI State in NgRx

### 27. Finishing the Login Effect

### 28. Preparing Other Auth Actions

### 29. Adding Signup

### 3. What is NgRx

### 30. Further Auth Effects

### 31. Adding Auto-Login with NgRx

### 32. Adding Auto-Logout

### 33. Finishing the Auth Effects

### 34. Using the Store Devtools

### 35. The Router Store

### 36. Getting Started with NgRx for Recipes

### 37. Fetching Recipe Detail Data

### 38. Fetching Recipes & Using the Resolver

### 39. Fixing the Auth Redirect

### 4. Getting Started with Reducers

### 40. Update, Delete and Add Recipes

### 41. Storing Recipes via Effects

### 42. Cleanup Work

### 43. Wrap Up

### 44. Useful Resources & Links.html

### 45. MUST READ The [LEGACY] Lectures.html

### 46. [LEGACY] Module Introduction

### 47. [LEGACY] Important Angular 6, RxJS 6 and this section!.html

### 48. [LEGACY] State Challenges

### 49. [LEGACY] Getting Started with Reducers

### 5. Adding Logic to the Reducer

### 50. [LEGACY] Adding Actions

### 51. [LEGACY] Finishing the First Reducer

### 52. [LEGACY] Registering the Application Store

### 53. [LEGACY] Selecting Data from State

### 54. [LEGACY] Dispatch Actions

### 55. [LEGACY] More Actions and Adding Ingredients

### 56. [LEGACY] Dispatching Update and Deleting Shopping List Actions

### 57. [LEGACY] Expanding App State

### 58. [LEGACY] Editing the Shopping-List via NgRx

### 59. [LEGACY] Managing all Relevant State

### 6. Understanding & Adding Actions

### 60. [LEGACY] Authentication and Side Effects - Introduction

### 61. [LEGACY] Setting up the Auth Store Files

### 62. [LEGACY] The Reducer

### 63. [LEGACY] Adding Reducer Logic & Actions

### 64. [LEGACY] Adjusting the App Module Setup

### 65. [LEGACY] Using Authentication

### 66. [LEGACY] Dispatch Actions

### 67. [LEGACY] Getting State Access in Http Interceptor

### 68. [LEGACY] Handling the Auth Token

### 69. [LEGACY] Only React to Actions Once via take(1)

### 7. Setting Up the NgRx Store

### 70. [LEGACY] A Closer Look at Effects

### 71. [LEGACY] Auth Effects and Actions

### 72. [LEGACY] Using NgRx Effects with NgRx = 7.html

### 73. [LEGACY] Effects - How they Work

### 74. [LEGACY] Adding Auth Signup

### 75. [LEGACY] Adding Auth Signin

### 76. [LEGACY] Navigation as a Side Effect

### 77. [LEGACY] Handling Logout via NgRx

### 78. [LEGACY] Additional Fixes

### 79. [LEGACY] Redirecting Upon Logout

### 8. Selecting State

### 80. [LEGACY] What's Next

### 81. [LEGACY] The Router Store Package

### 82. [LEGACY] Store Devtools

### 83. [LEGACY] Lazy Load and Dynamic Injection

### 84. [LEGACY] Adding Recipe Actions

### 85. [LEGACY] Adding Recipe Reducers

### 86. [LEGACY] Dispatching and Selecting State

### 87. [LEGACY] Viewing and Deleting Recipes via NgRx

### 88. [LEGACY] Editing and Updating Recipes via NgRx

### 89. [LEGACY] Recipes Side Effects - Fetching from Server

### 9. Dispatching Actions

### 90. [LEGACY] Recipes Side Effects - Storing Recipes on Server

### 91. [LEGACY] Cleaning Up

### 92. [LEGACY] Updating to RxJS 6+

### 93. [LEGACY] Wrap Up

### 94. [LEGACY] Useful Resources & Links.html

## 25. Bonus Angular Universal

### 1. Module Introduction

### 2. Important Official Docs & Starting Project.html

### 3. Getting Started with Angular Universal

### 4. Working on the App Module

### 5. Adding a Server-Side Build Workflow

### 6. Adding a NodeJS Server

### 7. Pre-Rendering the App on the Server

### 8. Next Steps

### 9. Angular Universal Gotchas.html

## 26. Angular Animations

### 1. Making Animations Work with Angular 4+.html

### 10. Using Keyframes for Animations

### 11. Grouping Transitions

### 12. Using Animation Callbacks

### 2. Introduction

### 3. Setting up the Starting Project

### 4. Animations Triggers and State

### 5. Switching between States

### 6. Transitions

### 7. Advanced Transitions

### 8. Transition Phases

### 9. The void State

## 27. Adding Offline Capabilities with Service Workers

### 1. Module Introduction

### 2. Adding Service Workers

### 3. Caching Assets for Offline Use

### 4. Caching Dynamic Assets & URLs

### 5. Further Links & Resources.html

## 28. A Basic Introduction to Unit Testing in Angular Apps

### 1. About this Section.html

### 10. Isolated vs Non-Isolated Tests

### 11. Further Resources & Where to Go Next.html

### 2. Introduction

### 3. Why Unit Tests

### 4. Analyzing the Testing Setup (as created by the CLI)

### 5. Running Tests (with the CLI)

### 6. Adding a Component and some fitting Tests

### 7. Testing Dependencies Components and Services

### 8. Simulating Async Tasks

### 9. Using fakeAsync and tick

## 29. Angular Changes & New Features

### 1. What's New with Angular 8

### 2. What's New & How to Update.html

## 30. Course Roundup

### 1. Course Roundup

### 2. Bonus More Content!.html

## 31. Custom Project & Workflow Setup

### 1. Introduction

### 10. Finishing & Using the Development Workflow

### 11. Setting up a Production Workflow

### 12. Adding Types & Fixing Bugs

### 13. Finishing Touches

### 2. Initializing the Project

### 3. Setting up the Basic Project Files

### 4. Installing the Core Dependencies

### 5. Filling the Project Files with Some Life

### 6. index.html & Polyfills

### 6. index.html & Polyfills.vtt

### 7. Installing Development Dependencies

### 8. Setting up a Development Workflow

### 9. Updating to Angular 6 + Webpack 4.html

## 32. Bonus TypeScript Introduction (for Angular 2 Usage)

### 1. Introduction

### 2. Using Types

### 3. Classes

### 4. Interfaces

### 5. Generics

### 6. Wrap up & Modules

### 7. Deep dive into TypeScript.html

Angular nghiep
https://www.youtube.com/watch?v=H6IjqFs6Q9o&list=PLJ5qtRQovuENHYHqlQP5XT7zwbCA5Q5He
