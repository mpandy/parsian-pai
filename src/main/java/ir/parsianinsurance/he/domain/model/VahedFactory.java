package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.VahedType;

/**
 * Created by 8119 on 11/23/2017.
 */
public class VahedFactory {
    
    public static Vahed newVahed(String codeNamayandegi, VahedType vahedType, Long saghfe_sodoor, Double saghfe_takhfif_modiriati, Long saghfe_khesarat_fot, Long saghfe_khesarat_naghsOzv, Long saghfe_khesarat_hazinePezeshki, String name, String address){

        Vahed vahed = new Vahed();
        vahed.setCode(codeNamayandegi);
        vahed.setVahedType(vahedType);
        vahed.setSaghfe_sodoor(saghfe_sodoor);
        vahed.setSaghfe_takhfif_modiriati(saghfe_takhfif_modiriati);
        vahed.setSaghfe_khesarat_fot(saghfe_khesarat_fot);
        vahed.setSaghfe_khesarat_naghsOzv(saghfe_khesarat_naghsOzv);
        vahed.setSaghfe_khesarat_hazinePezeshki(saghfe_khesarat_hazinePezeshki);
        vahed.setName(name);
        vahed.setAddress(address);

        VahedSequence vahedSequence = new VahedSequence();
        vahedSequence.initializeSequence();
        vahed.setVahedSequence(vahedSequence);

        return vahed;
    }

}

