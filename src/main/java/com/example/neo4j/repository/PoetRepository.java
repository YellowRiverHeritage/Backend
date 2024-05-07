package com.example.neo4j.repository;

import com.example.neo4j.model.Poet;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PoetRepository extends Neo4jRepository<Poet, Long> {}

