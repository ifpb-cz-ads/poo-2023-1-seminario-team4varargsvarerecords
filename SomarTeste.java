public class SomarTeste {
    public static void main(String[] args) {
        Somar soma = new Somar();
        int resp1 = soma.somarNumeros(10, 20);
        int resp2 = soma.somarNumeros(10, 20, 30);
        int resp3 = soma.somarNumeros(10, 20, 30, 40, 50, 60);

        System.out.println(resp1);
        System.out.println(resp2);
        System.out.println(resp3);
    }
}
