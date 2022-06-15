-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later (6 rows)

SELECT DISTINCT genre_name
FROM 
	movie AS m
	JOIN movie_actor AS ma ON m.movie_id = ma.movie_id
	JOIN person AS p ON ma.actor_id = p.person_id
	JOIN movie_genre AS mg ON m.movie_id = mg.movie_id
	JOIN genre AS g ON mg.genre_id = g.genre_id
WHERE
	person_name = 'Robert De Niro' AND release_date >= '2010-01-01';

