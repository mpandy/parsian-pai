package ir.parsianinsurance.he.infrastructure.producer;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Mohammad on 7/1/2017.
 */
public class EntityManagerProducer {

    @Produces
    @Dependent
    @PersistenceContext(unitName = "HE_PU")
    public EntityManager entityManager;
}
