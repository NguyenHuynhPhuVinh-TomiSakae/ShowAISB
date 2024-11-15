package com.tomisakae.showai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import com.tomisakae.showai.model.NewlyLaunched;

@Repository
public interface NewlyLaunchedRepository extends JpaRepository<NewlyLaunched, Long> {
    Page<NewlyLaunched> findAll(Pageable pageable);
}
