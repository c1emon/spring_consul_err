package com.example.demo.station;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 86400)
public class StationController {

    private final ObjectMapper mapper;
    private final MongoTemplate template;

    @GetMapping("/station/{id}")
    public Station Get(@PathVariable String id) {

        return template.findById(id, Station.class);
    }


}
