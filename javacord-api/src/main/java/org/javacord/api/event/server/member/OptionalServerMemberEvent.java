package org.javacord.api.event.server.member;

import org.javacord.api.entity.member.Member;
import org.javacord.api.event.server.ServerEvent;

import java.util.Optional;

/**
 * An optional server member event.
 * Used for events which can both happen for members and users, e.g. in DMs.
 */
public interface OptionalServerMemberEvent extends ServerEvent {
    /**
     * Gets the member of the event.
     *
     * @return The member of the event.
     */
    Optional<Member> getMember();
}
