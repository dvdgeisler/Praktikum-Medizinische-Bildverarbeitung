package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;
import java.util.Collection;

public class ConfigurationSectionDelegater implements IConfigurationSection {

	private static final long serialVersionUID = -6452246586330863699L;
	
	private final IConfigurationSection configurationSection;
	
	protected ConfigurationSectionDelegater(IConfigurationSection configurationSection) {
		this.configurationSection = configurationSection;
	}

	public IConfigurationSection getConfig() {
		return this.configurationSection;
	}

	public Byte setByte(String key, Byte value) {
		return this.configurationSection.setByte(key, value);
	}

	public Short setShort(String key, Short value) {
		return this.configurationSection.setShort(key, value);
	}

	public Integer setInteger(String key, Integer value) {
		return this.configurationSection.setInteger(key, value);
	}

	public Long setLong(String key, Long value) {
		return this.configurationSection.setLong(key, value);
	}

	public Float setFloat(String key, Float value) {
		return this.configurationSection.setFloat(key, value);
	}

	public Double setDouble(String key, Double value) {
		return this.configurationSection.setDouble(key, value);
	}

	public Character setCharacter(String key, Character value) {
		return this.configurationSection.setCharacter(key, value);
	}

	public Boolean setBoolean(String key, Boolean value) {
		return this.configurationSection.setBoolean(key, value);
	}

	public String setString(String key, String value) {
		return this.configurationSection.setString(key, value);
	}

	public IConfigurationSection setSection(String key,
			IConfigurationSection value) {
		return this.configurationSection.setSection(key, value);
	}

	public ArrayList<Byte> setByteList(String key, ArrayList<Byte> value) {
		return this.configurationSection.setByteList(key, value);
	}

	public ArrayList<Short> setShortList(String key, ArrayList<Short> value) {
		return this.configurationSection.setShortList(key, value);
	}

	public ArrayList<Integer> setIntegerList(String key,
			ArrayList<Integer> value) {
		return this.configurationSection.setIntegerList(key, value);
	}

	public ArrayList<Long> setLongList(String key, ArrayList<Long> value) {
		return this.configurationSection.setLongList(key, value);
	}

	public ArrayList<Float> setFloatList(String key, ArrayList<Float> value) {
		return this.configurationSection.setFloatList(key, value);
	}

	public ArrayList<Double> setDoubleList(String key, ArrayList<Double> value) {
		return this.configurationSection.setDoubleList(key, value);
	}

	public ArrayList<Character> setCharacterList(String key,
			ArrayList<Character> value) {
		return this.configurationSection.setCharacterList(key, value);
	}

	public ArrayList<Boolean> setBooleanList(String key,
			ArrayList<Boolean> value) {
		return this.configurationSection.setBooleanList(key, value);
	}

	public ArrayList<String> setStringList(String key, ArrayList<String> value) {
		return this.configurationSection.setStringList(key, value);
	}

	public ArrayList<IConfigurationSection> setSectionList(String key,
			ArrayList<IConfigurationSection> value) {
		return this.configurationSection.setSectionList(key, value);
	}

	public Byte getByte(String key) {
		return this.configurationSection.getByte(key);
	}

	public Short getShort(String key) {
		return this.configurationSection.getShort(key);
	}

	public Integer getInteger(String key) {
		return this.configurationSection.getInteger(key);
	}

	public Long getLong(String key) {
		return this.configurationSection.getLong(key);
	}

	public Float getFloat(String key) {
		return this.configurationSection.getFloat(key);
	}

	public Double getDouble(String key) {
		return this.configurationSection.getDouble(key);
	}

	public Character getCharacter(String key) {
		return this.configurationSection.getCharacter(key);
	}

	public String getString(String key) {
		return this.configurationSection.getString(key);
	}

	public Boolean getBoolean(String key) {
		return this.configurationSection.getBoolean(key);
	}

	public IConfigurationSection getSection(String key) {
		return this.configurationSection.getSection(key);
	}

	public ArrayList<Byte> getByteList(String key) {
		return this.configurationSection.getByteList(key);
	}

	public ArrayList<Short> getShortList(String key) {
		return this.configurationSection.getShortList(key);
	}

	public ArrayList<Integer> getIntegerList(String key) {
		return this.configurationSection.getIntegerList(key);
	}

	public ArrayList<Long> getLongList(String key) {
		return this.configurationSection.getLongList(key);
	}

	public ArrayList<Float> getFloatList(String key) {
		return this.configurationSection.getFloatList(key);
	}

	public ArrayList<Double> getDoubleList(String key) {
		return this.configurationSection.getDoubleList(key);
	}

	public ArrayList<Character> getCharacterList(String key) {
		return this.configurationSection.getCharacterList(key);
	}

