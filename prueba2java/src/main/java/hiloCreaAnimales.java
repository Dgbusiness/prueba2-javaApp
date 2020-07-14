
/**
 *
 * @author dprog
 */
public class hiloCreaAnimales extends Thread{
   
   // boolean que pondremos a false cuando queramos parar el hilo
   private boolean continuar = true;

   // metodo para poner el boolean a false.
   public void detenerHilo()
   {
      continuar=false;
   }

   // Metodo del hilo
   public void run()
   {
      // mientras continuar ...
      while (continuar)
      {
          System.out.println("Mientras tanto en el bosque de los pepinos... ");
          try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            this.sleep(2*1000);
          }catch (Exception e) {
            System.out.println(e);
          }
      }
   }
}
