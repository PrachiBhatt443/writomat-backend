-- Insert user
INSERT INTO users (id,name) VALUES (1,'Prachi Bhatt');

-- Insert analytics data for Instagram
INSERT INTO analytics (
    user_id, platform, followers, following, posts, category, bio, contactOptions, links,
    account_reach, account_engagement, content_shared, ads_run, active_promotions, total_stories,
    total_follows, total_posts, total_saves, total_comments, total_shares
) VALUES (
    1, 'Instagram', 150000, 800, 200, 'Lifestyle', 'Sharing my daily life experiences and tips.',
    'Email: prachi.bhatt@example.com', 'https://www.instagram.com/prachi_bhatt',
    500000, 10000, 500, 10, 2, 50, 100, 200, 300, 400,800
);

-- Insert analytics data for YouTube
INSERT INTO analytics (
    user_id, platform, followers, following, posts, category, bio, contactOptions, links,
    account_reach, account_engagement, content_shared, ads_run, active_promotions, total_stories,
    total_follows, total_posts, total_saves, total_comments, total_shares
) VALUES (
    1, 'YouTube', 50000, 200, 100, 'Vlogging', 'Daily vlogs and tech reviews.',
    'Email: prachi.bhatt@example.com', 'https://www.youtube.com/channel/UC1234567890abcdef',
    2000000, 25000, 1500, 20, 5, 0, 0, 100, 1500, 5000,800
);

-- Insert analytics data for Facebook
INSERT INTO analytics (
    user_id, platform, followers, following, posts, category, bio, contactOptions, links,
    account_reach, account_engagement, content_shared, ads_run, active_promotions, total_stories,
    total_follows, total_posts, total_saves, total_comments, total_shares
) VALUES (
    1, 'Facebook', 30000, 1500, 250, 'Lifestyle', 'Exploring the world and sharing my thoughts.',
    'Email: prachi.bhatt@example.com', 'https://www.facebook.com/prachi.bhatt',
    750000, 12000, 800, 15, 3, 20, 30, 250, 1000, 800,79
);

-- Insert analytics data for Twitter
INSERT INTO analytics (
    user_id, platform, followers, following, posts, category, bio, contactOptions, links,
    account_reach, account_engagement, content_shared, ads_run, active_promotions, total_stories,
    total_follows, total_posts, total_saves, total_comments, total_shares
) VALUES (
    1, 'Twitter', 200000, 1000, 1500, 'Tech Enthusiast', 'Tweeting about the latest in technology.',
    'Email: prachi.bhatt@example.com', 'https://www.twitter.com/prachi_bhatt',
    1000000, 30000, 2000, 25, 7, 0, 0, 1500, 2500, 2000, 896
);
