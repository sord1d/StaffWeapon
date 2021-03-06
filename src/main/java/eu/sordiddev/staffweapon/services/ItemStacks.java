package eu.sordiddev.staffweapon.services;


import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;


import java.util.Collections;

public class ItemStacks {

 public static ItemStack createStaffWeapon() {

     ItemStack staffweapon = new ItemStack(Material.TRIDENT);

     ItemMeta meta = staffweapon.getItemMeta();

     meta.displayName(Component.text(ChatColor.DARK_PURPLE + "Ma'Tok"));
     meta.lore(Collections.singletonList(Component.text(ChatColor.GOLD + "Staff Weapon")));
     meta.addEnchant(Enchantment.DAMAGE_ALL, 1,false);
     meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
     staffweapon.setItemMeta(meta);

     return staffweapon;
 }


    public static ItemStack createHelmet(){

        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);

        LeatherArmorMeta meta = (LeatherArmorMeta) helmet.getItemMeta();
        meta.displayName(Component.text(ChatColor.AQUA + "Jaffa Helm"));
        meta.lore(Collections.singletonList(Component.text(ChatColor.WHITE + "SG Adventure")));
        meta.setColor(Color.fromRGB(154,154,154));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);

        helmet.setItemMeta(meta);

        return  helmet;
    }

    public static ItemStack createTunic(){

        ItemStack tunic = new ItemStack(Material.LEATHER_CHESTPLATE);

        LeatherArmorMeta meta = (LeatherArmorMeta) tunic.getItemMeta();
        meta.displayName(Component.text(ChatColor.AQUA + "Jaffa Harnisch"));
        meta.lore(Collections.singletonList(Component.text(ChatColor.WHITE + "SG Adventure")));
        meta.setColor(Color.fromRGB(154,154,154));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);

        tunic.setItemMeta(meta);

        return tunic;
    }

    public static ItemStack createPants(){

        ItemStack pants = new ItemStack(Material.LEATHER_LEGGINGS);

        LeatherArmorMeta meta = (LeatherArmorMeta) pants.getItemMeta();
        meta.displayName(Component.text(ChatColor.AQUA + "Jaffa Hose"));
        meta.lore(Collections.singletonList(Component.text(ChatColor.WHITE + "SG Adventure")));
        meta.setColor(Color.fromRGB(154,154,154));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);

        pants.setItemMeta(meta);

        return pants;
    }

    public static ItemStack createBoots(){

        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);

        LeatherArmorMeta meta = (LeatherArmorMeta) boots.getItemMeta();
        meta.displayName(Component.text(ChatColor.AQUA + "Jaffa Stiefel"));
        meta.lore(Collections.singletonList(Component.text(ChatColor.WHITE + "SG Adventure")));
        meta.setColor(Color.fromRGB(154,154,154));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);

        boots.setItemMeta(meta);

        return  boots;
    }

}
