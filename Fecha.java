package taresa2;

public class Fecha
{
	private int mes, dia,año;
	String obtenerAño;
	
	public Fecha(int mes, int dia, int año)
	{
		this.mes=mes;
		this.dia=dia;
		this.año=año;
	}
	
	public void mostrarFecha(int mes, int dia, int año, String obtenerAño)
	{
		this.mes=mes;
		this.dia=dia;
		this.año=año;
		this.obtenerAño=obtenerAño; 
		
	}
    
	public int obtenerMes()
	{
		return mes;
	}
	public int obtenerDia()
	{
		return dia;
	}
	public int obtenerAño()
	{
		return año;
	}
	public String obtenerFecha()
	{
		obtenerAño="LA FECHA INGRESADA ES: "+mes+"/"+dia+"/"+año;
		return obtenerAño;
	}
}
