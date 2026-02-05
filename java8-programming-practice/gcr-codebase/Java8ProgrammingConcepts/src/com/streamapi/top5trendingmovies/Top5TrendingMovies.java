package com.streamapi.top5trendingmovies;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Top5TrendingMovies {
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(new Movie("Movie A", 9.2, 2024), new Movie("Movie B", 8.5, 2023),
				new Movie("Movie C", 9.0, 2022), new Movie("Movie D", 9.5, 2024), new Movie("Movie E", 8.9, 2023),
				new Movie("Movie F", 9.1, 2024));

		// Top 5 movies based on rating and release year
		movies.stream().filter(m -> m.getReleaseYear() >= 2022)
				.sorted(Comparator.comparingDouble(Movie::getRating).reversed().thenComparing(Movie::getReleaseYear)
						.reversed())
				.limit(5).forEach(m -> System.out.println(m));
	}
}
