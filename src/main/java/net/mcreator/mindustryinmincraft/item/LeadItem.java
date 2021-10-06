
package net.mcreator.mindustryinmincraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.mindustryinmincraft.itemgroup.MindustryItemGroup;
import net.mcreator.mindustryinmincraft.MindustryinmincraftModElements;

@MindustryinmincraftModElements.ModElement.Tag
public class LeadItem extends MindustryinmincraftModElements.ModElement {
	@ObjectHolder("mindustryinmincraft:lead")
	public static final Item block = null;
	public LeadItem(MindustryinmincraftModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MindustryItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("lead");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
