package casting;

public class casting {
    public static void main(String[] args) {

       // conversão de um short para um byte -> Há perda de informação --> Downcasting
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; // houve redução da capacidade desse short para que ele pudesse caber no mesmo espaço de um byte;

        // conversão de um int para um long --> Upcasting
        long l1;
        int i1 = 10;
        l1 = i1; // long é maior que int, então a conversão não perde informação.

        // Downcasting
        int i2;
        long l2 = 1000000000000000000L; // Fora do limite máximo que um inteiro suporta -> Vai haver perda de informação.
        i2 = (int)l2;

        // Nesse caso é um Downcasting mas sem perda de informação
        int i3;
        long l3 = 10000L; // Esse valor long cabe como um inteiro, apesar de ser uma conversão do tipo downcasting.
        i3 = (int) l3;

        // Upcasting
        double d1;
        float f1 = 10.5f; // Está sobrando espaço de representação.
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2;
        double d3 = 10000.58888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3;

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4; // Vai acontecer o truncamento do valor, ou seja, só a parte inteira será considerada.

        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        b1 = (byte) d3;
        System.out.println("b1: " + b1);

    }
}
