package com.toki.backend.friend.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FriendRequestProcessDto {
    private String toUserTag;
    private Boolean acceptFriend;
}
