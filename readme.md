# Unit test example

## Как использовать
1. Склонируйте репозиторий
2. Переключитесь на нужную ветку в IDE
3. Откройте Git, выделите самый верхний коммит в текущей ветке и нажмите на нужный файл. Это откроет его diff (отличие от предыдущей версии).

## Список веток в порядке изучения
1. BasicTest/WithError - пример с Calculator и ошибкой в тесте
2. BasicTest/FixedError - исправленная ошибка в тесте Calculator
3. ParameterizedTest - параметризованный тест для Calculator
4. MockTests/Beginning - пример с MagicBag и нестабильными тестами
5. MockTests/InterfaceImplementation - вынос зависимости MagicBag в конструктор, тесты со стабами
6. MockTests/Mockito-Start - Замена стабов на моки
7. MockTests/Mockito-Verify - Использование verify для проверки вызова методов