/**
 * Ejercicio 4 del examen fecha : 11/11/2020 1ºDAM
 * 
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ex17pjrp4 {
  public static void main(String[] args) {
      int alt = 3;
      int troz = 2;
      while (alt % troz != 0)  {
      
        System.out.printf("Introduzca la altura de la piramide: ");
        alt = Integer.parseInt(System.console().readLine());
        System.out.printf("\nIntroduzca el número de trozos: ");
        troz = Integer.parseInt(System.console().readLine());
        if (alt % troz != 0)  {
          System.out.println("Una piramide de " + alt + "pisos no puede dividirse en " + troz + " trozos de la misma altura. Vuelva a intentarlo");
        }
      }
      int planta = 1;
      int longitudDeLinea = 1;
      int espacios = alt-1;
    
      while (planta <= alt) {
        
        // inserta espacios
        for (int i = 1; i <= espacios; i++) {
          System.out.print(" ");
        }

        // pinta la línea
        for (int i = 1; i <= longitudDeLinea; i++) {
          System.out.print('*');
        }

        System.out.println();
        
        if(espacios % (alt / troz) == 0)  {
            System.out.println();
        }
        planta++;
        espacios--;
        longitudDeLinea += 2;
       
    }
  }
}
    
