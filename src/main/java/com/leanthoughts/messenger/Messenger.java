package com.leanthoughts.messenger;

/**
 * @author FFL
 * @since 21-11-2014
 * @version 0.1
 *
 * Messenger delivers an Envelope to recipients via an Aggregator.
 */
public interface Messenger {
    void send(Envelope envelope);

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
        public void send(Envelope envelope) {
            this.envelope = envelope;

        }
    }
}
