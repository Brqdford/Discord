package com.brqdford.slashdiscord;

import com.google.inject.Inject;
import com.velocitypowered.api.command.Command;
import com.velocitypowered.api.command.CommandInvocation;
import com.velocitypowered.api.command.RawCommand;
import com.velocitypowered.api.command.SimpleCommand;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.proxy.ServerConnection;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.event.HoverEvent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import org.slf4j.Logger;
import org.w3c.dom.Text;

import java.util.Optional;

@Plugin(id = "slashdiscord", name = "SlashDiscord", version = "1.0", description = "slashdiscord", authors = {"Brqdford"})
public class slashdiscord {
    private final ProxyServer server;

    @Inject
    public slashdiscord(ProxyServer server, Logger logger) {
        this.server = server;
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        this.server.getCommandManager().register("discord", (Command)new SimpleCommand() {
            public void execute(Invocation invocation) {
                invocation.source().sendMessage(Component.text("        Join our discord!").color((TextColor)NamedTextColor.YELLOW));
                invocation.source().sendMessage(Component.text("https://discord.gg/zh95CK958q").color((TextColor)NamedTextColor.GOLD).clickEvent(ClickEvent.openUrl("https://discord.gg/zh95CK958q")).hoverEvent(Component.text("Link to our discord.").color((TextColor)NamedTextColor.GOLD)));
            }
        },  new String[] { "dc" });
        this.server.getCommandManager().register("buy", (Command)new SimpleCommand() {
            public void execute(Invocation invocation) {
                invocation.source().sendMessage(Component.text("Support the server and get cool perks!").color((TextColor)NamedTextColor.DARK_AQUA));
                invocation.source().sendMessage(Component.text("    www.moddedparadise.store").color((TextColor)NamedTextColor.AQUA).clickEvent(ClickEvent.openUrl("http://www.moddedparadise.store")).hoverEvent(Component.text("Link to our store.").color((TextColor)NamedTextColor.AQUA)));
            }
        },  new String[] { "store" });
        this.server.getCommandManager().register("website", (Command)new SimpleCommand() {
            public void execute(Invocation invocation) {
                invocation.source().sendMessage(Component.text("         Join our Website:").color((TextColor)NamedTextColor.DARK_RED));
                invocation.source().sendMessage(Component.text("    www.moddedparadise.com").color((TextColor)NamedTextColor.RED).clickEvent(ClickEvent.openUrl("http://www.moddedparadise.com/")).hoverEvent(Component.text("Link to our website.").color((TextColor)NamedTextColor.RED)));
            }
        },  new String[] { "forums" });
        this.server.getCommandManager().register("vote", (Command)new SimpleCommand() {
            public void execute(Invocation invocation) {
                invocation.source().sendMessage(Component.text("         Vote for us:").color((TextColor)NamedTextColor.DARK_PURPLE));
                invocation.source().sendMessage(Component.text("    https://bit.ly/3HHyaml").color((TextColor)NamedTextColor.LIGHT_PURPLE).clickEvent(ClickEvent.openUrl("https://bit.ly/3HHyaml")).hoverEvent(Component.text("Vote link #1.").color((TextColor)NamedTextColor.LIGHT_PURPLE)));
                invocation.source().sendMessage(Component.text("    https://bit.ly/3oTxj9A").color((TextColor)NamedTextColor.LIGHT_PURPLE).clickEvent(ClickEvent.openUrl("https://bit.ly/3oTxj9A")).hoverEvent(Component.text("Vote link #2.").color((TextColor)NamedTextColor.DARK_PURPLE)));
                invocation.source().sendMessage(Component.text("    https://bit.ly/3r4IjUg").color((TextColor)NamedTextColor.LIGHT_PURPLE).clickEvent(ClickEvent.openUrl("https://bit.ly/3r4IjUg")).hoverEvent(Component.text("Vote link #3.").color((TextColor)NamedTextColor.LIGHT_PURPLE)));
            }
        },  new String[] { "votes" });
    }
}
