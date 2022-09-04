package org.javacord.core.event.server.member;

import org.javacord.api.entity.member.Member;
import org.javacord.api.event.server.member.MemberJoinEvent;

/**
 * The implementation of {@link MemberJoinEvent}.
 */
public class MemberJoinEventImpl extends ServerMemberEventImpl implements MemberJoinEvent {

    /**
     * Creates a new server member join event.
     *
     * @param member The user of the event.
     */
    public MemberJoinEventImpl(Member member) {
        super(member);
    }

}
