package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.Vahed;

import java.util.List;

/**
 * Created by Mohammad on 10/16/2017.
 */
public interface IBaseInfoService {
    List<Vahed> autocompleteVahed(String name);
}
