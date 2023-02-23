package taresa2;

public class PerfilMedico
{
	private String nombre,apellido,sexo;
	private int mes, dia,año,edad;
	private String FechaCompleta;
	private int altura;
	private double peso,FC,BMI,FCesperada;
	
	public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int año,  int altura,double peso)
	{
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.sexo=sexo;
		this.dia=dia;
		this.mes=mes;
		this.año=año;
		this.altura=altura;
		this.peso=peso;
		
	}
	
	public void Establecer(String nombre, String apellido, String sexo, int dia, int mes, int año,  int altura,int peso )
	{
		this.nombre=nombre;
		this.apellido=apellido;
		this.sexo=sexo;
		this.dia=dia;
		this.mes=mes;
		this.año=año;
		this.altura=altura;
		this.peso=peso;
		
	}
	
	public String obtenerNombre()
	{
		return nombre;
	}
	public String obteneraApellido()
	{
		return apellido;
	}
	public String obtenerSexo()
	{
		return sexo;
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
	public int obtenerAltura()
	{
		return altura;
	}
	public double obtenerPeso()
	{
		return peso;
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
	public double IndiceDEMasaCorporal()
	{
		BMI=(peso/(altura*altura))*10000;
		return BMI;
	}
	
}
