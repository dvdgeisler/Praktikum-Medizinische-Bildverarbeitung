package de.uni_tuebingen.gris.pmb.config;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import org.junit.Test;

public class ConfigurationTest {

	@Test
	public void testByteSerialization() throws JAXBException {
		Configuration c;
		Byte expected;
		String key;
		String xml;
		
		key = "test";
		expected = (byte) 0xFF;
		c = new Configuration();
		c.setByte("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));

		assertEquals(expected, c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testShortSerialization() throws JAXBException {
		Configuration c;
		Short expected;
		String key;
		String xml;
		
		key = "test";
		expected = (short) 0xFFFF;
		c = new Configuration();
		c.setShort("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertEquals(expected, c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testIntegerSerialization() throws JAXBException {
		Configuration c;
		Integer expected;
		String key;
		String xml;
		
		key = "test";
		expected = (int) 0xFFFFFFFF;
		c = new Configuration();
		c.setInteger("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertEquals(expected, c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testLongSerialization() throws JAXBException {
		Configuration c;
		Long expected;
		String key;
		String xml;
		
		key = "test";
		expected = (long) 0xFFFFFFFFFFFFFFFFL;
		c = new Configuration();
		c.setLong("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertEquals(expected, c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testFloatSerialization() throws JAXBException {
		Configuration c;
		Float expected;
		String key;
		String xml;
		
		key = "test";
		expected = Float.MIN_VALUE;
		c = new Configuration();
		c.setFloat("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertEquals(expected, c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testDoubleSerialization() throws JAXBException {
		Configuration c;
		Double expected;
		String key;
		String xml;
		
		key = "test";
		expected = Double.MIN_VALUE;
		c = new Configuration();
		c.setDouble("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertEquals(expected, c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testCharacterSerialization() throws JAXBException {
		Configuration c;
		Character expected;
		String key;
		String xml;
		
		key = "test";
		expected = Character.MAX_VALUE;
		c = new Configuration();
		c.setCharacter("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertEquals(expected, c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testBooleanSerialization() throws JAXBException {
		Configuration c;
		Boolean expected;
		String key;
		String xml;
		
		key = "test";
		expected = Boolean.TRUE;
		c = new Configuration();
		c.setBoolean("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertEquals(expected, c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testStringSerialization() throws JAXBException {
		Configuration c;
		String expected;
		String key;
		String xml;
		
		key = "test";
		expected = "value";
		c = new Configuration();
		c.setString("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertEquals(expected, c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testSectionSerialization() throws JAXBException {
		Configuration c;
		IConfigurationSection expected;
		String key;
		String xml;
		
		key = "test";
		expected = new ConfigurationSection();
		expected.setBoolean("bool_test", true);
		expected.setByte("byte_test", Byte.MAX_VALUE);
		expected.setCharacter("char_test", Character.MAX_VALUE);
		expected.setDouble("double_test", Double.MAX_VALUE);
		expected.setFloat("float_test", Float.MAX_VALUE);
		expected.setInteger("int_test", Integer.MAX_VALUE);
		expected.setLong("long_test", Long.MAX_VALUE);
		expected.setShort("short_test", Short.MAX_VALUE);
		expected.setString("string_test", "string");
		c = new Configuration();
		c.setSection("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertEquals(c.getSection(key),expected);
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testByteListSerialization() throws JAXBException {
		Configuration c;
		ArrayList<Byte> expected;
		String key;
		String xml;
		
		key = "test";
		expected = new ArrayList<Byte>() {
			{
				this.add((byte) 1);
				this.add((byte) 2);
				this.add((byte) 3);
				this.add((byte) 4);
				this.add((byte) 5);
			}
		};
		c = new Configuration();
		c.setByteList("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));

		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertEquals(expected,c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testShortListSerialization() throws JAXBException {
		Configuration c;
		ArrayList<Short> expected;
		String key;
		String xml;
		
		key = "test";
		expected = new ArrayList<Short>() {
			{
				this.add((short)1);
				this.add((short)2);
				this.add((short)3);
				this.add((short)4);
				this.add((short)5);
			}
		};
		c = new Configuration();
		c.setShortList("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertEquals(expected,c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testIntegerListSerialization() throws JAXBException {
		Configuration c;
		ArrayList<Integer> expected;
		String key;
		String xml;
		
		key = "test";
		expected = new ArrayList<Integer>() {
			{
				this.add(1);
				this.add(2);
				this.add(3);
				this.add(4);
				this.add(5);
			}
		};
		c = new Configuration();
		c.setIntegerList("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertEquals(expected,c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testLongListSerialization() throws JAXBException {
		Configuration c;
		ArrayList<Long> expected;
		String key;
		String xml;
		
		key = "test";
		expected = new ArrayList<Long>() {
			{
				this.add((long) 1);
				this.add((long) 2);
				this.add((long) 3);
				this.add((long) 4);
				this.add((long) 5);
			}
		};
		c = new Configuration();
		c.setLongList("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertEquals(expected, c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testFloatListSerialization() throws JAXBException {
		Configuration c;
		ArrayList<Float> expected;
		String key;
		String xml;
		
		key = "test";
		expected = new ArrayList<Float>() {
			{
				this.add((float) 1);
				this.add((float) 2);
				this.add((float) 3);
				this.add((float) 4);
				this.add((float) 5);
			}
		};
		c = new Configuration();
		c.setFloatList("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertEquals(expected, c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testDoubleListSerialization() throws JAXBException {
		Configuration c;
		ArrayList<Double> expected;
		String key;
		String xml;
		
		key = "test";
		expected = new ArrayList<Double>() {
			{
				this.add((double) 1);
				this.add((double) 2);
				this.add((double) 3);
				this.add((double) 4);
				this.add((double) 5);
			}
		};
		c = new Configuration();
		c.setDoubleList("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertEquals(expected, c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testCharacterListSerialization() throws JAXBException {
		Configuration c;
		ArrayList<Character> expected;
		String key;
		String xml;
		
		key = "test";
		expected = new ArrayList<Character>() {
			{
				this.add((char) 1);
				this.add((char) 2);
				this.add((char) 3);
				this.add((char) 4);
				this.add((char) 5);
			}
		};
		c = new Configuration();
		c.setCharacterList("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertEquals(expected,c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testBooleanListSerialization() throws JAXBException {
		Configuration c;
		ArrayList<Boolean> expected;
		String key;
		String xml;
		
		key = "test";
		expected = new ArrayList<Boolean>() {
			{
				this.add(true);
				this.add(false);
				this.add(true);
				this.add(false);
				this.add(true);
			}
		};
		c = new Configuration();
		c.setBooleanList("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertEquals(expected,c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}

	@Test
	public void testStringListSerialization() throws JAXBException {
		Configuration c;
		ArrayList<String> expected;
		String key;
		String xml;
		
		key = "test";
		expected = new ArrayList<String>() {
			{
				this.add("str 1");
				this.add("str 2");
				this.add("str 3");
				this.add("str 4");
				this.add("str 5");
			}
		};
		c = new Configuration();
		c.setStringList("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertNull(c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertEquals(expected, c.getStringList(key));
	}

	@Test
	public void testSectionListSerialization() throws JAXBException {
		Configuration c;
		ArrayList<IConfigurationSection> expected;
		String key;
		String xml;
		
		key = "test";
		expected = new ArrayList<IConfigurationSection>() {
			{
				this.add(new ConfigurationSection());
				this.get(0).setBoolean("bool_test", true);
				this.get(0).setByte("byte_test", Byte.MAX_VALUE);
				this.get(0).setCharacter("char_test", Character.MAX_VALUE);
				this.get(0).setDouble("double_test", Double.MAX_VALUE);
				this.get(0).setFloat("float_test", Float.MAX_VALUE);
				this.get(0).setInteger("int_test", Integer.MAX_VALUE);
				this.get(0).setLong("long_test", Long.MAX_VALUE);
				this.get(0).setShort("short_test", Short.MAX_VALUE);
				this.get(0).setString("string_test", "string1");
				this.add(new ConfigurationSection());
				this.get(1).setBoolean("bool_test", true);
				this.get(1).setByte("byte_test", Byte.MIN_VALUE);
				this.get(1).setCharacter("char_test", Character.MIN_VALUE);
				this.get(1).setDouble("double_test", Double.MIN_VALUE);
				this.get(1).setFloat("float_test", Float.MIN_VALUE);
				this.get(1).setInteger("int_test", Integer.MIN_VALUE);
				this.get(1).setLong("long_test", Long.MIN_VALUE);
				this.get(1).setShort("short_test", Short.MIN_VALUE);
				this.get(1).setString("string_test", "string2");
			}
		};
				
		c = new Configuration();
		c.setSectionList("test", expected);
		xml = c.toString();
		System.out.println(xml);
		
		c = new Configuration(new StringReader(xml));
		
		assertNull(c.getByte(key));
		assertNull(c.getBoolean(key));
		assertNull(c.getCharacter(key));
		assertNull(c.getDouble(key));
		assertNull(c.getFloat(key));
		assertNull(c.getInteger(key));
		assertNull(c.getLong(key));
		assertNull(c.getSection(key));
		assertNull(c.getShort(key));
		assertNull(c.getString(key));
		assertNull(c.getByteList(key));
		assertNull(c.getBooleanList(key));
		assertNull(c.getCharacterList(key));
		assertNull(c.getDoubleList(key));
		assertNull(c.getFloatList(key));
		assertNull(c.getIntegerList(key));
		assertNull(c.getLongList(key));
		assertEquals(expected,c.getSectionList(key));
		assertNull(c.getShortList(key));
		assertNull(c.getStringList(key));
	}
}
