package com.tobias.saul.starwarsstarshipservice.web.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tobias.saul.starwarsstarshipservice.model.Starship;
import com.tobias.saul.starwarsstarshipservice.web.response.StarshipsResponse;
import com.tobias.saul.starwarsstarshipservice.web.utils.StarwarsStarshipUtils;

@RestController
@RequestMapping("/starships")
public class StarshipService {

	private final String BASE_URL = "https://swapi.dev/api/starships/";
	private final RestTemplate restTemplate;

	public StarshipService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@GetMapping
	public List<Starship> getAllStarships() {

		ResponseEntity<StarshipsResponse> response = restTemplate.getForEntity(BASE_URL, StarshipsResponse.class);

		List<Starship> starships = StarwarsStarshipUtils.addToStarshipList(restTemplate, response);

		return starships;
	}
	
	@GetMapping("/{starshipId}")
	public Starship getStarship(@PathVariable("starshipId") Integer starshipId) {
		ResponseEntity<StarshipsResponse> response = restTemplate.getForEntity(BASE_URL, StarshipsResponse.class);
		
		List<Starship> starships = StarwarsStarshipUtils.addToStarshipList(restTemplate, response);
		
		Starship starship = starships.get(starshipId - 1);
		
		return starship;
	}

}
