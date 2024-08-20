package org.example.repository;

import org.example.builder.model.ExpenseDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpenseRepository extends CrudRepository<ExpenseDTO, Integer> {

    @Override
    <S extends ExpenseDTO> S save(S entity);

    @Override
    Optional<ExpenseDTO> findById(Integer integer);

    @Override
    Iterable<ExpenseDTO> findAll();
    @Override
    void deleteById(Integer integer);

    Iterable<ExpenseDTO> findByAccountDTO_AccountId(Integer accountId);
}
