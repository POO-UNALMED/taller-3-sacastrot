package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV;
	
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
	}
	
	
	
	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTV) {
		TV.numTV++;
	}

	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if(this.canal >= 1 && this.canal <= 119 && estado) {
			this.canal++;
		}
	}
	
	public void canalDown() {
		if(this.canal >= 2 && this.canal <= 120 && estado) {
			this.canal--;
		}
	}
	
	public void volumenUp() {
		if(this.volumen >=0 && this.volumen <=6 && estado) {
			this.volumen++;
		}
	}
	
	public void volumenDown() {
		if(this.volumen >=1 && this.volumen <=7 && estado) {
			this.volumen--;
		}
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if(canal>=1 && canal<121 && estado) {
			this.canal = canal;
		}
		
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if(volumen>=1 && volumen<=7 && estado) {
			this.volumen = volumen;
		}
		
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	

}
