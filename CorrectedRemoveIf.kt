fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeAll { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeAll { it > 2 }
    println(set) // Output: [1, 2]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    map.entries.removeIf { it.key > 2 }
    println(map) // Output: {1=one, 2=two}
    //For maps, it's generally safer to use removeIf on the entrySet
}