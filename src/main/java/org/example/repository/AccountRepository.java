package org.example.repository;

import org.example.builder.model.AccountDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccountRepository extends CrudRepository<AccountDTO, Integer> {
    @Override
    <S extends AccountDTO> S save(S entity);

    @Override
    Optional<AccountDTO> findById(Integer integer);
}
