-- 7. The genres of movies that Christopher Lloyd has appeared in (8 rows)
-- Hint: DISTINCT will prevent duplicate values in your query results.

SELECT DISTINCT genre_name
FROM 
	movie AS m
	JOIN movie_actor AS ma ON m.movie_id = ma.movie_id
	JOIN person AS p ON ma.actor_id = p.person_id
	JOIN movie_genre AS mg ON m.movie_id = mg.movie_id
	JOIN genre AS g ON mg.genre_id = g.genre_id
WHERE
	person_name = 'Christopher Lloyd';
	