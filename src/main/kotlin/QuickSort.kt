import kotlin.random.Random

class QuickSort : Extentions() {
    fun <T> quickSortRecursive(array: Array<T>): Array<Any>
            where T : Any {
        return if (array.size < 2)
            array as Array<Any>
        else {
            val pivot = array[0]
            var less = emptyArray<Any>()
            var greater = emptyArray<Any>()
            array.forEach {
                if (it < pivot)
                    less += arrayOf(it)
                else if (it > pivot)
                    greater += arrayOf(it)
                else emptyArray<Any>()
            }
            quickSortRecursive(less) + arrayOf(pivot) + quickSortRecursive(greater)
        }
    }

    fun <T> quickSortRecursiveRandom(array: Array<T>): Array<Any>
            where T : Any {
        return if (array.size < 2)
            array as Array<Any>
        else {
            val pivot = array[Random.nextInt(0, array.size - 1)]
            var less = emptyArray<Any>()
            var greater = emptyArray<Any>()
            array.forEach {
                if (it < pivot)
                    less += arrayOf(it)
                else if (it > pivot)
                    greater += arrayOf(it)
                else emptyArray<Any>()
            }
            quickSortRecursive(less) + arrayOf(pivot) + quickSortRecursive(greater)
        }
    }

    fun <T> quickSortRecursiveMid(array: Array<T>): Array<Any>
            where T : Any {
        return if (array.size < 2)
            array as Array<Any>
        else {
            val pivot = array[(array.size - 1) / 2]
            var less = emptyArray<Any>()
            var greater = emptyArray<Any>()
            array.forEach {
                if (it < pivot)
                    less += arrayOf(it)
                else if (it > pivot)
                    greater += arrayOf(it)
                else emptyArray<Any>()
            }
            quickSortRecursive(less) + arrayOf(pivot) + quickSortRecursive(greater)
        }
    }
}