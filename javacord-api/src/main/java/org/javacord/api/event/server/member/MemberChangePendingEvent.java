package org.javacord.api.event.server.member;

/**
 * A user pending state (membership screening) change event.
 */
public interface MemberChangePendingEvent extends ServerMemberEvent {

    /**
     * Gets the old pending state of the member.
     *
     * @return The old pending state of the member.
     */
    boolean getOldPending();

    /**
     * Gets the new pending state of the member.
     *
     * @return The new pending state of the member.
     */
    boolean getNewPending();

}
