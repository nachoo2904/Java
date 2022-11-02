package mapas;

import java.util.Objects;

public class Producto implements Comparable<Producto> {

	
	public Integer codigo;
	public Integer stock;
	
	public Producto(Integer codigo, Integer stock) {
		this.codigo = codigo;
		this.stock = stock;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, stock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(stock, other.stock);
	}

	@Override
	public int compareTo(Producto o) {
		return this.codigo.compareTo(o.codigo);
	}

	@Override
	public String toString() {
		return "[codigo=" + codigo + ", stock=" + stock + "]";
	}
	
	
	
	
}
