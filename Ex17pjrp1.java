/**
 * Ejercicio 1 del examen fecha : 11/11/2020 1ºDAM
 * 
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ex17pjrp1 {
  public static void main(String[] args) {
  
      System.out.printf("Introduzca la cantidad de polos que desea: ");
      int cant = Integer.parseInt(System.console().readLine());
      System.out.printf("\n1) blanco 2) color: ");
      int color = Integer.parseInt(System.console().readLine());
      System.out.printf("\n1)serigrafia 2)bordado: ");
      int adorno = Integer.parseInt(System.console().readLine());
      
      System.out.printf("\nEL POLITO BONITO - PRESUPUESTO\n");
      
      double precio = 0;
      if(cant >= 20 && cant < 40) {
        precio = 4.90;
      } else if (cant >= 40 && cant <100) {
        precio = 3.90;
      } else  {
        precio = 3.20;
      }
      if(color == 2)  {
        System.out.printf("\nPolo en blanco (unid.): %d\n", cant);
        System.out.printf("Precio unitario: %4.2f €\n", precio * 1.2);
        System.out.printf("Total textil: %4.2f €\n", precio * 1.2 * cant );
          if(adorno == 1)  {
          System.out.printf("Serigrafia(c.u.): %4.2f €\n", 2.00);
          System.out.printf("Total Serigrafia: %4.2f €\n", cant * 2.00);
          System.out.printf("Polo más logotipo: %4.2f €\n", cant * 2.00 + precio * 1.2 * cant);
          System.out.printf("IVA: %4.2f €\n", (cant * 2.00 + precio * 1.2 * cant) * 0.21);
          System.out.printf("Total: %4.2f €\n", (cant * 2.00 + precio * 1.2 * cant) * 1.21);
        } else  {
          System.out.printf("Bordado(c.u): %4.2f\n", 2.50);
          System.out.printf("Total Bordado: %4.2f €\n", cant * 2.50);
          System.out.printf("Polo más logotipo: %4.2f €\n", cant * 2.50 + precio * 1.2 * cant);
          System.out.printf("IVA: %4.2f €\n", (cant * 2.50 + precio * 1.2 * cant) * 0.21);
          System.out.printf("Total: %4.2f €\n", (cant * 2.50 + precio * 1.2 * cant) * 1.21);
        }
      } else  {
        System.out.printf("Polo en color (unid.): %d\n", cant);
        System.out.printf("Precio unitario: %4.2f €\n", precio);
        System.out.printf("Total textil: %4.2f €\n", precio * cant);
        if(adorno == 1)  {
          System.out.printf("Serigrafia(c.u.): %4.2f €\n", 2.00);
          System.out.printf("Total Serigrafia: %4.2f €\n", cant * 2.00);
          System.out.printf("Polo más logotipo: %4.2f €\n", cant * 2.00 + precio * cant);
          System.out.printf("IVA: %4.2f €\n", (cant * 2.00 + precio * cant) * 0.21);
          System.out.printf("Total: %4.2f €\n", (cant * 2.00 + precio * cant) * 1.21);
        } else  {
          System.out.printf("Bordado(c.u): %4.2f\n", 2.50);
          System.out.printf("Total Bordado: %4.2f €\n", cant *2.50);
          System.out.printf("Polo más logotipo: %4.2f €\n", cant *2.50 + precio * cant);
          System.out.printf("IVA: %4.2f €\n", (cant * 2.50 + precio * cant) * 0.21);
          System.out.printf("Total: %4.2f €\n", (cant * 2.50 + precio * cant) * 1.21);
        }
      }
      
  }
}

   
