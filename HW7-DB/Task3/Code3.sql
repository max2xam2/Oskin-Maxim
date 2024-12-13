SELECT p.post_id
FROM post p
LEFT JOIN comment c ON p.post_id = c.post_id
GROUP BY p.post_id
HAVING COUNT(c.comment_id) <= 1
ORDER BY p.post_id ASC
LIMIT 10;