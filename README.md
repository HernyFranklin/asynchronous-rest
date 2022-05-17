# Test

_Realiza consumos java rest simultaneos_

- Aplicación basada en **Java 11 Open JDK**
- Configuración centralizada con **Configuration Server**
- Dependencias administradas con **Gradle 7**
- Aplicación con arquitectura **hexagonal**

## Pruebas

### 1. Construcción del JAR

```
gradle build
```

### 2. Despliegue
En la ubicación del jar /build/libs/test-1.0.1.jar ejecutar:

```
java -jar test-1.0.1.jar
```

### 3. Prueba
Ejecutar en cualquier cliente REST o el navegador la siguiente URL:
```
localhost:8085/api/test
```

### 4. Cambiar puerto
Si por alguna razón el puerto estuviera ocupado, este puede modificarse en el archivo de ubicación:

/src/main/resources/bootstrap.yml
___

## Autor

* **Herny Franklin Choque** - *Desarrollador* - [h.franklin.choque@gmail.com](mailDeveloper)

