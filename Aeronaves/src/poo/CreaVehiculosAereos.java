package poo;
import java.util.*;

public class CreaVehiculosAereos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Variable de tipo objeto
		VehiculoAereo VehiculoA = new VehiculoAereo();
		
		//Variables de tipo escanner para las entradas
		Scanner EntradaTipo = new Scanner(System.in);
		Scanner EntradaModelo = new Scanner(System.in);
		Scanner EntradaPeso = new Scanner(System.in);
		Scanner EntradaCantidadMotores = new Scanner(System.in);
		Scanner EntradaVelocidad = new Scanner(System.in);
		Scanner EntradaCapacidad = new Scanner(System.in);
		Scanner EntradaPasajeros = new Scanner(System.in);
		
		//Enunciados
		System.out.println("TIPOS DE VEHICULOS AEREOS VALIDOS");
		System.out.println("---------------------------------");
		System.out.println("1.- Avion de cargar");
		System.out.println("2.- Avion de pasajeros");
		System.out.println("3.- Avioneta");
		System.out.println("4.- Helicoptero");
		
		System.out.println(); //salto de linea
		
		//Solicitar y leer el tipo
		System.out.println("Ingrese el numero del tipo de vehiculo");
		int Tipo = EntradaTipo.nextInt();
				
		//Solicitar y leer el modelo
		System.out.println("Ingrese el modelo del vehiculo");
		String Modelo = EntradaModelo.nextLine();	
		
		//Solicitar y leer la cantidad de motores
		System.out.println("Ingrese el peso del vehiculo");
		int Peso = EntradaPeso.nextInt();
				
		//Solicitar y leer la cantidad de motores
		System.out.println("Ingrese la cantidad de motores del vehiculo");
		int CantidadMotores = EntradaCantidadMotores.nextInt();
		
		//Solicitar y leer la velociad
		System.out.println("Ingrese la velocidad del vehiculo");
		int Velocidad = EntradaVelocidad.nextInt();	
		
		//Solicitar y leer la capacidad
		System.out.println("Ingrese la capacidad del vehiculo");
		int Capacidad = EntradaCapacidad.nextInt();	
		
		//Solicitar y leer la capacidad
		System.out.println("Ingrese numero de pasajeros soportado");
		int NumeroPasajeros = EntradaPasajeros.nextInt();	
		
		//Armar el objeto
		VehiculoA.SetTipo(Tipo);
		VehiculoA.SetModelo(Modelo);
		VehiculoA.SetPeso(Peso);
		VehiculoA.SetCantidadMotores(CantidadMotores);
		VehiculoA.SetVelocidad(Velocidad);
		VehiculoA.SetCapacidad(Capacidad);
		VehiculoA.SetNumeroPasajeros(NumeroPasajeros);
		
		System.out.println(); // Salto de linea
		
		//Mensaje por pantalla que muestra el objeto con todas sus caracter�sticas
		System.out.println("Datos del vehiculo aereo:\n" +
						   "Aerolinea: " + VehiculoA.GetAerolinea() + "\n" +  
						   "Material: " + VehiculoA.GetMaterial() + "\n" + 
						   "Tipo: " + VehiculoA.GetTipo() + "\n" + 
				           "Modelo: " + VehiculoA.GetModelo() + "\n" + 
						   "Peso: " + VehiculoA.GetPeso() + "\n" +
						   "Cantidad de motores: " + VehiculoA.GetCantidadMotortes() + "\n" + 
				           "Velocidad: " + VehiculoA.GetVelocidad() + "\n" + 
						   "Capacidad: " + VehiculoA.GetCapacidad() + "\n" + 
				           "NUmero de pasajeros: " + VehiculoA.GetNumeroPasajeros() + "\n" + 
				           "Precio: " + VehiculoA.GetPrecio(Peso, Capacidad, NumeroPasajeros));
		
		System.out.println("");
		System.out.println("ACCIONES REALIZADAS");
		System.out.println("-------------------");
		System.out.println(VehiculoA.ArrancarMotores());
		System.out.println(VehiculoA.Despegar());
		System.out.println(VehiculoA.PilotoAutomatico());
		System.out.println(VehiculoA.Aterrizar());
		System.out.println(VehiculoA.ApangandoMotores());
				
	}

}
