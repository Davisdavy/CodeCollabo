SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS Developers (
 id int PRIMARY KEY auto_increment,
 dev_name VARCHAR,
 dev_link VARCHAR

);

CREATE TABLE IF NOT EXISTS Teams (
 id int PRIMARY KEY auto_increment,
 team_name VARCHAR,
 dev_id INTEGER
);

CREATE TABLE IF NOT EXISTS Jobs (
 id int PRIMARY KEY auto_increment,
 job_name VARCHAR,
 job_requirement VARCHAR,
 dev_id INTEGER
);