package ir.parsianinsurance.he.domain.model;

import java.util.List;

/**
 * Created by 8119 on 7/25/2017.
 */
public abstract class ElhaghiyeableCollection {
    public abstract List<ElhaghiyeDiff> elhagiyeDiffs (ElhaghiyeableCollection theOther);
    public abstract Long getCreatedDate();
}
