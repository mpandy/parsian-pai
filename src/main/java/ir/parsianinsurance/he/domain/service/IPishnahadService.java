package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.NoeKhatarEzafi;
import ir.parsianinsurance.he.infrastructure.io.Zamime;

import java.util.List;
import java.util.Set;

/**
 * Created by Mohammad on 7/26/2017.
 */
public interface IPishnahadService {
    Pishnahad buildPishnahadToPersist(Pishnahad pishnahad);
    Pishnahad buildPishnahadToUpdate(Pishnahad pishnahad);
    Pishnahad loadPishnahad(Pishnahad pishnahad);
    Set<Zamime> loadZamaem(Pishnahad pishnahad);
    Zamime loadZamimePishnahad(Pishnahad pishnahad);
    List<Gharardad> autocompleteGharardad(String name);
    List<BimeGozar> autocompleteBimegozar(String name);
    List<BimeShode> autocompleteBimeshode(String name);
    List<NoeKhatarEzafi> autocompleteKhatareEzafi(String khatar);
    List<Shoghl> autocompleteShoghl(String shoghl);
}
