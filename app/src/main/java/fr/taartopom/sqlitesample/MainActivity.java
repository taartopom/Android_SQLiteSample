package fr.taartopom.sqlitesample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView scoresView;
    private DatabaseManager databaseManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoresView = (TextView) findViewById(R.id.tv_score);
        databaseManager =  new DatabaseManager(this);

//        databaseManager.insertScore("Batman", 1000);
//        databaseManager.insertScore("Poison ivy", 950);
//        databaseManager.insertScore("Aquaman", 1200);
//        databaseManager.insertScore("Ed nygma ", 500);
//        databaseManager.insertScore("Joker ", 1500);
//        databaseManager.insertScore("Bane", 100);
//        databaseManager.insertScore("Pinguin", 850);
//        databaseManager.insertScore("Harley Queen", 700);
//        databaseManager.insertScore("Harvet ", 680);
//        databaseManager.insertScore("Bulloc ", 5);

        List<ScoreData> scores =  databaseManager.readTop10();
        for( ScoreData score:scores){
            scoresView.append(score.toString() + "\n\n");
        }
        /* pour fermer la connexion avec la bdd */
        databaseManager.close();
    }
}
