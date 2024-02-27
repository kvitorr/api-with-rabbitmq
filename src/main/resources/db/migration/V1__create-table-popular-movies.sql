CREATE TABLE popular_movies (
    id BIGINT,
    insertion_date_time TIMESTAMP,
    title TEXT,
    original_title TEXT,
    overview TEXT,
    popularity BIGINT,
    release_date VARCHAR(10),
    adult BOOLEAN,

    PRIMARY KEY(id, insertion_date_time)
);