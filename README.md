# java-spring-sbermarket

## Overview

**java-spring-sbermarket** — это демонстрационный проект на Java Spring Boot, моделирующий упрощённый вариант интернет-магазина (SberMarket). В нём реализованы основные сущности и функциональность для работы с корзиной, избранными товарами, заказами, скидками, методами оплаты и пользователями.

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
3. [Контроллеры и доступные эндпоинты](#контроллеры-и-доступные-эндпоинты)
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
