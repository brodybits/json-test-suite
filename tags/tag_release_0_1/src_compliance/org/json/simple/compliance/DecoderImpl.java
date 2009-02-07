package org.json.simple.compliance;

import org.json.simple.JSONValue;
import org.json.test.compliance.std.DecodeException;
import org.json.test.compliance.std.JSONDecoder;

public class DecoderImpl implements JSONDecoder {

	public Object fromJSONString(String jsonString) throws DecodeException {
		Object value = null;
		
		try{
			value = JSONValue.parseWithException(jsonString);
		}
		catch(Exception e){
			throw new DecodeException(e);
		}
		
		return Mapper.transformToStd(value);
	}

}
