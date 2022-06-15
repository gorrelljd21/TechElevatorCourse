-- 2. The names and birthdays of actors in "The Fifth Element" (15 rows)

SELECT
	person_name, birthday
FROM
	movie AS m
	JOIN movie_actor AS ma ON m.movie_id = ma.movie_id
	JOIN person AS p ON ma.actor_id = p.person_id
WHERE 
	title = 'The Fifth Element';