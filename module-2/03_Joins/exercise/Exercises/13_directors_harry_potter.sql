-- 13. The directors of the movies in the "Harry Potter Collection" (4 rows)

SELECT DISTINCT
	person_name
FROM 	
	movie AS m
	JOIN collection AS c ON m.collection_id = c.collection_id
	JOIN person AS p ON m.director_id = p.person_id
WHERE
	collection_name = 'Harry Potter Collection' 
