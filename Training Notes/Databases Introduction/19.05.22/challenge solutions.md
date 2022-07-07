# SQL Challenges

## Sakila Challenge SQL

### 1)

List all actors.

```SQL
SELECT first_name, last_name
FROM actor;
```

### 2)

Find the surname of the actor with the forename 'John'.

```SQL
SELECT last_name
FROM actor
WHERE first_name='John';
```

### 3)

Find all actors with surname 'Neeson'.

```SQL
SELECT first_name, last_name
FROM actor
WHERE last_name='Neeson';
```

### 4)

Find all actors with ID numbers divisible by 10.

```SQL
SELECT first_name, last_name
FROM actor
WHERE actor_id % 10 = 0;
```

### 5)

What is the description of the movie with an ID of 100?

```SQL
SELECT description
FROM film
WHERE film_id=100;
```

### 6)

Find every R-rated movie.

```SQL
SELECT title
FROM film
WHERE rating='R';
```

### 7)

Find every non-R-rated movie.

```SQL
SELECT title
FROM film
WHERE rating!='R';
```

### 8)

Find the ten shortest movies.

```SQL
SELECT title, length
FROM film
ORDER BY length ASC
LIMIT 10;
```

### 9)

Find the movies with the longest runtime, without using ```LIMIT```.

```SQL
SELECT title, length
FROM film
WHERE length= (
	SELECT max(length)
	FROM film
);
```

### 10)

Find all movies that have deleted scenes.

```SQL
SELECT title
FROM film
WHERE special_features='Deleted Scenes';
```

### 11)

Using ```HAVING```, reverse-alphabetically list the last names that are not repeated.

```SQL
SELECT DISTINCT last_name
FROM actor
HAVING last_name IS NOT NULL
ORDER BY last_name DESC;
```

### 12)

Using ```HAVING```, list the last names that appear more than once, from highest to lowest frequency.

```SQL
SELECT last_name, COUNT(last_name)
FROM actor
GROUP BY last_name
HAVING COUNT(last_name) > 1
ORDER BY COUNT(last_name) DESC;
```

### 13)

Which actor has appeared in the most films?

```SQL
SELECT actor_info.first_name, actor_info.last_name
FROM actor_info
JOIN film_actor ON actor_info.actor_id=film_actor.actor_id
GROUP BY actor_info.actor_id
ORDER BY COUNT(*) DESC
LIMIT 1;
```

### 14)

When is 'Academy Dinosaur' due?

```SQL
SELECT film.title, DATE_ADD(rental.rental_date, INTERVAL film.rental_duration DAY) AS due_date
FROM film
LEFT OUTER JOIN inventory ON film.film_id = inventory.film_id
LEFT OUTER JOIN rental ON rental.inventory_id = inventory.inventory_id
WHERE film.title = "Academy Dinosaur"
AND rental.return_date IS NULL
AND rental.rental_date IS NOT NULL;
```

### 15)

What is the average runtime of all films?

```SQL
SELECT AVG(length)
FROM film;
```

### 16)

List the average runtime for every film category.

```SQL
SELECT category.name, AVG(film.length)
FROM category
JOIN film_category ON film_category.category_id=category.category_id
JOIN film ON film.film_id=film_category.film_id
GROUP BY category.category_id
ORDER BY AVG(film.length) DESC;
```

### 17)

List all movies featuring a robot.

```SQL
SELECT film.title
FROM film_text 
JOIN film ON film.film_id=film_text.film_id
WHERE film_text.description LIKE '%robot%';
```

### 18)

How many movies were released in 2010?

```SQL
SELECT COUNT(release_year) AS 2010_films
FROM film
WHERE release_year=2010;
```

### 19)

Find the titles of all the horror movies.

```SQL
SELECT film.title
FROM category
JOIN film_category ON film_category.category_id=category.category_id
JOIN film ON film_category.film_id=film.film_id
WHERE category.name='Horror';
```

### 20)

List the full name of the staff member with the ID of 2.

```SQL
SELECT first_name, last_name
FROM staff
WHERE staff_id=2;
```

