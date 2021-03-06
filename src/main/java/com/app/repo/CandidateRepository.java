package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Admin;
import com.app.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Long>{
	public Candidate findByEmail(String email);
}
