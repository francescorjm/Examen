package poo;

public class VehiculoAereo {

	
	public VehiculoAereo()
	{
	
		Material = "Aluminio";
		Aerolinea = "Chanchito Feliz AirLines";
		
		PrecioPorKilo = 0.5;
		PrecioPorKiloDeCarga = 1;
		PrecioPorPersona = 1.5;
				
	}
	
	public String GetMaterial()
	{
		return Material;
	}
	
	public String GetAerolinea()
	{
		return Aerolinea;
	}
	
	//Setter para establecer el Tipo de vehiculo aereo
	public void SetTipo(int Tipo)
	{
		//1 = Avion de carga
		//2 = Avion de pasajeros
		//3 = Avioneta
		//4 = Helicoptero
		
		if(Tipo==1)
		{
			_Tipo = "Avion de carga";
		}
		else if(Tipo==2)
		{
			_Tipo = "Avion de pasajeros";
		}
		else if(Tipo==3)
		{
			_Tipo = "Avioneta";
		}
		else if(Tipo==4)
		{
			_Tipo = "Helicoptero";
		}
	
	}
	
	//Getter para obtener el Tipo de vehiculo aereo
	public String GetTipo()
	{
		return _Tipo;
	}
	
	//Setter para establecer el Modelo de vehiculo aereo
	public void SetModelo(String Modelo)
	{
		_Modelo = Modelo;
	}
	
	//Getter para obtener el Modelo de vehiculo aereo
	public String GetModelo()
	{
		return _Modelo;
	}
	
	//Setter para establecer el peso de vehiculo aereo
	public void SetPeso(int Peso)
	{
		_Peso = Peso;
	}
		
	//Getter para obtener el peso de vehiculo aereo
	public int GetPeso()
	{
		return _Peso;
	}
	
	//Setter para establecer la cantidad de motores del vehiculo aereo
	public void SetCantidadMotores(int CantidadMotores)
	{
		_CantidadMotores = CantidadMotores;
	}
	
	//Getter para obtener la cantidad de motores del vehiculo aereo
	public int GetCantidadMotortes()
	{
		return _CantidadMotores;
	}	
	
	//Setter para establecer la velocidad del vehiculo aereo
	public void SetVelocidad(int Velocidad)
	{
		_Velocidad = Velocidad;
	}
	
	//Getter para obtener la velocidad del vehiculo aereo
	public int GetVelocidad()
	{
		return _Velocidad;
	}
	
	//Setter para establecer la capacidad del vehiculo aereo
	public void SetCapacidad(int Capacidad)
	{
		_Capacidad = Capacidad;
	}
		
	//Getter para obtener la capacidad del vehiculo aereo
	public int GetCapacidad()
	{
		return _Capacidad;
	}
	
	//Setter para establecer numero de pasajeros del vehiculo aereo
	public void SetNumeroPasajeros(int NumeroPasajeros)
	{
		_NumeroPasajeros = NumeroPasajeros;
	}
			
	//Getter para obtener numero de pasajeros del vehiculo aereo
	public int GetNumeroPasajeros()
	{
		return _NumeroPasajeros;
	}
			
	
	//Obtener el precio
	public double GetPrecio(int Peso, int CapacidadDeCarga, int NumeroPasajeros)
	{
		
		double TPeso = Peso * PrecioPorKilo;
		double TCapacidad = CapacidadDeCarga * PrecioPorKiloDeCarga;
		double TPersona = NumeroPasajeros * PrecioPorPersona;
		Precio = TPeso + TCapacidad + TPersona;
		
		return Precio;
	
	}
	
	//Metodos de accion
	public String ArrancarMotores()
	{
		return "Arrancando motores...";
	}
	
	public String Despegar()
	{
		return "Despegando...";
	}
	
	public String PilotoAutomatico()
	{
		return "Piloto automatico activado...";
	}
	
	public String Aterrizar()
	{
		return "Aterrizando...";
	}
	
	public String ApangandoMotores()
	{
		return "Motores apagados...";
	}
	
	//Variables
	private String Material;
	private String Aerolinea;
	
	private String _Tipo;
	private String _Modelo;
	private int _Peso;
	private int _CantidadMotores;
	private int _Velocidad;
	private int _Capacidad;
	private int _NumeroPasajeros;
	
	private double PrecioPorKilo;
	private double PrecioPorKiloDeCarga;
	private double PrecioPorPersona;
	private double Precio;
			
}
