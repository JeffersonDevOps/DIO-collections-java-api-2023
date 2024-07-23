package Main.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemsParaRemover.add(i);
                }
            }
            itemList.removeAll(itemsParaRemover);
        } else{
            System.out.println("Não há itens no Carrinho, não há itens a remover!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if (!itemList.isEmpty()) {
            for (Item itens : itemList){
                valorTotal += itens.getPreco() * itens.getQuantidade();
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Não há itens no Carrinho!");
        }
    }

    public void exibirItens(){
        if (!itemList.isEmpty()) {
            System.out.println(itemList);
        } else{
            System.out.println("Não há nada no carrinho!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Biscoito", 1.50, 3);
        carrinhoDeCompras.adicionarItem("Maca", 2.50, 2);
        carrinhoDeCompras.adicionarItem("Massa de Tomate", 5.50, 2);
//        carrinhoDeCompras.adicionarItem("Biscoito", 1.50, 3);
//        carrinhoDeCompras.adicionarItem("Biscoito", 1.50, 3);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("maca");
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total do carrinho é: " + carrinhoDeCompras.calcularValorTotal());

    }
}
