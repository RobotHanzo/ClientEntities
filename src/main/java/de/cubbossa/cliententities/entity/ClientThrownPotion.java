package de.cubbossa.cliententities.entity;

import de.cubbossa.cliententities.PlayerSpaceImpl;
import de.cubbossa.cliententities.ServerSideMethodNotSupported;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionType;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class ClientThrownPotion extends ClientThrownItemProjectile implements ThrownPotion {

    public ClientThrownPotion(PlayerSpaceImpl playerSpace, int entityId, PotionType potionEffect) {
        super(playerSpace, entityId, EntityType.POTION, null);

        ItemStack stack = new ItemStack(Material.SPLASH_POTION);
        PotionMeta meta = (PotionMeta) stack.getItemMeta();
        if (meta == null) meta = (PotionMeta) Bukkit.getItemFactory().getItemMeta(Material.SPLASH_POTION);
        meta.setBasePotionType(potionEffect);
        stack.setItemMeta(meta);
        setItem(stack);
    }

    @NotNull
    @Override
    public Collection<PotionEffect> getEffects() {
        throw new ServerSideMethodNotSupported();
    }
}
