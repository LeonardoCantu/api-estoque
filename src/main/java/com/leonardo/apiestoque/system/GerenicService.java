package com.leonardo.apiestoque.system;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.MappedSuperclass;
import java.util.List;
import java.util.Optional;

@Service
@MappedSuperclass
public abstract class GerenicService<T extends GenericEntity<?>, ID> extends GenericRepository<T, ID> {

    public T findAndValidate(Integer id) {
        Optional<T> value = findById((ID) id);
        return value.get();
    }
}
