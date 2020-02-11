stop port
netstat -ano|findstr "PID :8081"

https://community.talend.com/t5/Architecture-Best-Practices-and/How-to-find-and-kill-a-process-running-on-a-port/ta-p/55315

Linux
Để biết cách dùng chmod cho đúng, các bạn có thể dùng Chmod Calculator nhé
https://chmod-calculator.com/
==========================================
Tài khoản lưu trữ giá rẻ, Key giá rẻ, Thẻ VISA Prepaid: bit.ly/ltvnshop2

Câu hỏi interview]

Nay mình có đi phỏng vấn tại một công ty - xin phép đc giấu tên - và đc hỏi một số câu hỏi khá cụ thể và cũng rất bao quát về react native, Redux.. Nên muốn chia sẻ cho ae cùng thảo luận xem đáp án thật chuẩn và cũng có thêm kinh nghiệm khi tham gia phỏng vấn mảng React Native

1. React Native hoạt động như thế nào?

=> Câu trả lời của mình:

- Trong một ứng dụng viết bằng React Native sẽ có 2 thread quan trọng nhất là:

* Main thread
* JS thread - thread mà JVM sẽ chạy js code

- Bản chất react native js code sẽ không đc convert sang native code dưới bất kì hình thức nào.
- JS code sẽ đc chạy trên JVM và call các native api để addView, removeView, updateView ..., và các Logic khác

- react native code là Declerative nhưng khi layout thì nó laị call các native api theo dạng imprerative
- JS Thread và Mainthread giao tiếp vs nhau qua các bridge

=> Người phỏng vấn bảo: Code React Native sẽ đc chuyển 1 phần sang native code - native view tại complitime và run time chỉ update view + logic thôi
=> mình không đồng ý về vấn đề đó

2. Redux là gì: Là 1 thư viện dùng để quản lí State của app.
   Imutable data và chỉ thay đổi tuỳ vào việc xử lí action và reducer

3. Thunk - Saga
   Giông nhau: Middle ware của Redux, thường để dùng để handle side efect action.

Khác:

- Thunk convert Thunk action => Pure Action + side effect.
- Saga Quan sát các pure action đc dispatch vào store rồi mới thực hiện side effect và put các Pure action vào store.
- Saga sử dụng generator function.

4. Câu hỏi về App structure: Tổ chức file trong project.
5. Memory leak...

...

Các bạn có thấy không đồng ý thì comment bên dưới nha.

Ai có câu hỏi khác cũng cmt để mn cùng có hêm nhiều kĩ năng phỏng vấn

https://viblo.asia/p/
10-linux-commands-ma-bat-ki-lap-trinh-vien-nao-cung-can-biet-4dbZN18mKYM?fbclid=IwAR17vily6ZifYwKz6vUyzmFzN3LoXTras6JBZAp-7-UZEJSGsaP_VyWE4S8
