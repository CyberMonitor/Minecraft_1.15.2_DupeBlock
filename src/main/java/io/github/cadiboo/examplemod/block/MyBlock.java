package io.github.cadiboo.examplemod.block;

import io.github.cadiboo.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MyBlock extends Block {

	public MyBlock(final Properties properties) {
		super(properties);
		ExampleMod.LOGGER.debug("AAAAA myBlock");
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
		ExampleMod.LOGGER.debug("BBBBB pos=" + pos.toString());
		ExampleMod.LOGGER.debug("BBBBB pos.DOWN=" + pos.down().toString());
		BlockState newBlockState = world.getBlockState(pos.down());
		world.setBlockState(pos, newBlockState, 8);
	}
}

/*
	@Override
	public void onBlockHarvested(World world,BlockPos pos,BlockState state, PlayerEntity player){
		ExampleMod.LOGGER.debug("DDDDD pos="+pos.toString());
		ExampleMod.LOGGER.debug("DDDDD pos.DOWN="+pos.down().toString());
		BlockState newBlockState = world.getBlockState(pos.down());
		world.setBlockState(pos, newBlockState,8 );
	}
 */
	/*
	@Override
	public void onBlockAdded(BlockState state,World world,BlockPos pos, BlockState oldstate, boolean isMoving) {
		ExampleMod.LOGGER.debug("CCCCC pos="+pos.toString());
		ExampleMod.LOGGER.debug("CCCCC pos.DOWN="+pos.down().toString());
		//BlockState newBlockState = world.getBlockState(pos.down());
		//world.setBlockState(pos, newBlockState);
	}

	 */




	/*
	public void onBlockAdded(World world, BlockPos pos, BlockState state) {
	    // 取得我們要複製的方塊資訊，即Y軸往下一格處的方塊
	    //BlockState newBlockState = world.getBlockState(pos.offset(EnumFacing.DOWN));
		BlockState newBlockState = world.getBlockState(pos.down());
	    // 將我們的方塊做變化
	    world.setBlockState(pos, newBlockState);

	    // 增加一點閃電特效
	    EntityLightningBolt lightningBolt = new EntityLightningBolt(
	            world,
	            pos.getX(),
	            pos.getY(),
	            pos.getZ()
	    );
	    world.addWeatherEffect(lightningBolt);
	}
	 */


