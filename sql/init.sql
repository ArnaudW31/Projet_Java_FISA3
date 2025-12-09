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
INSERT INTO exercice (nom) VALUES ('adducteur');
INSERT INTO exercice (nom) VALUES ('arriereepaulepoulie');
INSERT INTO exercice (nom) VALUES ('curlbicepshaltere');
INSERT INTO exercice (nom) VALUES ('curlmarteaupoulie');
INSERT INTO exercice (nom) VALUES ('deadlift');
INSERT INTO exercice (nom) VALUES ('developpecouche');
INSERT INTO exercice (nom) VALUES ('developpeincline');
INSERT INTO exercice (nom) VALUES ('developpemilitaire');
INSERT INTO exercice (nom) VALUES ('elevationlateral');
INSERT INTO exercice (nom) VALUES ('extensionmollet');
INSERT INTO exercice (nom) VALUES ('extentiontricepspoulie');
INSERT INTO exercice (nom) VALUES ('legcurl');
INSERT INTO exercice (nom) VALUES ('legextension');
INSERT INTO exercice (nom) VALUES ('presse');
INSERT INTO exercice (nom) VALUES ('squat');
INSERT INTO exercice (nom) VALUES ('tiragehorizontal');
INSERT INTO exercice (nom) VALUES ('tiragepouliebasse');
INSERT INTO exercice (nom) VALUES ('tiragepouliehaute');
INSERT INTO exercice (nom) VALUES ('tirageverticalpriseserre');
INSERT INTO exercice (nom) VALUES ('traction');

-- Quelques performances exemple
INSERT INTO performance (id_exercice, date, poids, repetitions) VALUES (1,'2025-09-01',70,8);
INSERT INTO performance (id_exercice, date, poids, repetitions) VALUES (1,'2025-09-10',75,6);
INSERT INTO performance (id_exercice, date, poids, repetitions) VALUES (1,'2025-09-20',77.5,5);
INSERT INTO performance (id_exercice, date, poids, repetitions) VALUES (2,'2025-09-02',100,5);
