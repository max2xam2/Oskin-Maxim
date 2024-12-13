SELECT COUNT(profile_id) AS users0Post
FROM profile p
WHERE NOT EXISTS (
    SELECT 1 FROM post po WHERE po.profile_id = p.profile_id
);
