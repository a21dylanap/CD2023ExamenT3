## Ejercicio 1

Para el ejercicio uno lo primero fueron agregar las dos clases que nos proporcionó el profesor al maven anteriormente creado. Una vez allí comente la clase con las directrices de javadoc, una vez que terminé, abri el terminal y puse los siguientes comandos:

```bash
ls exament3
```
Para ponnerme dentro de la carpeta en la que esta todo

```bash
mvn javadoc:javadoc
```
Para generar los comentarios que creamos anteriormente

```bash
mvn compile
```
Por ultimo compilamos para ver si está todo bien

## Ejercicio 2

Lo primero fue poner la clase test en el apartado correspondiente de pruebas. Luego "mvn test" para que ejecute las pruebas. Le saque captura de como las pasaba correctamente y listo.

## Ejercicio 3

Lo primero que hice fue crear la clase que nos indicó el profesor en las instrucciones, luego lo primero que hay que hacer es ir al pom y configurar el plugin que viene por defecto llamado "maven-javadoc-plugin"

```xml
<configuration>
    <archive>
        <manifest>
            <mainClass>
                examen.App
            </mainClass>
        </manifest>
    </archive>
</configuration>
```

Luego ejecuté jar:jar para crear el .jar

Se creó y fui a comprobar si se ejecutaba con "java -jar "nombre""

Pero daba el error "no hay ningún atributo de manifiesto principal en prueba-0.0.1-SNAPSHOT.jar"

Pero con una rapida busqueda encontre que el problema era que lo que está ocurriendo es que el JAR que se genera Maven no incluye, por defecto, la entrada correspondiente a la clase que contiene el método main(String[]) en el manifiesto, por lo que al intentar ejecutar el archivo la JVM no sabe que clase quieres usar como punto de entrada. Y con un nuevo plugin lo solucioné:

´´´xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-jar-plugin</artifactId>
        <configuration>
            <archive>
                <manifest>
                    <mainClass>examen.App</mainClass>
                </manifest>
            </archive>
        </configuration>
    </plugin>
´´´

Y asi ya me funcionó.

Gracias.
