# ForoHub System
ForoHub es una plataforma desarrollada con Spring Boot, enfocada en la creación, gestión y participación en foros educativos. El proyecto proporciona un sistema seguro y eficiente para manejar usuarios, temas, cursos y respuestas, garantizando una experiencia interactiva y organizada.

---
## **Tabla de Contenidos**
1. [Características](#características)
2. [Arquitectura del Sistema](#arquitectura-del-sistema)
3. [Tecnologías Utilizadas](#tecnologías-utilizadas)
4. [Configuración e Instalación](#configuración-e-instalación)
5. [Endpoints Principales](#endpoints-principales)
6. [Contribución](#contribución)

---
## **Características**
- **Gestión de Usuarios**: Implementación de autenticación y autorización utilizando JWT.
- **Gestión de Foros**: Funcionalidad para crear y visualizar temas y respuestas.
- **Gestión de Cursos**: Vinculación de cursos con temas y categorías.
- **Documentación de la API**: Documentación automática generada con Swagger.
- **Seguridad**: Uso de Spring Security para la implementación de roles y permisos.

---
## **Arquitectura del Sistema**
La estructura del proyecto está basada en una arquitectura en capas:
- **Capa API**: Incluye los controladores REST y configuraciones de seguridad.
- **Capa de Dominio**: Define las entidades, repositorios y DTOs.
- **Capa de Infraestructura**: Se encarga de la configuración de la base de datos, gestión de errores y la documentación de la API.
![Diagrama de Arquitectura](path/to/architecture-diagram.png)

---
## **Tecnologías Utilizadas**
- **Lenguaje**: Java 17
- **Framework Principal**: Spring Boot
- **Seguridad**: Spring Security, JWT
- **Acceso a Datos**: Spring Data JPA, Hibernate
- **Base de Datos**: MySQL
- **Documentación**: SpringDoc OpenAPI (Swagger)

---
## **Configuración e Instalación**
### **Requisitos Previos**
- JDK 17
- Maven 3.8+
- MySQL 8.0+
