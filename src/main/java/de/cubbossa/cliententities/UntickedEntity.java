package de.cubbossa.cliententities;

import org.bukkit.entity.Player;

import java.util.Collection;

public interface UntickedEntity {

  void announce(Collection<Player> viewers);
}
