package com.proxglobal.usercustomdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.proxglobal.usercustomdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityBinding.root)

        activityBinding.btnOpenOutOfUseDialog.setOnClickListener {
            val runOutOfUsesDialog = RunOutOfUsesDialog(this, object :
                RunOutOfUsesDialog.RunOutOfUseDialogListener {
                override fun onConfirm(text: String) {
                    Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
                }
            })
            runOutOfUsesDialog.show()
        }

        activityBinding.btnOpenFreeUseDialog.setOnClickListener {
            val freeUsesDialog =
                FreeUsesDialog(this, object : FreeUsesDialog.FreeUsesDialogListener {
                    override fun onConfirm(text: String) {
                        Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
                    }

                })
            freeUsesDialog.show()
        }
    }

}