	public ArrayList<String> getStringList(String key) {
		return this.configurationSection.getStringList(key);
	}

	public ArrayList<Boolean> getBooleanList(String key) {
		return this.configurationSection.getBooleanList(key);
	}

	public ArrayList<IConfigurationSection> getSectionList(String key) {
		return this.configurationSection.getSectionList(key);
	}

	public Byte removeByte(String key) {
		return this.configurationSection.removeByte(key);
	}

	public Short removeShort(String key) {
		return this.configurationSection.removeShort(key);
	}

	public Integer removeInteger(String key) {
		return this.configurationSection.removeInteger(key);
	}

	public Long removeLong(String key) {
		return this.configurationSection.removeLong(key);
	}

	public Float removeFloat(String key) {
		return this.configurationSection.removeFloat(key);
	}

	public Double removeDouble(String key) {
		return this.configurationSection.removeDouble(key);
	}

	public Character removeCharacter(String key) {
		return this.configurationSection.removeCharacter(key);
	}

	public String removeString(String key) {
		return this.configurationSection.removeString(key);
	}

	public Boolean removeBoolean(String key) {
		return this.configurationSection.removeBoolean(key);
	}

	public IConfigurationSection removeSection(String key) {
		return this.configurationSection.removeSection(key);
	}

	public ArrayList<Byte> removeByteList(String key) {
		return this.configurationSection.removeByteList(key);
	}

	public ArrayList<Short> removeShortList(String key) {
		return this.configurationSection.removeShortList(key);
	}

	public ArrayList<Integer> removeIntegerList(String key) {
		return this.configurationSection.removeIntegerList(key);
	}

	public ArrayList<Long> removeLongList(String key) {
		return this.configurationSection.removeLongList(key);
	}

	public ArrayList<Float> removeFloatList(String key) {
		return this.configurationSection.removeFloatList(key);
	}

	public ArrayList<Double> removeDoubleList(String key) {
		return this.configurationSection.removeDoubleList(key);
	}

	public ArrayList<Character> removeCharacterList(String key) {
		return this.configurationSection.removeCharacterList(key);
	}

	public ArrayList<String> removeStringList(String key) {
		return this.configurationSection.removeStringList(key);
	}

	public ArrayList<Boolean> removeBooleanList(String key) {
		return this.configurationSection.removeBooleanList(key);
	}

	public ArrayList<IConfigurationSection> removeSectionList(String key) {
		return this.configurationSection.removeSectionList(key);
	}

	public Collection<String> getByteKeys() {
		return this.configurationSection.getByteKeys();
	}

	public Collection<String> getShortKeys() {
		return this.configurationSection.getShortKeys();
	}

	public Collection<String> getIntegerKeys() {
		return this.configurationSection.getIntegerKeys();
	}

	public Collection<String> getLongKeys() {
		return this.configurationSection.getLongKeys();
	}

	public Collection<String> getFloatKeys() {
		return this.configurationSection.getFloatKeys();
	}

	public Collection<String> getDoubleKeys() {
		return this.configurationSection.getDoubleKeys();
	}

	public Collection<String> getCharacterKeys() {
		return this.configurationSection.getCharacterKeys();
	}

	public Collection<String> getStringKeys() {
		return this.configurationSection.getStringKeys();
	}

	public Collection<String> getBooleanKeys() {
		return this.configurationSection.getBooleanKeys();
	}

	public Collection<String> getSectionKeys() {
		return this.configurationSection.getSectionKeys();
	}

	public Collection<String> getByteListKeys() {
		return this.configurationSection.getByteListKeys();
	}

	public Collection<String> getShortListKeys() {
		return this.configurationSection.getShortListKeys();
	}

	public Collection<String> getIntegerListKeys() {
		return this.configurationSection.getIntegerListKeys();
	}

	public Collection<String> getLongListKeys() {
		return this.configurationSection.getLongListKeys();
	}

	public Collection<String> getFloatListKeys() {
		return this.configurationSection.getFloatListKeys();
	}

	public Collection<String> getDoubleListKeys() {
		return this.configurationSection.getDoubleListKeys();
	}

	public Collection<String> getCharacterListKeys() {
		return this.configurationSection.getCharacterListKeys();
	}

	public Collection<String> getStringListKeys() {
		return this.configurationSection.getStringListKeys();
	}

	public Collection<String> getBooleanListKeys() {
		return this.configurationSection.getBooleanListKeys();
	}

	public Collection<String> getSectionListKeys() {
		return this.configurationSection.getSectionListKeys();
	}

	public boolean isByteKey(String key) {
		return this.configurationSection.isByteKey(key);
	}

	public boolean isShortKey(String key) {
		return this.configurationSection.isShortKey(key);
	}

