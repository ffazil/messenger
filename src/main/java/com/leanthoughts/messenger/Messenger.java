package com.leanthoughts.messenger;

import java.io.IOException;

/**
 * @author FFL
 * @since 21-11-2014
 * @version 0.1
 *
 * Messenger delivers an Envelope to recipients via an Aggregator.
 */
public interface Messenger {
    void send(Envelope envelope) throws IOException;

    final class Default implements Messenger{

        private Wire wire;
        private Envelope envelope;

        public Default(){

        }

        public Default(Wire wire){
            this.wire = wire;
        }

        public Default using(Wire wire){
            this.wire = wire;
            return this;
        }

        @Override
        public void send(Envelope envelope) throws IOException {
            this.envelope = envelope;
            Message message = envelope.unwrap();
            message.setUid(wire.getUsername());
            message.setPin(wire.getPassword());
            Transport transport = wire.connect();
            transport.push(message);

        }
    }
}
