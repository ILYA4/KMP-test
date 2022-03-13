package ru.chit.recyclemap.android.fragments.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.collect
import ru.chit.recyclemap.android.databinding.FragmentBitcoinCurrencyBinding
import ru.chit.recyclemap.android.fragments.vm.BitcoinCurrencyViewModelImpl

class BitcoinCurrencyFragment: Fragment() {

    private val viewModel: BitcoinCurrencyViewModelImpl by viewModels()

    private lateinit var binding: FragmentBitcoinCurrencyBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBitcoinCurrencyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.requestBitcoinPrice()
        lifecycleScope.launchWhenStarted {
            viewModel.bitcoinCurrencyState.collect {
                binding.amount.text = it.amountPrice.toString()
            }
        }
    }
}