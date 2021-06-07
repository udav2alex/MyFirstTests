package com.geekbrains.myfirsttests

import org.junit.Assert.assertFalse
import org.junit.Test


class EmailValidatorHomeworkFirstTest {

    // 1. Добавьте в приложение MyFirstTests несколько тестов в качестве негативного тестирования
    @Test
    fun emailValidator_InvalidEmailNoAt_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name-email.com"))
    }

    @Test
    fun emailValidator_InvalidEmailTooLongName_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(
            "123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890name@email.com"
        ))
    }

    @Test
    fun emailValidator_InvalidEmailTooLongDomain_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(
            "name@1234567890123456789012345678901234567890123456789012345678901234567890email.com"
        ))
    }

    @Test
    fun emailValidator_InvalidEmailTooLongZone_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(
            "name@email.123456789012345678901234567890com"
        ))
    }
}