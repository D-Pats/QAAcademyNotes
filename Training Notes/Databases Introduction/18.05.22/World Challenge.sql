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
SELECT `name` FROM city WHERE `name` LIKE 'f%' LIMIT 25;

-- Question 7
-- Using COUNT and JOIN ... ON, get the number of cities in China.
SELECT COUNT(c.countrycode) AS number_of_cities FROM city c
JOIN country co ON c.countrycode = co.code
WHERE co.name = 'china';

-- Question 8
-- Using IS NOT NULL, ORDER BY, and LIMIT, which country has the lowest population? Discard non-zero populations.
SELECT `name` FROM country WHERE population IS NOT NULL AND population != 0 ORDER BY population LIMIT 1;

-- Question 9
-- Using aggregate functions, return the number of countries the database contains.
SELECT COUNT(code) AS number_of_countries FROM country;

-- Question 10
-- What are the top ten largest countries by area?
SELECT `name` FROM country ORDER BY surfacearea DESC LIMIT 10;

-- Question 11
-- List the five largest cities by population in Japan.
SELECT c.name FROM city c
JOIN country co ON c.countrycode = co.code
WHERE co.name = 'japan' ORDER BY co.population DESC LIMIT 5;

-- Question 12
-- List the names and country codes of every country with Elizabeth II as its Head of State. You will need to fix the mistake first!
UPDATE country
SET headofstate = 'Elizabeth II'
WHERE headofstate = 'elisabeth ii';
SELECT `name`, `code` FROM country WHERE headofstate = 'elizabeth ii';

-- Question 13
-- List the top ten countries with the smallest population-to-area ratio. Discard any countries with a ratio of 0.
SELECT `name`, population/surfacearea AS population_density FROM country WHERE population AND surfacearea IS NOT NULL ORDER BY population/surfacearea LIMIT 10;

-- Question 14
-- List every unique world language.
SELECT DISTINCT `language` FROM countrylanguage;

-- Question 15
-- List the names and GNP of the world's top 10 richest countries.
SELECT `name`, gnp FROM country ORDER BY gnp DESC LIMIT 10;

-- Question 16
-- List the names of, and number of languages spoken by, the top ten most multilingual countries.
SELECT c.name, COUNT(cl.language) AS number_of_languages FROM country c
JOIN countrylanguage cl ON c.code = cl.countrycode
GROUP BY c.name ORDER BY number_of_languages DESC LIMIT 10;

-- Question 17
-- List every country where over 50% of its population can speak German.
SELECT c.name FROM country c
JOIN countrylanguage cl ON c.code = cl.countrycode
WHERE cl.language = 'german' AND isofficial = 't' AND cl.percentage > 50;

-- Question 18
-- Which country has the worst life expectancy? Discard zero or null values.
SELECT `name` FROM country WHERE lifeexpectancy IS NOT NULL AND lifeexpectancy > 0 ORDER BY lifeexpectancy LIMIT 1;

-- Question 19
-- List the top three most common government forms.
SELECT governmentform FROM country GROUP BY governmentform ORDER BY COUNT(governmentform) DESC LIMIT 3;

-- Question 20
-- How many countries have gained independence since records began?
SELECT COUNT(indepyear) AS number_gained_independence FROM country WHERE indepyear IS NOT NULL;