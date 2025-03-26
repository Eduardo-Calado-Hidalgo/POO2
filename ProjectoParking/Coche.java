package ProjectoParking;

import java.util.Objects;

public class Coche {
	Marca marca;
	Color color;
	
	public Coche(Marca marca, Color color) {
		this.marca = marca;
		this.color = color;
	}
	
	public Coche() {
		this.marca = Marca.obtenerMarca();
		this.color = Color.obtenerColor();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Coche)) return false;
		if (this.color == ((Coche)obj).color && this.marca == ((Coche)obj).marca) {
			return true;
		}
			return false;
		}
	
	  @Override
	    public int hashCode() {
		  return Objects.hash(marca,color);
	          
	    }
	
	public Marca getMarca() {
		return marca;
	}

	public Color getColor() {
		return color;
	}
	
}
