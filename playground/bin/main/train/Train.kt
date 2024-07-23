package train

import queue.Queue

class Train<E>(private val locomotive: Locomotive<E>): Queue<E> {
    fun addWagon(wagon: Wagon<E>) {
        if(!locomotive.hasNextWagon) {
            locomotive.nextWagon = wagon
        } else {
            var currentWagon: Wagon<E> = locomotive.nextWagon !!
            while(currentWagon.hasNextWagon) {
                currentWagon = currentWagon.nextWagon !!
            }
            currentWagon.nextWagon = wagon
        }
    }
    fun removeLastWagon(): Wagon<E>? {
        var lastWagon: Wagon<E>? = null
        var nextToLastWagon: Wagon<E>? = null
        if(locomotive.hasNextWagon) {
            lastWagon = locomotive.nextWagon !!
            while(lastWagon?.nextWagon != null) {
                nextToLastWagon = lastWagon
                lastWagon = lastWagon.nextWagon
            }
            nextToLastWagon?.nextWagon = null
        }
        return lastWagon
    }
    fun getLength(): Int {
        var result: Int = 0
        if(locomotive.hasNextWagon) {
            var currentWagon: Wagon<E> = locomotive.nextWagon !!
            result = 1
            while(currentWagon.nextWagon != null) {
                currentWagon = currentWagon.nextWagon !!
                result ++
            }
        }
        return result
    }
    fun addWagonAfter(wagon: Wagon<E>, afterWagonNum: E) {
        if(locomotive.hasNextWagon) {
            var currentWagon: Wagon<E> = locomotive.nextWagon !!
            var currentWagonNum = currentWagon.wagonNum
            if(afterWagonNum == currentWagonNum) {
                wagon.nextWagon = currentWagon.nextWagon
                currentWagon.nextWagon = wagon
            } else {
                while(currentWagon.nextWagon != null) {
                    currentWagon = currentWagon.nextWagon !!
                    currentWagonNum = currentWagon.wagonNum
                    if(afterWagonNum == currentWagonNum) {
                        wagon.nextWagon = currentWagon.nextWagon
                        currentWagon.nextWagon = wagon
                    }
                }
            }
        }
    }

    override fun enqueue(element: E) {
        addWagon(Wagon(element))
    }

    override fun dequeue(): E? {
        val firstWagon: Wagon<E>? = locomotive.nextWagon
        val secondWagon: Wagon<E>? = firstWagon?.nextWagon
        locomotive.nextWagon = secondWagon
        return firstWagon?.wagonNum
    }

    override fun peek(): E? {
        val firstWagon: Wagon<E>? = locomotive.nextWagon
        return firstWagon?.wagonNum
    }

    override fun toString(): String {
        var result: String = locomotive.toString()
        if(locomotive.hasNextWagon) {
            var currentWagon: Wagon<E> = locomotive.nextWagon !!
            result += "-$currentWagon"
                while(currentWagon.nextWagon != null) {
                    currentWagon = currentWagon.nextWagon !!
                    result += "-$currentWagon"
                }
        }
        return result
    }
}
fun main() {
    val locomotive = Locomotive<Char>()
    val train = Train(locomotive)

    train.addWagon(Wagon('a'))
    train.addWagon(Wagon('b'))
    train.addWagon(Wagon('c'))
    train.addWagon(Wagon('d'))
    val removedWagon = train.removeLastWagon()
    train.addWagon(Wagon('e'))
    val newWagon = Wagon('f')
    train.addWagonAfter(newWagon, 'b')
    println(train)
    println("Length is: " + train.getLength())
    println("The removed wagon is: $removedWagon")

    val newLocomotive = Locomotive<String>()
    val newTrain = Train(newLocomotive)
    newTrain.enqueue("Sorour")
    newTrain.enqueue("Dennis")
    val peekResult = newTrain.peek()
    println(peekResult)
    val dequeueResult = newTrain.dequeue()
    println(newTrain)
    println(dequeueResult)
}