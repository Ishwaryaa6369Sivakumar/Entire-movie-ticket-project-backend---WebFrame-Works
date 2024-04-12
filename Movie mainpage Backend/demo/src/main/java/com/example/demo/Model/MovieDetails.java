package com.example.demo.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="moviesdetails")
public class MovieDetails {
    @Id
    private  int TicketId;
    @Column(name="Moviename")
    private  String MovieName;
    @Column(name="NumberOfTickets")
    private  int NoOfTickets;
    @Column(name="Amount")
    private  double Amount;
    public MovieDetails() {
    }
    public MovieDetails(int ticketId, String movieName, int noOfTickets, double amount, Ticket ticket) {
        TicketId = ticketId;
        MovieName = movieName;
        NoOfTickets = noOfTickets;
        Amount = amount;
        this.ticket = ticket;
    }
    @OneToOne
    @JsonBackReference
    private Ticket ticket;
    public int getTicketId() {
        return TicketId;
    }
    public void setTicketId(int ticketId) {
        TicketId = ticketId;
    }
    public String getMovieName() {
        return MovieName;
    }
    public void setMovieName(String movieName) {
        MovieName = movieName;
    }
    public int getNoOfTickets() {
        return NoOfTickets;
    }
    public void setNoOfTickets(int noOfTickets) {
        NoOfTickets = noOfTickets;
    }
    public double getAmount() {
        return Amount;
    }
    public void setAmount(double amount) {
        Amount = amount;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
}