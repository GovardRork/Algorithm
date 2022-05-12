import kotlin.collections.Map.Entry

class DijkstraAlgorithm {
    var graph = HashMap<String, HashMap<String, Double>>(300, 0.7f)
    var costs = HashMap<String, Double>(300, 0.7f)
    var parents = HashMap<String, String>(300, 0.7f)
    var processed = Array<Any>(graph.size) {}

    var weights = HashMap<String, Double>(300, 0.7f)
    var neighbors = HashMap<String, String>(300, 0.7f)

    fun clearNeighbors(rawmap: HashMap<String, String> = neighbors): HashMap<String, String> {
        var cleared = HashMap<String, String>(3000, 0.7f)
        val qs = QuickSort()
        rawmap.forEach { (key, value) ->
            var newkey = qs.quickSortRecursive(
                (key + value)
                    .toCharArray()
                    .toTypedArray()
            )
                .joinToString(separator = "")
            //cleared.put(newkey, key + "_" + value)
            cleared.put( key + "_" + value,newkey)
        }
        return cleared
    }

    fun clearWeights(): HashMap<String, Double> {


        return weights
    }


    fun fillGraph(
        c: HashMap<String, Double> = weights,
        p: HashMap<String, String> = neighbors
    ): HashMap<String, HashMap<String, Double>> {

        return graph
    }

    fun findLowestCostNode(): Entry<Any, Double> {
        lateinit var node: Entry<Any, Double>
        var cost = 0.0
        costs.filter { !processed.contains(it.key) }.forEach {
            if (it.value < cost) {
                cost = it.value
                node = it
            }
        }
        return node
    }

    fun findMinCost(
        g: HashMap<String, HashMap<String, Double>> = graph,
        c: HashMap<String, Double> = costs,
        p: HashMap<String, String> = parents
    ) {
        println(g["f"]?.getValue("fd").toString())

    }


}