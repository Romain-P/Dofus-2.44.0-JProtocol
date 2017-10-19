// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HumanOptionFollowers
    extends com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption {
  public static final int PROTOCOL_ID = 410;
  // array,com.ankamagames.dofus.network.types.game.look.IndexedEntityLook
  public com.ankamagames.dofus.network.types.game.look.IndexedEntityLook[] followingCharactersLook;

  public HumanOptionFollowers()
  {}

  public HumanOptionFollowers(
      com.ankamagames.dofus.network.types.game.look.IndexedEntityLook[] followingCharactersLook)
  {

    super();
    this.followingCharactersLook = followingCharactersLook;
  }

  public HumanOptionFollowers(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.look.IndexedEntityLook>
          followingCharactersLook)
  {

    super();
    this.followingCharactersLook =
        followingCharactersLook.toArray(
            com.ankamagames.dofus.network.types.game.look.IndexedEntityLook[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 410;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui16(followingCharactersLook.length);

    for (int i = 0; i < followingCharactersLook.length; i++)
  {

      followingCharactersLook[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int followingCharactersLook_length = reader.read_ui16();
    this.followingCharactersLook =
        new com.ankamagames.dofus.network.types.game.look.IndexedEntityLook
            [followingCharactersLook_length];

    for (int i = 0; i < followingCharactersLook_length; i++)
  {

      com.ankamagames.dofus.network.types.game.look.IndexedEntityLook followingCharactersLook_it =
          new com.ankamagames.dofus.network.types.game.look.IndexedEntityLook();

      followingCharactersLook_it.deserialize(reader);
      this.followingCharactersLook[i] = followingCharactersLook_it;
    }
  }

  @Override
  public String toString()
  {

    return "HumanOptionFollowers("
        + "followingCharactersLook="
        + java.util.Arrays.toString(this.followingCharactersLook)
        + ')';
  }
}
