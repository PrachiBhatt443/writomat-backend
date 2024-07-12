CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    category VARCHAR(100),
    bio TEXT,
    contactOptions VARCHAR(255),
    links TEXT,
    followers INT,
    following INT,
    posts INT
);

CREATE TABLE analytics (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT,
    account_reach INT,
    account_engagement INT,
    content_shared INT,
    ads_run INT,
    active_promotions INT,
    total_stories INT,
    total_follows INT,
    total_posts INT,
    total_saves INT,
    total_comments INT,
    total_shares INT,
    FOREIGN KEY (user_id) REFERENCES users(id)
);
