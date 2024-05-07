package com.example.neo4j.controller;

import com.example.neo4j.model.Poet;
import com.example.neo4j.model.Poem;
import com.example.neo4j.model.Location;
import com.example.neo4j.repository.PoetRepository;
import com.example.neo4j.repository.PoemRepository;
import com.example.neo4j.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/graph")
public class GraphController {

    @Autowired
    private PoetRepository poetRepository;

    @Autowired
    private PoemRepository poemRepository;

    @Autowired
    private LocationRepository locationRepository;

    @GetMapping("/all")
    public Map<String, Object> getAllNodesAndRelationships() {
        List<Poet> poets = poetRepository.findAll();
        poets.forEach(poet -> poet.getPoems().size());  // 强制加载诗作和地点的关系

        Map<String, Object> result = new HashMap<>();
        result.put("poets", poets);
        return result;
    }

    // 新增统计图谱信息的接口
    @GetMapping("/stats")
    public Map<String, Long> getGraphStatistics() {
        long totalPoets = poetRepository.count();
        long totalPoems = poemRepository.count();
        long totalLocations = locationRepository.count();

        Map<String, Long> stats = new HashMap<>();
        stats.put("totalNodes", totalPoets + totalPoems + totalLocations);
        stats.put("totalPoets", totalPoets);
        stats.put("totalPoems", totalPoems);
        stats.put("totalLocations", totalLocations);

        return stats;
    }
}

