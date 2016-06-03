public class Hello {
    private static void methode() {
	System.out.println("début methode 1");
	System.out.println("milieu methode 1");
	System.out.println("fin methode 1");
    }
    public static void main(String... args) {
	methode();
	System.out.println("Préambule");
	System.out.println("hello world !");
	System.out.println("good bye");
	System.out.println("Épilogue");
    }
}
