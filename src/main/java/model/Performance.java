package model;

import java.time.LocalDate;

public class Performance {
    private int id;
    private int idExercice;
    private LocalDate date;
    private double poids;
    private int repetitions;

    public Performance() {}

    public Performance(int id, int idExercice, LocalDate date, double poids, int repetitions) {
        this.id = id;
        this.idExercice = idExercice;
        this.date = date;
        this.poids = poids;
        this.repetitions = repetitions;
    }

    public Performance(int idExercice, LocalDate date, double poids, int repetitions) {
        this(0, idExercice, date, poids, repetitions);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdExercice() { return idExercice; }
    public void setIdExercice(int idExercice) { this.idExercice = idExercice; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public double getPoids() { return poids; }
    public void setPoids(double poids) { this.poids = poids; }

    public int getRepetitions() { return repetitions; }
    public void setRepetitions(int repetitions) { this.repetitions = repetitions; }
}