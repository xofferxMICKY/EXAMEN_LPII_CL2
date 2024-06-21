package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import interfaces.Interfas_usuario;
import modelo.Modelo_usuario;

public class Implemento_usuario implements Interfas_usuario{

	@Override
	public String logeo(Modelo_usuario usuario) {
		String encontrado = "ko";

	    // Establecer la conexión con la unidad de persistencia
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_OFFER_RUIZ_ESTEBAN_CHECYA");

	    // Gestionar las entidades
	    EntityManager em = emf.createEntityManager();

	    // Construir la consulta JPQL para buscar un usuario por nombre de usuario y contraseña
	    String jpql = "SELECT u FROM Modelo_usuario u WHERE u.usuarioCL2 = :nombreUsuario AND u.passwordCL2 = :contrasena";

	    // Crear la consulta JPQL
	    TypedQuery<Modelo_usuario> query = em.createQuery(jpql, Modelo_usuario.class);
	    query.setParameter("nombreUsuario", usuario.getUsuarioCL2());
	    query.setParameter("contrasena", usuario.getPasswordCL2());

	    // Ejecutar la consulta y obtener el resultado
	    Modelo_usuario usuarioEncontrado = null;
	    try {
	        usuarioEncontrado = query.getSingleResult();
	        encontrado = "ok"; // Si se encontró el usuario, establecer encontrado a true
	    } catch (NoResultException e) {
	        // Si no se encuentra ningún resultado, encontrado se mantiene como false
	    }

	    // Cerrar el EntityManager
	    em.close();

	    return encontrado;
	}



}
