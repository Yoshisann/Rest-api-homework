package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

  enum Genre
{
    Action,
    Crime,
    Fantasy,
    Horror,
    Romance,
    ScienceFiction,
    SliceofLife,
    Thriller,
    WarAndWestern

}

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Movie
{
    private String name;
    private Genre genre;
    private int Year;
    private String Director;
}
