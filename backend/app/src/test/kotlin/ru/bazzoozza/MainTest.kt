package ru.bazzoozza

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest : StringSpec({
    "Check test environment" {
        "test".length shouldBe 4
    }
})