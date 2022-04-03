SELECT
    CASE
        WHEN n.grade < 8 THEN 'NULL'
            ELSE s.name
    END, n.grade, s.value
FROM students s
JOIN notes n on s.value
BETWEEN n.min_value AND n.max_value
ORDER BY n.grade DESC, s.name DESC;