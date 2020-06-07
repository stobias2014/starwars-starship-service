package com.tobias.saul.starwarsstarshipservice.web.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.tobias.saul.starwarsstarshipservice.model.Starship;
import com.tobias.saul.starwarsstarshipservice.web.response.StarshipsResponse;

public class StarwarsStarshipUtils {

	public static String formatUrlToContainHttps(String url) {
		StringBuilder str = new StringBuilder(url);
		str.insert(4, 's');
		return str.toString();
	}

	public static List<Starship> addToStarshipList(RestTemplate restTemplate,
			ResponseEntity<StarshipsResponse> response) {
		List<Starship> starships = new ArrayList<Starship>();
		starships.addAll(response.getBody().getStarships());

		while (response.getBody().getNext() != null) {
			if (response.getBody().getNext() == null) {
				continue;
			} else {
				String formattedUrl = StarwarsStarshipUtils.formatUrlToContainHttps(response.getBody().getNext());
				response = restTemplate.getForEntity(formattedUrl, StarshipsResponse.class);
				starships.addAll(response.getBody().getStarships());
			}
		}

		return starships;
	}

}
