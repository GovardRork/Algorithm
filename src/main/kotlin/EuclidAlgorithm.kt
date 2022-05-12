//Нужен для равномерного деления прямоугольника на квадратные участки максимального размера.
class EuclidAlgorithm(sideA: Int, sideB: Int) {
    //Для корректной работы алгоритма нужно правильно определить длину и ширину
    private var length = if (sideA >= sideB) sideA else sideB
    private var width = if (sideA <= sideB) sideA else sideB

    //Поиск максимальной стороны квадрата
    fun findMaxLengthRecursive(l: Int = length, w: Int = width): Int {
        if (w == 0) throw Exception("Сторона не может быть равна нулю.")
        return if (l % w == 0)
            w
        else findMaxLengthRecursive(w, l - (l / w) * w)
    }
}