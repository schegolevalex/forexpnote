package com.schegolevalex.explanatorynote2.forexpnote.repository;

import com.schegolevalex.explanatorynote2.forexpnote.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {
  }