SELECT p.post_id
FROM post p
JOIN comment c ON p.post_id = c.post_id
WHERE LEFT(p.title, 1) BETWEEN '0' AND '9'
  AND LENGTH(p.content) > 20
GROUP BY p.post_id
HAVING COUNT(c.comment_id) = 2
ORDER BY p.post_id ASC;
