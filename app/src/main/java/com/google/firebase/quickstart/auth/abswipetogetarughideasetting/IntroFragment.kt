package com.google.firebase.quickstart.auth.abswipetogetarughideasetting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_intro.*

class IntroFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) =
        inflater.inflate(R.layout.fragment_intro, container, false)!!

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        tvTitle.text = requireArguments().getString("title")
    }
    companion object {
        fun newInstance(title: String): Fragment {
            val fragment = IntroFragment()
            val args = Bundle()
            args.putString("title", title)
            fragment.arguments = args
            return fragment
        }
    }
}