package com.hmscl.admobmediation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initialize
        MobileAds.initialize(this)

        //load banner ads
        val adRequest = AdRequest.Builder().build()
        val adBanner = findViewById<AdView>(R.id.adBanner)
        adBanner.loadAd(adRequest)
    }
}