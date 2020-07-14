
/**
 *
   * @author dprog
   */
import java.io.*;
public class main {

   public static void main(String[] args) {

      //Creamos un hilo que pone la trama a la historia.
      hiloCreaAnimales trama = new hiloCreaAnimales();
      trama.start();

      //Creamos un nuevo leon y su primera presa. Además creamos un arreglo de 10 futuras presas
      leon leo = new leon();
      animal presa1 = new animal("Antilope",4,true);
      animal presas[] = new animal[10];

      leo.animalComiendo();
      leo.animalComiendo(presa1);

      //El leon se come sus presas cada 1s
      for (int i = 0; i < 10; i++) {
         presas[i] = new animal();
         leo.animalComiendo(presas[i]);
         try {
               Thread.sleep(1000);
         }catch (Exception e) {
               System.out.println(e);
         }
      }

      trama.detenerHilo();

      //Manejo de Ficheros: 
      //En este apartado se escribirá a un archivo que comio el leon
      File cantCiervosComidos = new File("elLeonSeComio.txt");
      
      try{
            FileWriter fw = new FileWriter(cantCiervosComidos, true);
            fw.write("EL LEÓN SE COMIÓ 10 CIERVOS Y 1 ANTILOPE");
            fw.close();
      } catch (Exception e) {
            e.printStackTrace();
      }
      
      //Lectura del archivo
      try {
         FileReader fr = new FileReader (cantCiervosComidos);
         BufferedReader br = new BufferedReader(fr);

         String linea;
         while((linea=br.readLine())!=null)
            System.out.println(linea);
         fr.close();
      }
      catch(Exception e){
         e.printStackTrace();
      }
      

   }
}
