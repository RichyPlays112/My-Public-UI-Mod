
package net.mcreator.ultimate_infinity.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.ultimate_infinity.ElementsUltimateInfinityMod;

import java.util.Set;
import java.util.HashMap;

@ElementsUltimateInfinityMod.ModElement.Tag
public class ItemStarforgePickaxe extends ElementsUltimateInfinityMod.ModElement {
	@GameRegistry.ObjectHolder("ultimate_infinity:starforgepickaxe")
	public static final Item block = null;
	public ItemStarforgePickaxe(ElementsUltimateInfinityMod instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("STARFORGEPICKAXE", 20, 0, 15f, 6f, 0)) {
			{
				this.attackSpeed = -2.8f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 20);
				return ret.keySet();
			}
		}.setUnlocalizedName("starforgepickaxe").setRegistryName("starforgepickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("ultimate_infinity:starforgepickaxe", "inventory"));
	}
}
