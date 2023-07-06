package com.magneticmojo.rpsapi.api.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.magneticmojo.rpsapi.api.state.FirstMoveMadeAwaitingLastMoveState;

import java.io.IOException;

public class FirstMoveMadeAwaitingLastMoveStateSerializer extends StdSerializer<FirstMoveMadeAwaitingLastMoveState> { // TODO @TEST

    public FirstMoveMadeAwaitingLastMoveStateSerializer() {
        this(null);
    }

    public FirstMoveMadeAwaitingLastMoveStateSerializer(Class<FirstMoveMadeAwaitingLastMoveState> t) {
        super(t);
    }

    @Override
    public void serialize(
            FirstMoveMadeAwaitingLastMoveState state,
            JsonGenerator gen,
            SerializerProvider provider)
            throws IOException {

        gen.writeStartObject();
        gen.writeStringField("message", state.firstPlayerMove().player().name() + " made the first move");
        gen.writeStringField("playerOne", state.playerOne().name());
        gen.writeStringField("playerTwo", state.playerTwo().name());
        gen.writeStringField("firstMove", state.firstPlayerMove().player().name());
        gen.writeEndObject();
    }
}
