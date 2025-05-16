package com.holix.holix_server.club.extension;

public class ClubExtension {

    public static String formatParticipants(Integer participants, Integer maxParticipants) {
        return String.format("%d명 / %d명", participants, maxParticipants);
    }
}
