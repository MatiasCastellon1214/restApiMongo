Que hace hermanox. Ch bueno, ahí van los pasos, no son muchos:
Herramientas utilizadas: Docker Desktop, MongoDB, SpringBoot (dependencias: Spring Web, Spring Data MongoDB, Lombok). Estoy corriendo la aplicación en Intellij.

1) Descargo y ejecuto Docker Desktop
2) En Intellij hago correr el archivo docker-compose.yaml, el cual contiene dos contenedores: mongodb y mongo-express. Al correr el archivo, se levantan los dos contenedores.
   Ambos contenedores corren, aunque mongo-express lo hace tras varios intentos (10/10) apareciendo el siguiente mensaje al final:

    No custom config.js found, loading config.default.js
    2024-02-21T16:42:32.611945639Z Welcome to mongo-express 1.0.2

  Sin embargo, aparetemente ambos contenedores se encuentran en la misma red ya que al ejecutar "docker ps" aparece lo siguiente:

    CONTAINER ID   IMAGE           COMMAND                  CREATED         STATUS              PORTS                      NAMES
2e43215c8a6f   mongo-express   "/sbin/tini -- /dock…"   4 minutes ago   Up About a minute   0.0.0.0:8081->8081/tcp     mongo_express
83252ab55caf   mongo           "docker-entrypoint.s…"   4 minutes ago   Up 3 minutes        0.0.0.0:27017->27017/tcp   mongo_db


  De hecho, puedo ingresar a localhost:8081

    
3) De acuerdo a la configuración en application.properties, intento hacer correr la aplicacion pero aquí se produce otro error:
   problema con la autenticación de las credenciales de Mongo.


Bueno cabex, hasta aquí llegué. Realicé varios intentos pero solo quedaron en la esterilidad. La apicación por sí misma si corre está configurada para correr en el
puerto 8082 (application.properties). Cualquier ayuda me viene al pelo, hermanox. Te mando palmaditas y besos en las nalgas. 
