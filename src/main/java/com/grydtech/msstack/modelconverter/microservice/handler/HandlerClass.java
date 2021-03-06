package com.grydtech.msstack.modelconverter.microservice.handler;

import com.grydtech.msstack.modelconverter.microservice.ClassSchema;
import com.grydtech.msstack.modelconverter.microservice.communication.CommunicationClass;
import com.grydtech.msstack.modelconverter.microservice.communication.EventClass;
import com.grydtech.msstack.modelconverter.microservice.communication.RequestClass;
import com.grydtech.msstack.modelconverter.microservice.communication.ResponseClass;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class HandlerClass extends ClassSchema {

    private String type;
    private String endPoint; // when the handler type is event this will be null
    private CommunicationClass requestClass; // when the handler type is event this will be EventClass
    private CommunicationClass responseClass; // when the handler type is event this will be null
    private final List<EventClass> eventClasses = new ArrayList<>();

    public void addEvent(EventClass event) {
        this.eventClasses.add(event);
    }

    public void addEventCollection(Collection<EventClass> events) {
        this.eventClasses.addAll(events);
    }
}
