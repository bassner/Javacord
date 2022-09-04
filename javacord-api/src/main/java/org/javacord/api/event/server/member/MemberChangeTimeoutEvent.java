package org.javacord.api.event.server.member;

import java.time.Instant;
import java.util.Optional;

/**
 * A user change timeout event.
 */
public interface MemberChangeTimeoutEvent extends ServerMemberEvent {

    /**
     * Gets the new timeout of the member.
     *
     * @return The new timeout of the member.
     */
    Optional<Instant> getNewTimeout();

    /**
     * Gets the old timeout of the member.
     *
     * @return The old timeout of the member.
     */
    Optional<Instant> getOldTimeout();

}
