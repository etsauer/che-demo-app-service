package fun.is.quarkus.randomThoughts.dto;

import java.util.UUID;

public record RandomThoughtDto(UUID thoughtId, String randomThought) {}
