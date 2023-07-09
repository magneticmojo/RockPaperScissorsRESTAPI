package com.magneticmojo.rockpaperscissors.api.model.responses;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.magneticmojo.rockpaperscissors.api.serialization.responses.JoinGameResponseSerializer;
import com.magneticmojo.rockpaperscissors.services.rockpaperscissors.game.model.entities.Player;

@JsonSerialize(using = JoinGameResponseSerializer.class)
public record JoinGameResponse(Player player, String playerNumber, String gameId) {
}
