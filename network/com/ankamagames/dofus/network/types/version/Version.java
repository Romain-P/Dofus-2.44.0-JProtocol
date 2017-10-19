// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.version;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class Version extends NetworkType {
  public static final int PROTOCOL_ID = 11;
  // i8
  public byte major;
  // i8
  public byte minor;
  // i8
  public byte release;
  // i32
  public int revision;
  // i8
  public byte patch;
  // i8
  public byte buildType;

  public Version()
  {}

  public Version(byte major, byte minor, byte release, int revision, byte patch, byte buildType)
  {
    this.major = major;
    this.minor = minor;
    this.release = release;
    this.revision = revision;
    this.patch = patch;
    this.buildType = buildType;
  }

  @Override
  public int getProtocolId()
  {
    return 11;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.major);
    writer.write_i8(this.minor);
    writer.write_i8(this.release);
    writer.write_i32(this.revision);
    writer.write_i8(this.patch);
    writer.write_i8(this.buildType);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.major = reader.read_i8();
    this.minor = reader.read_i8();
    this.release = reader.read_i8();
    this.revision = reader.read_i32();
    this.patch = reader.read_i8();
    this.buildType = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "Version("
        + "major="
        + this.major
        + ", minor="
        + this.minor
        + ", release="
        + this.release
        + ", revision="
        + this.revision
        + ", patch="
        + this.patch
        + ", buildType="
        + this.buildType
        + ')';
  }
}
