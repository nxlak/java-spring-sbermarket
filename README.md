# java-spring-sbermarket

## Overview

**java-spring-sbermarket** — это проект на Java Spring Boot, моделирующий упрощённый вариант интернет-магазина (SberMarket). В нём реализованы основные сущности и функциональность для работы с корзиной, избранными товарами, заказами, скидками, методами оплаты и пользователями.

Код содержит следующие основные части:

- **DTO (Data Transfer Objects)**: классы для передачи данных между слоями приложения (пример — `UserRequestDTO`, `UserResponseDTO`).
- **Контроллеры**: REST-эндпоинты, через которые осуществляется взаимодействие с клиентом.
- **Сущности (Entities)**: классы, отражающие таблицы в базе данных (например, `User`, `Product`, `Order`, `Discount`).
- **Репозитории (Repositories)**: интерфейсы, позволяющие работать с базой данных с помощью Spring Data JPA.
- **Сервисы (Services)**: бизнес-логика, связывающая контроллеры и репозитории.
- **Исключения**: классы для обработки ошибок (например, `UserNotFoundException`).

---

## Содержание

1. [Структура проекта](#структура-проекта)
2. [Основные сущности](#основные-сущности)
3. [Контроллеры](#контроллеры)
4. [Сервисы](#сервисы)
5. [Исключения](#исключения)
6. [Сборка и запуск](#сборка-и-запуск)
7. [Примеры запросов](#примеры-запросов)

---

## Структура проекта

Упрощённая структура пакетов выглядит так:

```bash
.
├── com/java/sbermarket
│   ├── controller
│   │   ├── dto
│   │   ├── CartController.java
│   │   ├── DiscountController.java
│   │   ├── FavouritesController.java
│   │   ├── OrderController.java
│   │   ├── ProductController.java
│   │   └── UserController.java
│   ├── entity
│   │   ├── Cart.java
│   │   ├── CartItem.java
│   │   ├── Discount.java
│   │   ├── Favourites.java
│   │   ├── Order.java
│   │   ├── OrderItem.java
│   │   ├── PayMethod.java
│   │   ├── Product.java
│   │   └── User.java
│   ├── exceptions
│   │   ├── PayMethodNotFoundException.java
│   │   └── UserNotFoundException.java
│   ├── repository
│   │   ├── CartRepository.java
│   │   ├── DiscountRepository.java
│   │   ├── FavouritesRepository.java
│   │   ├── OrderRepository.java
│   │   ├── ProductRepository.java
│   │   └── UserRepository.java
│   └── service
│       ├── CartService.java
│       ├── DiscountService.java
│       ├── FavouritesService.java
│       ├── OrderService.java
│       ├── ProductService.java
│       └── UserService.java
└── ...
```

Основные пакеты:
- **controller**: содержит классы, отвечающие за обработку HTTP-запросов (REST API).
- **controllerdto**: классы DTO для приёма/отправки данных пользователю.
- **entity**: классы-сущности, которые маппятся на таблицы в базе данных.
- **exceptions**: пользовательские классы исключений.
- **repository**: интерфейсы Spring Data JPA, взаимодействующие с БД.
- **service**: бизнес-логика, управление данными, вызовы репозиториев.

## Основные сущности

- **User**
- **Cart**
- **Favourites**
- **Order**
- **PayMethod**
- **Discount**
- **Product**

## Контроллеры

### UserController
- **GET** /users/{userId} — получение пользователя по userId.
- **POST** /users — создание нового пользователя.

### CartController
- **GET** /cart/{cartId} — получить корзину по cartId.
- **POST** /cart/{cartId}/product/{productId} — добавить товар в корзину.
- **DELETE** /cart/{cartId}/product/{productId} — удалить товар из корзины.

### FavouritesController
- **GET** /favourites/{id} — получить избранное по id.
- **POST** /favourites/{id}/product/{productId} — добавить товар в избранное.
- **DELETE** /favourites/{id}/product/{productId} — удалить товар из избранного.

### OrderController
- **POST** /users/{userId}/orders — добавить заказ пользователю.
- **GET** /orders/{orderId} — получить заказ по orderId.

### DiscountController
- **GET** /discount/{discountId} — получить скидку по discountId.
- **POST** /discount — создать новую скидку.
- **DELETE** /discount/{discountId} — удалить скидку.

### ProductController
- **GET** /product/{productId} — получить товар по productId.
- **POST** /product — сохранить новый товар.

## Сервисы
- **CartService**: Логика работы с корзиной: добавление/удаление товаров, поиск корзины в БД и пр.

- **DiscountService**: Логика для создания, получения, удаления скидок.

- **FavouritesService**: Управление списком избранных товаров.

- **OrderService**: Создание заказа, поиск заказа по ID.

- **ProductService**: Сохранение и поиск товаров.

- **UserService**: Регистрация/сохранение пользователей, поиск пользователя.

Каждый сервис использует соответствующий Repository для операций с базой данных.

## Исключения
- **UserNotFoundException**: выбрасывается, если пользователь не найден.
- **PayMethodNotFoundException**: выбрасывается, если платёжный метод не найден (присутствует как пример кастомного исключения, но в текущем коде может не использоваться повсеместно).
- **EntityNotFoundException** (из JPA): выбрасывается при работе с другими сущностями, если не найдены в репозитории.

## Сборка и запуск
### Предварительные требования
1. Java 11+ (JDK)
2. Maven (3.6+)

### Шаги для запуска
1. Склонируйте репозиторий или скачайте архив с проектом.
2. Перейдите в корень проекта:
```bash
cd java-spring-sbermarket
```
3. Соберите проект Maven'ом:
```bash
mvn clean
mvn package
```
4. Запустите Spring Boot приложение:
```bash
mvn spring-boot:run
```
5. Приложение стартует по умолчанию на порту 8080. Проверьте доступность в браузере/через Postman:
```bash
http://localhost:8080
```
Примечание: при необходимости настройки, такие как порт приложения, можно изменить в src/main/resources/application.properties.

## Примеры запросов 

Ниже несколько примеров HTTP-запросов к эндпоинтам (можно использовать cURL или Postman).

- **Создать пользователя**
```bash
POST /users
Content-Type: application/json

{
  "login": "john_doe",
  "password": "1234",
  "mail": "john@example.com",
  "phone": "+1-202-555-0147",
  "address": "Some Street",
  "pay_methods": [],
  "cart": {
    "cartItems": []
  },
  "favourites": {
    "products": []
  },
  "orders": []
}
```

- **Получить пользователя**
```bash
GET /users/1
```

- **Создать заказ**
```bash
POST /users/1/orders
Content-Type: application/json

{
  "orderItems": [
    {
      "productId": 101,
      "amount": 2
    }
  ]
}
```

При успешном выполнении запросов сервер вернёт соответствующие JSON-ответы или статусные коды.
