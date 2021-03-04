package com.celeste.event.wrappers;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public abstract class EventWrapper extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    /**
     * Static method to get the HandlerList
     *
     * @return HandlerList
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * @return HandlerList
     */
    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }

}
