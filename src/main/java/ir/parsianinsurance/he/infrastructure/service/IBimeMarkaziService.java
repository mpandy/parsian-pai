package ir.parsianinsurance.he.infrastructure.service;

import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi.*;

import java.util.List;

/**
 * Created by Mohammad on 1/27/2018.
 */
public interface IBimeMarkaziService {

    WbsV4PlcyRes sodoorBimename(Bimename bimename);
    WbsV4EdrsRes sabteElhaghiye(Elhaghiye elhaghiye);
    WbsV4DocLosRes sabteParvandeKhesarat(Khesarat khesarat);
    WbsV4LosRes sabteHavaleKhesarat(HavaleKhesarat havaleKhesarat);
    List<WbsV4PlcyCvrRes> sabtePoosheshForSodoor(Bimename bimename);
    List<WbsV4PlcyCvrRes> sabtePoosheshForElhaghiye(Elhaghiye elhaghiye);
    WbsV4AgncRes sabteAgency(Vahed vahed);
    WbsV4BranchRes sabteBranch(Vahed vahed);

}
