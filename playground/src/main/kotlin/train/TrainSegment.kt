package train

abstract class TrainSegment<E> {
    var nextWagon: Wagon<E>? = null
    val hasNextWagon: Boolean
        get() = nextWagon != null
}