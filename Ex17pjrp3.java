/**
 * Ejercicio 3 del examen fecha : 11/11/2020 1ºDAM
 * 
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ex17pjrp3 {
  public static void main(String[] args) {
      
      
      System.out.printf("Introduzca un número: ");
      int num = Integer.parseInt(System.console().readLine());
      
      
      int rec = num;
      int tam = 1;
      while (rec > 10)  {
        rec = rec / 10;
        tam++;
      }
      
      int resul = num;
      for(int i = tam ;i > rec;i--)  {
          resul = resul / 10;
      }
      
        System.out.printf("El número recortado es %d", resul);
  }
}

   
