package taresa2;

public class PruebaPerfilMedico {

	public static void main(String[] args) 
	{
		
		PerfilMedico impresion1=new PerfilMedico("jair", "olivares", "Masculino", 19, 01, 2000, 180,86);

		System.out.println("Nombre:                           "+impresion1.obtenerNombre()+
		                   "\nApellido:                         "+impresion1.obteneraApellido()+
		                                                         impresion1.obtenerFecha()+
		                   "\nAltura en cm:                     "+impresion1.obtenerAltura()+
		                   "\nPeso en Kg:                       "+impresion1.obtenerPeso()+
		                   "\nEdad:                             "+impresion1.edad()+
		                   "\nSexo:                             "+impresion1.obtenerSexo()+
		                   "\nFrecuencia cardiaca max:          "+impresion1.FC()+
		                   "\nFrecuencia cardiaca esperada:     "+impresion1.FCesperadaMin()+"-"+impresion1.FCesperadaMax()+
		                   "\nIndice de Masa Corporal:          "+impresion1.IndiceDEMasaCorporal());
		 System.out.println("          \nInstituto Nacinal De Salud\n \n       "
	        		+          "   VALORES DE BMI\n"
	        		+          " Bajo peso: menos de:   18.5\n"
	        		+          " Normal:                18.5 y 24.9\n"
	        		+          " Sobre peso:            25 y 29.9\n"
	        		+ ""
	        		+          " Obesidad:              30 o mas\n");

	      
	}

}
