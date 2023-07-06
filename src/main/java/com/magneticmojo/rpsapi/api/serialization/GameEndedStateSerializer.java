package com.magneticmojo.rpsapi.api.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.magneticmojo.rpsapi.api.state.GameEndedState;

import java.io.IOException;
// TODO @TEST
public class GameEndedStateSerializer extends StdSerializer<GameEndedState> {

    public GameEndedStateSerializer() {
        this(null);
    }

    public GameEndedStateSerializer(Class<GameEndedState> t) {
        super(t);
    }

    @Override
    public void serialize(
            GameEndedState state,
            JsonGenerator gen,
            SerializerProvider provider)
            throws IOException {

        gen.writeStartObject();
        gen.writeStringField("message", "Game ended");
        gen.writeStringField("playerOne", state.playerOne().name());
        gen.writeStringField("playerTwo", state.playerTwo().name());
        gen.writeStringField("firstMove", state.firstPlayerMove().player().name() + " made the first move: " + state.firstPlayerMove().move().name());
        gen.writeStringField("lastMove", state.lastPlayerMove().player().name() + " made the last move: " + state.lastPlayerMove().move().name());
        gen.writeStringField("gameResult", state.result());
        gen.writeEndObject();
    }
}