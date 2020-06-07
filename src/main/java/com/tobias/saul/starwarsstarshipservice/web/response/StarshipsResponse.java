package com.tobias.saul.starwarsstarshipservice.web.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tobias.saul.starwarsstarshipservice.model.Starship;

public class StarshipsResponse {

	private String next;
	@JsonProperty(value = "results")
	private List<Starship> starships;

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public List<Starship> getStarships() {
		return starships;
	}

	public void setStarships(List<Starship> starships) {
		this.starships = starships;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + ((starships == null) ? 0 : starships.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StarshipsResponse other = (StarshipsResponse) obj;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (starships == null) {
			if (other.starships != null)
				return false;
		} else if (!starships.equals(other.starships))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StarshipsResponse [next=" + next + ", starships=" + starships + "]";
	}

}