### 21)

List all the movies that Fred Costner has appeared in.

```SQL
SELECT film.title
FROM film
JOIN film_actor ON film_actor.film_id=film.film_id
JOIN actor ON actor.actor_id=film_actor.actor_id
WHERE actor.first_name='FRED' AND actor.last_name='Costner';
```

### 22)

How many distinct countries are there?

```SQL
SELECT DISTINCT COUNT(country) AS distinct_countries
FROM country;
```

### 23)

List the name of every language in reverse-alphabetical order.

```SQL
SELECT name
FROM language
ORDER BY name DESC;
```

### 24)

List the full names of every actor whose surname ends with '-son' in alphabetical order by their forename.

```SQL
SELECT first_name, last_name
FROM actor
WHERE last_name LIKE '%son'
ORDER BY first_name ASC;
```

### 25)

Which category contains the most films?

```SQL
SELECT category.name
FROM category
JOIN film_category ON film_category.category_id=category.category_id
GROUP BY category.category_id
ORDER BY COUNT(film_category.category_id) DESC
LIMIT 1;
```

## World Challenge SQL

### 1)

Using ```COUNT```, get the number of cities in the USA.

```SQL
SELECT COUNT(CountryCode) 
FROM city 
WHERE CountryCode = 'USA';
```

### 2)

Find out the population and life expectancy for people in Argentina.

```SQL
SELECT Population, LifeExpectancy 
FROM country 
WHERE Name = 'Argentina';
```

### 3)

Using ```IS NOT NULL```, ```ORDER BY```, and ```LIMIT```, which country has the highest life expectancy?

```SQL
SELECT LifeExpectancy 
FROM country 
WHERE LifeExpectancy IS NOT NULL 
ORDER BY LifeExpectancy DESC 
LIMIT 1;
```

### 4)

Using ```JOIN ... ON```, find the capital city of Spain.

```SQL
SELECT country.Name, city.Name 
FROM country 
JOIN city ON country.Capital=city.id 
WHERE country.Name='Spain';
```

### 5)

Using ```JOIN ... ON```, list all the languages spoken in the Southeast Asia region.

```SQL
SELECT countrylanguage.Language 
FROM countrylanguage 
JOIN country ON country.Code=countrylanguage.CountryCode 
WHERE country.Region='Southeast Asia';
```

### 6)

Using a single query, list 25 cities around the world that start with the letter F.

```SQL
SELECT Name 
FROM city 
WHERE Name 
LIKE 'F%' 
LIMIT 25;
```

### 7)

Using ```COUNT``` and ```JOIN ... ON```, get the number of cities in China.

```SQL
SELECT COUNT(CountryCode) 
FROM city 
JOIN country ON country.Code=city.CountryCode 
WHERE country.Name='China';
```

### 8)

Using IS ```NOT NULL```, ```ORDER BY```, and ```LIMIT```, which country has the lowest population? Discard non-zero populations.

```SQL
SELECT Name, Population 
FROM country 
WHERE Population IS NOT NULL 
ORDER BY Population ASC 
LIMIT 1;
```

### 9)

Using aggregate functions, return the number of countries the database contains.

```SQL
SELECT COUNT(Name) 
FROM country;
```

### 10)

What are the top ten largest countries by area?

```SQL
SELECT Name, SurfaceArea 
From country 
ORDER BY SurfaceArea DESC 
LIMIT 10;
```

### 11)

List the five largest cities by population in Japan.

```SQL
SELECT city.Name 
FROM city 
JOIN country ON city.CountryCode=country.Code 
WHERE country.Name='Japan' 
ORDER BY city.Population DESC 
LIMIT 5;
```

### 12)

List the names and country codes of every country with Elizabeth II as its Head of State. You will need to fix the mistake first!

```SQL
UPDATE country 
SET HeadOfState='Elizabeth II' 
WHERE HeadOfState='Elisabeth II';

SELECT Name, Code 
FROM country 
WHERE HeadOfState='Elizabeth II';
```

### 13)

