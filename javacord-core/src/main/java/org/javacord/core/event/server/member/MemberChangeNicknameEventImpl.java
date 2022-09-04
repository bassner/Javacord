package org.javacord.core.event.server.member;

import org.javacord.api.entity.member.Member;
import org.javacord.api.event.server.member.MemberChangeNicknameEvent;

import java.util.Optional;

/**
 * The implementation of {@link MemberChangeNicknameEvent}.
 */
public class MemberChangeNicknameEventImpl extends ServerMemberEventImpl implements
        MemberChangeNicknameEvent {

    private final Member newMember;
    private final Member oldMember;

    /**
     * Creates a new user change nickname event.
     *
     * @param newMember The new member.
     * @param oldMember The old member.
     */
    public MemberChangeNicknameEventImpl(Member newMember, Member oldMember) {
        super(newMember);
        this.newMember = newMember;
        this.oldMember = oldMember;
    }

    @Override
    public Optional<String> getNewNickname() {
        return newMember.getNickname();
    }

    @Override
    public Optional<String> getOldNickname() {
        return oldMember.getNickname();
    }
}
