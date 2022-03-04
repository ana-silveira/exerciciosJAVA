package tpsdados;

public class TpsDados {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
//short s2 = 40000;  (o tamanho ultrapassa muito o limite máximo suportado pelo byte)
// int i1 = -10000000000 ; (o tamanho ultrapassa muito o limite minimo suportado pelo inteiro)
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

//float f1 = 4.5; (Vai dar erro porque, sem o f ao final, o sistema entende que o valor se trata de uma variável do tipo double, que possui capacidade de armazenamento muito maior, e portanto, não cabe em um float)
        float f2 = 10.68F;

        double d1 = 85.69; //(O sistema entende como double automaticamente, então a falta do D não causa nenhum problema aqui)
        double d2 = 99.04D;


        char c1 = 'W';
// char c2 = 'Tw'; (Dá erro pq o char só permite 1 caractere dentro das aspas simples).
        char c3 = '\u0057'; // Código unicode que reprenta ao valor W. Está correto.

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag kfgj gsligu glsgu lsiugug uh5i7w 58q çHih HU4HT O847 TO LUH uHhuu laeriut l";

// String dt1 = "09/02/1981"; (Existe um tipo de dados especifico para datas; O string não é o tipo mais adequado)

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}
