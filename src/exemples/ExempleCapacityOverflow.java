package exemples;

public class ExempleCapacityOverflow {

  public static void main(String[] args) {

    byte uneVariable;

    uneVariable = 127;
    // ou bien :
//    uneVariable = Byte.MAX_VALUE;

    // Erreur : car byte ⟵ byte + int ⟺ byte ⟵ int (les types
    // sont incompatibles.)
//    uneVariable = uneVariable + 1;
//
//    Les instructions :
//    uneVariable++;
//    uneVariable += 1;
//    uneVariable = (byte) (uneVariable + 1);
//    Sont équivalentes et valides.
//
    uneVariable++;
    // affiche -128 (c-à-d Byte.MIN_VALUE)
    System.out.println(uneVariable);

    byte a = 127;
    a += 128;
    System.out.println(a);
  }

}
