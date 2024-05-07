package com.example.neo4j.repository;

import com.example.neo4j.model.Poem;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PoemRepository extends Neo4jRepository<Poem, Long> {}
