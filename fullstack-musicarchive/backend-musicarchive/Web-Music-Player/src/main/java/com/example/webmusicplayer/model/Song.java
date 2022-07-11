package com.example.webmusicplayer.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Song {
    @Id
    private String id;

    private  String filename;

    private String title;

    private String artist;

    private  boolean isFavorited;
}
