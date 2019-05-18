package exemples;

public class ExempleBloc {

  public static void main(String[] args) {
    int uneVariable = 1;

    // le code contenu entre { et } est appelé bloc d'instructions.
    {
//      int uneVariable;
      // Erreur : le nom de variable uneVariable est deja pris.

      int uneSecondeVariable = 2;
      System.out.println(uneSecondeVariable);
    }

    // Affiche 1
    System.out.println(uneVariable);

//    System.out.println(uneSecondeVariable);
    // Erreur : la variable uneSecondeVariable ne peut pas être utilisée en
    // dehors du bloque où elle a été déclarée.
  }

}
