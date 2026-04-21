/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author Italo
 */
/**
 * Classe principal que testa a hierarquia de formas
 * usando um array de referências do tipo Forma.
 */
public class Atividade09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Array de referências do tipo Forma (polimorfismo!)
        // Forma é abstrata, mas o array pode guardar qualquer subclasse
        Forma[] formas = new Forma[6];

        // Preenchendo o array com objetos concretos
        formas[0] = new Circulo(5);
        formas[1] = new Quadrado(4);
        formas[2] = new Triangulo(6, 3);
        formas[3] = new Esfera(7);
        formas[4] = new Cubo(3);
        formas[5] = new Piramide(4, 6);
     
       
        System.out.println("===== FORMAS GEOMETRICAS =====\n");
        
        // Percorre o array e verifica o tipo de cada forma
        for (Forma f : formas) {

            // toString() mostra a descrição do objeto
            System.out.println(f.toString());

            // Verifica se é Forma2D
            if (f instanceof Forma2D) {
                Forma2D f2d = (Forma2D) f; // faz o cast
                System.out.printf("Tipo: Bidimensional | area: %.2f%n", f2d.obterArea());

            // Verifica se é Forma3D
            } else if (f instanceof Forma3D) {
                Forma3D f3d = (Forma3D) f; // faz o cast
                System.out.printf("Tipo: Tridimensional | area: %.2f | Volume: %.2f%n",
                        f3d.obterArea(), f3d.obterVolume());
            }
            System.out.println("------------------------------");
        
       }
    }
}
