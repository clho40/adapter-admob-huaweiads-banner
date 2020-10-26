package com.hmscl.admobmediation.HuaweiCustomBannerEvent

import android.util.Log
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
import com.huawei.hms.ads.AdParam

class HuaweiCustomBannerEventForwarder(
    listener: CustomEventBannerListener,
    adView: HuaweiCustomBannerView
): HuaweiCustomBannerListener() {
    private var listener: CustomEventBannerListener? = null
    private var adView: HuaweiCustomBannerView? = null

    init {
        this.listener = listener
        this.adView = adView
    }

    override fun onAdLoaded() {
        listener?.onAdLoaded(adView)
    }

    override fun onAdFailed(errorCode: Int) {
        Log.e("error--",errorCode.toString())
        listener?.onAdFailedToLoad(
            AdError(
                AdParam.ErrorCode.INNER,
                AdParam.ErrorCode.INNER.toString(),"HuaweiBannerAds")
        )
    }

    override fun onAdClosed() {
        listener?.onAdClosed()
    }

    override fun onAdLeave() {
        listener?.onAdLeftApplication()
    }

    override fun onAdOpened() {
        listener?.onAdOpened()
    }

    override fun onAdClicked() {
        listener?.onAdClicked()
    }
}