
-- Insert sample user data
INSERT INTO users (name, category, bio, contactOptions, links, followers, following, posts) VALUES
('Prachi', 'Tech', 'Tech enthusiast and software developer.', 'Email: prachi@example.com', 'http://example.com/prachi', 2000, 500, 75);

-- Insert corresponding analytics data for Prachi
INSERT INTO analytics (user_id, account_reach, account_engagement, content_shared, ads_run, active_promotions, total_stories, total_follows, total_posts, total_saves, total_comments, total_shares) VALUES
((SELECT id FROM users WHERE name = 'Prachi'), 8000, 2500, 150, 5, 2, 30, 75, 20, 40, 50, 60);

