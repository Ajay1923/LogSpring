package com.crud.demo.repository;

import com.crud.demo.model.StatisticsFinal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatisticsFinalRepository extends JpaRepository<StatisticsFinal, Long> {
}
