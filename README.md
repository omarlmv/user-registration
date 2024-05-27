# User Registration API

Este proyecto es una API de registro de usuarios construida con Spring Boot. Proporciona endpoints para registrar nuevos usuarios y validar sus datos.

## Requisitos

- JDK 11
- Maven 3.6+
- Git

## Instalación

1. Clona el repositorio:

   ```bash
   git clone https://github.com/omarlmv/user-registration.git
   cd user-registration

2. Compila el proyecto usando Maven:
   mvn clean install

3. Inicia la aplicación:
   mvn spring-boot:run
   o ejecutando la clas UserRegistrationApplication

   La aplicación se ejecutará en http://localhost:8080.

4. Registro de Usuario
   Para registrar un nuevo usuario, utiliza el siguiente comando curl:

    curl --location 'http://localhost:8080/api/users/register' \
    --header 'Content-Type: application/json' \
    --data-raw '{
    "name": "Juan Rodriguez",
    "email": "juana@rodriguez.org",
    "password": "Hunter2",
    "phones": [
    {
    "number": "1234567",
    "citycode": "1",
    "contrycode": "57"
    }
    ]
    }'

    Respuesta Esperada
    HTTP 201 Created: Si el usuario se registra con éxito.
    HTTP 400 Bad Request: Si hay un error en los datos proporcionados.
    HTTP 409 Conflict: Si el correo electrónico ya está registrado.

5. Pruebas Unitarias
   mvn test
