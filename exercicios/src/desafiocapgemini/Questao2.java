package desafiocapgemini;

import java.util.Scanner;

/**
 * Questão 02
Débora se inscreveu em uma rede social para se manter em contato com seus amigos.
A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte.
- O site considera uma senha forte quando ela satisfaz os seguintes critérios:
    Possui no mínimo 6 caracteres.
    Contém no mínimo 1 digito.
    Contém no mínimo 1 letra em minúsculo.
    Contém no mínimo 1 letra em maiúsculo.
    Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
 -Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte.
 -Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.
 -Explicação: Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab.
2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.
 */

public class Questao2 {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserir nova senha: ");
        String senha = sc.next();
        String pattern = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9a-zA-Z!@#$%^&*()-+].{6,}";

       System.out.println(senha.matches(pattern));

    }

}