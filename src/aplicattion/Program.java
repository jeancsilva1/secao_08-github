package aplicattion;

import entities.Product;

public class Program {
    
    public static void main(String[] args) {
        Product product = new Product();
        product.nome = "TV";
        product.preco = 900.0;
        product.quantidade = 10;
        
        System.out.println(product);
        System.out.println("Adicionando produtos...");
        product.adicionaProduto(10);
        System.out.println(product);
        System.out.println("Retirando produtos...");
        product.retiraProduto(5);
        System.out.println(product);
    }
    
}
