package com.example.labxpert.Repository;

import com.example.labxpert.Model.SousAnalyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISousAnalyseRepository extends JpaRepository<SousAnalyse,Long> {
}
