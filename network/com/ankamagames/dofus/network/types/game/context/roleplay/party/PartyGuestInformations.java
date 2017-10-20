// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyGuestInformations extends NetworkType {
  public static final int PROTOCOL_ID = 374;
  // vi64
  public long guestId;
  // vi64
  public long hostId;
  // str
  public java.lang.String name;
  // com.ankamagames.dofus.network.types.game.look.EntityLook
  public com.ankamagames.dofus.network.types.game.look.EntityLook guestLook;
  // i8
  public byte breed;
  // bool
  public boolean sex;
  // com.ankamagames.dofus.network.types.game.character.status.PlayerStatus
  public com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.party.companion.PartyCompanionBaseInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
          .PartyCompanionBaseInformations[]
      companions;

  public PartyGuestInformations() {}

  public PartyGuestInformations(
      long guestId,
      long hostId,
      java.lang.String name,
      com.ankamagames.dofus.network.types.game.look.EntityLook guestLook,
      byte breed,
      boolean sex,
      com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status,
      com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
                  .PartyCompanionBaseInformations
              []
          companions) {
    this.guestId = guestId;
    this.hostId = hostId;
    this.name = name;
    this.guestLook = guestLook;
    this.breed = breed;
    this.sex = sex;
    this.status = status;
    this.companions = companions;
  }

  public PartyGuestInformations(
      long guestId,
      long hostId,
      java.lang.String name,
      com.ankamagames.dofus.network.types.game.look.EntityLook guestLook,
      byte breed,
      boolean sex,
      com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
                  .PartyCompanionBaseInformations>
          companions) {
    this.guestId = guestId;
    this.hostId = hostId;
    this.name = name;
    this.guestLook = guestLook;
    this.breed = breed;
    this.sex = sex;
    this.status = status;
    this.companions =
        companions.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
                        .PartyCompanionBaseInformations
                    []
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 374;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.guestId);
    writer.write_vi64(this.hostId);
    writer.write_str(this.name);
    this.guestLook.serialize(writer);
    writer.write_i8(this.breed);
    writer.write_bool(this.sex);
    writer.write_ui16(this.status.getProtocolId());
    this.status.serialize(writer);
    writer.write_ui16(companions.length);

    for (int i = 0; i < companions.length; i++) {

      companions[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.guestId = reader.read_vi64();
    this.hostId = reader.read_vi64();
    this.name = reader.read_str();
    this.guestLook = new com.ankamagames.dofus.network.types.game.look.EntityLook();
    this.guestLook.deserialize(reader);
    this.breed = reader.read_i8();
    this.sex = reader.read_bool();

    int status_typeId = reader.read_ui16();
    this.status =
        (com.ankamagames.dofus.network.types.game.character.status.PlayerStatus)
            InternalProtocolTypeManager.get(status_typeId);
    this.status.deserialize(reader);

    int companions_length = reader.read_ui16();
    this.companions =
        new com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
                .PartyCompanionBaseInformations[companions_length];

    for (int i = 0; i < companions_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
              .PartyCompanionBaseInformations
          companions_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
                  .PartyCompanionBaseInformations();

      companions_it.deserialize(reader);
      this.companions[i] = companions_it;
    }
  }

  @Override
  public String toString() {

    return "PartyGuestInformations("
        + "guestId="
        + this.guestId
        + ", hostId="
        + this.hostId
        + ", name="
        + this.name
        + ", guestLook="
        + this.guestLook
        + ", breed="
        + this.breed
        + ", sex="
        + this.sex
        + ", status="
        + this.status
        + ", companions="
        + java.util.Arrays.toString(this.companions)
        + ')';
  }
}
