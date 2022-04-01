package org.jspiders.movieApp.dto;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="movie")
@NamedQueries({@NamedQuery(name="updateBudgetByName",query="update MovieDTO movie set movie.budget=:budget where movie.name=:name")
,@NamedQuery(name="fetchAll",query="select movie from MovieDTO movie"),
 @NamedQuery(name="fetchProducerNameByMovieName",query="select movie.producerName from MovieDTO movie where movie.name=:name"),
 @NamedQuery(name="fetchCount",query="select count(movie) from MovieDTO movie"),
 @NamedQuery(name="fetchMaxBudget",query="select max(movie.budget) from MovieDTO movie")})
public class MovieDTO implements Serializable
{
	@Id
	@GenericGenerator(name="rohan",strategy="increment")
	@GeneratedValue(generator="rohan")
	@Column(name="id")
	private int movieID;
	@Column(name="name")
	private String name;
	@Column(name="producerName")
	private String producerName;
	@Column(name="budget")
	private double budget;
	
	public MovieDTO() 
	{
		System.out.println("movie dto...");
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	@Override
	public String toString() 
	{
		return "MovieDTO [movieID=" + movieID + ", name=" + name
				+ ", producerName=" + producerName + ", budget=" + budget + "]";
	}
}