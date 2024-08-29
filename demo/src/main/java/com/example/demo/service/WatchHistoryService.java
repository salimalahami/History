package com.example.demo.service;


import com.example.demo.dto.HistoryDto;
import com.example.demo.entity.WatchHistory;
import com.example.demo.repository.WatchHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchHistoryService {

    @Autowired
    private WatchHistoryRepository movieRepository;

    public  void addMovieToHistory(HistoryDto historyDto) {

        WatchHistory movieHistory = WatchHistory.builder()
                .movieId(historyDto.getMovieId())
                .userId(historyDto.getUserId())
                .watchDate(historyDto.getWatchDate())
                .watchTime(historyDto.getWatchTime())
                .build();

        movieRepository.save(movieHistory);
    }
    public List<WatchHistory> getAllMovies() {
        return movieRepository.findAll();
    }


}