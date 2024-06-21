package interfaces;

import java.util.List;

import modelo.Modelo_producto;

public interface Interfas_producto {
	public void RegistrarProducto(Modelo_producto producto);
	public List<Modelo_producto> ListarProducto();
}
