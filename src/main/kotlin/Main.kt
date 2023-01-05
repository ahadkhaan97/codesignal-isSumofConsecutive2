fun main() {
    print(solution(8))
}

fun solution(n: Int): Int {
    var count = 0
    for (i in 1 until n) {
        var tempIndex = i
        var sum = 0
        while (sum < n) {
            sum += tempIndex
            tempIndex++
        }
        if (sum == n)
            count++
    }
    return count
}
