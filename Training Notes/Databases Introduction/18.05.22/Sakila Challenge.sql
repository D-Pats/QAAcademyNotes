USE Sakila;

-- Question 1
-- List all actors.
SELECT * FROM actor;

-- Question 2
-- Find the surname of the actor with the forename 'John'.
SELECT * FROM actor WHERE first_name = 'John';

-- Question 3
-- Find all actors with the surname 'Neeson'.
SELECT * FROM actor WHERE last_name = 'Neeson';

-- Question 4
-- Find all actors with ID numbers divisible by 10
SELECT * FROM actor WHERE actor_id LIKE '%0';
-- or
SELECT * FROM actor WHERE actor_id % 10 = 0;

-- Question 5 
-- What is the description of the movie with an ID of 100?
SELECT `description` FROM film WHERE film_id = 100;

-- Question 6
-- Find every R-rated movie.
SELECT * FROM film WHERE rating = 'r';

-- Question 7
-- Find every non-R-rated movie.
SELECT * FROM film WHERE rating != 'r';

-- Question 8
-- Find the ten shortest movies.
SELECT * FROM film ORDER BY length LIMIT 10;

-- Question 9
-- Find the movies with the longest runtime, without using LIMIT.
SELECT * FROM film WHERE length = (SELECT MAX(length) FROM film);

-- Question 10
-- Find all movies that have deleted scenes.
SELECT * FROM film where special_features LIKE '%Deleted Scenes';

-- Question 11
-- Using HAVING, reverse-alphabetically list the last names that are not repeated.
SELECT last_name from actor GROUP BY last_name HAVING COUNT(last_name) <= 1 ORDER BY last_name DESC;

-- Question 12
-- Using HAVING, list the last names that appear more than once, from highest to lowest frequency.
SELECT last_name from actor GROUP BY last_name HAVING COUNT(last_name) > 1 ORDER BY COUNT(last_name) DESC;

-- Question 13
-- Which actor has appeared in the most films?
SELECT a.first_name, a.last_name, CONCAT(a.first_name, ' ', a.last_name) AS full_name FROM film_actor fa
JOIN film f ON fa.film_id = f.film_id
JOIN actor a ON fa.actor_id = a.actor_id
GROUP BY full_name ORDER BY COUNT(full_name) DESC LIMIT 1;

-- Question 14
-- When is 'Academy Dinosaur' due?
SELECT f.title, r.return_date FROM film f
JOIN inventory i ON i.film_id = f.film_id
JOIN rental r ON i.inventory_id = r.inventory_id
WHERE title = 'Academy Dinosaur' ORDER BY r.return_date DESC LIMIT 1;
-- Jordans answer
SELECT f.title, r.rental_date, f.rental_duration, DATE_ADD(r.rental_date, INTERVAL f.rental_duration DAY) AS real_return_date, r.return_date FROM film f
JOIN inventory i ON i.film_id = f.film_id
JOIN rental r ON i.inventory_id = r.inventory_id
WHERE title = 'Academy Dinosaur' AND r.return_date IS NULL;

-- Question 15
-- What is the average runtime of all films?
SELECT AVG(length) AS average FROM film;

-- Question 16
-- List the average runtime for every film category.
SELECT c.name, AVG(f.length) AS average_length FROM film_category fc
JOIN film f ON fc.film_id = f.film_id
JOIN category c ON fc.category_id = c.category_id
GROUP BY c.name;

-- Question 17
-- List all movies featuring a robot.
SELECT title, `description` FROM film WHERE `description` LIKE '%robot%';

-- Question 18
-- How many movies were released in 2010?
SELECT COUNT(title) AS num_of_movies_2010 FROM film WHERE release_year LIKE '%2010';

-- Question 19
-- Find the titles of all the horror movies.
SELECT f.title, c.name FROM film_category fc
JOIN film f ON fc.film_id = f.film_id
JOIN category c ON fc.category_id = c.category_id
Where c.name = 'Horror';

-- Question 20
-- List the full name of the staff member with the ID of 2.
SELECT CONCAT(first_name, ' ', last_name) AS staff_name FROM staff WHERE staff_id = 2;

-- Question 21
-- List all the movies that Fred Costner has appeared in.
SELECT f.title FROM film_actor fa
JOIN film f ON fa.film_id = f.film_id
JOIN actor a ON fa.actor_id = a.actor_id
WHERE a.first_name = 'fred' AND a.last_name = 'costner';

-- Question 22
-- How many distinct countries are there?
SELECT DISTINCT COUNT(country) AS distinct_countries FROM country;

-- Question 23
-- List the name of every language in reverse-alphabetical order.
SELECT DISTINCT `name` FROM `language`;

-- Question 24
-- List the full names of every actor whose surname ends with '-son' in alphabetical order by their forename.
SELECT CONCAT(first_name, ' ', last_name) AS full_name FROM actor WHERE last_name LIKE '%son' ORDER BY first_name;

-- Question 25
-- Which category contains the most films?
SELECT c.name FROM film_category fc
JOIN film f ON fc.film_id = f.film_id
JOIN category c ON fc.category_id = c.category_id
GROUP BY fc.category_id ORDER BY COUNT(fc.category_id) DESC LIMIT 1;