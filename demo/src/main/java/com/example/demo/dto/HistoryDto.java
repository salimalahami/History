package com.example.demo.dto;

import lombok.*;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HistoryDto {
    private int movieId;
    private int userId;
    private Date watchDate;
    private LocalTime watchTime;

}

