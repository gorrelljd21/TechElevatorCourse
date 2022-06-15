-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)

SELECT
	title
FROM 	
	movie AS m
	JOIN collection AS c ON m.collection_id = c.collection_id
	JOIN person AS p ON m.director_id = p.person_id
WHERE
	collection_name = 'Star Wars Collection' AND person_name NOT LIKE 'George Lucas'
