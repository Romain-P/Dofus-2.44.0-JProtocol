// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorInformations extends NetworkType {
  public static final int PROTOCOL_ID = 167;
  // f64
  public double uniqueId;
  // vi16
  public short firtNameId;
  // vi16
  public short lastNameId;
  // com.ankamagames.dofus.network.types.game.guild.tax.AdditionalTaxCollectorInformations
  public com.ankamagames.dofus.network.types.game.guild.tax.AdditionalTaxCollectorInformations
      additionalInfos;
  // i16
  public short worldX;
  // i16
  public short worldY;
  // vi16
  public short subAreaId;
  // i8
  public byte state;
  // com.ankamagames.dofus.network.types.game.look.EntityLook
  public com.ankamagames.dofus.network.types.game.look.EntityLook look;
  // array,com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorComplementaryInformations
  public com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorComplementaryInformations[]
      complements;

  public TaxCollectorInformations()
  {}

  public TaxCollectorInformations(
      double uniqueId,
      short firtNameId,
      short lastNameId,
      com.ankamagames.dofus.network.types.game.guild.tax.AdditionalTaxCollectorInformations
          additionalInfos,
      short worldX,
      short worldY,
      short subAreaId,
      byte state,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorComplementaryInformations[]
          complements)
  {
    this.uniqueId = uniqueId;
    this.firtNameId = firtNameId;
    this.lastNameId = lastNameId;
    this.additionalInfos = additionalInfos;
    this.worldX = worldX;
    this.worldY = worldY;
    this.subAreaId = subAreaId;
    this.state = state;
    this.look = look;
    this.complements = complements;
  }

  public TaxCollectorInformations(
      double uniqueId,
      short firtNameId,
      short lastNameId,
      com.ankamagames.dofus.network.types.game.guild.tax.AdditionalTaxCollectorInformations
          additionalInfos,
      short worldX,
      short worldY,
      short subAreaId,
      byte state,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.guild.tax
                  .TaxCollectorComplementaryInformations>
          complements)
  {
    this.uniqueId = uniqueId;
    this.firtNameId = firtNameId;
    this.lastNameId = lastNameId;
    this.additionalInfos = additionalInfos;
    this.worldX = worldX;
    this.worldY = worldY;
    this.subAreaId = subAreaId;
    this.state = state;
    this.look = look;
    this.complements =
        complements.toArray(
            com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorComplementaryInformations
                    []
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 167;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.uniqueId);
    writer.write_vi16(this.firtNameId);
    writer.write_vi16(this.lastNameId);
    this.additionalInfos.serialize(writer);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
    writer.write_vi16(this.subAreaId);
    writer.write_i8(this.state);
    this.look.serialize(writer);
    writer.write_ui16(complements.length);

    for (int i = 0; i < complements.length; i++)
  {

      writer.write_ui16(complements[i].getProtocolId());

      complements[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.uniqueId = reader.read_f64();
    this.firtNameId = reader.read_vi16();
    this.lastNameId = reader.read_vi16();
    this.additionalInfos =
        new com.ankamagames.dofus.network.types.game.guild.tax.AdditionalTaxCollectorInformations();
    this.additionalInfos.deserialize(reader);
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
    this.subAreaId = reader.read_vi16();
    this.state = reader.read_i8();
    this.look = new com.ankamagames.dofus.network.types.game.look.EntityLook();
    this.look.deserialize(reader);

    int complements_length = reader.read_ui16();
    this.complements =
        new com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorComplementaryInformations
            [complements_length];

    for (int i = 0; i < complements_length; i++)
  {

      int complements_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorComplementaryInformations
          complements_it =
              (com.ankamagames.dofus.network.types.game.guild.tax
                      .TaxCollectorComplementaryInformations)
                  InternalProtocolTypeManager.get(complements_it_typeId);

      complements_it.deserialize(reader);
      this.complements[i] = complements_it;
    }
  }

  @Override
  public String toString()
  {

    return "TaxCollectorInformations("
        + "uniqueId="
        + this.uniqueId
        + ", firtNameId="
        + this.firtNameId
        + ", lastNameId="
        + this.lastNameId
        + ", additionalInfos="
        + this.additionalInfos
        + ", worldX="
        + this.worldX
        + ", worldY="
        + this.worldY
        + ", subAreaId="
        + this.subAreaId
        + ", state="
        + this.state
        + ", look="
        + this.look
        + ", complements="
        + java.util.Arrays.toString(this.complements)
        + ')';
  }
}
