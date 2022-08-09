package com.example.webmusicplayer;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.webmusicplayer.services.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebMusicPlayerApplication {

	@Autowired
	private static StorageService storageService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(WebMusicPlayerApplication.class, args);

		StorageService storageService = context.getBean(StorageService.class);
		System.out.println(storageService.getSongFileName());
	}

}
