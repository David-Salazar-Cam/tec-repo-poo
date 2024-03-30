package tec.poo.proyectos.movies.common.validators;

public class StringValidator {
    public static void ThrowIfNullOrEmpty(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("String value is null or empty");
        }
    }
}
