package com.sharath.kotlin_viewmodel_databinding

import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewmodel : ViewModel(), IViewmodel {
    var myInt = 0
    override val title: ObservableField<String> = ObservableField("This is number counter")
    override val body: ObservableField<String> = ObservableField(myInt.toString())
    override val buttonText: ObservableField<String> = ObservableField("Click me")

    override fun onClick() {
        myInt++
        body.set(myInt.toString())
    }
}