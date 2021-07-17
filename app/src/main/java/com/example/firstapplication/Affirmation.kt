package com.example.firstapplication

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId:Int,
    @DrawableRes val drawableResourceId:Int
)