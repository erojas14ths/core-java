package com.erojas.core.poo.record;

import java.util.List;

/**
 * A {@code Person} class represents a person with a name and a list of friends.
 * @param name name
 * @param friends name friends
 */
public record Person(String name, List<String> friends) {
}
