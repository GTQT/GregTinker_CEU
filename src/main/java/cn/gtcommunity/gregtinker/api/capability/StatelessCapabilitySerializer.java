package cn.gtcommunity.gregtinker.api.capability;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

import javax.annotation.Nullable;

public class StatelessCapabilitySerializer<T> implements Capability.IStorage<T>
{
    public StatelessCapabilitySerializer()
    {/**/}

    @Nullable
    @Override
    public NBTBase writeNBT(Capability<T> capability, T instance, EnumFacing side)
    {
        return null;
    }

    @Override
    public void readNBT(Capability<T> capability, T instance, EnumFacing side, NBTBase nbt)
    {}
}
