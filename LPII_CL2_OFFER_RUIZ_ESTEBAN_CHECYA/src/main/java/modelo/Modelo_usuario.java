package modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USUARIOCL2")
public class Modelo_usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int idUsuarioCL2;
	    private String usuarioCL2;
	    private String passwordCL2;

	    // Constructor por defecto
	    public Modelo_usuario() {}

	    // Constructor con parámetros
	    public Modelo_usuario(int idUsuarioCL2, String usuarioCL2, String passwordCL2) {
	        this.idUsuarioCL2 = idUsuarioCL2;
	        this.usuarioCL2 = usuarioCL2;
	        this.passwordCL2 = passwordCL2;
	    }

	    // Getters y Setters
	    public int getIdUsuarioCL2() {
	        return idUsuarioCL2;
	    }

	    public void setIdUsuarioCL2(int idUsuarioCL2) {
	        this.idUsuarioCL2 = idUsuarioCL2;
	    }

	    public String getUsuarioCL2() {
	        return usuarioCL2;
	    }

	    public void setUsuarioCL2(String usuarioCL2) {
	        this.usuarioCL2 = usuarioCL2;
	    }

	    public String getPasswordCL2() {
	        return passwordCL2;
	    }

	    public void setPasswordCL2(String passwordCL2) {
	        this.passwordCL2 = passwordCL2;
	    }
}
