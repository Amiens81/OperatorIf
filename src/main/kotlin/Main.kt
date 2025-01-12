package org.example

fun main() {
    println("Первая задача, решение:")
    val n  = 10
    if(n > 0){
        println(n + 1)
    }else{
        println(n)
    }
    //todo Вторая задача
    val a =  4
    val b = 45
    val c = -2
    val d =  8
    var positiveNumbers = 0
    if (a > 0){positiveNumbers++}
    if (b > 0){positiveNumbers++}
    if (c > 0){positiveNumbers++}
    if (d > 0){positiveNumbers++}
    println("Вторая задача.\nПоложительных чисел: "  + positiveNumbers)
    println("Третья задача, решение:")
    val x = 5
    val y = 6
    if(x > y){
        println(x)
    }else{println(y)}
    println("Четвёртая задача, решение: ")
    val dayNumber = 7
    if (dayNumber == 1){
        println("понедельник")
    }else if (dayNumber == 2){
        println("вторник")
    }else if(dayNumber == 3){
        println("среда")
    }else if(dayNumber == 4){
        println("четверг")
    }else if(dayNumber == 5){
        println("пятница")
    }else if(dayNumber == 6){
        println("суббота")
    }else if(dayNumber == 7){
        println("воскресенье")
    }
    println("Пятая задача, решение: ")
    val K = 5
    val i = 1..5
    if (K == 1) {
        println( "плохо")
    } else if (K == 2) {
        println("неудовлетворительно")
    } else if (K == 3) {
        println( "удовлетворительно")
    } else if (K == 4) {
        println("хорошо")
    } else if (K == 5) {
        println("отлично")
    } else if ( K !in i) {
        println("Ошибка!")
    }
    println("Шестая задача, решение: ")
    val arithmeticOperation = 3
    val number1 = 10.0
    val number2 =  2.0
    if(arithmeticOperation == 1){
        println("Сложение: " + (number1 +  number2))
    }else if(arithmeticOperation == 2){
        println("Вычитание: " + (number1- number2))
    }else if(arithmeticOperation == 3){
        println("Умножение: " + (number1 * number2))
    }else if(arithmeticOperation == 4){ if (number2 != 0.0) {
        println("Деление: " + (number1 / number2))}else{
        println("Деление на ноль запрещено!")
    }
    }
}