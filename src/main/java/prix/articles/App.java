package prix.articles;

public class App {
    
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        System.out.print("Combien avez vous d'articles : ");
        int nbArticles = clavier.nextInt();

        double total = 0;

        for (int i = 1; i <= nbArticles; i++) {
            System.out.print("Entrez leprix de l'articles" +1 + " : ");
            double prix = Clavier.nextDouble();
            total = total + prix;
        }
        clavier.close();
        System.out.println("Votre total est de : ");
         
        
    }
    
}
