package br.com.dio.santander.relações.exerc3_heranca;

public class RodarAplicacao {

    public static void main(String[] args) {
        //vetor com 3 objetos
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
        //Percorreu o método e chamou ele, fez o polimorfismo,
        // pois inferiu os dados dos objetos ClasseFilha1 e ClasseFilha2.
        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");
        //Percorreu o método e chamou ele, porem só teve polimorfismo na ClasseFilha2,
        // pois a ClasseFilha1 não teve método2
        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2(); // sobrescrita pura
        classeFilha2.metodo2();

    }
}
