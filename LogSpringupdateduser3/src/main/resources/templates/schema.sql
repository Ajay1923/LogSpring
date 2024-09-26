CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    middle_name VARCHAR(255),
    last_name VARCHAR(255) NOT NULL,
    date_of_birth DATE NOT NULL,
    gender VARCHAR(10) NOT NULL,
    email VARCHAR(255) NOT NULL,
    mobile_number VARCHAR(15) NOT NULL
);


SELECT * FROM users WHERE username ='oslo';
SELECT * FROM users WHERE username ='user';


CREATE TABLE statistics (
    id SERIAL PRIMARY KEY,
    user_id INT NOT NULL,
    timestamp VARCHAR(300) NOT NULL,
    uploaded_file_name VARCHAR(300) NOT NULL,
    resulting_file_name VARCHAR(300) NOT NULL,
    log_codes VARCHAR(300) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id)
);