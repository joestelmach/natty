package com.joestelmach.natty;

import static org.junit.Assert.*;

import java.util.TimeZone;

import org.apache.commons.lang.SerializationUtils;
import org.junit.Test;

public class ParserTest {	

	@Test
	public void testParser() {
		// Test serializing of a basic parser which does not have a
		// user-supplied TimeZone.
		Parser parser = new Parser();
		
		byte[] serialized = SerializationUtils.serialize(parser);
		Parser deserialized = (Parser) SerializationUtils.deserialize(serialized);
		
		// Check the parser
		// Note: if a.equals(b), then a.hashcode() MUST equal b.hashcode()
		// see http://stackoverflow.com/a/27609 for more.
		assertEquals(parser, deserialized);
		assertEquals(parser.hashCode(), deserialized.hashCode());
	}

	@Test
	public void testParserTimeZone() {
		// TODO this could be improved by mocking TimeZone since it is not part
		// of the system under test.
		TimeZone defaultTimeZone = TimeZone.getDefault();
		
		// Test serializing of an alternate parser with a
		// user-supplied TimeZone.
		Parser parser = new Parser(defaultTimeZone);
		
		byte[] serialized = SerializationUtils.serialize(parser);
		Parser deserialized = (Parser) SerializationUtils.deserialize(serialized);
		
		// Check the parser
		// Note: if a.equals(b), then a.hashcode() MUST equal b.hashcode()
		// see http://stackoverflow.com/a/27609 for more.
		assertEquals(parser, deserialized);
		assertEquals(parser.hashCode(), deserialized.hashCode());
	}
}
