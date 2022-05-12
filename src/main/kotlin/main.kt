import java.io.File
import java.util.*
import kotlin.collections.HashMap

private fun maxArea(h: Int, w: Int, horizontalLinesY: IntArray, verticalLinesX: IntArray): Long {
    var lineY = (intArrayOf(0, h) + horizontalLinesY).sortedArray()
    var lineX = (intArrayOf(0, w) + verticalLinesX).sortedArray()
    var maxX = 0
    var maxY = 0

    lineX.forEachIndexed { i, x ->
        if (i != 0 && lineX[i] - lineX[i - 1] >= maxX) {
            maxX = lineX[i] - lineX[i - 1]
        }
    }
    lineY.forEachIndexed { i, x ->
        if (i != 0 && lineY[i] - lineY[i - 1] >= maxY) {
            maxY = lineY[i] - lineY[i - 1]
        }
    }

    return maxX * maxY.toLong()
}

private fun clearStringMassive() {
    var str = File("input.txt").bufferedReader().readLines()
    var strset = HashMap<Int, String>(300, 0.7f)
    var out = arrayOfNulls<String>(str.count())
    val regex = "[0-9]+".toRegex()
    str.forEach { it ->
        var y = regex.find(it,0)?.value
        var x = y!!.toInt()
        strset[x] = it.filter { it.isLetter() }
    }
    strset.forEach {
        out[it.key - 1] = it.value
    }
    out.forEach {
//        var s = el.toString() + "\n"
//        File("output.txt").writeText(s)
        var s = it.toString()
        println(s)
    }
}

private fun  gradient ():Unit{

}


fun main(args: Array<String>) {
    println(LeetCode().findSubstring())


//    File("input.txt").createNewFile()
//    File("input.txt").writeText("str3"+"\n" +"1smth"+"\n" +"bla2bla"+"\n")
//    clearStringMassive()


//    var rl = readLine()
//    var a = rl!!.split(" ")[0]
//    var b = rl!!.split(" ")[1]
//    println(a.toInt()+b.toInt())
//    println(b)

//    var rl = File("input.txt").bufferedReader().readLines()
//    var a = rl[0]!!.split(" ")[0]
//    var b = rl[1]!!.split(" ")[1]
//    var c = a.toInt()+b.toInt()
//    File("output.txt").writeText(c.toString())


    //val rl = File("input.txt").bufferedReader().readLines()
//    val j = readLine()
//    var hash = hashSetOf<Char>()
//    j!!.forEach { f->
//        hash.add(f)
//    }
//
//    val s = readLine()
//    var c = 0
//    hash.forEach { x->
//        s!!.forEach { y->
//            if(y == x)
//                c++
//        }
//    }
//    println(c)
    //File("output.txt").writeText(c.toString())
    val sc = Scanner(System.`in`)

    val sizeInput = sc.nextLine().split(" ")
    val h = sizeInput[0].toInt()
    val w = sizeInput[1].toInt()

    val horizontalLinesY = sc.nextLine().split(" ").let {
        val array = IntArray(it.size)
        for (i in 0 until it.size) {
            array[i] = it[i].toInt()
        }
        array
    }

    val verticalLinesX = sc.nextLine().split(" ").let {
        val array = IntArray(it.size)
        for (i in 0 until it.size) {
            array[i] = it[i].toInt()
        }
        array
    }

    val area = maxArea(h, w, horizontalLinesY, verticalLinesX);
    println(area);

    //Создаем отсортированный по возрастанию массив целых чисел
    var ar = arrayOf("a", "ab", "abc", "asd", "b", "bb", "bbbb")
    //var el = "bbbjb"
    val ar3 = arrayOf(
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10,
        11,
        12,
        13,
        15,
        16,
        18,
        21,
        32,
        33,
        34,
        35,
        36,
        37,
        38,
        39,
        40,
        41,
        42,
        43,
        44,
        45,
        46
    )
    var list = listOf<Int>(
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10,
        11,
        12,
        13,
        15,
        16,
        18,
        21,
        32,
        33,
        34,
        35,
        36,
        37,
        38,
        39,
        40,
        41,
        42,
        43,
        44,
        45,
        46
    )
    val ar2 = arrayOf(1, 2, 3, 4/*, 5, 6, 8, 10, 13, 15, 21*/)
    var list2 = listOf<Int>(1, 2, 3, 4)
    //var el = 3
    //for (i in 0 .. ar[ar.size-1])
    //    for (i in 1 .. 1)
    var neighboors: HashMap<String, String> = hashMapOf(
        "один" to "два",
        "один" to "три",
        "один" to "пять",
        "два" to "один",
        "два" to "три",
        "два" to "пять",
        "три" to "один",
        "три" to "два",
        "три" to "пять",
        "пять" to "один",
        "пять" to "два",
        "пять" to "три"
    )

    var massive = ar

    neighboors.forEach { (key, value) -> println("key = ${key.toString()}, value = $value") }

//    var da = DijkstraAlgorithm().clearNeighbors(neighboors)
//    da.forEach{(key,value)->println("key = ${key.toString()}, value = $value")}

//    var sortarray = QuickSort().quickSortRecursiveMid(massive)
//    sortarray.forEach { println(it) }

//    ArrayOperation().multipleTableArray(ar3).forEach {
//        var str = "["
//        for (i in it.indices)
//            str += it[i].toString() + ","
//        println("${str.subSequence(0, str.length - 1)}]")
//
//    }

    //println(multipleTableArray(ar2).contentDeepToString())


//    massive.forEach()
//    {
//        println("Element is $it")
//        var pos = BinarySearch().binarySearchRecursive(massive, it, null, 0)
//        print(" Element's index is ${pos.first.toString()}")
//        println()
//    }
//    massive.forEach()
//    {
//        println("Element is $it")
//        var pos = BinarySearch().binarySearch(massive, it)
//        print(" Element's index is $pos")
//        println()
//    }
//    var s = RecursionMath().sum(massive)
//    println(s)
//    var e = EuclidAlgorithm(11,5).findMaxLengthRecursive()
//    println(e)


}


//    var s = Recursion().sum(list2)
//    println("Sum of array is $s")
//    var m = Recursion().max(list)
//    var sd = "asdasda"
//   println("Max element of array is ${sd.length}")

