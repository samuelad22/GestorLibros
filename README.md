# Lorevia

Lorevia es un gestor de libros en desarrollo. Permite organizar libros, personajes y categorias desde una aplicacion web con autenticacion de usuarios.

## Tecnologias

### Frontend

- React 19
- Vite
- React Router
- Axios
- Oxlint

### Backend

- Java 21
- Spring Boot 4
- Spring Web MVC
- Spring Data JPA / Hibernate
- Spring Security
- JWT
- MySQL
- Maven

## Funcionalidades actuales

- Registro de usuarios e inicio de sesion.
- Autenticacion mediante tokens JWT.
- Proteccion de las vistas privadas.
- Consulta del perfil del usuario autenticado.
- Listado, creacion, edicion y eliminacion de libros.
- Vista de detalle de cada libro.
- Busqueda de libros por nombre mediante la API.
- Gestion de categorias: listar, crear, editar, eliminar y buscar.
- Gestion de personajes: listar, crear, editar, eliminar y buscar.
- Asociacion de categorias y personajes con libros.
- Gestion de usuarios y parentescos disponible en la API del backend.
- Cambio de idioma entre espanol e ingles en la interfaz.
- Cierre de sesion y control de sesiones expiradas.

## Estructura del proyecto

```text
GestorLibros/
├── loreviaBackEnd/   # API REST y persistencia
├── loreviaFrontEnd/  # Aplicacion web React
└── README.md
```

## Requisitos

- Java 21 o superior.
- MySQL en ejecucion.
- Node.js y npm.
- Una base de datos MySQL accesible por el backend.

## Configuracion del backend

La configuracion se encuentra en `loreviaBackEnd/src/main/resources/application.properties`.

Por defecto, el backend utiliza:

- Base de datos: `gestorLibros`.
- Servidor: `localhost`.
- Puerto de la API: `8080`.
- Hibernate: actualiza el esquema automaticamente con `ddl-auto=update`.

Antes de ejecutar el proyecto, comprueba el usuario y la contrasena de MySQL en ese archivo. No publiques credenciales reales ni el secreto JWT en el repositorio; en un entorno real deben gestionarse mediante variables de entorno o un sistema de secretos.

## Ejecucion

### Backend

Desde la carpeta `loreviaBackEnd`:

```powershell
.\mvnw.cmd spring-boot:run
```

La API quedara disponible en `http://localhost:8080`.

Para ejecutar las pruebas:

```powershell
.\mvnw.cmd test
```

### Frontend

Desde la carpeta `loreviaFrontEnd`:

```powershell
npm install
npm run dev
```

Vite mostrara la URL local de la aplicacion, normalmente `http://localhost:5173`.

El frontend espera encontrar la API en `http://localhost:8080`.

## Rutas principales del frontend

- `/login`: inicio de sesion.
- `/registro`: registro de usuarios.
- `/libros`: listado y gestion de libros.
- `/libros/:id`: detalle de un libro.
- `/personajes`: gestion de personajes.
- `/categorias`: gestion de categorias.

## Endpoints principales de la API

- `/api/auth`: registro, login y perfil.
- `/api/libros`: operaciones sobre libros y sus asociaciones.
- `/api/categorias`: operaciones sobre categorias.
- `/api/personajes`: operaciones sobre personajes.
- `/api/usuarios`: operaciones sobre usuarios.
- `/api/parentescos`: operaciones sobre parentescos.

## Estado del proyecto

El proyecto se encuentra en desarrollo. La funcionalidad puede ampliarse con nuevas relaciones, validaciones, permisos y configuracion especifica para despliegue.
