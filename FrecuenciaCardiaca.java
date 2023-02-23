package taresa2;

public class FrecuenciaCardiaca 
{
	private String nombre, apellido;
	private int dia,mes,año,edad;
	private double FC,FCesperada;
	private String FechaCompleta;
	
	public  FrecuenciaCardiaca(String nombre, String apellido, int mes, int dia, int año)
	{
		this.nombre=nombre;
		this.apellido=apellido;
		this.dia=dia;
		this.mes=mes;
		this.año=año;
	
	}
	
	public void establecer(String nombre, String apellido, int dia, int mes, int año, int edad, double FC,String FechaCompleta)
	{
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.dia=dia;
		this.mes=mes;
		this.año=año;
		this.edad=edad;
		this.FechaCompleta=FechaCompleta;
	}
	
	public String obtenerNombre()
	{
		return nombre;
	}
	public String obteneraApellido()
	{
		return apellido;
	}
	public int obtenerDia()
	{
		return dia;
	}
	public int obtenerMes()
	{
		return mes;
	}
	public int obtenerAño()
	{
		return año;
	}
	public String obtenerFecha()
	{
		FechaCompleta="\nLA FECHA INGRESADA ES:            "+mes+"/"+dia+"/"+año;
		return FechaCompleta;
	}
	public int edad()
	{
		edad=2023-año;
		return edad;
	}
	public double FC()
	{
		FC=220-edad;
		return FC;
	}
	public double FCesperadaMin ()
		{
		
		  FCesperada=FC*0.5;
		  return FCesperada;	
		}
	public double FCesperadaMax ()
	{
	
	  FCesperada=FC*0.85;
	  return FCesperada;	
	}
	
}
