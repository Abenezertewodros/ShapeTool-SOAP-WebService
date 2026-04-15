# ShapeArea SOAP Web Service

A **Spring Boot + Spring Web Services (Spring-WS)** project that provides a SOAP-based web service to calculate the area of various geometric shapes.

## ✨ Features

- Contract-First SOAP Web Service
- Calculates area for 5 geometric shapes:
  - Circle
  - Square
  - Rectangle
  - Parallelogram
  - Triangle
- Input validation using custom XSD schema (`PositiveDouble`)
- Automatic SOAP Fault handling for invalid requests
- Proper namespace and document/literal style

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Web Services (Spring-WS)
- SOAP 1.1
- Maven
- XSD Schema

## 📋 Service Operations

| Operation                    | Description                          | Input Parameter(s)       |
|-----------------------------|--------------------------------------|--------------------------|
| `CalculateCircleArea`       | Area = π × r²                       | radius                   |
| `CalculateSquareArea`       | Area = side²                        | side                     |
| `CalculateRectangleArea`    | Area = length × width               | length, width            |
| `CalculateParallelogramArea`| Area = base × height                | base, height             |
| `CalculateTriangleArea`     | Area = 0.5 × base × height          | base, height             |

## 🔗 WSDL URL: http://localhost:8080/Shapearea/Shapearea.wsdl

**Live WSDL (when application is running):**
