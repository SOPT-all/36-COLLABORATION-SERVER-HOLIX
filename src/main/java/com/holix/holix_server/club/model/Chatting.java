package com.holix.holix_server.club.model;

import com.holix.holix_server.user.model.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "chatting")
public class Chatting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chattingId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club_id")
    private Club club;

    private String contents;
    private Integer likes;

    @Enumerated(EnumType.STRING)
    private ChattingType chattingType;

    private LocalDateTime createdAt;

    @Builder
    public Chatting(User user,
                    Club club,
                    String contents,
                    Integer likes,
                    ChattingType chattingType) {
        this.user = user;
        this.club = club;
        this.contents = contents;
        this.likes = likes;
        this.chattingType = chattingType;
        this.createdAt = LocalDateTime.now();
    }
}
