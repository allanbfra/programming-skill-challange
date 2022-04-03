SELECT DISTINCT name
FROM (
    SELECT name FROM dogs
    UNION
    SELECT name FROM cats
) a
ORDER BY name