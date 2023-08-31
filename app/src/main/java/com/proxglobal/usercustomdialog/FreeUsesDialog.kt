package com.proxglobal.usercustomdialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.proxglobal.usercustomdialog.databinding.FreeUsesDialogFragmentBinding
import com.proxglobal.usercustomdialog.databinding.RunOutOfUseDialogFragmentBinding

class FreeUsesDialog(
    context: Context,
    private val listener: FreeUsesDialogListener
): Dialog(context, R.style.DialogTheme) {

    private lateinit var binding: FreeUsesDialogFragmentBinding

    interface FreeUsesDialogListener{
        fun onConfirm(text: String)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FreeUsesDialogFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnUpgrade.setOnClickListener {
            listener.onConfirm("Upgrade button is clicked")
        }
        binding.btnExit.setOnClickListener {
            dismiss()
        }
    }

}