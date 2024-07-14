-- Insert a sample user
INSERT INTO app_user (name) VALUES ('John Doe');

-- Insert some analytics data for the sample user
INSERT INTO analytics (
    platform, userName, category, bio, contact, link, followers, posts, accountReach,
    engagement, contentShared, adsRun, activePromotions, totalStories, totalFollows,
    totalPosts, totalSaves, totalComments, totalShares, user_id
) VALUES (
    'Facebook', 'JohnDoeFB', 'Tech', 'Tech Enthusiast', 'john.doe@example.com',
    'https://facebook.com/JohnDoeFB', 1200, 300, 5000, 2500, 150, 20, 5, 300, 30,
    100, 50, 200, 60, 1
);

INSERT INTO analytics (
    platform, userName, category, bio, contact, link, followers, posts, accountReach,
    engagement, contentShared, adsRun, activePromotions, totalStories, totalFollows,
    totalPosts, totalSaves, totalComments, totalShares, user_id
) VALUES (
    'Instagram', 'JohnDoeIG', 'Lifestyle', 'Lifestyle Blogger', 'john.doe@example.com',
    'https://instagram.com/JohnDoeIG', 1400, 500, 6000, 2800, 200, 25, 10, 400, 40,
    120, 55, 210, 65, 1
);

INSERT INTO analytics (
    platform, userName, category, bio, contact, link, followers, posts, accountReach,
    engagement, contentShared, adsRun, activePromotions, totalStories, totalFollows,
    totalPosts, totalSaves, totalComments, totalShares, user_id
) VALUES (
    'YouTube', 'JohnDoeYT', 'Education', 'Educational Content Creator', 'john.doe@example.com',
    'https://youtube.com/JohnDoeYT', 5000, 150, 25000, 12000, 300, 10, 3, 200, 15,
    80, 30, 150, 40, 1
);

INSERT INTO analytics (
    platform, userName, category, bio, contact, link, followers, posts, accountReach,
    engagement, contentShared, adsRun, activePromotions, totalStories, totalFollows,
    totalPosts, totalSaves, totalComments, totalShares, user_id
) VALUES (
    'Twitter', 'JohnDoeTW', 'Tech', 'Tech Enthusiast and Blogger', 'john.doe@example.com',
    'https://twitter.com/JohnDoeTW', 2000, 800, 10000, 6000, 250, 15, 4, 180, 25,
    90, 35, 130, 55, 1
);
