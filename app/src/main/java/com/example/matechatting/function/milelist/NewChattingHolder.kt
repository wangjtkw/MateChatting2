package com.example.matechatting.function.milelist

import com.example.matechatting.base.BaseHolder
import com.example.matechatting.databinding.ItemMileListNewChattingBinding

class NewChattingHolder(binding: ItemMileListNewChattingBinding) :BaseHolder(binding){
    override fun <T> bind(t: T) {

    }
}
data class NewChattingSource(
    val newChatting:MileItemBean
)