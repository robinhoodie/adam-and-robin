CREATE DATABASE adam_and_robin with OWNER = adamnrobin;

CREATE TABLE arw_contact_information (
	contact_information_id INT,
	active BOOLEAN,
	
	PRIMARY KEY (contact_information_id)
);