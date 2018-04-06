DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id        VARCHAR(40) PRIMARY KEY,
  username  VARCHAR(50)  NOT NULL,
  password  VARCHAR(200)  NOT NULL,
  role      VARCHAR(20) NOT NULL
);