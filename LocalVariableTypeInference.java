import java.util.ArrayList;
import java.util.List;

public class LocalVariableTypeInference {
    public static void main (String[] args) {
             
        // Exemplo com declaração explícita do tipo

        // ORIGINAL
        int numero1 = 10;
        System.out.println(((Object)numero1).getClass().getSimpleName());
        // LVTI
        var numero2 = 10;
        System.out.println(((Object)numero2).getClass().getSimpleName());


        // Exemplo de melhora na legibilidade diminuindo a repetição
        
        // ORIGINAL
        List<String> nomes1 = new ArrayList<>();
        nomes1.add("teste");
        for (var x : nomes1) {
            System.out.println(x.getClass().getSimpleName());
        }
        System.out.println(nomes1.getClass().getSimpleName()); 
        // PREFERÍVEL
        var nomes2 = new ArrayList<String>();
        System.out.println(nomes2.getClass().getSimpleName());
        // PERIGOSO: inferido como ArrayList<Object>
        var nomes3 = new ArrayList<>();
        nomes3.add(1);
        for (var y : nomes3) {
            System.out.println(y.getClass().getSimpleName());
        }
        System.out.println(nomes3.getClass().getSimpleName());


        // Exemplo de como devemos ter cuidado ao declarar primitivos como "var"

        // ORIGINAL
        byte flags1 = 0;
        System.out.println(((Object)flags1).getClass().getSimpleName());
        short mask1 = 0x7fff;
        System.out.println(((Object)mask1).getClass().getSimpleName());
        long base1 = 17;
        System.out.println(((Object)base1).getClass().getSimpleName());
        // PERIGOSO: Todos inferidos como Int
        var flags2 = 0;
        System.out.println(((Object)flags2).getClass().getSimpleName());
        var mask2 = 0x7fff;
        System.out.println(((Object)mask2).getClass().getSimpleName());
        var base2 = 17;
        System.out.println(((Object)base2).getClass().getSimpleName());
    }
}