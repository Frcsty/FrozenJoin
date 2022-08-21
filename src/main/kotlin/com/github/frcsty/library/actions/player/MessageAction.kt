package com.github.frcsty.library.actions.player

import com.github.frcsty.cache.PlaceholderCache
import com.github.frcsty.library.actions.Action
import com.github.frcsty.util.sendTranslatedMessage
import org.bukkit.entity.Player

object MessageAction : Action {
    override val id = "MESSAGE"

    override fun run(player: Player, data: String, cache: PlaceholderCache?) =
        player.sendTranslatedMessage(data, player, cache)
}