# Academic Management System & Web Explorer
Full-stack web application developed with a decoupled Client-Server architecture utilizing Spring Boot (Java 17), PostgreSQL, and a multi-view Vanilla JavaScript frontend.

### 1. Project Description
A full-stack academic management and data exploration platform developed with a decoupled Client-Server architecture:

* **Page 1 (Student CRUD):** Full Create, Read, Update, and Delete operations using asynchronous `fetch` calls, real-time live search, and read-only inspection modals.
* **Page 2 (API Explorer):** Asynchronous student consumer featuring a 4.5-second countdown timer before revealing the search bar, gender-based Rick and Morty character avatars, and a single-record detail view with Back navigation.
* **Page 3 (Responsive Showcase):** Interactive device resolution switcher (Desktop 1200px, Laptop 1024px, Tablet 768px, and Mobile 380px) with live pixel metrics and fluid CSS Grid layout.
* **Page 4 (AI Auditor Agent):** UI/UX evaluation agent powered by Google Gemini 1.5 Flash providing heuristic reviews on accessibility, visual hierarchy, and architecture.

### 2. Technologies Used

| Layer | Technology | Details |
| :--- | :--- | :--- |
| **Backend** | Java / Spring Boot | Java 17, Spring Boot 3.2.2 |
| **Persistence** | Spring Data JPA / Hibernate | Automatic ORM mapping |
| **Database** | PostgreSQL | PostgreSQL 17 (pgAdmin 4) |
| **Web Server** | Apache Tomcat | Embedded container (Port 8080) |
| **Frontend** | HTML5, CSS3, JavaScript | Vanilla JS (ES6+), CSS Grid, Flexbox |
| **External APIs** | Rick & Morty API / Gemini API | Character avatars and Gemini 1.5 Flash model |

### 3. Key Functional Features
* **Relational Persistence:** Permanent storage backed by PostgreSQL.
* **Asynchronous Data Exchange:** Pure JSON communication via HTTP methods (`GET`, `POST`, `PUT`, `DELETE`) with zero page reloads.
* **CORS Enabled:** `@CrossOrigin(origins = "*")` configured for seamless client communication.
* **Real-Time Client Filtering:** Fast in-memory search across student names, IDs, and email addresses.
* **Circular Reference Protection:** `@JsonIgnore` annotations applied to JPA relations for clean JSON serialization.

### 4. Prerequisites
* **Java Development Kit (JDK):** Version 17 or higher.
* **PostgreSQL:** Version 14 or higher running on default port `5432`.
* **Recommended IDE:** Apache NetBeans 19+, IntelliJ IDEA, or VS Code.
* **Web Browser:** Google Chrome, Brave, Microsoft Edge, or Mozilla Firefox.

### 5. Local Endpoints & URLs

| View / Service | Local URL | Scope & Purpose |
| :--- | :--- | :--- |
| **Page 1** | `http://localhost:8080/crud.html` | Student CRUD management with live search and modal dialogs. |
| **Page 2** | `http://localhost:8080/pagina2.html` | Student explorer with avatars, 4.5s delay, and detail view. |
| **Page 3** | `http://localhost:8080/pagina3.html` | Interactive responsive device simulator (Desktop to Mobile). |
| **Page 4** | `http://localhost:8080/pagina4.html` | Heuristic UI/UX AI evaluation agent (Gemini 1.5 Flash). |
| **REST API** | `http://localhost:8080/api/estudiantes` | Base REST endpoint for student entities. |


# Sistema de Gestión Académica y Explorador Web
Aplicación web integral desarrollada bajo una arquitectura desacoplada Cliente-Servidor mediante Spring Boot (Java 17), PostgreSQL y una interfaz progresiva en Vanilla JavaScript.

### 1. Descripción del Proyecto
Plataforma académica y de exploración interactiva construida con arquitectura desacoplada Cliente-Servidor:

* **Página 1 (CRUD Estudiantes):** Operaciones completas de creación, lectura, actualización y eliminación mediante peticiones asíncronas con `fetch`, filtrado en tiempo real y ventana modal de solo lectura.
* **Página 2 (Explorador con API):** Consumo asíncrono con temporizador de 4.5 segundos antes de mostrar el buscador, asignación de avatares de Rick and Morty según el género del estudiante y vista detallada con botón de retorno (*Back*).
* **Página 3 (Diseños Responsivos):** Conmutador interactivo de resoluciones (Escritorio 1200px, Portátil 1024px, Tableta 768px y Móvil 380px) con métricas de píxeles en tiempo real y maquetación fluida con CSS Grid.
* **Página 4 (Agente Auditor de IA):** Agente de evaluación heurística de interfaces impulsado por Google Gemini 1.5 Flash para auditorías de accesibilidad, jerarquía visual y arquitectura web.

### 2. Tecnologías Utilizadas

| Capa | Tecnología | Detalles |
| :--- | :--- | :--- |
| **Backend** | Java / Spring Boot | Java 17, Spring Boot 3.2.2 |
| **Persistencia** | Spring Data JPA / Hibernate | Mapeo objeto-relacional automático |
| **Base de Datos** | PostgreSQL | PostgreSQL 17 (pgAdmin 4) |
| **Servidor Web** | Apache Tomcat | Servidor embebido (Puerto 8080) |
| **Frontend** | HTML5, CSS3, JavaScript | Vanilla JS (ES6+), CSS Grid, Flexbox |
| **APIs Externas** | API Rick & Morty / API Gemini | Avatares de personajes y modelo Gemini 1.5 Flash |

### 3. Funcionalidades Principales
* **Persistencia relacional:** Almacenamiento permanente en base de datos PostgreSQL.
* **Intercambio asíncrono de datos:** Comunicación basada en JSON mediante verbos HTTP (`GET`, `POST`, `PUT`, `DELETE`) sin recarga de pantalla.
* **Habilitación de CORS:** Anotación `@CrossOrigin(origins = "*")` configurada para permitir el consumo flexible entre capas.
* **Filtrado en tiempo real:** Búsqueda instantánea en memoria por nombre, cédula y correo electrónico.
* **Protección contra referencias circulares:** Implementación de `@JsonIgnore` en las relaciones JPA para una serialización JSON limpia.

### 4. Requisitos Previos
* **Java Development Kit (JDK):** Versión 17 o superior.
* **PostgreSQL:** Versión 14 o superior ejecutándose en el puerto predeterminado `5432`.
* **IDE recomendado:** Apache NetBeans 19+, IntelliJ IDEA o VS Code.
* **Navegador web:** Google Chrome, Brave, Microsoft Edge o Mozilla Firefox.

### 5. URLs Locales del Proyecto

| Vista / Servicio | URL Local | Alcance y Propósito |
| :--- | :--- | :--- |
| **Página 1** | `http://localhost:8080/crud.html` | CRUD de estudiantes con buscador en tiempo real y ventana modal de consulta. |
| **Página 2** | `http://localhost:8080/pagina2.html` | Explorador con avatares, retardo de 4.5 segundos y vista de detalle individual. |
| **Página 3** | `http://localhost:8080/pagina3.html` | Simulador responsivo interactivo de dispositivos (Escritorio a Móvil). |
| **Página 4** | `http://localhost:8080/pagina4.html` | Agente evaluador de interfaces y usabilidad web mediante IA (Gemini 1.5 Flash). |
| **API REST** | `http://localhost:8080/api/estudiantes` | Endpoint base para la consulta y gestión de entidades estudiante. |

