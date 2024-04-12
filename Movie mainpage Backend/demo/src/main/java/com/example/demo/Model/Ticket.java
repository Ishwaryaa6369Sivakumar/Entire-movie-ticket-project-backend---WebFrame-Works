package com.example.demo.Model;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Ticket {
    @Id
    private int ticketId;
    private String movieName;
    private String categories;
    private double amount;
    private String numberOfSeats;
    private String confirmBooking;

    @OneToOne(mappedBy = "ticket", cascade = CascadeType.ALL )
    @JsonManagedReference
    private MovieDetails movieDetails;
    
    public MovieDetails getMovieDetails() {
        return movieDetails;
    }
    public void setMovieDetails(MovieDetails movieDetails) {
        this.movieDetails = movieDetails;
    }
    public int getTicketId() {
        return ticketId;
    }
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getCategories() {
        return categories;
    }
    public void setCategories(String categories) {
        this.categories = categories;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public String getConfirmBooking() {
        return confirmBooking;
    }
    public void setConfirmBooking(String confirmBooking) {
        this.confirmBooking = confirmBooking;
    }
    public Ticket(int ticketId, String movieName, String categories, double amount, String numberOfSeats,
            String confirmBooking,MovieDetails movieDetails) {
        this.ticketId = ticketId;
        this.movieName = movieName;
        this.categories = categories;
        this.amount = amount;
        this.numberOfSeats = numberOfSeats;
        this.confirmBooking = confirmBooking;
        this.movieDetails = movieDetails;
    }
    public Ticket() {
    }
    
    
    
}