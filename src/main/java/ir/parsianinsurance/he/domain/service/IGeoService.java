package ir.parsianinsurance.he.domain.service;

import java.util.List;

public interface IGeoService {
    List<String> autocompleteGeo(String name);
    void load();
}
