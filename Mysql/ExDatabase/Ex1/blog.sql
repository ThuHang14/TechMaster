
CREATE TABLE post(
id INT PRIMARY KEY AUTO_INCREMENT, 
title TEXT NOT NULL, 
content TEXT NOT NULL, 
description TEXT NOT NULL, 
author_id INT ,
thumbnail TEXT NOT NULL, 
status TEXT NOT NULL, 
create_at TEXT NOT NULL , 
published_at TEXT NOT NULL, 
view_count INT, 
vote_score INT, 
post_type TEXT NOT NULL
)

CREATE TABLE users(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL,
email TEXT NOT NULL,
mobile varchar(15),
password TEXT NOT NULL,
avatar TEXT NOT NULL
)


CREATE TABLE discuss(
id INT PRIMARY KEY AUTO_INCREMENT,
post_id INT ,
author_id INT ,
text TEXT NOT NULL,
is_public TEXT NOT NULL,
create_at TEXT NOT NULL,
FOREIGN KEY (post_id) REFERENCES post(id),
FOREIGN KEY (author_id) REFERENCES users(id)
)

CREATE TABLE tag(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL
)

CREATE TABLE post_tag(
post_id INT,
tag_id INT,
FOREIGN KEY (post_id) REFERENCES discuss(post_id),
FOREIGN KEY (tag_id) REFERENCES tag(id)
)
