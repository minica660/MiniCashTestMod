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
                    .icon(() -> new ItemStack(Items.COMMAND_BLOCK))
                    .displayItems((pParameters, pOutput) -> {

                        HolderLookup.RegistryLookup ent =pParameters.holders().lookupOrThrow(Registries.ENCHANTMENT);

                        ItemStack netheriteAxe = new ItemStack(Items.NETHERITE_AXE);

                        netheriteAxe.enchant(ent.getOrThrow(Enchantments.SHARPNESS), 5);
                        netheriteAxe.enchant(ent.getOrThrow(Enchantments.EFFICIENCY), 5);
                        netheriteAxe.enchant(ent.getOrThrow(Enchantments.UNBREAKING), 3);


                      pOutput.accept(netheriteAxe);
                    })
                    .build());





    public static void register(IEventBus eventBus) {

        TABS.register(eventBus);

    }



}
