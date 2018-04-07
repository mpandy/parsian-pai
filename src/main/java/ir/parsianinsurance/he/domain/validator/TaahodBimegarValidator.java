package ir.parsianinsurance.he.domain.validator;

import ir.parsianinsurance.he.domain.model.TaahodBimegar;
import ir.parsianinsurance.he.domain.model.enums.NoeTaahod;
import ir.parsianinsurance.he.infrastructure.HeException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8119 on 9/26/2017.
 */
public class TaahodBimegarValidator {

    TaahodBimegar taahodBimegar;

    public TaahodBimegarValidator(TaahodBimegar taahodBimegar) {
        this.taahodBimegar = taahodBimegar;
    }

    public  List<String> validate() throws HeException {
        List<String> errorMessages = new ArrayList<>();

        if(taahodBimegar.getNoetaahod().equals(NoeTaahod.EMPTY))
            throw new HeException("noetaahodRaVaredNamaeed");

        if(taahodBimegar.getSarmaye_taahod() == null)
            throw new HeException("SarmayetaahodRaVaredNamaeed");

        return errorMessages;
    }
    }
