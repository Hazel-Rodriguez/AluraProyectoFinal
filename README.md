**Challenge Back End Alura - Foro Hub Aplicación**  

**Descripción**  
El objetivo de este challenge fue desarrollar una API REST mediante la creación de **Foro Hub**, una aplicación diseñada con Spring que simula el funcionamiento del foro del sitio de Alura.  

La aplicación permite que estudiantes, profesores y moderadores interactúen entre sí. Cada usuario puede crear y gestionar temas de discusión, fomentando el intercambio de ideas y conocimientos.  

Este proyecto busca profundizar en la gestión de datos de un foro, estableciendo relaciones entre tópicos, respuestas y usuarios.  

**Funcionalidades**  
La API ofrece las siguientes acciones:  
- **Crear un nuevo tópico**: Los usuarios pueden agregar nuevos temas de discusión.  
- **Listar todos los tópicos**: Consultar todos los temas creados en el foro.  
- **Visualizar un tópico específico**: Acceder a los detalles de un tópico a través de su identificador.  
- **Actualizar un tópico**: Modificar la información de un tópico existente.  
- **Eliminar un tópico**: Remover un tópico del foro.  

**Tecnologías Utilizadas**  
- **Java 23**  
- **Spring Boot**  
- **Spring Data JPA**  
- **Base de datos MySQL** (según configuración)  
- **Maven** (gestor de dependencias)  

**Endpoints de la API**  
- `POST /topicos`: Crear un nuevo tópico.  
- `GET /topicos`: Listar todos los tópicos.  
- `GET /topicos/{id}`: Consultar un tópico específico.  
- `PUT /topicos/{id}`: Actualizar un tópico existente.  
- `DELETE /topicos/{id}`: Eliminar un tópico. 
