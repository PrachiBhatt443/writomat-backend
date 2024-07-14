CREATE TABLE app_user (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE analytics (
    id SERIAL PRIMARY KEY,
    platform VARCHAR(50),
    userName VARCHAR(100),
    category VARCHAR(100),
    bio TEXT,
    contact VARCHAR(100),
    link VARCHAR(255),
    followers INTEGER,
    posts INTEGER,
    accountReach INTEGER,
    engagement INTEGER,
    contentShared INTEGER,
    adsRun INTEGER,
    activePromotions INTEGER,
    totalStories INTEGER,
    totalFollows INTEGER,
    totalPosts INTEGER,
    totalSaves INTEGER,
    totalComments INTEGER,
    totalShares INTEGER,
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES app_user(id) ON DELETE CASCADE
);
