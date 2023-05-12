package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")



public class RestMovieController
{

    @GetMapping("/info")
    public ResponseEntity<String> testGet()
    {
        return ResponseEntity.ok("Eu sunt un response");
    }
}
