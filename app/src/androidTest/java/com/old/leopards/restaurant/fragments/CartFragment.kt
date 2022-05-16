package com.old.leopards.restaurant.fragments

import android.view.View
import com.kaspersky.kaspresso.screens.KScreen
import com.old.leopards.restaurant.MainActivity
import com.old.leopards.restaurant.R
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher

object CartFragment : KScreen<CartFragment>() {
    override val layoutId: Int?
        get() = R.layout.activity_main
    override val viewClass: Class<*>?
        get() = MainActivity::class.java

    val recycler = KRecyclerView(
        builder = { withId(R.id.cart_rv) },
        itemTypeBuilder = { itemType(CartFragment::Item) }
    )

    internal class Item(parent: Matcher<View>) : KRecyclerItem<Item>(parent) {
        val title: KTextView = KTextView(parent) { withId(R.id.cart_item_title) }
        val price: KTextView = KTextView(parent) { withId(R.id.cart_item_price) }
        val weight: KTextView = KTextView(parent) { withId(R.id.cart_item_weight) }
        val description: KTextView = KTextView(parent) { withId(R.id.cart_item_description) }
    }

}