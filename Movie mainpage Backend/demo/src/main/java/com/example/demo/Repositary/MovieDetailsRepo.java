package com.example.demo.Repositary;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Model.MovieDetails;


public interface MovieDetailsRepo extends JpaRepository<MovieDetails,Integer> {
    @Query("SELECT s FROM MovieDetails s WHERE s.TicketId = :TicketId")
    MovieDetails findTicketId(@RequestParam("TicketId") int TicketId);

 }