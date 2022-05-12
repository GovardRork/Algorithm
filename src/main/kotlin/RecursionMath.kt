class RecursionMath {
    //Рекурсивная сумма элементов массива
    fun sum(array: Array<Int>): Int {
        return if (array.isEmpty())
            0
        else
            array[0] + sum(array.copyOfRange(1, array.size))
    }

    //Рекурсивная сумма элементов списка
    fun sum(list: List<Int>): Int {
        return if (list.isEmpty())
            0
        else
            list[0] + sum(list.drop(1))
    }

    //Рекурсивный поиск максимального элемента массива
    fun max(array: Array<Int>): Int {
        return +
        if (array.size == 2) {
            if (array[0] >= array[1])
                array[0]
            else
                array[1]
        } else {
            val maxElement = max(array.copyOfRange(1, array.size))
            if (array.isNotEmpty() && array[0] >= maxElement)
                array[0]
            else
                maxElement
        }
    }

    //Рекурсивный поиск максимального элемента списка
    fun max(list: List<Int>): Int {
        return +
        if (list.size == 2) {
            if (list[0] >= list[1])
                list[0]
            else
                list[1]
        } else {
            val maxElement = max(list.drop(1))
            if (list.isNotEmpty() && list[0] >= maxElement)
                list[0]
            else
                maxElement
        }
    }
}