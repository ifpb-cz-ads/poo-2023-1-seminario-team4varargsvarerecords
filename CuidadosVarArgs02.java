import java.util.*;

public class CuidadosVarArgs02 {
    public static void main(String[] args) {
        String one = firstOfFirst((ArrayList<String>) Arrays.asList("Um", "Dois"), (ArrayList<String>) Arrays.asList("Três", "Quatro"));
    }

    static String firstOfFirst(ArrayList<String>...strings) {
        ArrayList<Integer> inteiros = new ArrayList<>(Arrays.asList(0, 10, 12));
        Object[] objects = strings;
        objects[0] = inteiros;

        return strings[0].get(0);
    }
}
