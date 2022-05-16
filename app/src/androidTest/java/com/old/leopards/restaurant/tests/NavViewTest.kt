package com.old.leopards.restaurant.tests

import com.old.leopards.restaurant.fragments.CartFragment
import com.old.leopards.restaurant.fragments.NavViewFragment
import org.junit.Test

class NavViewTest : TestImpl() {
    @Test
    fun navViewTest() =
        before {
            before()
        }.after {
            after()
        }.run {
            NavViewFragment.cart.click()
            CartFragment {
                recycler.matches {
                    isVisible()
                }
            }
        }
}