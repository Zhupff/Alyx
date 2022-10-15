package alyx.tuple

import java.io.Serializable

interface MutableTuple : Serializable {
    val size: Int
    fun toTuple(): Tuple
}

data class MutableTuple2<A, B>(
    var first : A,
    var second: B
) : MutableTuple {

    override var size: Int = 2

    override fun toTuple(): Tuple2<A, B> = Tuple2(first, second)

    override fun toString(): String = "($first, $second)"
}

data class MutableTuple3<A, B, C>(
    var first  : A,
    var second : B,
    var third  : C
) : MutableTuple {

    override var size: Int = 3

    override fun toTuple(): Tuple3<A, B, C> = Tuple3(first, second, third)

    override fun toString(): String = "($first, $second, $third)"
}

data class MutableTuple4<A, B, C, D>(
    var first  : A,
    var second : B,
    var third  : C,
    var fourth : D
) : MutableTuple {

    override var size: Int = 4

    override fun toTuple(): Tuple4<A, B, C, D> = Tuple4(first, second, third, fourth)

    override fun toString(): String = "($first, $second, $third, $fourth)"
}

data class MutableTuple5<A, B, C, D, E>(
    var first  : A,
    var second : B,
    var third  : C,
    var fourth : D,
    var fifth  : E
) : MutableTuple {

    override var size: Int = 5

    override fun toTuple(): Tuple5<A, B, C, D, E> = Tuple5(first, second, third, fourth, fifth)

    override fun toString(): String = "($first, $second, $third, $fourth, $fifth)"
}

data class MutableTuple6<A, B, C, D, E, F>(
    var first  : A,
    var second : B,
    var third  : C,
    var fourth : D,
    var fifth  : E,
    var sixth  : F
) : MutableTuple {

    override var size: Int = 6

    override fun toTuple(): Tuple6<A, B, C, D, E, F> = Tuple6(first, second, third, fourth, fifth, sixth)

    override fun toString(): String = "($first, $second, $third, $fourth, $fifth, $sixth)"
}

data class MutableTuple7<A, B, C, D, E, F, G>(
    var first  : A,
    var second : B,
    var third  : C,
    var fourth : D,
    var fifth  : E,
    var sixth  : F,
    var seventh: G
) : MutableTuple {

    override var size: Int = 7

    override fun toTuple(): Tuple7<A, B, C, D, E, F, G> = Tuple7(first, second, third, fourth, fifth, sixth, seventh)

    override fun toString(): String = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh)"
}

data class MutableTuple8<A, B, C, D, E, F, G, H>(
    var first  : A,
    var second : B,
    var third  : C,
    var fourth : D,
    var fifth  : E,
    var sixth  : F,
    var seventh: G,
    var eighth : H
) : MutableTuple {

    override var size: Int = 8

    override fun toTuple(): Tuple8<A, B, C, D, E, F, G, H> = Tuple8(first, second, third, fourth, fifth, sixth, seventh, eighth)

    override fun toString(): String = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh, $eighth)"
}

data class MutableTuple9<A, B, C, D, E, F, G, H, I>(
    var first  : A,
    var second : B,
    var third  : C,
    var fourth : D,
    var fifth  : E,
    var sixth  : F,
    var seventh: G,
    var eighth : H,
    var ninth  : I
) : MutableTuple {

    override var size: Int = 9

    override fun toTuple(): Tuple9<A, B, C, D, E, F, G, H, I> = Tuple9(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)

    override fun toString(): String = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh, $eighth, $ninth)"
}


fun <A, B> Pair<A, B>.toMutableTuple(): MutableTuple2<A, B> = MutableTuple2(first, second)
fun <A, B, C> Triple<A, B, C>.toMutableTuple(): MutableTuple3<A, B, C> = MutableTuple3(first, second, third)

fun <A, B> MutableTuple2<A, B>.toPair(): Pair<A, B> = Pair(first, second)
fun <A, B, C> MutableTuple3<A, B, C>.toTriple(): Triple<A, B, C> = Triple(first, second, third)


fun <A> MutableTuple2<A, A>.toList(): List<A> = listOf(first, second)
fun <A> MutableTuple2<A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second)
inline fun <reified A> MutableTuple2<A, A>.toArray(): Array<A> = arrayOf(first, second)

fun <A> MutableTuple3<A, A, A>.toList(): List<A> = listOf(first, second, third)
fun <A> MutableTuple3<A, A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second, third)
inline fun <reified A> MutableTuple3<A, A, A>.toArray(): Array<A> = arrayOf(first, second, third)

fun <A> MutableTuple4<A, A, A, A>.toList(): List<A> = listOf(first, second, third, fourth)
fun <A> MutableTuple4<A, A, A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second, third, fourth)
inline fun <reified A> MutableTuple4<A, A, A, A>.toArray(): Array<A> = arrayOf(first, second, third, fourth)

fun <A> MutableTuple5<A, A, A, A, A>.toList(): List<A> = listOf(first, second, third, fourth, fifth)
fun <A> MutableTuple5<A, A, A, A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second, third, fourth, fifth)
inline fun <reified A> MutableTuple5<A, A, A, A, A>.toArray(): Array<A> = arrayOf(first, second, third, fourth, fifth)

fun <A> MutableTuple6<A, A, A, A, A, A>.toList(): List<A> = listOf(first, second, third, fourth, fifth, sixth)
fun <A> MutableTuple6<A, A, A, A, A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second, third, fourth, fifth, sixth)
inline fun <reified A> MutableTuple6<A, A, A, A, A, A>.toArray(): Array<A> = arrayOf(first, second, third, fourth, fifth, sixth)

fun <A> MutableTuple7<A, A, A, A, A, A, A>.toList(): List<A> = listOf(first, second, third, fourth, fifth, sixth, seventh)
fun <A> MutableTuple7<A, A, A, A, A, A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second, third, fourth, fifth, sixth, seventh)
inline fun <reified A> MutableTuple7<A, A, A, A, A, A, A>.toArray(): Array<A> = arrayOf(first, second, third, fourth, fifth, sixth, seventh)

fun <A> MutableTuple8<A, A, A, A, A, A, A, A>.toList(): List<A> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth)
fun <A> MutableTuple8<A, A, A, A, A, A, A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second, third, fourth, fifth, sixth, seventh, eighth)
inline fun <reified A> MutableTuple8<A, A, A, A, A, A, A, A>.toArray(): Array<A> = arrayOf(first, second, third, fourth, fifth, sixth, seventh, eighth)

fun <A> MutableTuple9<A, A, A, A, A, A, A, A, A>.toList(): List<A> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)
fun <A> MutableTuple9<A, A, A, A, A, A, A, A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)
inline fun <reified A> MutableTuple9<A, A, A, A, A, A, A, A, A>.toArray(): Array<A> = arrayOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)