# UnitConverter-Kotlin

Консольный конвертер единиц на Kotlin.

## Возможности
- Температура: C ↔ F  
- Вес: kg ↔ lb  
- Расстояние: km ↔ mi  

## Запуск
1. Открыть проект в IntelliJ IDEA и запустить `Main.kt`.  
2. Или скомпилировать через kotlinc:
   ```bash
   kotlinc src/**/*.kt -d UnitConverter.jar
   kotlin -classpath UnitConverter.jar unitconverter.MainKt
