package com.example.fragmentoestaticoalvaradomoran

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class PrimerFragmento : Fragment() {
    private lateinit var editText: EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_primer_fragmento, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boton = view.findViewById<Button>(R.id.btn_boton)
        editText = view.findViewById(R.id.txt_texto_fragmento1)
        boton.setOnClickListener({
            var message : String = editText.text.toString()
            val bundle = Bundle()
            bundle.putString("Valor_campo",message)
            arguments = bundle
            parentFragmentManager.setFragmentResult("key",bundle)
        })
    }
}