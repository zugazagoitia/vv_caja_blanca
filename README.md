# Verificación y Validación del Software 2021

GRUPO IWM-41 Grupo 1

## Instrucciones para ejecutar las pruebas

> ⚠️ Es necesario tener maven instalado previamente.

Antes de ejecutar las pruebas se debe instalar la dependencia `SingeList.jar`

Esto se puede hacer con maven desde la ruta base del proyecto:

```bash
mvn install:install-file -Dfile=./SingleList.jar -DgroupId=com.singleList -DartifactId=SingleList -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar
```

Una vez esté instalada se pueden ejecutar las pruebas directamente con ``mvn test``
