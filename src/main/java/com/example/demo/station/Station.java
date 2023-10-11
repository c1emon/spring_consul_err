package com.example.demo.station;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document("stations")
public class Station {
    @Id
    private String id;

    @Indexed(unique = true)
    private String name;

    private boolean running;

    private Date createdAt;
    private Date updatedAt;
}
