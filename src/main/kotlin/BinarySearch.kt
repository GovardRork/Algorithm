import kotlin.math.log2
import kotlin.math.roundToInt

class BinarySearch:Extentions() {
    //Бинарный поиск чисел/строк в массиве.
    //Работает только с отсортированным массивом.
    fun <T> binarySearch(array: Array<T>, element: T): String
            where T : Any {
        var counter = 0
        var low = 0
        var high = array.size - 1
        val arSize = array.size
        val maxOperation = log2(arSize.toDouble()).roundToInt()
        print("Размер массива: $arSize")
        print(" Максимум операций: $maxOperation")
        var mid = (low + high) / 2
        var guess = array[mid]
        //Если элемент выходит за границы крайних элементов отсортированного массива
        //значит его в массиве нет
        if (element <= array[high] && element >= array[low]) {
            while (low <= high) {
                if (guess < element) {
                    low = mid + 1
                    mid = (low + high) / 2
                    guess = array[mid]
                    counter++
                } else if (guess > element) {
                    high = mid - 1
                    mid = (low + high) / 2
                    guess = array[mid]
                    counter++
                } else break
            }
            print(" Потребовалось операций: $counter ")
        }
        return if (low > high || (counter == 1 && guess != element))
            "not found."
        else
            mid.toString()
    }

    //Рекурсивный бинарный поиск чисел/строк в массиве.
    //Работает только с отсортированным массивом.
    fun <T> binarySearchRecursive(array: Array<T>, element: T, counterX: Int?, index: Int): Triple<String, Int?, Int>
            where T : Any {
        var counter = counterX?.plus(1)
        val mid = array.size / 2
        val middle = array[mid]
        val bsIndex = index + when {
            element >= middle -> mid
            else -> 0
        }
        //Первичная инициализация счётчика и индексатора
        if (counterX == null) {
            //Если элемент выходит за границы крайних элементов отсортированного массива
            //значит его в массиве нет
            if (element > array[array.size - 1] || element < array[0]) {
                return Triple("not found (out of array bounds).", 0, 0)
            }
            counter = 0
            val arSize = array.size
            val maxOperation = log2(arSize.toDouble()).roundToInt()
            print("Размер массива: $arSize")
            print(" Максимум операций: $maxOperation")
        }
        return when {
            array.size == 1 -> {
                print(" Потребовалось операций: $counter ")
                when (element) {
                    array[0] -> Triple((bsIndex).toString(), 0, 0)
                    else -> Triple("not found(3)", 0, 0)
                }
            }
            middle < element ->
                binarySearchRecursive(array.copyOfRange(mid, array.size), element, counter, bsIndex)
            middle > element -> binarySearchRecursive(array.copyOfRange(0, mid), element, counter, bsIndex)
            else -> {
                print(" Потребовалось операций: $counter ")
                Triple((bsIndex).toString(), 0, 0)
            }
        }
    }
}

