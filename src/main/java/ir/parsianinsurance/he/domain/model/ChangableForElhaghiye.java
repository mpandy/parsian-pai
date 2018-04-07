package ir.parsianinsurance.he.domain.model;

import java.util.List;

/**
 * Created by Mohammad on 6/6/2017.
 */
public interface ChangableForElhaghiye {

    List<ElhaghiyeDiff> elhagiyeDiffs(ChangableForElhaghiye theOther);
//    ChangableForElhaghiye copyBimegozarForElhaghiye();

}
