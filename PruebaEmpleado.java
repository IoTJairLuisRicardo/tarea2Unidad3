package taresa2;


import javax.swing.JOptionPane;

public class PruebaEmpleado 
{
	 public static void main (String []args)
     {
    	 
    	 
    	 
    	 Empleado impresion1=new Empleado("jair", "olivares", 800);
    	 Empleado impresion2=new Empleado("luis", "Mendez", 700);
    	 Empleado impresion3=new Empleado("Ricardo", "joto", 600);
    		
    	 
    	 System.out.println("\nEl salario  Mensual es de"); 
			System.out.println(impresion1.obtenerNombre()+" "+impresion1.obtenerApellido()+" "+impresion1.obtenerSalarioM());
			System.out.println(impresion2.obtenerNombre()+" "+impresion2.obtenerApellido()+" "+impresion2.obtenerSalarioM());
			System.out.println(impresion3.obtenerNombre()+" "+impresion3.obtenerApellido()+" "+impresion3.obtenerSalarioM());

			System.out.println("\nEl salario a ANUAL es de");			
			System.out.println(impresion1.obtenerNombre()+" "+impresion1.obtenerApellido()+" "+impresion1.obtenerSalarioAnual());
			System.out.println(impresion2.obtenerNombre()+" "+impresion2.obtenerApellido()+" "+impresion2.obtenerSalarioAnual());
			System.out.println(impresion3.obtenerNombre()+" "+impresion3.obtenerApellido()+" "+impresion3.obtenerSalarioAnual());
			
			
			
			System.out.println("\nEl salario  MENSUAL con un AUMENTO de 10% es de");			
			System.out.println(impresion1.obtenerNombre()+" "+impresion1.obtenerApellido()+" "+impresion1.obtenerAumentoMensual());
			System.out.println(impresion2.obtenerNombre()+" "+impresion2.obtenerApellido()+" "+impresion2.obtenerAumentoMensual());
			System.out.println(impresion3.obtenerNombre()+" "+impresion3.obtenerApellido()+" "+impresion3.obtenerAumentoMensual());
			
			System.out.println("\nEl salario a ANUAL es de");			
			System.out.println(impresion1.obtenerNombre()+" "+impresion1.obtenerApellido()+" "+impresion1.obtenerAumento());
			System.out.println(impresion2.obtenerNombre()+" "+impresion2.obtenerApellido()+" "+impresion2.obtenerAumento());
			System.out.println(impresion3.obtenerNombre()+" "+impresion3.obtenerApellido()+" "+impresion3.obtenerAumento());
			
			
			/*JOptionPane.showMessageDialog( null, "Bienvenido \nNombre:               "+impresion1.obtenerNombre()+
					                                        "\nApellido:              "+impresion1.obtenerApellido()+
			                                                "\nSaldo Mensual:  "+impresion1.obtenerSalarioM());
			
			JOptionPane.showMessageDialog( null, "Bienvenido \nNombre:               "+impresion2.obtenerNombre()+
                                                            "\nApellido:              "+impresion2.obtenerApellido()+
                                                            "\nSaldo Mensual:  "+impresion2.obtenerSalarioM());
			
			JOptionPane.showMessageDialog( null, "Bienvenido \nNombre:               "+impresion3.obtenerNombre()+
                                                            "\nApellido:              "+impresion3.obtenerApellido()+
                                                            "\nSaldo Mensual:  "+impresion3.obtenerSalarioM());
            */
    		
			
    	 
    	 
     }

}
