package com.old.leopards.restaurant.tests

import android.Manifest
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.launchActivity
import androidx.test.rule.GrantPermissionRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.old.leopards.restaurant.MainActivity
import org.junit.Rule

open class TestImpl : TestCase() {

    protected lateinit var scenario: ActivityScenario<MainActivity>

    @get:Rule
    val runtimePermissionRule: GrantPermissionRule = GrantPermissionRule.grant(
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE
    )

    fun before() {
        scenario = launchActivity()
        testLogger.i("Logger initialized")
        device.screenshots.take("Start screenshot")
    }

    fun after() {
        scenario.close()
    }
}