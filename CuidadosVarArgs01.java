import java.util.Arrays;

public class CuidadosVarArgs01 {
    public static void main(String[] args) {
        String[] teste = intemediaria("Um", "Dois");
        System.out.println(Arrays.toString(teste));

    }

    static <T> T[] criarArray(T... arguments) {
        return arguments;
    }

    static <T> T[] intemediaria(T a, T b) {
        return criarArray(a, b);
    }
}
