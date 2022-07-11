package com.example.webmusicplayer.repository;

import com.example.webmusicplayer.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongRepository extends MongoRepository<Song, String> {

}
