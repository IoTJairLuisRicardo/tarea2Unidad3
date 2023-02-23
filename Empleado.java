package taresa2;


public class Empleado 
{

	
		
		
		private String nombre;
		private String apellido;
		private double SalarioM, SalarioA;
		
		public Empleado(String nombre, String apellido, double SalarioM)
		{
			this.nombre=nombre;
			this.apellido=apellido;
			
			
		     if(SalarioM>0)
		     {
		    	 this.SalarioM=SalarioM;
		    	 
		     }
			
			// TODO Auto-generated method stub	
		}
		
		public  void establecer(String nombre, String apellido, double SalarioM)
		{
			this.nombre=nombre;
			this.apellido=apellido;
			this.SalarioM=SalarioM;
		}
		
		public String obtenerNombre()
		{
			return nombre;
		}
		public String obtenerApellido()
		{
			return apellido;
		}
		public double obtenerSalarioM()
		{
			return SalarioM;
		}
		
		public double obtenerSalarioAnual()
		{
			SalarioA=SalarioM*12;
			return SalarioA;
		}
		
		public double obtenerAumento()
		{
			SalarioA=SalarioM+(SalarioM*0.1);
			SalarioA=SalarioA*12;
			return SalarioA;
		}
		public double obtenerAumentoMensual()
		{
			SalarioA=SalarioM+(SalarioM*0.1);
			
			return SalarioA;
		}
		
		
	
		

		

	

}
