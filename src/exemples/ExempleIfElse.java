package exemples;

import java.util.Scanner;

public class ExempleIfElse {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Entrez la moyenne : ");
    float moyenneEtudiant = in.nextFloat();

    if (moyenneEtudiant < 0f || moyenneEtudiant > 20f) {
      System.out.println("Erreur");
      return;
    }

    if (moyenneEtudiant < 8) {
      System.out.println("Faible");
    } else if (moyenneEtudiant >= 8 && moyenneEtudiant < 12) {
      System.out.println("Moyen");
    } else if (moyenneEtudiant >= 12 && moyenneEtudiant < 17) {
      System.out.println("Bon");
    } else {
      System.out.println("Excellent");
    }

  }

}
