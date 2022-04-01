package org.jspiders.dto;

import java.io.Serializable;

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
@NamedQueries({@NamedQuery(name="fatchAll",query="select movie from MovieDto movie")
,@NamedQuery(name="fatchByMovieName",query="select movie from MovieDto movie where movie.name=:nm")
,@NamedQuery(name="fatchProducerNameByMovieName",query="select movie.producerName from MovieDto movie where name=:nm")
,@NamedQuery(name="fetchCount",query="select count(movie) from MovieDto movie")
,@NamedQuery(name="fatchMaxBudget",query="select max(budget) from MovieDto movie")
,@NamedQuery(name="updateBudgetByMovieName",query="update MovieDto movie set movie.budget=:bud where name=:nm")})
public class MovieDto implements Serializable
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
	
	public MovieDto() 
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
	public String toString() {
		return "MovieDto [movieID=" + movieID + ", name=" + name
				+ ", producerName=" + producerName + ", budget=" + budget + "]";
	}
}
