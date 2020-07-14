
/**
 *
 * @author dprog
 */
public class leon extends animal implements animalComiendo {
    //Esta clase leon hereda los atributos principales de animal e implementa de la interfaz animalComiendo
    //para definir el metodo animalComiendo;
    void leon () {
        patas = 4;
        tipo = "Leon";
        herbivoro = false;
    }
     
    public void animalComiendo () {
        System.out.println("Comiendo carne...");
    }
    
    public void animalComiendo (animal presa) {
        System.out.println("(Comiendo carne de " + presa.tipo + ")");
    }
}
