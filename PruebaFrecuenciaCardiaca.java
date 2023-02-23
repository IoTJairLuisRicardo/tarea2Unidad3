package taresa2;

public class PruebaFrecuenciaCardiaca {

	public static void main(String[] args) 
	{
		
		FrecuenciaCardiaca impresion1= new FrecuenciaCardiaca("luis", "Mendez", 01, 19,2000);
		
		System.out.println("Nombre:                           "+impresion1.obtenerNombre()+
				         "\nApellido:                         "+impresion1.obteneraApellido()
				           +impresion1.obtenerFecha()+
				          "\nEdad:                             "+impresion1.edad()+
				           "\nFrecuencia cardiaca Maxima:       "+impresion1.FC()+
				           "\nFrecuencia cardiaca esperada:     "+impresion1.FCesperadaMin()+"-"+impresion1.FCesperadaMax());
	
		
	}

}
