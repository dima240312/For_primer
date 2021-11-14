fun main() {
    For_primer()
}


fun For_primer() {
    print(
        "For_primer.\n" +
                "Дана строка string и целое число и number_of_times (N > 0).\n" +
                "Вывести number_of_times раз строку string.\n"
    )
    print("Введите число: ")
    var number = readLine()!!.toInt()
    print("Введите количество раз: ")
    var number_of_times = readLine()!!.toInt()

    for (i in 1..number_of_times) {
        print("$i) ")
        println(number)
    }
}