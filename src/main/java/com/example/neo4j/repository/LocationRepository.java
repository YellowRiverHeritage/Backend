package com.example.neo4j.repository;

import com.example.neo4j.model.Location;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface LocationRepository extends Neo4jRepository<Location, Long> {}
