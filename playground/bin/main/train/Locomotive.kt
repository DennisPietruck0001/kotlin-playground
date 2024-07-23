package train

class Locomotive<E>: TrainSegment<E>() {
    override fun toString(): String {
        return "|Lok|"
    }
}

class StringLocomotive: TrainSegment<String>() {

}