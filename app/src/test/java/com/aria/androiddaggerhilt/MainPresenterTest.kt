package com.aria.androiddaggerhilt

import com.aria.androiddaggerhilt.contract.MainContract
import com.aria.androiddaggerhilt.data.GetWelcomeMessageDataSource
import com.aria.androiddaggerhilt.model.WelcomeMessage
import com.aria.androiddaggerhilt.presenter.MainPresenter
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.given
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainPresenterTest {
    private val view: MainContract.View = mock()
    private val getWelcomeMessageDataSource: GetWelcomeMessageDataSource = mock()
    private lateinit var presenter: MainPresenter

    @BeforeEach
    fun setUp() {
        presenter = MainPresenter(view, getWelcomeMessageDataSource)
    }

    @Test
    fun `Given welcome message When view is created Then show welcome message`() {
        givenWelcomeMessage()

        presenter.onViewCreated()

        verify(view).showWelcomeMessage(eq(createWelcomeMessage()))
    }

    private fun givenWelcomeMessage() {
        given(getWelcomeMessageDataSource())
            .willReturn(createWelcomeMessage())
    }

    private fun createWelcomeMessage() =
        WelcomeMessage("0", "Testing welcome message")
}