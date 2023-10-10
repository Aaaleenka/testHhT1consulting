###Тестовое задание на Вакансию "Java-разработчик (Стажер)"

**Текст задания:**

Спроектировать(продумать формат и ограничения входящих/исходящих параметров) и реализовать REST API, вычисляющее частоту встречи символов по заданной строке. Результат должен быть отсортирован по убыванию количества вхождений символа в заданную строку.

Пример входной строки: “aaaaabcccc” 
Пример выходного результата: “a”: 5, “c”: 4, “b”: 1

**Требования к решению:**

* Java 8+
* Spring boot 2+
* Решение должно быть покрыто тестами
* У решения должна быть документация по запуску и формату входящих/исходящих параметров
* Код решения необходимо разместить в публичном Github репозитории.

**Описание работы программы:**

* Класс *LogicService* - реализует подсчет каждого символа в заданной строке, и сортирует их в порядке убывания.
* Класс *MainController* - реализует REST API

**Запрос:** http://localhost:8080/ЗАДАННАЯ_СТРОКА

*Пример: http://localhost:8080/Youcandoanythingyousetyourmindtoman*

**Ответное сообщение - и есть нужный ответ.**

*Ответ на пример: "n":5, "o":5, "a":3, "t":3, "u":3, "y":3, "d":2, "i":2, "m":2, "c":1, "e":1, "g":1, "h":1, "r":1, "s":1, "Y":1"*