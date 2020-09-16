package com.aria.scopedscreen.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aria.scopedscreen.R
import com.aria.scopedscreen.contract.HiltSummaryContract
import com.aria.scopedscreen.databinding.FragmentHiltSummaryBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltSummaryFragment : Fragment(R.layout.fragment_hilt_summary), HiltSummaryContract.View {

    @Inject
    lateinit var presenter: HiltSummaryContract.Presenter

    lateinit var fragmentHiltSummaryBinding: FragmentHiltSummaryBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentHiltSummaryBinding.bind(view)
        fragmentHiltSummaryBinding = binding

        presenter.onViewCreated()
    }

    override fun showUI() {
    }
}