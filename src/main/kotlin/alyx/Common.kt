package alyx

fun <T> Boolean?.ifElse(yes: T, no: T): T = if (this == true) yes else no

inline fun <T> Boolean?.ifElse(yes: () -> T, no: () -> T): T = if (this == true) yes() else no()