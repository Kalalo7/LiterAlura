
# Gestión de Libros y Autores - Aplicación Java

Este proyecto es una aplicación en Java que permite la gestión de libros y autores. Utiliza la API de [Gutendex](https://gutendex.com) para buscar información sobre libros y autores, y mantiene un registro local de los mismos.

## Características

- **Búsqueda de libros por título**: Consulta la API de Gutendex para buscar información sobre libros y autores relacionados.
- **Gestión de libros y autores registrados localmente**:
  - Listar todos los libros y autores.
  - Filtrar libros por idioma.
  - Consultar autores vivos en un año determinado.
- **Estadísticas**:
  - Top 10 libros más descargados (localmente y en la API).
  - Estadísticas de descargas: promedio, máximo y mínimo.
- **Persistencia local**: Utiliza repositorios para almacenar y recuperar datos de libros y autores.

## Requisitos

- **Java 11 o superior**.
- Dependencias de tu proyecto (asegúrate de incluirlas en tu archivo `pom.xml` o `build.gradle`, según tu gestor de dependencias):
  - `Spring Data JPA` (o alguna biblioteca para el manejo de repositorios).
  - Cliente HTTP para consumir la API de Gutendex.

## Estructura del Proyecto

- **Clase Principal (`Principal.java`)**: Maneja el menú de interacción y coordina las diferentes funcionalidades del sistema.
- **Repositorios**: Interfaces (`IAutoresRepository`, `ILibrosRepository`) para la gestión de autores y libros en el almacenamiento local.
- **Integración con API**: Clase `ConsumoAPI` para consumir la API de Gutendex.
- **Conversor de Datos**: Clase `ConvierteDatos` para procesar la información obtenida de la API.

## Uso

1. Clonar el repositorio:

   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd <NOMBRE_DEL_PROYECTO>
   ```

2. Compilar y ejecutar el proyecto:

   ```bash
   javac Principal.java
   java Principal
   ```

3. Navegar por el menú interactivo para utilizar las distintas funcionalidades:
   - Buscar libros.
   - Registrar libros y autores.
   - Consultar estadísticas y más.

## Ejemplo del Menú Principal

```plaintext
Bienvenido! Por favor selecciona una opción:

1 - | Buscar libros por título |
2 - | Listar libros registrados |
3 - | Listar autores registrados |
4 - | Listar autores vivos en un determinado año |
5 - | Listar libros por idioma |
6 - | Top 10 libros más descargados |
7 - | Obtener estadísticas |
0 - | Salir |
```

## Funcionalidades Implementadas

### 1. Búsqueda de Libros
Permite buscar un libro por título utilizando la API de Gutendex. Si el libro no está registrado localmente, se puede agregar junto con su autor.

### 2. Listar Libros y Autores Registrados
Muestra los libros y autores almacenados en la base de datos local, ordenados alfabéticamente.

### 3. Filtrar Libros por Idioma
Permite filtrar libros según su idioma (`en`, `es`, `pt`, `fr`).

### 4. Consultar Autores Vivos en un Año
Devuelve una lista de autores vivos en el año especificado.

### 5. Top 10 Libros Más Descargados
Consulta y muestra los 10 libros con más descargas desde la API o la base de datos local.

### 6. Estadísticas
Genera estadísticas de descargas (promedio, máximo, mínimo) tanto desde la API como desde la base de datos local.

## Personalización

Si deseas personalizar la URL base para consultas en la API, puedes modificar la constante `URL_BASE` en `Principal.java`:

```java
private final static String URL_BASE = "https://gutendex.com/books/?search=";
```

## Contribuciones

Si deseas contribuir a este proyecto, por favor envía un Pull Request o reporta problemas en el repositorio.

## Licencia

Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

---

¡Disfruta explorando y gestionando libros con esta aplicación!
