package zhupff.alyx.color

data class Colors(
    val origin: Int, val mode: Mode,
    val primary: Int, val onPrimary: Int, val primaryContainer: Int, val onPrimaryContainer: Int,
    val secondary: Int, val onSecondary: Int, val secondaryContainer: Int, val onSecondaryContainer: Int,
    val tertiary: Int, val onTertiary: Int, val tertiaryContainer: Int, val onTertiaryContainer: Int,
    val error: Int, val onError: Int, val errorContainer: Int, val onErrorContainer: Int,
    val background: Int, val onBackground: Int, val surface: Int, val onSurface: Int,
    val surfaceVariant: Int, val onSurfaceVariant: Int, val inverseSurface: Int, val inverseOnSurface: Int,
    val outline: Int, val outlineVariant: Int,
    val shadow: Int, val scrim: Int,
    val inversePrimary: Int, val inverseSecondary: Int, val inverseTertiary: Int
) {
    enum class Mode {
        Light, Dark
    }
}