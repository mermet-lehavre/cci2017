public class Hello {
    private static void methode() {
	System.out.println("début methode 1");
	System.out.println("milieu methode 1");
	System.out.println("milieu methode 2");
	System.out.println("fin methode 1");
	System.out.println("fin finale");
    }
    public static void main(String... args) {
	methode();
	System.out.println("Préambule");
	System.out.println("Bonjour tout le monde !");
	System.out.println("Au revoir");
	System.out.println("Comment allez-vous ?");
	System.out.println("Épilogue");
	methode2();
    }
    private static void methode2() {
    }
}
