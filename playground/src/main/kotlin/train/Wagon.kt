package train

class Wagon<T>(var wagonNum: T): TrainSegment<T>() {
    override fun toString(): String {
        return "|$wagonNum|"
    }
}