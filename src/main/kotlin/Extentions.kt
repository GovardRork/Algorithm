abstract class Extentions {
    //Convert in string and compare.
    operator fun <T> T.compareTo(any: T): Int {
        // Add leading zeros for correct number compare.
        val n = any.toString().length - this.toString().length
        val element = if (n < 0 && any is Number) "0".repeat(-n) else "" + any.toString()
        val comparable = if (n > 0 && this is Number) "0".repeat(n) else "" + this.toString()

        return when {
            comparable > element -> 1
            comparable < element -> -1
            else -> 0
        }
    }

    inline operator fun <reified T> Array<T>.plus(b: Array<T>): Array<T> {
        return arrayOf(*this, *b)
    }

}