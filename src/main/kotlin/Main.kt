import utils.combinations


fun main(args: Array<String>) {
    (0..51).combinations(5).forEach {
        for (v in it) {
            print(v)
            print('\t')
        }
        println()
    }
}