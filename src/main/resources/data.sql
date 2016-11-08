INSERT INTO CANDY (id, name, brand, price, rating, calories) VALUES (1, 'Twix', 'Mars', 100, 2, 283.0);
INSERT INTO CANDY (id, name, brand, price, rating, calories) VALUES (2, 'Snickers', 'Mars', 150, 1, 299.0);
INSERT INTO CANDY (id, name, brand, price, rating, calories) VALUES (3, 'Balisto', 'Mars', 200, 5, 92.5);
INSERT INTO CANDY (id, name, brand, price, rating, calories) VALUES (4, 'Mars', 'Mars', 150, 3, 229.0);
INSERT INTO CANDY (id, name, brand, price, rating, calories) VALUES (5, 'Lion', 'Nestle', 100, 2, 217.0);
INSERT INTO CANDY (id, name, brand, price, rating, calories) VALUES (6, 'Kitkat', 'Nestle', 150, 3, 217.0);
INSERT INTO CANDY (id, name, brand, price, rating, calories) VALUES (7, 'Kinder Schoko-Bons', 'kinder', 200, 4, 346.0);
INSERT INTO CANDY (id, name, brand, price, rating, calories) VALUES (8, 'kinder Riegel', 'kinder', 50, 3, 119.0);
INSERT INTO CANDY (id, name, brand, price, rating, calories) VALUES (9, 'kinder Schokolade', 'kinder', 150, 1, 119.0);
INSERT INTO CANDY (id, name, brand, price, rating, calories) VALUES (10, 'Ü-Ei', 'kinder', 50, 2, 111.0);
INSERT INTO CANDY (id, name, brand, price, rating, calories) VALUES (11, 'Goldbären', 'Haribo', 200, 1, 257.0);
INSERT INTO CANDY (id, name, brand, price, rating, calories) VALUES (12, 'Color-Rado', 'Haribo', 150, 3, 363.0);
INSERT INTO CANDY (id, name, brand, price, rating, calories) VALUES (13, 'Tropifrutti', 'Haribo', 150, 2, 349.0);
INSERT INTO CANDY (id, name, brand, price, rating, calories) VALUES (14, 'Happy Cola', 'Haribo', 200, 5, 348.0);


INSERT INTO FITNESS (id, description, level) VALUES (1, 'Geht so', 3);
INSERT INTO FITNESS (id, description, level) VALUES (2, 'Ich wohne im 6. Stock ohne Aufzug', 2);
INSERT INTO FITNESS (id, description, level) VALUES (3, 'Triathlet', 1);
INSERT INTO FITNESS (id, description, level) VALUES (4, 'Couchpotatoe', 4);
INSERT INTO FITNESS (id, description, level) VALUES (5, 'Fitnessguru', 2);
INSERT INTO FITNESS (id, description, level) VALUES (6, 'Fit was?', 5);

INSERT INTO USER (id, first_name, last_name, fitness_id) VALUES(1, 'Sascha', 'Heinz', 1);
INSERT INTO USER (id, first_name, last_name, fitness_id) VALUES(2, 'Manuel', 'Meier', 2);
INSERT INTO USER (id, first_name, last_name, fitness_id) VALUES(3, 'Sven', 'Maier', 3);
INSERT INTO USER (id, first_name, last_name, fitness_id) VALUES(4, 'Andrea', 'Kunz', 4);
INSERT INTO USER (id, first_name, last_name, fitness_id) VALUES(5, 'Leon', 'Schmidt', 5);
INSERT INTO USER (id, first_name, last_name, fitness_id) VALUES(6, 'Nina', 'Walter', 6);


INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(1, 5);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(1, 3);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(1, 2);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(1, 10);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(2, 10);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(2, 12);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(2, 13);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(2, 11);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(4, 1);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(4, 2);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(4, 3);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(4, 4);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(4, 5);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(4, 6);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(4, 7);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(4, 8);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(4, 9);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(4, 10);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(4, 11);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(4, 12);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(4, 13);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(5, 10);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(6, 8);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(6, 8);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(6, 8);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(6, 8);
INSERT INTO user_ordered_candies  (user_id, ordered_candies_id) VALUES(6, 8);


