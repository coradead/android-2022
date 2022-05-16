package com.old.leopards.restaurant.fragments

import com.kaspersky.kaspresso.screens.KScreen
import com.old.leopards.restaurant.MainActivity
import com.old.leopards.restaurant.R
import io.github.kakaocup.kakao.text.KTextView

object NavViewFragment : KScreen<CartFragment>() {
    override val layoutId: Int?
        get() = R.layout.activity_main
    override val viewClass: Class<*>?
        get() = MainActivity::class.java

    val food = KTextView { withId(R.id.navigation_food) }
    val cart = KTextView { withId(R.id.navigation_cart) }
    val profile = KTextView { withId(R.id.navigation_profile) }
}