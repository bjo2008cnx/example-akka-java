package org.royrusso.actor;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class ChildActor extends UntypedActor {

    LoggingAdapter log = Logging.getLogger(getContext().system(), this);

    @Override
    public void preStart() {
        log.info("Starting");
    }

    @Override
    public void onReceive(Object msg) {
        log.info("子：收到消息: " + msg);
    }

}
