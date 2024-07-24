package Main.List.Pesquisa;

import java.util.ArrayList;

import java.util.List;

public class SomaNumeros {
    //atributos
    List<Integer> numerosInteirosList;

    public SomaNumeros() {
        this.numerosInteirosList = numerosInteirosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosInteirosList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : numerosInteirosList){
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        for (Integer numero : numerosInteirosList){
            if (numero >= maiorNumero){
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for (Integer numero : numerosInteirosList){
            if (numero <= menorNumero){
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if (!numerosInteirosList.isEmpty()){
            System.out.println(this.numerosInteirosList);
        }
    }

    public static void main(String[] args) {
//        SomaNumeros somaNumeros = new SomaNumeros();
//
//
//        somaNumeros.adicionarNumero(10);
//        somaNumeros.adicionarNumero(1);
//        somaNumeros.adicionarNumero(110);
//        somaNumeros.adicionarNumero(200);
//
//        somaNumeros.exibirNumeros();
//        System.out.println(somaNumeros.calcularSoma());
//        System.out.println(somaNumeros.encontrarMaiorNumero());
//        System.out.println(somaNumeros.encontrarMenorNumero());

// Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());    }
}
