package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PRODUCTOCL2")
public class Modelo_producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int idProductoCL2;
	    private String nombreCL2;
	    private double precioVentaCL2;
	    private double precioCompCL2;
	    private String estadoCL2;
	    private String descripCL2;

	    // Constructor por defecto
	    public Modelo_producto() {}

	    // Constructor con parámetros
	    public Modelo_producto(int idProductoCL2, String nombreCL2, double precioVentaCL2, double precioCompCL2, String estadoCL2, String descripCL2) {
	        this.idProductoCL2 = idProductoCL2;
	        this.nombreCL2 = nombreCL2;
	        this.precioVentaCL2 = precioVentaCL2;
	        this.precioCompCL2 = precioCompCL2;
	        this.estadoCL2 = estadoCL2;
	        this.descripCL2 = descripCL2;
	    }

	    // Getters y Setters
	    public int getIdProductoCL2() {
	        return idProductoCL2;
	    }

	    public void setIdProductoCL2(int idProductoCL2) {
	        this.idProductoCL2 = idProductoCL2;
	    }

	    public String getNombreCL2() {
	        return nombreCL2;
	    }

	    public void setNombreCL2(String nombreCL2) {
	        this.nombreCL2 = nombreCL2;
	    }

	    public double getPrecioVentaCL2() {
	        return precioVentaCL2;
	    }

	    public void setPrecioVentaCL2(double precioVentaCL2) {
	        this.precioVentaCL2 = precioVentaCL2;
	    }

	    public double getPrecioCompCL2() {
	        return precioCompCL2;
	    }

	    public void setPrecioCompCL2(double precioCompCL2) {
	        this.precioCompCL2 = precioCompCL2;
	    }

	    public String getEstadoCL2() {
	        return estadoCL2;
	    }

	    public void setEstadoCL2(String estadoCL2) {
	        this.estadoCL2 = estadoCL2;
	    }

	    public String getDescripCL2() {
	        return descripCL2;
	    }

	    public void setDescripCL2(String descripCL2) {
	        this.descripCL2 = descripCL2;
	    }
}
