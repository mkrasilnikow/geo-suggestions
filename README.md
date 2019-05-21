### Приложение для получения географических координат по заданному адресу

---
#### Добавление ключа DaData 

В файл geo-suggestions/src/main/resources/application.properties 
Необходимо добавить свои ключи доступа к сервису daData. Для этого используются параметры **api.key** и **api.secretKey**


#### Развертывание приложения

* Если нужен jar: \
Клонируем ветку **master**, выполняем команду: 
    ```
    mvn clean install
    ``` 
    На выходе получаем fat jar **geo-suggestions-0.0.1-SNAPSHOT**, имеющий все нужные зависимости.
    Запуск: 
    ```
    java -jar geo-suggestions-0.0.1-SNAPSHOT.jar
    ``` 
    
    
* Если нужен war: \
Клонируем ветку **feature/camunda-war**, выполняем команду: 
    ```
    mvn clean package
    ``` 
    На выходе получаем war **geo-suggestions-0.0.1-SNAPSHOT**, имеющий все нужные зависимости.
    Запускать с помощью веб-сервера TomCat или jetty.

* Схема процесса:
![Suggestions Process](https://github.com/wiezmin/geo-suggestions/blob/master/src/main/resources/suggestionsProcess.png "Suggestions Process")
