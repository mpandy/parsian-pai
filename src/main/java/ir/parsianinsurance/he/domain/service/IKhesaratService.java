package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.HavaleKhesarat;
import ir.parsianinsurance.he.domain.model.Khesarat;
import ir.parsianinsurance.he.domain.model.KhesaratCase;
import ir.parsianinsurance.he.infrastructure.Warning;
import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.interfaces.view.model.KhesaratSearchModel;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mohammad on 7/26/2017.
 */
public interface IKhesaratService {

    Khesarat buildKhesarat(Khesarat khesarat);
    HavaleKhesarat buildHavaleKhesarat(HavaleKhesarat havaleKhesarat);
    KhesaratCase buildKhesaratCase(KhesaratCase khesaratCase);
    void setShomareKhesaratCases(Khesarat khesarat);
    void setShomareHavaleKhesarat(Khesarat khesarat);
    List<Khesarat> searchKhesarat(KhesaratSearchModel searchedKhesarat, int rowLimit);
    boolean isKhesaratAble(Khesarat khesarat);
    Long mablagheKhesarat(Khesarat khesarat);

    Optional<Warning> addPossibleSaghfeKhesaratFotArtifactDocs(KhesaratCase khesaratCase, User user);
    Optional<Warning> addPossibleSaghfeKhesaratNaghseOzvArtifactDocs(KhesaratCase khesaratCase, User user);
    Optional<Warning> addPossibleSaghfeKhesaratHazPezArtifactDocs(KhesaratCase khesaratCase, User currentUser);

    boolean allOfKhesaratCasesTayidShodeHastand(Khesarat khesarat);
    boolean ayaBimenameBasteMishavad(Khesarat khesarat);
}
