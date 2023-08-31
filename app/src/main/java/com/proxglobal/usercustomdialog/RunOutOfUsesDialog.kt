package com.proxglobal.usercustomdialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.proxglobal.usercustomdialog.databinding.RunOutOfUseDialogFragmentBinding

class RunOutOfUsesDialog(
    context: Context,
    private val listener: RunOutOfUseDialogListener,
) : Dialog(context, R.style.DialogTheme) {

    private lateinit var binding: RunOutOfUseDialogFragmentBinding

    interface RunOutOfUseDialogListener {
        fun onConfirm(text: String)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RunOutOfUseDialogFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnUpgrade.setOnClickListener {
            listener.onConfirm("Upgrade button is clicked")
        }

        binding.btnWatchAd.setOnClickListener {
            listener.onConfirm("Watch Ads button is clicked")
        }

        binding.btnExit.setOnClickListener {
            dismiss()
        }
    }

}