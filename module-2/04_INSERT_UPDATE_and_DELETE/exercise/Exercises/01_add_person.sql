-- 1. Add a new person to the person table with the name "Lisa Byway" with the birthday of 4/15/1984 (1 row)

INSERT INTO person (person_name, birthday)
VALUES ('Lisa Byway', '1984-04-15');

SELECT * FROM person WHERE person_name = 'Lisa Byway';

--DELETE FROM person WHERE person_id = 3984917;