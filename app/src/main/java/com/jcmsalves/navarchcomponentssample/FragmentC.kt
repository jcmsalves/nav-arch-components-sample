package com.jcmsalves.navarchcomponentssample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_c.*

class FragmentC : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_c, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textResult.text = "received argument: " + arguments?.getString("primitive_argument")

        val someDataClass: SomeDataClass? = arguments?.getParcelable("custom_object")
        someDataClass?.let {
            customObjectField.text = it.someField
            customObjectNumber.text = it.anotherField.toString()
        }
    }
}
