# TestProject
Это проект по автоматизированному тестированию. Он разделён на две части: GitProject и APIProject.
Язык — Java.
Для сборки проекта используется фреймворк Maven.
Для сборки отчёта используется Allure Framework.
Для логирования используется log4j.
## GitProject
Эта часть предназначена для тестирования сайта https://github.com на базе Selenium WebDriver.
!!! Иногда при авторизации GitHub может потребовать 6-ти значный код, в таком случае надо будет войти в аккаунт вручную в браузере и потом повторно запустить тесты.
### Сборка проекта
Сборка осуществляется с помощью команды
```mvn clean test```.
### Генерация отчёта
Генерация отчёта осуществляется с помощью команды
```mvn allure:serve```.
## APIProject
Эта часть предназначена для тестирования api https://petstore.swagger.io/#/ с использованием библиотеки Rest-assured.
Документация по api — https://petstore.swagger.io/#/.
Сборка осуществляется с помощью команды
```mvn clean test```.
### Генерация отчёта
Генерация отчёта осуществляется с помощью команды
```mvn allure:serve```.
## Ссылка на тест-сьют в google-docks
https://docs.google.com/spreadsheets/d/1v2PeXHsgFdZPTeLZAYFUelF-02deIOxJpn7h93jZuRY/edit?usp=sharing
