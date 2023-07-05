public class Somar{
    public int somarNumeros(int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }
}