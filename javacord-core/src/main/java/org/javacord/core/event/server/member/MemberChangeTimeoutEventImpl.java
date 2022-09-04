package org.javacord.core.event.server.member;

import org.javacord.api.entity.member.Member;
import org.javacord.api.event.server.member.MemberChangeTimeoutEvent;

import java.time.Instant;
import java.util.Optional;

/**
 * The implementation of {@link MemberChangeTimeoutEvent}.
 */
public class MemberChangeTimeoutEventImpl extends ServerMemberEventImpl implements
        MemberChangeTimeoutEvent {

    private final Member newMember;
    private final Member oldMember;

    /**
     * Creates a new user change timeout event.
     *
     * @param newMember The new member.
     * @param oldMember The old member.
     */
    public MemberChangeTimeoutEventImpl(Member newMember, Member oldMember) {
        super(newMember);
        this.newMember = newMember;
        this.oldMember = oldMember;
    }

    @Override
    public Optional<Instant> getNewTimeout() {
        return newMember.getTimeout();
    }

    @Override
    public Optional<Instant> getOldTimeout() {
        return oldMember.getTimeout();
    }
}
