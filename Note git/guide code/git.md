https://viblo.asia/p/hoc-ve-git-trong-30-phut-phan-i-WAyK8RRolxX
$ git config --global user.name "Tuyen B"
$ git config --global user.email tuyenbl@example.com

Trong trường hợp này, chúng ta chỉ có một tệp vì vậy hãy thêm:

\$ git add hello.txt
Nếu bạn muốn thêm tất cả trong thư mục , bạn có thể dùng :

\$ git add -A
Kiểm tra trạng thái lần nữa trước khí commit

\$ git status

git checkout br : switch

git remote show origin : show URL

để thay đổi url thì thực thi command như bên dưới.
git remote set-url origin http://192.168.1.211/gitlab/[group_name]/[repository_uri]

---

https://git-scm.com/book/en/v2/Git-Basics-Viewing-the-Commit-History

```ts

$ git config --global user.name "Tuyen B"
$ git config --global user.email tuyenbl@example.com

$ git log --pretty=format:"%h - %an, %ar : %s"
ca82a6d - Scott Chacon, 6 years ago : changed the version number
085bb3b - Scott Chacon, 6 years ago : removed unnecessary test
a11bef0 - Scott Chacon, 6 years ago : first commit

q = exit
```

https://www.studytonight.com/cpp/basics-of-cpp.php
https://docs.microsoft.com/en-us/cpp/cpp/constexpr-cpp?view=vs-2019
constexpr variables
The primary difference between const and constexpr variables is that the initialization of a const variable can be deferred until run time. A constexpr variable must be initialized at compile time. All constexpr variables are const.

https://github.com/youtalk/raspimouse2/blob/0fe807b3bb18058a1bbab2563936b996702ee56e/raspimouse/src/raspimouse_component.cpp

https://github.com/RoverRobotics/openrover-ros2/blob/master/openrover_core/src/rover.cpp

The primary difference between const and constexpr variables is that the initialization of a const variable can be deferred until run time. A constexpr variable must be initialized at compile time. All constexpr variables are const.

the auto keyword declares a variable in the automatic storage class

---

revert:
https://www.norbauer.com/rails-consulting/notes/git-revert-reset-a-single-file

https://cuuduongthancong.com/subject/toan-roi-rac
https://www.tutorialandexample.com/react-jsx/

### Removing the last commit

To remove the last commit from git, you can simply run `git reset --hard HEAD^` If you are removing multiple commits from the top, you can run `git reset --hard HEAD~2` to remove the last two commits. You can increase the number to remove even more commits.

If you want to "uncommit" the commits, but keep the changes around for reworking, remove the "--hard": git reset HEAD^ which will evict the commits from the branch and from the index, but leave the working tree around.

If you want to save the commits on a new branch name, then run git branch newbranchname before doing the git reset.

### Command after use git add

```ts
git reset HEAD filename
git checkout filename

```

https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-introduction
https://www.geeksforgeeks.org/clone-method-in-java-2/
https://techmaster.vn/posts/34068/co-che-cua-hashmap
https://www.tutorialandexample.com/reactjs-tutorial/
https://www.programiz.com/python-programming/variables-constants-literals
