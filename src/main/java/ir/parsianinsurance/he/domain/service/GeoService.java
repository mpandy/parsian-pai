package ir.parsianinsurance.he.domain.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.stream.Collectors;

@Named
@ApplicationScoped
public class GeoService implements IGeoService {

    List<String> geos;

    @PersistenceContext
    EntityManager em;


    @Override
    public List<String> autocompleteGeo(String name) {
        return geos .stream()
                    .filter(x -> x.contains(name))
                    .collect(Collectors.toList());
    }

    @Override
    public void load() {
        Query q = em.createNamedQuery("findAllCityName");
        this.geos = q.getResultList();
    }
}
