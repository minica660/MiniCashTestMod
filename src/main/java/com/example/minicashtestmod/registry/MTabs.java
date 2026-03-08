package com.example.minicashtestmod.registry;

import com.example.minicashtestmod.Minicashtestmod;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class MTabs {
    //レジストリ
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Minicashtestmod.MOD_ID);

    //タブ追加
        public static final RegistryObject<CreativeModeTab> MINICASH_TAB =
            TABS.register("minicash_tab",() -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetabs.minicash_tab"))
                    .icon(() -> new ItemStack(Items.TOTEM_OF_UNDYING))
                    .displayItems((pParameters, pOutput) -> {

                        HolderLookup.RegistryLookup ent =pParameters.holders().lookupOrThrow(Registries.ENCHANTMENT);

                        ItemStack netheriteAxe = new ItemStack(Items.NETHERITE_AXE);

                        netheriteAxe.enchant(ent.getOrThrow(Enchantments.SHARPNESS), 5);
                        netheriteAxe.enchant(ent.getOrThrow(Enchantments.EFFICIENCY), 5);
                        netheriteAxe.enchant(ent.getOrThrow(Enchantments.UNBREAKING), 3);
                        netheriteAxe.enchant(ent.getOrThrow(Enchantments.MENDING), 1);

                        ItemStack netheriteSword = new ItemStack(Items.NETHERITE_SWORD);


                        netheriteSword.enchant(ent.getOrThrow( Enchantments.SHARPNESS), 5);     
                        netheriteSword.enchant(ent.getOrThrow(Enchantments.FIRE_ASPECT), 2);    
                        netheriteSword.enchant(ent.getOrThrow(Enchantments.LOOTING), 3);        
                        netheriteSword.enchant(ent.getOrThrow(Enchantments.SWEEPING_EDGE), 3);  
                        netheriteSword.enchant(ent.getOrThrow(Enchantments.KNOCKBACK), 2);      
                        netheriteSword.enchant(ent.getOrThrow(Enchantments.UNBREAKING), 3);     
                        netheriteSword.enchant(ent.getOrThrow(Enchantments.MENDING), 1);        

                        ItemStack netheritePickaxe = new ItemStack(Items.NETHERITE_PICKAXE);
                        netheritePickaxe.enchant(ent.getOrThrow(Enchantments.EFFICIENCY), 5);
                        netheritePickaxe.enchant(ent.getOrThrow(Enchantments.UNBREAKING), 3);
                        netheritePickaxe.enchant(ent.getOrThrow(Enchantments.MENDING), 1);
                        netheritePickaxe.enchant(ent.getOrThrow(Enchantments.FORTUNE), 3);
                        netheritePickaxe.enchant(ent.getOrThrow(Enchantments.SILK_TOUCH), 1);


                        ItemStack netheriteHelmet = new ItemStack(Items.NETHERITE_HELMET);
                        netheriteHelmet.enchant(ent.getOrThrow(Enchantments.PROTECTION), 4);
                        netheriteHelmet.enchant(ent.getOrThrow(Enchantments.UNBREAKING), 3);
                        netheriteHelmet.enchant(ent.getOrThrow(Enchantments.MENDING), 1);
                        netheriteHelmet.enchant(ent.getOrThrow(Enchantments.RESPIRATION), 3);
                        netheriteHelmet.enchant(ent.getOrThrow(Enchantments.AQUA_AFFINITY), 1);


                        ItemStack netheriteChestplate = new ItemStack(Items.NETHERITE_CHESTPLATE);
                        netheriteChestplate.enchant(ent.getOrThrow(Enchantments.PROTECTION), 4);
                        netheriteChestplate.enchant(ent.getOrThrow(Enchantments.UNBREAKING), 3);
                        netheriteChestplate.enchant(ent.getOrThrow(Enchantments.MENDING), 1);


                        ItemStack netheriteLeggings = new ItemStack(Items.NETHERITE_LEGGINGS);
                        netheriteLeggings.enchant(ent.getOrThrow(Enchantments.PROTECTION), 4);
                        netheriteLeggings.enchant(ent.getOrThrow(Enchantments.UNBREAKING), 3);
                        netheriteLeggings.enchant(ent.getOrThrow(Enchantments.MENDING), 1);
                        netheriteLeggings.enchant(ent.getOrThrow(Enchantments.SWIFT_SNEAK), 3);


                        ItemStack netheriteBoots = new ItemStack(Items.NETHERITE_BOOTS);
                        netheriteBoots.enchant(ent.getOrThrow(Enchantments.PROTECTION), 4);
                        netheriteBoots.enchant(ent.getOrThrow(Enchantments.UNBREAKING), 3);
                        netheriteBoots.enchant(ent.getOrThrow(Enchantments.MENDING), 1);
                        netheriteBoots.enchant(ent.getOrThrow(Enchantments.FEATHER_FALLING), 4);
                        netheriteBoots.enchant(ent.getOrThrow(Enchantments.DEPTH_STRIDER), 3);
                        netheriteBoots.enchant(ent.getOrThrow(Enchantments.SOUL_SPEED), 3);

                      pOutput.accept(netheriteAxe);
                        pOutput.accept(netheriteSword);
                        pOutput.accept(netheritePickaxe);
                        pOutput.accept(netheriteHelmet);
                        pOutput.accept(netheriteChestplate);
                        pOutput.accept(netheriteLeggings);
                        pOutput.accept(netheriteBoots);
                    })
                    .build());





    public static void register(IEventBus eventBus) {

        TABS.register(eventBus);

    }



}
