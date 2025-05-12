package com.holix.holix_server.club.model;

import com.holix.holix_server.user.model.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "club")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clubId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private String clubTitle;
    private Boolean isPinned;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String notice;

    private Integer participants;
    private Integer maxParticipants;

    @Builder
    public Club(User user,
                String clubTitle,
                Boolean isPinned,
                String imgUrl,
                String notice,
                Integer participants,
                Integer maxParticipants) {
        this.user = user;
        this.clubTitle = clubTitle;
        this.isPinned = isPinned;
        this.imgUrl = imgUrl;
        this.notice = notice;
        this.participants = participants;
        this.maxParticipants = maxParticipants;
    }
}
