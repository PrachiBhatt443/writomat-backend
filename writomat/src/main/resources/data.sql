-- Insert a sample user
INSERT INTO app_user (name) VALUES ('John Doe');

-- Insert some analytics data for the sample user
INSERT INTO analytics (
    platform, userName, category, bio, contact, link, followers, posts, accountReach,
    engagement, contentShared, adsRun, activePromotions, totalStories, totalFollows,
    totalPosts, totalSaves, totalComments, totalShares, user_id
) VALUES (
    'Facebook', 'JohnDoeFB', 'Tech', 'Tech Enthusiast', 'john.doe@example.com',
    'https://facebook.com/JohnDoeFB', 1200, 300, 5000, 2500, 150, 20, 5, 300,30,
    100, 50, 200, 60, 1
);

INSERT INTO analytics (
    platform, userName, category, bio, contact, link, followers, posts, accountReach,
    engagement, contentShared, adsRun, activePromotions, totalStories, totalFollows,
    totalPosts, totalSaves, totalComments, totalShares, user_id
) VALUES (
    'Instagram', 'JohnDoeIG', 'Lifestyle', 'Lifestyle Blogger', 'john.doe@example.com',
    'https://instagram.com/JohnDoeIG', 1400, 500, 6000, 2800, 200, 25, 10, 400,40,
    120, 55, 210, 65, 1
);
