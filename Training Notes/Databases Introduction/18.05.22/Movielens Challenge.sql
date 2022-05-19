USE Movielens;

-- Question 1
-- List the titles and release dates of movies released between 1983-1993 in reverse chronological order.
SELECT title, release_date FROM movies WHERE release_date BETWEEN '1983-01-01' AND '1993-12-31';

-- Question 2
-- Without using LIMIT, list the titles of the movies with the lowest average rating.
SELECT title, AVG(r.rating) AS average_rating FROM movies m
JOIN ratings r ON m.id = r.movie_id
GROUP BY movie_id ORDER BY AVG(r.rating);
-- Jordan's answer
SELECT title, AVG(r.rating) AS average_rating FROM movies m
JOIN ratings r ON m.id = r.movie_id
GROUP BY m.id
HAVING AVG(r.rating) = (
		SELECT MIN(avg_rating)
		FROM (
				SELECT AVG(rating) AS avg_rating
				FROM ratings
				GROUP BY movie_id
                ) AS table1
			)
ORDER BY AVG(r.rating);



-- Question 3
-- List the unique records for Sci-Fi movies where male 24-year-old students have given 5-star ratings.
SELECT m.title, g.name FROM movies m
JOIN genres_movies gm ON m.id = gm.movie_id
JOIN genres g ON gm.genre_id = g.id
JOIN ratings r ON m.id = r.movie_id
JOIN users u ON r.user_id = u.id
JOIN occupations o ON u.occupation_id = o.id
WHERE g.name = 'sci-fi' AND u.gender = 'm' AND u.age = 24 AND o.name = 'student' AND r.rating = 5 GROUP BY m.title ORDER BY m.title;

-- Question 4
-- List the unique titles of each of the movies released on the most popular release day.
SELECT title FROM movies WHERE release_date = (
SELECT release_date FROM movies GROUP BY release_date ORDER BY COUNT(release_date) DESC LIMIT 1
);

-- Question 5
-- Find the total number of movies in each genre; list the results in ascending numeric order.
SELECT COUNT(m.title) AS number_of_movies, g.name FROM movies m
JOIN genres_movies gm ON m.id = gm.movie_id
JOIN genres g ON gm.genre_id = g.id
GROUP BY g.name ORDER BY number_of_movies;