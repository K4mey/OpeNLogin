/*
 * This file is part of a NickUC project
 *
 * Copyright (c) NickUC <nickuc.com>
 * https://github.com/nickuc
 */

package com.nickuc.openlogin.bukkit.utils;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;

public class TextComponentMessage {

    public static void sendPluginChoise(Player player) {
        TextComponent first = new TextComponent("      ");

        TextComponent nlogin = new TextComponent("nLogin");
        nlogin.setColor(ChatColor.YELLOW);
        HoverEvent nloginHover = new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§cnLogin §7is a §cproprietary §7authentication plugin,\n§7updated and maintained by §bnickuc.com§7. This means that you\n§7cannot view and modify the source code of the plugin.\n\n§eIf you still have questions, please contact us:\n§bnickuc.com/discord"));
        ClickEvent nloginClick = new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/openlogin nlogin skip");
        nlogin.setHoverEvent(nloginHover);
        nlogin.setClickEvent(nloginClick);
        first.addExtra(nlogin);
        first.addExtra("              ");

        TextComponent openlogin = new TextComponent("OpeNLogin");
        openlogin.setColor(ChatColor.YELLOW);
        HoverEvent openloginHover = new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§aOpeNLogin §7is a §aopen source §7authentication plugin,\n§7updated and maintained by all OpeNLogin contributors.\n\n§cCurrently the plugin does not have as many resources as nLogin."));
        ClickEvent openloginClick = new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/openlogin setup");
        openlogin.setHoverEvent(openloginHover);
        openlogin.setClickEvent(openloginClick);
        first.addExtra(openlogin);

        TextComponent second = new TextComponent("  ");

        TextComponent proprietary = new TextComponent("(proprietary)");
        proprietary.setColor(ChatColor.RED);
        proprietary.setHoverEvent(nloginHover);
        proprietary.setClickEvent(nloginClick);
        second.addExtra(proprietary);
        second.addExtra("      ");

        TextComponent opensource = new TextComponent("(open source)");
        opensource.setColor(ChatColor.DARK_GREEN);
        opensource.setHoverEvent(openloginHover);
        opensource.setClickEvent(openloginClick);
        second.addExtra(opensource);

        Player.Spigot spigot = player.spigot();
        spigot.sendMessage(first);
        spigot.sendMessage(second);
    }

}
