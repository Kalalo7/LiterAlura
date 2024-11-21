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
   git clone https://github.com/Kalalo7/literalura.git
   cd literalura

   
