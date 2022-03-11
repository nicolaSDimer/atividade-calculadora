package com.matheus.testecale

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.matheus.testecale.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var x1: Float
        var x2 : Float

        binding.buttonFirst.setOnClickListener {
            x1 = binding.Valor.text.toString().toFloat()
            x2 = binding.Valor2.text.toString().toFloat()

            var text = x1+x2

            binding.textView4.text = text.toString()
        }

        binding.buttonFirst2.setOnClickListener {
            x1= binding.Valor.text.toString().toFloat()
            x2 = binding.Valor2.text.toString().toFloat()

            var text = x1*x2

            binding.textView4.text = text.toString()
        }

        binding.buttonFirst3.setOnClickListener {
            x1= binding.Valor.text.toString().toFloat()
            x2 = binding.Valor2.text.toString().toFloat()

            var text = x1/x2

            binding.textView4.text = text.toString()
        }

        binding.buttonFirst4.setOnClickListener {
            x1= binding.Valor.text.toString().toFloat()
            x2 = binding.Valor2.text.toString().toFloat()

            var text = x1-x2

            binding.textView4.text = text.toString()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
