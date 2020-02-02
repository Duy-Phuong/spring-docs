dùng this.router.navigateByUrl để redirect
html SD:
<a [routerLink]="['/login']"
https://jasonwatmore.com/post/2018/05/10/angular-6-reactive-forms-validation-example
https://viblo.asia/p/rxjs-voi-angular-subscribe-va-unsubscribe-observable-Do754kQ0lM6

@ViewChild('username', { static: false }) username: ElementRef;
=> get value: this.username.nativeElement.value

get value
this.reactiveForm.get('name');

===============================
https://code.tutsplus.com/vi/tutorials/lets-go-golang-code-organization--cms-27368
Install
Nếu bạn cài đặt Go vào thư mục mặc định là C:\Go thì bạn cần cấu hình như sau:
user
Tạo một biến mới tên là GOROOT với giá trị là C:\Go
GOPATH D:\Project\mob-smart-agent-backend1
sys
Chọn biến PATH có sẵn, thêm vào sau dấu chấm phẩy ; cuối dòng đường dẫn sau: C:\Go\bin;

GOPATH: %USERPROFILE%\go

check
go version
go run hello.go
set GOPATH=
go env
dir
md
Run to Cursor Alt+F9
http://nguyenvantien2009.com/debug-de-go-loi-trong-java/

Con trỏ:https://www.tutorialspoint.com/go/go_pointers.htm

tai
go get github.com/graphql-go/handler
[info]
https://godoc.org/gopkg.in/go-playground/validator.v9
https://godoc.org/gopkg.in/bluesuncorp/validator.v5
https://godoc.org/labix.org/v2/mgo/bson
https://developpaper.com/basic-use-tutorial-of-mongodb-bson/
https://www.thepolyglotdeveloper.com/2018/05/getting-started-graphql-golang/
https://godoc.org/github.com/graphql-go/graphql
https://zupzup.org/go-example-graphql/
https://backlog.com/git-tutorial/vn/stepup/stepup2_1.html
https://tutorialedge.net/golang/go-graphql-beginners-tutorial/
https://hackmongo.com/post/three-golang-error-types/

---

https://kipalog.com/search?q=graphql-go
https://kipalog.com/posts/Single-endpoint-cung-GraphQL--Backend-Go
điều kiện search: https://docs.mongodb.com/manual/reference/operator/query/
https://blog.couchbase.com/using-graphql-with-golang-and-a-nosql-database/
gopkg.in/mgo.v2

[/info]

PS D:\Project\mob-smart-agent-backend1> go get github.com/beevik/guid
PS D:\Project\mob-smart-agent-backend1> go get github.com/dgrijalva/jwt-go
PS D:\Project\mob-smart-agent-backend1> go get github.com/gin-gonic/gin
PS D:\Project\mob-smart-agent-backend1> go get github.com/graphql-go/graphql
PS D:\Project\mob-smart-agent-backend1> go get github.com/graphql-go/graphql/language/ast
PS D:\Project\mob-smart-agent-backend1> go get github.com/graphql-go/handler
PS D:\Project\mob-smart-agent-backend1> go get github.com/itsjamie/gin-cors
PS D:\Project\mob-smart-agent-backend1> go get gopkg.in/go-playground/validator.v9
PS D:\Project\mob-smart-agent-backend1> go get gopkg.in/mgo.v2
PS D:\Project\mob-smart-agent-backend1> go get gopkg.in/mgo.v2/bson
PS D:\Project\mob-smart-agent-backend1> go get gopkg.in/yaml.v2

## test

List mutation
https://drive.google.com/drive/u/0/folders/12z6diAJXPxn1s0SahdyEA4WnWjHODzwx

Define Output Type => tao obj
var GetListChannelType = graphql.NewObject(graphql.ObjectConfig{
Voi obj moi thi tao trong model*graph...
Voi date:
"created_at": &graphql.Field{
Type: graphql.String,
Resolve: func(p graphql.ResolveParams) (interface{}, error) {
/\_Format StartTime to custom Format*/
a := p.Source.(model.Channel)
return a.CreatedAt.Format(commonStruct.FormatDateTime),nil
},
},

Doi voi create thi co object moi thi khai bao:
var GoogleType = graphql.NewInputObject
/_Define Input Query_/
var GetListChannelQuery = graphql.Field{

/_Resolve to get Data_/
Resolve: func(p graphql.ResolveParams) (result interface{}, err error) {
/_Validation Params
define a model in model/channel.go(include validate)_/
query := model.ListChannelsQuery{}

    	// validate input params with model
    	var check = commonStruct.ValidateStruct(p.Args, &query)

/_Get Result From Database _/
var dataResult = resource.NewResourceChannel().List

schema define input "getListChannel": &channel.GetListChannelQuery,

Model
Doi voi id
Id bson.ObjectId `json:"id,omitempty" bson:"_id,omitempty" // cho phep bo qua Url WebsiteURL string`json:"website_URL" bson:"website_URL" validate:"required,max=1024,url"`Object Google`json:"google" bson:"google"`

==================================

user.Id = bson.ObjectIdHex("5d7369fc90c5d5364cd1863c")

============================================================================
mutation {
updateAccountUser(token: "011cfbd0-6841-40ba-8cdd-d4b00bf51470") {
code
msg
}
}
=====================================Log in=======================================
{
login(username:"phuongtd",password:"12345678",captcha:""){
token
msg
code
name
}
}
