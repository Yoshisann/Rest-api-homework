package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Movieid
{
    private String name;
    private Genre genre;
    private int year;
    private String Director;
    private long id;

    public Movieid(String name,Genre genre,int year,String Director,long id)
    {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.Director = Director;
        this.id = id;
    }

    public Movie toMovie()
    {
        return new Movie(this.name,this.genre,this.year,this.Director);
    }

    public boolean equals (Object object)
    {
        if(object == null || this.getClass() != object.getClass())
        {
            return false;
        }
        Movieid toCompare = (Movieid) object;
        return this.name.equals(toCompare.name) && this.genre.equals(toCompare.genre);
    }

}
