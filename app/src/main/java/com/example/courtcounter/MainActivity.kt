 package com.example.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   var pointsA:Int = 0
   var pointsB:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //********************TEAM A *************************
        //Increamenting Team A score by 1
        buttonAFreeThrowId.setOnClickListener{
            pointsA+=1
            teamAScoreId.setText(pointsA.toString())
        }
        //Increamenting Team A score by 2
        buttonAPlusTwoId.setOnClickListener{
            pointsA+=2
            teamAScoreId.setText(pointsA.toString())
        }
        //Increamenting Team A score by 3
        buttonAPlusThreeId.setOnClickListener{
            pointsA+=3
            teamAScoreId.setText(pointsA.toString())
        }

        //********************TEAM B *************************

        //Increamenting Team B score by 1
        buttonBFreeThrowId.setOnClickListener{
            pointsB+=1
            teamBScoreId.setText(pointsB.toString())
        }
        //Increamenting Team B score by 2
        buttonBPlusTwoId.setOnClickListener{
            pointsB+=2
            teamBScoreId.setText(pointsB.toString())
        }
        //Increamenting Team B score by 3
        buttonBPlusThreeId.setOnClickListener{
            pointsB+=3
            teamBScoreId.setText(pointsB.toString())
        }

        //******************RESET********************
        buttonReset.setOnClickListener{
            pointsA=0
            pointsB=0
            teamAScoreId.setText(getString(R.string.zero))
            teamBScoreId.setText(getString(R.string.zero))
        }

    }
}