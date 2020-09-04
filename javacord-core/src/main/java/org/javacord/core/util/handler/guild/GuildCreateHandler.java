package org.javacord.core.util.handler.guild;

import com.fasterxml.jackson.databind.JsonNode;
import org.apache.logging.log4j.Logger;
import org.javacord.api.DiscordApi;
import org.javacord.api.entity.server.Server;
import org.javacord.api.event.server.ServerBecomesAvailableEvent;
import org.javacord.api.event.server.ServerJoinEvent;
import org.javacord.core.DiscordApiImpl;
import org.javacord.core.entity.server.ServerImpl;
import org.javacord.core.event.server.ServerBecomesAvailableEventImpl;
import org.javacord.core.event.server.ServerJoinEventImpl;
import org.javacord.core.util.gateway.PacketHandler;
import org.javacord.core.util.logging.LoggerUtil;

/**
 * Handles the guild create packet.
 */
public class GuildCreateHandler extends PacketHandler {

    /**
     * Logger of this class
     */
    private static final Logger logger = LoggerUtil.getLogger(GuildCreateHandler.class);

    /**
     * Creates a new instance of this class.
     *
     * @param api The api.
     */
    public GuildCreateHandler(DiscordApi api) {
        super(api, true, "GUILD_CREATE");
    }

    @Override
    public void handle(JsonNode packet) {
        if (packet.has("unavailable") && packet.get("unavailable").asBoolean()) {
            logger.warn("Server " + packet.get("id").asLong() + " is unavailable.");
            return;
        }
        long id = packet.get("id").asLong();
        if (api.getUnavailableServers().contains(id)) {
            ServerImpl server = new ServerImpl(api, packet);
            ServerBecomesAvailableEvent event = new ServerBecomesAvailableEventImpl(server);

            api.getEventDispatcher().dispatchServerBecomesAvailableEvent(server, event);
            return;
        }

        ServerImpl server = new ServerImpl(api, packet);
        ServerJoinEvent event = new ServerJoinEventImpl(server);

        api.getEventDispatcher().dispatchServerJoinEvent(server, event);
    }

}
