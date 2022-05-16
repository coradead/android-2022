package com.old.leopards.restaurant.fragments

import android.view.View
import com.google.android.material.R.id
import com.kaspersky.kaspresso.screens.KScreen
import com.old.leopards.restaurant.MainActivity
import com.old.leopards.restaurant.R
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher

object FoodFragment : KScreen<FoodFragment>() {

    override val layoutId: Int?
        get() = R.layout.activity_main
    override val viewClass: Class<*>?
        get() = MainActivity::class.java

    val snackBar = KTextView { withId(id.snackbar_text) }

    val recycler = KRecyclerView(
        builder = { withId(R.id.rv_food_list) },
        itemTypeBuilder = { itemType(FoodFragment::Item) }
    )

    internal class Item(parent: Matcher<View>) : KRecyclerItem<Item>(parent) {
        val title: KTextView = KTextView(parent) { withId(R.id.tv_food_name) }
        val weight: KTextView = KTextView(parent) { withId(R.id.tv_food_weight) }
        val price: KButton = KButton(parent) { withId(R.id.bt_food_price) }
    }
}