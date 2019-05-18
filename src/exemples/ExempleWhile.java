package exemples;

public class ExempleWhile {

  public static void main(String[] args) {

    // afficher 10 x "Hello world."
    byte i = 0;
    while (i < 10) {
      System.out.println("Hello world.");
      i++;
    }

    // valeur de i après la boucle
    System.out.println(i);

    // que ce passe t-il si j'ajoute 1 au maximum de byte (127) ?
    i = 127;
    i++;
    System.out.println(i);

    // réponse: les valeurs sont cycliques (127 + 1 = -128).
  }

}