List the top ten countries with the smallest population-to-area ratio. Discard any countries with a ratio of 0.

```SQL
SELECT Name, SurfaceArea, Population, Population / SurfaceArea  
FROM country 
ORDER BY Population / SurfaceArea ASC, SurfaceArea DESC 
LIMIT 10;
```

### 14)

List every unique world language.

```SQL
SELECT DISTINCT Language 
FROM countrylanguage;
```

### 15)

List the names and GNP of the world's top 10 richest countries.

```SQL
SELECT Name, GNP 
FROM country 
ORDER BY GNP DESC 
LIMIT 10;
```

### 16)

List the names of, and number of languages spoken by, the top ten most multilingual countries.

```SQL
SELECT country.Name, COUNT(countrylanguage.CountryCode) 
FROM country 
JOIN countrylanguage ON countrylanguage.CountryCode=country.Code 
GROUP BY country.Name
ORDER BY COUNT(countrylanguage.CountryCode) DESC 
LIMIT 10;
```

### 17)

List every country where over 50% of its population can speak German.

```SQL
SELECT country.Name
FROM country
JOIN countrylanguage ON countrylanguage.CountryCode=country.Code
WHERE countrylanguage.Language='German' 
AND countrylanguage.Percentage >= 50.00;
```

### 18)

Which country has the worst life expectancy? Discard zero or null values.

```SQL
SELECT Name, LifeExpectancy 
FROM country 
WHERE LifeExpectancy IS NOT NULL 
AND LifeExpectancy > 0
ORDER BY LifeExpectancy ASC 
LIMIT 1;
```

### 19)

List the top three most common government forms.

```SQL
SELECT GovernmentForm, COUNT(GovernmentForm)
FROM country
GROUP BY GovernmentForm
ORDER BY COUNT(GovernmentForm) DESC
LIMIT 3;
```

### 20)

How many countries have gained independence since records began?

```SQL
SELECT COUNT(IndepYear)
FROM country
WHERE IndepYear IS NOT NULL;
```

## Movielens Challenge SQL

### 1)

List the titles and release dates of movies released between 1983-1993 in reverse chronological order.

```SQL
SELECT title, release_date
FROM movies
WHERE release_date BETWEEN '1983-01-01' AND '1993-01-01'
ORDER BY release_date DESC;
```


### 2)

Without using ```LIMIT```, list the titles of the movies with the lowest average rating.

```SQL
SELECT title, AVG(rating) AS average_rating
FROM movies
JOIN ratings ON movies.id = ratings.movie_id
GROUP BY movies.title
HAVING average_rating = (
	SELECT MIN(avg_rating)
	FROM (
		SELECT AVG(rating) AS avg_rating
		FROM ratings
		GROUP BY movie_id
	) AS table1
)
ORDER BY average_rating;
```


### 3)

List the unique records for Sci-Fi movies where male 24-year-old students have given 5-star ratings.

```SQL
SELECT movies.id, title
FROM movies
JOIN genres_movies ON genres_movies.movie_id=movies.id
JOIN genres ON genres.id=genres_movies.genre_id
JOIN ratings ON ratings.movie_id=movies.id
JOIN users ON users.id=ratings.user_id
JOIN occupations ON occupations.id=users.occupation_id
WHERE genres.name='Sci-Fi'
AND users.age='24'
AND users.gender='m'
AND ratings.rating='5'
AND occupations.name='Student';
```


### 4)

List the unique titles of each of the movies released on the most popular release day.

```SQL
SELECT title
FROM movies
WHERE release_date=(
	SELECT release_date
	FROM movies
	GROUP BY release_date
	ORDER BY COUNT(id) DESC
	LIMIT 1
);
```


### 5)

Find the total number of movies in each genre; list the results in ascending numeric order.

```SQL
SELECT COUNT(movies.id), genres.name
FROM genres
JOIN genres_movies ON genres.id=genres_movies.genre_id
JOIN movies ON genres_movies.movie_id=movies.id
GROUP BY genres_movies.genre_id
ORDER BY COUNT(movies.id) DESC;
```