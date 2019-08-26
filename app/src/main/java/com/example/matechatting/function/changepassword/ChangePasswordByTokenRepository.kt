package com.example.matechatting.function.changepassword

import com.example.matechatting.network.ChangePasswordByTokenService
import com.example.matechatting.network.IdeaApi
import com.example.matechatting.base.BaseRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ChangePasswordByTokenRepository : BaseRepository {

    fun changePassword(oldPass: String, newPass: String, callback: (Boolean) -> Unit) {
        IdeaApi.getApiService(ChangePasswordByTokenService::class.java).changePassword(newPass, oldPass)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnNext {
                callback(it.success)
            }
            .subscribe()
    }
}