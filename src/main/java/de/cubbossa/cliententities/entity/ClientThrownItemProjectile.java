package de.cubbossa.cliententities.entity;

import de.cubbossa.cliententities.ClientEntityMethodNotSupportedException;
import de.cubbossa.cliententities.PlayerSpace;
import lombok.Getter;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.projectiles.ProjectileSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Getter
public class ClientThrownItemProjectile extends ClientEntity {

  ItemStack item;

  public ClientThrownItemProjectile(PlayerSpace playerSpace, int entityId, EntityType entityType, ItemStack stack) {
    super(playerSpace, entityId, entityType);
    this.item = stack;
  }

  public void setItem(@NotNull ItemStack itemStack) {
    this.item = setMeta(this.item, itemStack);
  }
}
