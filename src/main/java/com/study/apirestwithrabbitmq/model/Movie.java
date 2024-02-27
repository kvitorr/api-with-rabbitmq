package com.study.apirestwithrabbitmq.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "Movie")
@Entity(name = "Movie")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Movie {
    @Id
    private String id;
    @Id
    private LocalDateTime insertionDate;
    private String title;
    private String originalTitle;
    private String overview;
    private Long popularity;
    private String releaseDate;
    private boolean adult;
}