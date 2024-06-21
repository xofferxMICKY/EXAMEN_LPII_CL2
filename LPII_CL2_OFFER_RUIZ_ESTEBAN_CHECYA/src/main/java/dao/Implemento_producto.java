package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.Interfas_producto;
import modelo.Modelo_producto;



public class Implemento_producto implements Interfas_producto{

	@Override
	public void RegistrarProducto(Modelo_producto producto) {
		// TODO Auto-generated method stub
		EntityManagerFactory em = Persistence.createEntityManagerFactory("LPII_CL2_OFFER_RUIZ_ESTEBAN_CHECYA");
		
		EntityManager emanager = em.createEntityManager();
		
		emanager.getTransaction().begin();
		
		emanager.persist(producto);
		
		System.out.println("producto registrado");
		
		emanager.getTransaction().commit();
		
		emanager.close();
		
		
	}

	@Override
	public List<Modelo_producto> ListarProducto() {
		// establecer la conexión con la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_OFFER_RUIZ_ESTEBAN_CHECYA");
        
        // gestionar las entidades
        EntityManager em = emf.createEntityManager();
       //inicar la transaccion
        em.getTransaction().begin();
        List<Modelo_producto> listado = em.createQuery("SELECT p FROM Modelo_producto p", Modelo_producto.class).getResultList();
         
        em.getTransaction().commit();
        // cerrar el EntityManager
        em.close();
        
        return listado;
	}

}
