-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
SELECT state_name, population FROM state ORDER BY population DESC;

-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT state_name, census_region FROM state ORDER BY census_region DESC NULLS LAST, state_name;
-- NULLS LAST/FIRST to put them where you want them

-- The biggest park by area
SELECT park_name, area FROM park ORDER BY area DESC;
SELECT state_name, population FROM state ORDER BY population DESC;

-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT city_name, population FROM city ORDER BY population DESC OFFSET 10 LIMIT 10;
--OFFSET gives you just what you want, groups of 10 at a time

-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.
-- SELECT CURRENT_DATE - '2022-05-16';
SELECT park_name, date_established, (CURRENT_DATE - date_established)/365 AS age_years 
FROM park ORDER BY age_years DESC, park_name LIMIT 20;

-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
SELECT * FROM city;
SELECT city_name || ', ' || state_abbreviation AS city_and_state FROM city; --single column result

-- All parks by name and date established "Name: park name Date established: date established".
SELECT 'Name: '|| park_name || ' Date established: '|| date_established AS park_dates FROM park;

-- The census region and state name of all states in the West & Midwest sorted in ascending order.
SELECT * FROM state WHERE census_region IN ('West','Midwest');
SELECT 'Census Region: ' || census_region || ' State: ' || state_name AS cr_and_state 
FROM state 
WHERE census_region IN ('West','Midwest')
ORDER BY population DESC;

-- AGGREGATE FUNCTIONS
-- collapse

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT ROUND(AVG(population)) AS pop_avg FROM state;

-- Total population in the West and South census regions
SELECT SUM(population) AS pop_sum, AVG(population) AS pop_avg FROM state WHERE census_region IN ('West', 'South');
SELECT SUM(population) AS pop_sum FROM state WHERE census_region IN ('West', 'South');

-- The number of cities with populations greater than 1 million
SELECT COUNT(city_name) FROM city WHERE population > 1000000;

-- The number of state nicknames.
SELECT * FROM state;
SELECT state_nickname FROM state;
SELECT COUNT(state_nickname) FROM state; --NULLS don't count
SELECT * FROM state WHERE state_nickname IS NULL; -- verifies that 5 rows have NULL in state nickname
SELECT COUNT(*) FROM STATE; --this includes the NULLs

-- The area of the smallest and largest parks.
SELECT area FROM park;
SELECT MIN(area) AS smallest_park, MAX(area) AS largest_park FROM park;


-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT
	state_abbreviation,
	COUNT(city_name) AS num_cities --could use COUNT(*)
FROM
	city
WHERE
	population > 100000
GROUP BY
	state_abbreviation
ORDER BY
	num_cities DESC, state_abbreviation;

-- Determine the average park area depending upon whether parks allow camping or not.
SELECT * FROM park;
SELECT has_camping, ROUND(AVG(area)) AS avg_area, COUNT(*) AS num_parks FROM park GROUP BY has_camping;

-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT 
	state_abbreviation,
	SUM(population) AS pop_sum
FROM 
	city 
GROUP BY 
	state_abbreviation 
ORDER BY 
	state_abbreviation;

-- The smallest city population in each state ordered by city population.
SELECT 
	state_abbreviation,
	MIN(population) AS smallest_city
FROM
	city
GROUP BY
	state_abbreviation
ORDER BY
	smallest_city;

SELECT * FROM state;
SELECT
	census_region, COUNT(*) AS num_states
FROM
	state
WHERE
	census_region IS NOT NULL
GROUP BY
	census_region
HAVING
	COUNT(*) >= 13
ORDER BY
	num_states DESC;


-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)



-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,


-- Include the names of the smallest and largest parks


-- List the capital cities for the states in the Northeast census region.
SELECT * FROM state;
SELECT * FROM city WHERE city_id = 198;

SELECT capital FROM state;

SELECT 
	*
FROM 
	city
WHERE
	city_id IN (SELECT capital FROM state); -- lists all state capitals

-- can use NOT IN to get every city that is not a capital
--subselect, poormans join
