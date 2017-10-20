
// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.security;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class RawDataMessage extends NetworkMessage {
    public static final int PROTOCOL_ID = 6253;

    
        // array,i8
        public byte[] content,0,_loc2_;
    

    public RawDataMessage() { }

    
        public RawDataMessage(byte[] content,0,_loc2_) {
            

            
            this.content,0,_loc2_ = content,0,_loc2_;
            
        }

        
    

    @Override
    public int getProtocolId() {
        return 6253;
    }

    @Override
    public void serialize(DataWriter writer) {
        

        
            

            
                
                    
                    writer.write_(content,0,_loc2_.length);
                    
                    writer.write_array_i8(this.content,0,_loc2_);
                
            

            

            
        
    }

    @Override
    public void deserialize(DataReader reader) {
        

        
            

            

            

            
                
                int content,0,_loc2__length = reader.read_();
                

                
                    this.content,0,_loc2_ = reader.read_array_i8(content,0,_loc2__length);
                
            
        
    }

    @Override
    public String toString() {
    
        return "RawDataMessage(" +
        
            
            "content,0,_loc2_=" +
            

            
            
            + this.content,0,_loc2_.length + "b" +
            
            
        
            ')';
    
    }
}

