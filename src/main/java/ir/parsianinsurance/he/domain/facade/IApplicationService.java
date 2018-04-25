package ir.parsianinsurance.he.domain.facade;

import ir.parsianinsurance.he.domain.model.Bimename;
import ir.parsianinsurance.he.domain.model.Elhaghiye;
import ir.parsianinsurance.he.domain.model.Khesarat;
import ir.parsianinsurance.he.domain.model.Pishnahad;
import ir.parsianinsurance.he.infrastructure.Warning;
import ir.parsianinsurance.he.interfaces.webservice.model.AgencyBimenameInfo;

import java.util.Optional;

/**
 * Created by Mohammad on 7/6/2017.
 */
public interface IApplicationService {
    Pishnahad sabtePishnahad(Bimename bimename);
    Optional<Warning> sodooreBimename(Bimename bimename);
    Bimename sodooreBimenameAgency(AgencyBimenameInfo info);
    Optional<Warning> sabteElhaghiyeTaghir(Elhaghiye elhaghiye);
    Optional<Warning> sabteKhesarat(Khesarat khesarat);
    Khesarat sabteKhesaratHavales(Khesarat khesarat);
    Optional<Warning> sabteElhaghiyeEbtal(Elhaghiye elhaghiye);
    Optional<Warning> sabteElhaghiyeFaskh(Elhaghiye elhaghiye);
}
