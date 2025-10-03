-- Création des tables
CREATE TABLE IF NOT EXISTS exercice (
    id_exercice INTEGER PRIMARY KEY AUTOINCREMENT,
    nom TEXT NOT NULL,
    categorie TEXT,
    description TEXT
);

CREATE TABLE IF NOT EXISTS performance (
    id_perf INTEGER PRIMARY KEY AUTOINCREMENT,
    id_exercice INTEGER,
    date TEXT,
    poids REAL,
    repetitions INTEGER,
    FOREIGN KEY (id_exercice) REFERENCES exercice(id_exercice)
);

-- Exemple de données
INSERT INTO exercice (nom, categorie, description) VALUES ('Développé couché', 'Pecs', 'Barre, couché');
INSERT INTO exercice (nom, categorie, description) VALUES ('Squat', 'Jambes', 'Back squat');
INSERT INTO exercice (nom, categorie, description) VALUES ('Soulevé de terre', 'Dos', 'Deadlift');

-- Quelques performances exemple
INSERT INTO performance (id_exercice, date, poids, repetitions) VALUES (1,'2025-09-01',70,8);
INSERT INTO performance (id_exercice, date, poids, repetitions) VALUES (1,'2025-09-10',75,6);
INSERT INTO performance (id_exercice, date, poids, repetitions) VALUES (1,'2025-09-20',77.5,5);
INSERT INTO performance (id_exercice, date, poids, repetitions) VALUES (2,'2025-09-02',100,5);
