package org.javacord.api.listener.message;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.GloballyAttachableListener;
import org.javacord.api.listener.ObjectAttachableListener;
import org.javacord.api.listener.channel.TextChannelAttachableListener;
import org.javacord.api.listener.server.ServerAttachableListener;
import org.javacord.api.listener.server.member.MemberAttachableListener;
import org.javacord.api.listener.user.UserAttachableListener;
import org.javacord.api.listener.webhook.WebhookAttachableListener;

/**
 * This listener listens to message creations.
 */
@FunctionalInterface
public interface MessageCreateListener extends ServerAttachableListener, UserAttachableListener,
        WebhookAttachableListener, TextChannelAttachableListener, GloballyAttachableListener,
        ObjectAttachableListener, MemberAttachableListener {

    /**
     * This method is called every time a message is created.
     *
     * @param event The event.
     */
    void onMessageCreate(MessageCreateEvent event);

}
