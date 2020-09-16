package com.aria.androiddaggerhilt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aria.androiddaggerhilt.contract.MainContract
import com.aria.androiddaggerhilt.databinding.ActivityMainBinding
import com.aria.androiddaggerhilt.model.WelcomeMessage
import com.aria.imagesloader.di.CoilImageLoader
import com.aria.imagesloader.exposed.ImageLoader
import com.aria.scopedscreen.view.HiltSummaryActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var presenter: MainContract.Presenter

    @Inject
    @CoilImageLoader
    lateinit var imageLoader: ImageLoader

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter.onViewCreated()
        setupHiltSummaryButton()
    }

    private fun setupHiltSummaryButton() {
        binding.viewSummaryButton.setOnClickListener {
            startActivity(Intent(this, HiltSummaryActivity::class.java))
        }
    }

    override fun showWelcomeMessage(welcomeMessage: WelcomeMessage) {
        binding.welcomeMessageTitle.text = welcomeMessage.title
        imageLoader.load(
            vasiliyZukanovImage,
            binding.welcomeMessageImageView
        )
    }
    companion object {
        private const val vasiliyZukanovImage = "https://www.techyourchance.com/wp-content/uploads/2020/06/dagger_hilt.jpeg"

    }
}