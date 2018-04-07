package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.Vahed;

/**
 * Created by Mohammad on 9/2/2017.
 */
public interface ISequenceService {

    String nextShomarePishnahad(Vahed vahed);
    String nextShomareBimename(Vahed vahed);
    String nextParvandeKhesarat(Vahed vahed);
    void addNamayandeToMemory(Vahed vahed);
    int namayandeganCount();
}
