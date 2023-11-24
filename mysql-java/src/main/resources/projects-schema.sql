DROP TABLE IF EXISTS material;
DROP TABLE IF EXISTS step;
DROP TABLE IF EXISTS project_category;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS project;

CREATE TABLE project (
	project_id INT AUTO_INCREMENT NOT NULL,
	project_name VARCHAR(128) NOT NULL,
	Estimated_hours TIME,
	actual_hours TIME,
	difficulty VARCHAR(64),
	notes VARCHAR(128),
	PRIMARY KEY (project_id)
);

CREATE TABLE category (
	category_id INT AUTO_INCREMENT NOT NULL,
	category_name VARCHAR(128) NOT NULL,
	PRIMARY KEY (category_id)
);

CREATE TABLE project_category (
	category_id INT NOT NULL,
	project_id INT NOT null,
	FOREIGN KEY (category_id) REFERENCES category (category_id) ON DELETE CASCADE,
	FOREIGN KEY (project_id) REFERENCES project (project_id) ON DELETE cascade,
	unique key (project_id, category_id)
);

CREATE TABLE step (
	step_id INT AUTO_INCREMENT NOT NULL,
	project_id INT NOT NULL,
	step_text VARCHAR(128),
	step_order INT NOT NULL,
	PRIMARY KEY (step_id),
	FOREIGN KEY (project_id) REFERENCES project (project_id) ON DELETE cascade
);

CREATE TABLE material (
	material_id INT AUTO_INCREMENT NOT NULL,
	project_id INT not null,
	material_name VARCHAR(128) NOT NULL,
	num_required INT NOT NULL,
	cost DECIMAL(7, 2),
	PRIMARY KEY (material_id),
	FOREIGN KEY (project_id) REFERENCES project (project_id) ON DELETE cascade

);

