package com.tomisakae.showai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tomisakae.showai.model.NewlyLaunched;

@Repository
public interface NewlyLaunchedRepository extends JpaRepository<NewlyLaunched, Long> {
}
