package br.com.dio.santander;
 /*
 *  Classe de exemplo para o exercício da Aula 2 de Variáveis, Tipos de Dado e Operadores aritméticos.
 */
public class Exercitando02 {

     public static void main(String[] args) {

         byte b1 = 10;
         byte b2 = 20;

         short s1 = 20000;
         /*short s2 = 40000; O tamanho ultrapassa o limite máximo causando erro*/

         /*int i1 = -100000000000; O tamanho ultrapassa o limite inferior causando erro*/
         int i2 = 28500;

         /*long l1 = 1000000000000000000; Não define como long com o L ao fim da variável*/
         long l2 = 2540000000000000558L;

         /*float f1 = 4.5; Não define como float e sim como double, também colocando o f ao fim */
         float f2 = 10.68f;

         double d1 = 85.69;
         double d2 = 99.04d;

         char c1 = 'W';
         /*char c2 = 'Tw'; Somente 1 caracter*/
         char c3 = '\u0057'; // código unicode, acaba sendo iguala a W

         String st1 = "Fulano";
         String st2 = "Anderson";
         String st3 = "ag dgd se se et t KIOMAJUD &*&f@#$% 7851258";

         String dt1 = "09/02/2056"; // Fere as boas práticas

         boolean bo1 = true;
         boolean bo2 = false;

         System.out.println(b1);
         System.out.println(b2);
         System.out.println(s1);
         System.out.println(i2);
         System.out.println(b1);
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
         System.out.println(dt1);






     }

}