	public boolean isIntegerKey(String key) {
		return this.configurationSection.isIntegerKey(key);
	}

	public boolean isLongKey(String key) {
		return this.configurationSection.isLongKey(key);
	}

	public boolean isFloatKey(String key) {
		return this.configurationSection.isFloatKey(key);
	}

	public boolean isDoubleKey(String key) {
		return this.configurationSection.isDoubleKey(key);
	}

	public boolean isCharacterKey(String key) {
		return this.configurationSection.isCharacterKey(key);
	}

	public boolean isStringKey(String key) {
		return this.configurationSection.isStringKey(key);
	}

	public boolean isBooleanKey(String key) {
		return this.configurationSection.isBooleanKey(key);
	}

	public boolean isSectionKey(String key) {
		return this.configurationSection.isSectionKey(key);
	}

	public boolean isByteListKey(String key) {
		return this.configurationSection.isByteListKey(key);
	}

	public boolean isShortListKey(String key) {
		return this.configurationSection.isShortListKey(key);
	}

	public boolean isIntegerListKey(String key) {
		return this.configurationSection.isIntegerListKey(key);
	}

	public boolean isLongListKey(String key) {
		return this.configurationSection.isLongListKey(key);
	}

	public boolean isFloatListKey(String key) {
		return this.configurationSection.isFloatListKey(key);
	}

	public boolean isDoubleListKey(String key) {
		return this.configurationSection.isDoubleListKey(key);
	}

	public boolean isCharacterListKey(String key) {
		return this.configurationSection.isCharacterListKey(key);
	}

	public boolean isStringListKey(String key) {
		return this.configurationSection.isStringListKey(key);
	}

	public boolean isBooleanListKey(String key) {
		return this.configurationSection.isBooleanListKey(key);
	}

	public boolean isSectionListKey(String key) {
		return this.configurationSection.isSectionListKey(key);
	}

	public Collection<? extends IConfigurationPropertyByte> getByteProperties() {
		return this.configurationSection.getByteProperties();
	}

	public Collection<? extends IConfigurationPropertyShort> getShortProperties() {
		return this.configurationSection.getShortProperties();
	}

	public Collection<? extends IConfigurationPropertyInteger> getIntegerProperties() {
		return this.configurationSection.getIntegerProperties();
	}

	public Collection<? extends IConfigurationPropertyLong> getLongProperties() {
		return this.configurationSection.getLongProperties();
	}

	public Collection<? extends IConfigurationPropertyFloat> getFloatProperties() {
		return this.configurationSection.getFloatProperties();
	}

	public Collection<? extends IConfigurationPropertyDouble> getDoubleProperties() {
		return this.configurationSection.getDoubleProperties();
	}

	public Collection<? extends IConfigurationPropertyCharacter> getCharacterProperties() {
		return this.configurationSection.getCharacterProperties();
	}

	public Collection<? extends IConfigurationPropertyString> getStringProperties() {
		return this.configurationSection.getStringProperties();
	}

	public Collection<? extends IConfigurationPropertySection> getSectionProperties() {
		return this.configurationSection.getSectionProperties();
	}

	public Collection<? extends IConfigurationPropertyBoolean> getBooleanProperties() {
		return this.configurationSection.getBooleanProperties();
	}

	public Collection<? extends IConfigurationPropertyByteList> getByteListProperties() {
		return this.configurationSection.getByteListProperties();
	}

	public Collection<? extends IConfigurationPropertyShortList> getShortListProperties() {
		return this.configurationSection.getShortListProperties();
	}

	public Collection<? extends IConfigurationPropertyIntegerList> getIntegerListProperties() {
		return this.configurationSection.getIntegerListProperties();
	}

	public Collection<? extends IConfigurationPropertyLongList> getLongListProperties() {
		return this.configurationSection.getLongListProperties();
	}

	public Collection<? extends IConfigurationPropertyFloatList> getFloatListProperties() {
		return this.configurationSection.getFloatListProperties();
	}

	public Collection<? extends IConfigurationPropertyDoubleList> getDoubleListProperties() {
		return this.configurationSection.getDoubleListProperties();
	}

	public Collection<? extends IConfigurationPropertyCharacterList> getCharacterListProperties() {
		return this.configurationSection.getCharacterListProperties();
	}

	public Collection<? extends IConfigurationPropertyStringList> getStringListProperties() {
		return this.configurationSection.getStringListProperties();
	}

	public Collection<? extends IConfigurationPropertySectionList> getSectionListProperties() {
		return this.configurationSection.getSectionListProperties();
	}

	public Collection<? extends IConfigurationPropertyBooleanList> getBooleanListProperties() {
		return this.configurationSection.getBooleanListProperties();
	}
	
	
}
