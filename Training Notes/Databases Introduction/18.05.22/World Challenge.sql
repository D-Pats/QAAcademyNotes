USE World;
-- Question 1
-- Using COUNT, get the number of cities in the USA.
SELECT COUNT(c.name) AS number_of_cities FROM city c
JOIN country co ON c.countrycode = co.code
WHERE co.name = 'United States';

-- Question 2
-- Find out the population and life expectancy for people in Argentina.
SELECT population, lifeexpectancy FROM country WHERE name = 'argentina';

-- Question 3
-- Using IS NOT NULL, ORDER BY, and LIMIT, which country has the highest life expectancy?
SELECT name, lifeexpectancy FROM country WHERE lifeexpectancy IS NOT NULL ORDER BY lifeexpectancy DESC LIMIT 1;

-- Question 4
-- Using JOIN ... ON, find the capital city of Spain.
SELECT c.name FROM city c
JOIN country co ON c.countrycode = co.code
WHERE c.id = 653;

-- Question 5
-- Using JOIN ... ON, list all the languages spoken in the Southeast Asia region.
SELECT DISTINCT cl.language FROM country c
JOIN countrylanguage cl on c.code = cl.countrycode
WHERE region = 'southeast asia';

-- Question 6
-- Using a single query, list 25 cities around the world that start with the letter F.


-- Question 7
-- Using COUNT and JOIN ... ON, get the number of cities in China.


-- Question 8
-- Using IS NOT NULL, ORDER BY, and LIMIT, which country has the lowest population? Discard non-zero populations.


-- Question 9
-- Using aggregate functions, return the number of countries the database contains.


-- Question 10
-- What are the top ten largest countries by area?


-- Question 11
-- List the five largest cities by population in Japan.


-- Question 12
-- List the names and country codes of every country with Elizabeth II as its Head of State. You will need to fix the mistake first!


-- Question 13
-- List the top ten countries with the smallest population-to-area ratio. Discard any countries with a ratio of 0.


-- Question 14
-- List every unique world language.


-- Question 15
-- List the names and GNP of the world's top 10 richest countries.


-- Question 16
-- List the names of, and number of languages spoken by, the top ten most multilingual countries.


-- Question 17
-- List every country where over 50% of its population can speak German.


-- Question 18
-- Which country has the worst life expectancy? Discard zero or null values.


-- Question 19
-- List the top three most common government forms.


-- Question 20
-- How many countries have gained independence since records began?