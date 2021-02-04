# ManageBooks
![License](https://img.shields.io/badge/license-Apache--2.0-blue.svg)
### 简介
### 使用技术
后端 | ... 
:---:|:---
核心框架 | spring、springboot、mybatis
连接池 | Alibaba Druid

前端 | ... 
:---:|:---
核心框架(轻量简洁) | BootStrap、Thymeleaf

界面入口:  localhost:8080<br>
管理员用户名: admin_czc 密码: 123456 (manager表)<br>
普通用户名: czc_reader 密码: 123456 (reader表)<br>

### 目录结构
```
.
├── ManageBooks.iml
├── mvnw
├── mvnw.cmd
├── pom.xml
├── readme.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── cn
│   │   │       └── lightina
│   │   │           └── managebooks
│   │   │               ├── enumeration (异常枚举类)
│   │   │               ├── exception (自定义异常)
│   │   │               ├── ManageBooksApplication.java
│   │   │               ├── config
│   │   │               │   └── WebConfig.java
│   │   │               ├── controller
│   │   │               │   ├── LoginController.java (登陆)
│   │   │               │   ├── ReaderController.java 
│   │   │               │   └── emailController.java (邮件)
│   │   │               ├── dao
│   │   │               │   ├── BookMapper.java
│   │   │               │   ├── MailMapper.java
│   │   │               │   └── UserMapper.java
│   │   │               ├── pojo
│   │   │               │   ├── Book.java
│   │   │               │   ├── BookList.java
│   │   │               │   ├── Borrow.java
│   │   │               │   ├── BorrowDetail.java
│   │   │               │   ├── MailDetail.java
│   │   │               │   ├── ProcessResult.java 
│   │   │               │   ├── Reservation.java
│   │   │               │   ├── ReservationDetail.java
│   │   │               │   ├── ReservationResult.java
│   │   │               │   └── User.java
│   │   │               └── service
│   │   │                   ├── BookService.java (预约和借阅等)
│   │   │                   ├── BookServiceimpl.java
│   │   │                   ├── MailService.java (邮箱)
│   │   │                   ├── MailServiceimpl.java
│   │   │                   ├── UserService.java (登陆)
│   │   │                   └── UserServiceimpl.java
│   │   └── resources
│   │       ├── Mapper
│   │       │   ├── book.xml
│   │       │   ├── mail.xml
│   │       │   └── user.xml
│   │       ├── application.yml
│   │       ├── static
│   │       │   ├── common
│   │       │   │   └── headbar.html (导航栏)
│   │       │   └── lib
│   │       │       ├── css
│   │       │       ├── images
│   │       │       └── js
│   │       └── templates
│   │           ├── admin_addbook.html
│   │           ├── admin_borrow.html
│   │           ├── admin_processreservation.html
│   │           ├── detail_admin.html (管理员导航栏模版)
│   │           ├── detail_user.html (用户导航栏模版)
│   │           ├── login.html (登陆主界面)
│   │           ├── user_booklist.html
│   │           ├── user_borrow.html
│   │           └── user_reservation.html
```
