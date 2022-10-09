package zhupff.alyx.tuple

import java.io.Serializable

interface Tuple : Serializable {
    val size: Int
    fun toMutableTuple(): MutableTuple
}

data class Tuple2<A, B>(
    val first : A,
    val second: B
) : Tuple {

    override val size: Int = 2

    override fun toMutableTuple(): MutableTuple2<A, B> = MutableTuple2(first, second)

    override fun toString(): String = "($first, $second)"
}

data class Tuple3<A, B, C>(
    val first  : A,
    val second : B,
    val third  : C
) : Tuple {

    override val size: Int = 3

    override fun toMutableTuple(): MutableTuple3<A, B, C> = MutableTuple3(first, second, third)

    override fun toString(): String = "($first, $second, $third)"
}

data class Tuple4<A, B, C, D>(
    val first  : A,
    val second : B,
    val third  : C,
    val fourth : D
) : Tuple {

    override val size: Int = 4

    override fun toMutableTuple(): MutableTuple4<A, B, C, D> = MutableTuple4(first, second, third, fourth)

    override fun toString(): String = "($first, $second, $third, $fourth)"
}

data class Tuple5<A, B, C, D, E>(
    val first  : A,
    val second : B,
    val third  : C,
    val fourth : D,
    val fifth  : E
) : Tuple {

    override val size: Int = 5

    override fun toMutableTuple(): MutableTuple5<A, B, C, D, E> = MutableTuple5(first, second, third, fourth, fifth)

    override fun toString(): String = "($first, $second, $third, $fourth, $fifth)"
}

data class Tuple6<A, B, C, D, E, F>(
    val first  : A,
    val second : B,
    val third  : C,
    val fourth : D,
    val fifth  : E,
    val sixth  : F
) : Tuple {

    override val size: Int = 6

    override fun toMutableTuple(): MutableTuple6<A, B, C, D, E, F> = MutableTuple6(first, second, third, fourth, fifth, sixth)

    override fun toString(): String = "($first, $second, $third, $fourth, $fifth, $sixth)"
}

data class Tuple7<A, B, C, D, E, F, G>(
    val first  : A,
    val second : B,
    val third  : C,
    val fourth : D,
    val fifth  : E,
    val sixth  : F,
    val seventh: G
) : Tuple {

    override val size: Int = 7

    override fun toMutableTuple(): MutableTuple7<A, B, C, D, E, F, G> = MutableTuple7(first, second, third, fourth, fifth, sixth, seventh)

    override fun toString(): String = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh)"
}

data class Tuple8<A, B, C, D, E, F, G, H>(
    val first  : A,
    val second : B,
    val third  : C,
    val fourth : D,
    val fifth  : E,
    val sixth  : F,
    val seventh: G,
    val eighth : H
) : Tuple {

    override val size: Int = 8

    override fun toMutableTuple(): MutableTuple8<A, B, C, D, E, F, G, H> = MutableTuple8(first, second, third, fourth, fifth, sixth, seventh, eighth)

    override fun toString(): String = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh, $eighth)"
}

data class Tuple9<A, B, C, D, E, F, G, H, I>(
    val first  : A,
    val second : B,
    val third  : C,
    val fourth : D,
    val fifth  : E,
    val sixth  : F,
    val seventh: G,
    val eighth : H,
    val ninth  : I
) : Tuple {

    override val size: Int = 9

    override fun toMutableTuple(): MutableTuple9<A, B, C, D, E, F, G, H, I> = MutableTuple9(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)

    override fun toString(): String = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh, $eighth, $ninth)"
}


fun <A, B> Pair<A, B>.toTuple(): Tuple2<A, B> = Tuple2(first, second)
fun <A, B, C> Triple<A, B, C>.toTuple(): Tuple3<A, B, C> = Tuple3(first, second, third)

fun <A, B> Tuple2<A, B>.toPair(): Pair<A, B> = Pair(first, second)
fun <A, B, C> Tuple3<A, B, C>.toTriple(): Triple<A, B, C> = Triple(first, second, third)


fun <A> Tuple2<A, A>.toList(): List<A> = listOf(first, second)
fun <A> Tuple2<A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second)
inline fun <reified A> Tuple2<A, A>.toArray(): Array<A> = arrayOf(first, second)

fun <A> Tuple3<A, A, A>.toList(): List<A> = listOf(first, second, third)
fun <A> Tuple3<A, A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second, third)
inline fun <reified A> Tuple3<A, A, A>.toArray(): Array<A> = arrayOf(first, second, third)

fun <A> Tuple4<A, A, A, A>.toList(): List<A> = listOf(first, second, third, fourth)
fun <A> Tuple4<A, A, A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second, third, fourth)
inline fun <reified A> Tuple4<A, A, A, A>.toArray(): Array<A> = arrayOf(first, second, third, fourth)

fun <A> Tuple5<A, A, A, A, A>.toList(): List<A> = listOf(first, second, third, fourth, fifth)
fun <A> Tuple5<A, A, A, A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second, third, fourth, fifth)
inline fun <reified A> Tuple5<A, A, A, A, A>.toArray(): Array<A> = arrayOf(first, second, third, fourth, fifth)

fun <A> Tuple6<A, A, A, A, A, A>.toList(): List<A> = listOf(first, second, third, fourth, fifth, sixth)
fun <A> Tuple6<A, A, A, A, A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second, third, fourth, fifth, sixth)
inline fun <reified A> Tuple6<A, A, A, A, A, A>.toArray(): Array<A> = arrayOf(first, second, third, fourth, fifth, sixth)

fun <A> Tuple7<A, A, A, A, A, A, A>.toList(): List<A> = listOf(first, second, third, fourth, fifth, sixth, seventh)
fun <A> Tuple7<A, A, A, A, A, A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second, third, fourth, fifth, sixth, seventh)
inline fun <reified A> Tuple7<A, A, A, A, A, A, A>.toArray(): Array<A> = arrayOf(first, second, third, fourth, fifth, sixth, seventh)

fun <A> Tuple8<A, A, A, A, A, A, A, A>.toList(): List<A> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth)
fun <A> Tuple8<A, A, A, A, A, A, A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second, third, fourth, fifth, sixth, seventh, eighth)
inline fun <reified A> Tuple8<A, A, A, A, A, A, A, A>.toArray(): Array<A> = arrayOf(first, second, third, fourth, fifth, sixth, seventh, eighth)

fun <A> Tuple9<A, A, A, A, A, A, A, A, A>.toList(): List<A> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)
fun <A> Tuple9<A, A, A, A, A, A, A, A, A>.toMutableList(): MutableList<A> = mutableListOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)
inline fun <reified A> Tuple9<A, A, A, A, A, A, A, A, A>.toArray(): Array<A> = arrayOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)