//Operations with arrays
class ArrayOperation {
    //Multiple every element of array on some multiplier
    fun multipleArray(array: Array<Int>, multi: Int): Array<Int> {
        for (i in array.indices)
            array[i] = array[i] * multi
        return array
    }

    //Create multiplication table from array.
    //Example: [1,2,3] -> [[1,2,3],[2,4,6],[3,6,9]]
    fun multipleTableArray(array: Array<Int>): Array<Array<Int>> {
        val result = Array(array.size) { array.copyOf() }
        val indices = array.indices
        for (i in indices)
            for (j in indices)
                result[i][j] *= array[i]
        return result
    }
}