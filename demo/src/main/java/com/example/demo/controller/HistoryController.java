package com.example.demo.controller;


import com.example.demo.dto.HistoryDto;
import com.example.demo.entity.WatchHistory;
import com.example.demo.service.WatchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/movies")
public class HistoryController {

    @Autowired
    private WatchHistoryService historymovieService;

    @PostMapping("/add-to-history")
    public ResponseEntity<String> addMovieToHistory(@RequestBody HistoryDto historyDto) {
        historymovieService.addMovieToHistory(historyDto);
        return ResponseEntity.ok("Movie added to history successfully!");
    }
    @GetMapping("/get-all-movies")
    public List<WatchHistory> getAllMovies() {
        return historymovieService.getAllMovies();

    }

}