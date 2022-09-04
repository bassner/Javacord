package org.javacord.api.event.server.member;

/**
 * A user change deafened event.
 */
public interface MemberChangeDeafenedEvent extends ServerMemberEvent {

    /**
     * Gets the new deafened state of the user.
     *
     * @return Whether the user is deafened now.
     */
    boolean isNewDeafened();

    /**
     * Gets the old deafened state of the user.
     *
     * @return Whether the user was deafened previously.
     */
    boolean isOldDeafened();

}
