package com.old.leopards.restaurant.tests

import com.old.leopards.restaurant.fragments.FoodFragment
import org.junit.Test

class FoodTest : TestImpl() {
    @Test
    fun recyclerTest() =
        before {
            before()
        }.after {
            after()
        }.run {
            step("Checking size") {
                FoodFragment {
                    recycler {
                        testLogger.i("Check amount of elements(default is 2)")
                        device.screenshots.take("Amount of elements screenshot")
                        hasSize(2)
                        testLogger.i("Amount is correct")
                    }
                }
            }

            step("Getting first title") {
                testLogger.i("Check first element: it should be visible and has title - \"Rise\"")
                FoodFragment {
                    recycler {
                        firstChild<FoodFragment.Item> {
                            isVisible()
                            title.hasText("Rise")
                            device.screenshots.take("Screenshot of first element")
                        }
                    }
                }
                testLogger.i("First element is displayed correctly")
            }

            step("Pressing on recycler view") {
                testLogger.i("Pressing first element, snack bar should pop up")
                FoodFragment {
                    recycler {
                        firstChild<FoodFragment.Item> {
                            click()
                        }
                    }
                    testLogger.i("Click performed")
                    snackBar.matches {
                        withText("Not implemented yet")
                    }
                    device.screenshots.take("Screenshot snackBar pops up")
                    testLogger.i("SnackBar is displayed")
                }
            }
        }
}