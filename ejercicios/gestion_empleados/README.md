Maven Template Project
=======================

Este proyecto puede utilizarse como base para crear otros proyectos Maven + Java.

## Crear un proyecto Maven utilizando arquetipo Quickstart.
Para este ejempo se utiliza el arquetipo más simple: _Maven Quickstart Archetype_.

```
mvn archetype:generate -DgroupId=tec.poo \
 -DartifactId=maven-project-template \
 -DarchetypeArtifactId=maven-archetype-quickstart \
 -DarchetypeVersion=1.4 \
 -DinteractiveMode=false
```
### Cosas a cambiar:
1. Este comando crea un proyecto Maven + Java utilizando JDK 1.7 como versión de compilador. Cambiar esto a versión 14 o a la que se vaya a utilizar. (Por ejemplo 17 o 21)
1. La dependencia de JUnit tiene una versión vieja. Actualizar a JUnit 5 o mayor.
1. Actualizar el `<groupId>` de ser necesario.
1. Actualizar el `<artifactId>` de ser necesario.
1. Actualizar la `<version>` de ser necesario.
1. Actualizar el `<name>` de ser necesario.
1. Actualizar el elemento `<MainClass>` de los _plugins_ `maven-assembly-plugin` y `maven-assembly-plugin` al `fully qualified name` de la clase principal.

## Crear un proyecto Maven utilizando esta plantilla
- Solamente tiene que copiar todos los contenidos del directorio `maven-project-template` a otra dirección en su sistema
de archivos.

### Cosas a cambiar:
1. Cambiar el nombre del directory `maven-project-template` por el nombre que va tener su proyecto.
1. Actualizar el `<groupId>` de ser necesario.
1. Actualizar el `<artifactId>` de ser necesario.
1. Actualizar la `<version>` de ser necesario.
1. Actualizar el `<name>` de ser necesario.
1. Actualizar el elemento `<MainClass>` de los _plugins_ `maven-assembly-plugin` y `maven-assembly-plugin` al `fully qualified name` de la clase principal.

## Gestión del ciclo de vida de la aplicación

### Limpiar recursos de construcción
Cuando Maven construye o compila código u otros archivos, utilizar el directorio `target/` para publicar los resultados.
El directorio `target/` no se necesita.
```
mvn clean
```

### Compilar un proyecto
```
mvn compile
```

### Ejecutar pruebas unitarias
Esta tarea compila el código de producción, el de pruebas y ejecuta las pruebas.
```
mvn test
```

### Empaquetar a JAR
Esta tarea compila el código de producción, el de pruebas, ejecuta las pruebas y crear el JAR
```
# Se empaqueta el código SIN las dependencias de terceros. 
# Para correr el programa se necesitaria del comando
# java -cp <lista de rutas hacia las librerías de terceros> <main-class>
mvn package 

# Se empaqueta el código CON las dependendias de terceros
# Para correr el programa se necesitaría del comando
# java -jar <ruta del jar>
mvn package assembly:single
```

### Instalar JAR en repositorio Maven local
Esta tarea compila el código de producción, el de pruebas, ejecuta las pruebas, crear el JAR e instala el JAR en el
repositorio local.
```
mvn install
```

>**Importante**
> Los comandos anteriores se pueden combinar, por ejemplo se puede hacer
> `mvn clean compile` para limpiar el directorio `target/` e iniciar un proceso de
> compilación desde un estado estable.

### Ejecutar una aplicación
Maven se utiliza para gestionar el ciclo de vida del proyecto. **No** se utiliza para ejecutar aplicaciones 
en producción. 
En un servidor de producción se ejecuta una aplicación Java por medio del programa `java` y un archivo
`.jar`. En un servidor de producción Maven no debería de estar instalado.

Para efectos de prueba se puede utilizar el _plugin_ "Maven Exec" para ejecutar aplicaciones Java.
**Precaución**: este _plugin_ aunque útil para correr una aplicación desde Maven, tiene el error conocido de puede
dejar la aplicación en un estado como de "colgada", es decir como que no termina cuando debería de terminar.

```
mvn exec:java
```


