CREATE TABLE temperature_types (
    id INT AUTO_INCREMENT PRIMARY KEY,
    type_name VARCHAR(50) NOT NULL UNIQUE
);

INSERT INTO temperature_types (type_name) VALUES
    ('Fahrenheit to Celsius'),
    ('Celsius to Fahrenheit'),
    ('Kelvin to Celsius');

ALTER TABLE temperature_records
    ADD COLUMN temperature_type_id INT NULL;

UPDATE temperature_records r
JOIN temperature_types t ON r.type = t.type_name
SET r.temperature_type_id = t.id;

ALTER TABLE temperature_records
    MODIFY temperature_type_id INT NOT NULL,
    ADD CONSTRAINT fk_temperature_type
        FOREIGN KEY (temperature_type_id) REFERENCES temperature_types(id),
    DROP COLUMN type;
