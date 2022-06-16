-- INSERT

-- Add Disneyland to the park table. (It was established on 7/17/1955, has an area of 2.1 square kilometers and does not offer camping.)
INSERT INTO park(park_name, date_established, area, has_camping) 
VALUES ('Disneyland', '1955-07-17', 2.1, false);

INSERT INTO park(park_name, date_established, area, has_camping) 
VALUES ('Ault Park', '1960-01-01', 0.91234, false) RETURNING park_id;

SELECT * FROM park WHERE park_name = 'Ault Park';

SELECT * FROM park WHERE park_name = 'Disneyland';

-- Add Hawkins, IN (with a population of 30,000 and an area of 38.1 square kilometers) and Cicely, AK (with a popuation of 839 and an area of 11.4 square kilometers) to the city table.
INSERT INTO city(city_name, state_abbreviation, population, area)
VALUES ('Hawkins', 'IN', '30000', '38.1'), ('Cicely', 'AK', '839', '11.4');

SELECT * FROM city WHERE city_name = 'Hawkins';

-- Since Disneyland is in California (CA), add a record representing that to the park_state table.
INSERT INTO park_state(park_id, state_abbreviation)
VALUES ((SELECT park_id FROM park WHERE park_name = 'Disneyland'), 'CA');

SELECT * FROM park_state WHERE state_abbreviation = 'CA';


-- UPDATE

-- Change the state nickname of California to "The Happiest Place on Earth."
UPDATE state SET state_nickname = 'The Happiest Place on Earth.' WHERE state_abbreviation = 'CA';

SELECT * FROM state WHERE state_abbreviation = 'CA'

-- Increase the population of California by 1,000,000.
UPDATE state SET population = population + 1000000 WHERE state_abbreviation = 'CA';

SELECT * FROM state WHERE state_abbreviation = 'CA'

-- Change the capital of California to Anaheim.
UPDATE state SET capital = (SELECT city_id FROM city WHERE city_name = 'Anaheim' AND state_abbreviation = 'CA') WHERE state.state_abbreviation = 'CA';

SELECT
	*
FROM
	state AS s
	JOIN city AS c ON s.capital = c.city_id
WHERE
	s.state_abbreviation = 'CA'
-- Change California's nickname back to "The Golden State", reduce the population by 1,000,000, and change the capital back to Sacramento.
UPDATE state SET 
	state_nickname = 'The Golden State',
	population = population - 1000000,
	capital = (SELECT city_id FROM city WHERE city_name = 'Sacramento' AND state_abbreviation = 'CA')
WHERE 
	state.state_abbreviation = 'CA'
	
SELECT * FROM state WHERE state_abbreviation = 'CA'

-- DELETE cannot delete column from a row

-- Delete Hawkins, IN from the city table.
DELETE FROM city WHERE city_name = 'Hawkins' AND state_abbreviation = 'IN'

-- Delete all cities with a population of less than 1,000 people from the city table.

DELETE FROM city WHERE population < 1000

-- REFERENTIAL INTEGRITY

-- Try adding a city to the city table with "XX" as the state abbreviation.
INSERT INTO city (state_abbreviation, area, city_name, population)
VALUES ('XX', 3.14, 'Gotham', 500000);

-- Try deleting California from the state table.
DELETE FROM state WHERE state_abbreviation = 'CA'

-- Try deleting Disneyland from the park table. Try again after deleting its record from the park_state table.
DELETE FROM park_state WHERE park_id = (SELECT park_id FROM park WHERE park_name = 'Disneyland') 

DELETE FROM park WHERE park_name = 'Disneyland'


-- CONSTRAINTS

-- NOT NULL constraint
-- Try adding Smallville, KS to the city table without specifying its population or area.
INSERT INTO city (city_name, state_abbreviation)
VALUES ('Smallville', 'KS')

-- DEFAULT constraint
-- Try adding Smallville, KS again, specifying an area but not a population.
INSERT INTO city (city_name, state_abbreviation, area)
VALUES ('Smallville', 'KS', .1)

-- Retrieve the new record to confirm it has been given a default, non-null value for population.
SELECT * FROM city WHERE city_name = 'Smallville'

-- UNIQUE constraint
-- Try changing California's nickname to "Vacationland" (which is already the nickname of Maine).
UPDATE state SET state_nickname = 'Vacationland' WHERE state_abbreviation = 'CA';

-- CHECK constraint
-- Try changing the census region of Florida (FL) to "Southeast" (which is not a valid census region).
UPDATE state SET census_region = 'Southeast' WHERE state_abbreviation = 'FL';


-- TRANSACTIONS

-- Delete the record for Smallville, KS within a transaction.
BEGIN TRANSACTION;
DELETE FROM city WHERE city_name = 'Smallville';
COMMIT;

-- Delete all of the records from the park_state table, but then "undo" the deletion by rolling back the transaction.
BEGIN TRANSACTION;
DELETE FROM park_state;
SELECT * FROM park_state;
ROLLBACK;

-- Update all of the cities to be in the state of Texas (TX), but then roll back the transaction.
BEGIN TRANSACTION;
UPDATE city SET state_abbreviation = 'TX';
SELECT * FROM city;
ROLLBACK;

-- Demonstrate two different SQL connections trying to access the same table where one is inside of a transaction but hasn't committed yet.
