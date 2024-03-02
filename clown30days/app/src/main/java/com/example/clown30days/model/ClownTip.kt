package com.example.clown30days.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ClownTip(
    @StringRes val nameRes: Int,
    @StringRes val instructionRes: Int,
    @DrawableRes val imageRes: Int,
)