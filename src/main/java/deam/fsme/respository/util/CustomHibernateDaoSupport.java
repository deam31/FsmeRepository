package deam.fsme.respository.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomHibernateDaoSupport {
	
    @Autowired
    private SessionFactory sessionFactory;
 
    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
 
    public void persist(Object entity) {
        getSession().persist(entity);
    }
 
    public void delete(Object entity) {
        getSession().delete(entity);
    }

}
