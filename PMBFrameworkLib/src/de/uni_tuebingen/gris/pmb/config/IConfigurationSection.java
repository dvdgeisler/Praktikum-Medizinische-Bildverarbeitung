package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;


public interface IConfigurationSection extends Serializable {
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	Byte setByte(String key, Byte value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	Short setShort(String key, Short value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	Integer setInteger(String key, Integer value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	Long setLong(String key, Long value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	Float setFloat(String key, Float value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	Double setDouble(String key, Double value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	Character setCharacter(String key, Character value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	Boolean setBoolean(String key, Boolean value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	String setString(String key, String value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	IConfigurationSection setSection(String key, IConfigurationSection value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	ArrayList<Byte> setByteList(String key, ArrayList<Byte> value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	ArrayList<Short> setShortList(String key, ArrayList<Short> value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	ArrayList<Integer> setIntegerList(String key, ArrayList<Integer> value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	ArrayList<Long> setLongList(String key, ArrayList<Long> value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	ArrayList<Float> setFloatList(String key, ArrayList<Float> value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	ArrayList<Double> setDoubleList(String key, ArrayList<Double> value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	ArrayList<Character> setCharacterList(String key, ArrayList<Character> value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	ArrayList<Boolean> setBooleanList(String key, ArrayList<Boolean> value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	ArrayList<String> setStringList(String key, ArrayList<String> value);
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 */
	ArrayList<IConfigurationSection> setSectionList(String key, ArrayList<IConfigurationSection> value);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Byte getByte(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Short getShort(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Integer getInteger(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Long getLong(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Float getFloat(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Double getDouble(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Character getCharacter(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	String getString(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Boolean getBoolean(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	IConfigurationSection getSection(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Byte> getByteList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Short> getShortList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Integer> getIntegerList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Long> getLongList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Float> getFloatList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Double> getDoubleList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Character> getCharacterList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<String> getStringList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Boolean> getBooleanList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<IConfigurationSection> getSectionList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Byte removeByte(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Short removeShort(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Integer removeInteger(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Long removeLong(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Float removeFloat(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Double removeDouble(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Character removeCharacter(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	String removeString(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	Boolean removeBoolean(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	IConfigurationSection removeSection(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Byte> removeByteList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Short> removeShortList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Integer> removeIntegerList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Long> removeLongList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Float> removeFloatList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Double> removeDoubleList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Character> removeCharacterList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<String> removeStringList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<Boolean> removeBooleanList(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	ArrayList<IConfigurationSection> removeSectionList(String key);

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getByteKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getShortKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getIntegerKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getLongKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getFloatKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getDoubleKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getCharacterKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getStringKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getBooleanKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getSectionKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getByteListKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getShortListKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getIntegerListKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getLongListKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getFloatListKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getDoubleListKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getCharacterListKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getStringListKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getBooleanListKeys();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getSectionListKeys();

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isByteKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isShortKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isIntegerKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isLongKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isFloatKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isDoubleKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isCharacterKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isStringKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isBooleanKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isSectionKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isByteListKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isShortListKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isIntegerListKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isLongListKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isFloatListKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isDoubleListKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isCharacterListKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isStringListKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isBooleanListKey(String key);

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isSectionListKey(String key);

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyByte> getByteProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyShort> getShortProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyInteger> getIntegerProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyLong> getLongProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyFloat> getFloatProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyDouble> getDoubleProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyCharacter> getCharacterProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyString> getStringProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertySection> getSectionProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyBoolean> getBooleanProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyByteList> getByteListProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyShortList> getShortListProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyIntegerList> getIntegerListProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyLongList> getLongListProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyFloatList> getFloatListProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyDoubleList> getDoubleListProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyCharacterList> getCharacterListProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyStringList> getStringListProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertySectionList> getSectionListProperties();

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<? extends IConfigurationPropertyBooleanList> getBooleanListProperties();
	
}