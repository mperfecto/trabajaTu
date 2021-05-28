# Proyecto trabajaTu


Este deberá usar un servidor de base de datos (PostgreSQL) y tendrá que estar deployado (desplegado) en un servidor web (Heroku).


La aplicación web tendrá que tener las siguientes funcionalidades:


1. [x] Cuando un cliente acceda a la dirección http://localhost:8080/contar/XXXX


    Nos devolverá una página web con el número de vocales y el numero de consonantes que tiene la palabra XXXX pasada por la URL. 


2. [x] 
Cuando un cliente acceda a la dirección:
http://localhost:8080/guarda?DATO1=XXXX&DATO2=YYYY&DATO3=ZZZZ&DATON=NNNN  ....


    Guardará, en una tabla de la base de datos, los datos pasados como parámetro (DATO1, DATO2, DATO3, ...).
Los datos a pasar y a guardar los decides tú. (comprueba que no pases los mismos datos que tus compañeros)


3. [x] Cuando el cliente acceda a la dirección
http://localhost:8080/listar


    Se mostrará una pagina web con la lista de todos los datos almacenados en la tabla anterior de la base de datos


4. [ ] Cuando el cliente acceda a la dirección:
http://localhost:8080/BBBB


    Siendo BBBB una palabra o frase, el servidor deberá recoger esa frase, hacerle algún tipo de transformación, y devolver la frase transformada al cliente.
    La transformación que hay que hacer la decides tu. (comprueba que no hagas lo mismo que otros compañeros)


5. [ ] Cuando un cliente acceda a la dirección:
http://localhost:8080/traduce/Hola que tal


    Nos devolverá la frase Hola que tal (o cualquiera que se le pase como parámetro) traducida del español al ingles.
