package fr.taartopom.sqlitesample;

import java.util.Date;

public class ScoreData {

    private int idScore;
    private String name;
    private  int score;
    private Date when;

    public ScoreData(int idScore, String name, int score, Date when) {
        this.setIdScore( idScore );
        this.setName( name );
        this.setScore( score );
        this.setWhen( when );
    }

    // les getters
    public int getIdScore() {
        return idScore;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Date getWhen() {
        return when;
    }

// les setters
    public void setIdScore(int idScore) {
        this.idScore = idScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    @Override
    public String toString() {
        return "ScoreData{" +
                "idScore=" + idScore +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", when=" + when +
                '}';
    }
}
