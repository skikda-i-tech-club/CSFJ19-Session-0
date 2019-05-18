package exemples;

import java.util.Scanner;

public class ExempleTableaux {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // déclaration d'une référence à un tableau de float.
    float[] notes;

    int nombreModule;
    do {
      System.out.println("Entrez le nombre de modules :");
      nombreModule = in.nextInt();
    } while (nombreModule <= 0);

    // création d'un tableau de float.
    notes = new float[nombreModule];

    for (int i = 0; i < notes.length; i++) {
      do {
        System.out.println("Entrez la note " + i + " :");
        notes[i] = in.nextFloat();
      } while (notes[i] > 20f || notes[i] < 0f);
    }

    float moyenne = 0f;
    for (int i = 0; i < notes.length; i++) {
      moyenne += notes[i];
    }
    moyenne /= notes.length;

    System.out.printf("La moyenne est de : %+10.2f\n", -moyenne);
  }

}
