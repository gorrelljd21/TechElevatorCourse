-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)

SELECT
	title, person_name
FROM 
	person AS p
	JOIN movie_actor AS ma ON p.person_id =  ma.actor_id
	JOIN movie AS m ON ma.movie_id = m.movie_id
WHERE 
	actor_id = director_id

