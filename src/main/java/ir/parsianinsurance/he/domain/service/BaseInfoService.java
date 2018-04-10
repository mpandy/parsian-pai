package ir.parsianinsurance.he.domain.service;

import com.querydsl.core.types.Predicate;
import ir.parsianinsurance.he.domain.model.QVahed;
import ir.parsianinsurance.he.domain.model.Vahed;
import ir.parsianinsurance.he.infrastructure.repository.VahedRepository;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
/**
 * Created by Mohammad on 10/16/2017.
 */
@Model
public class BaseInfoService implements IBaseInfoService {

    @Inject
    VahedRepository vahedRepository;

    @Override
    public List<Vahed> autocompleteVahed(String name) {

        QVahed vahed = QVahed.vahed;
        String trimmedString = name.trim();
        Predicate namayandeAndCodeContains =    vahed.name.contains(trimmedString).or(
                                                vahed.code.contains(trimmedString));
        Iterable<Vahed> iterable =  vahedRepository.findAll(namayandeAndCodeContains);
        return StreamSupport
                .stream(iterable.spliterator(), false)
                .collect(Collectors.toList());
    }
}
